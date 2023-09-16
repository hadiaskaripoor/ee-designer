package org.eclipse.sirius.web.ahpcc;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.json.Json;
import javax.json.JsonArray;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import autoDesigner1.Application;
import autoDesigner1.AutoDesigner1Package;
import autoDesigner1.Data;
import autoDesigner1.Data_In;
import autoDesigner1.Data_Out;
import autoDesigner1.Link;
import autoDesigner1.Mapping;
import autoDesigner1.Node;
import autoDesigner1.Route;
import autoDesigner1.Task;
import autoDesigner1.design.ArchSolving;
import autoDesigner1.design.Services;
import autoDesigner1.design.userAssignment;
import autoDesigner1.impl.AutoDesigner1FactoryImpl;
import autoDesigner1.impl.EEDImpl;
import gurobi.GRBException;

@RequestMapping("api/model")
@RestController
public class ServiceController {

    private String projectId;

    // How the unsovled model should be named
    private String filename = "document.xml"; //$NON-NLS-1$

    private String documentId;

    // The model as object which has not been cast to the proper model yet (This class handles two different model
    // types). Cast it to the model you are working on
    // before using it.
    private Object object;

    // for rounding the times in scheduling
    private static final DecimalFormat df = new DecimalFormat("0.00"); //$NON-NLS-1$

    // colors for the schedule-chart
    List<String> colors = Arrays.asList("#008FFB", "#00E396", "#775DD0", "#FEB019", "#FF4560"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$

    @GetMapping("/solve")
    public RedirectView getSolved(@RequestParam(value = "ProjectId") String projectId, @RequestParam(value = "DocumentId") String documentId) throws IOException {

        this.setDocumentId(documentId);
        this.setProjectId(projectId);

        this.readModelInstance();

        System.out.println("Start solving routing model."); //$NON-NLS-1$
        return this.solve();

        /*
         * if (this.extractModelType(this.object).equals("eed")) { //$NON-NLS-1$
         * System.out.println("Start solving AHPCC model."); //$NON-NLS-1$ return this.solveAhpcc(); } else {
         * System.out.println("Start solving routing model."); //$NON-NLS-1$ return this.solveRouting(); }
         */
    }

    // Used for the "Generate Full Mesh" function in the UI. In the JS code you can find the call of this function in
    // TreeItemDocumentContextMenu.tsx
    // Creates the full mesh for the routing model if possible
    // should return to error page if used on a different model
    @GetMapping("/generate")
    public RedirectView getFullMesh(@RequestParam(value = "ProjectId") String projectId, @RequestParam(value = "DocumentId") String documentId) throws IOException {
        System.out.println("projectId: " + projectId + ", documentId: " + documentId); //$NON-NLS-1$ //$NON-NLS-2$
        this.setDocumentId(documentId);
        this.setProjectId(projectId);

        this.readModelInstance();

        EEDImpl routing = (EEDImpl) this.object;
        routing = Services.createFullMesh(routing);

        try {
            this.saveAsXML(routing, "FullMeshModel.xml"); //$NON-NLS-1$
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Change modelFilename
        // Changed from C:\\Users\\Andre\\TUM\\eclipse-workspace-mapping\\ahpccSolver\\SolvedModel.xml
        String modelFilename = "FullMeshModel.xml"; //$NON-NLS-1$

        @SuppressWarnings("unused")
        UploadDocument upload = new UploadDocument(this.projectId, modelFilename);

        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("http://localhost:8080/projects/" + this.projectId + "/edit"); //$NON-NLS-1$ //$NON-NLS-2$

        // added by Amir
        this.saveSampleTopAsXML();

        return redirectView;

    }

    @GetMapping("/setDocuId")
    public void setDocuId(@RequestParam(value = "DocumentId") String documentId) {
        this.documentId = documentId;
        System.out.println("docuId: " + documentId); //$NON-NLS-1$

        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("http://localhost:8080/projects/" + this.projectId + "/edit"); //$NON-NLS-1$ //$NON-NLS-2$

    }

    // Amir added
    // returns json-array for the gantt-chart
    @GetMapping("/schedules/coordinates")
    public String coordinates(@RequestParam(value = "documentId") String documentId, @RequestParam(value = "projectId") String projId, @RequestParam(value = "objectId") String objectId,
            @RequestParam(value = "kind") String kind, @RequestParam(value = "label") String label) throws IOException {

        System.out.println("docuId in coordinates: " + documentId); //$NON-NLS-1$
        this.setDocuId(documentId);
        this.setProjectId(projId);
        System.out.println("http://localhost:8080/api/model/schedules/coordinates?documentId=" + documentId + "&projectId=" + projId + "&objectId=" + objectId + "&kind=" + kind + "&label=" + label); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        try {
            this.readModelInstance();
            EEDImpl modelInstance = (EEDImpl) this.object;
            /*
             * example for the format: [{ x:"process1", y:[1,2]},{x:"process2", y:[3,4]}
             */

            // kind = packagename::className
            // -> remove packagename from kind
            String[] kind_splitted = kind.split("::"); //$NON-NLS-1$
            if (kind_splitted.length > 1) {
                String rawKind = kind_splitted[1];

                if (rawKind.equals("ECU") || rawKind.equals("HPCU")) { //$NON-NLS-1$ //$NON-NLS-2$
                    return this.getProcessSchedules(modelInstance, label).toString();
                } else {
                    if (rawKind.equals("Link")) { //$NON-NLS-1$
                        // we now add the active tasks for the scheduling on the routes!
                        // return this.getTaskSchedules(modelInstance, label).toString();
                    } else {
                        if (rawKind.equals("Route")) { //$NON-NLS-1$
                            // String linkName = this.getLinkNameOfRoute(modelInstance, label);
                            return this.getTaskSchedules(modelInstance, label).toString();
                            // if (linkName != null) {
                            // return this.getTaskSchedules(modelInstance, linkName).toString();
                            // }
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ""; //$NON-NLS-1$
    }

    // Amir added
    // returns a json-array of this format: [{ x:"name", y:[1,2]},{x:"name2", y:[3,4]},...] where the y defines the
    // startingTime and the endingTime
    public JsonArray getProcessSchedules(EEDImpl modelInstance, String nodeName) {
        javax.json.JsonArrayBuilder jsonArray = Json.createArrayBuilder();
        int colorCounter = 0;
        List<Integer> periods = new ArrayList();
        Map<autoDesigner1.Process, String> processAndColor = new LinkedHashMap();

        for (Application app : modelInstance.getApplications()) {
            boolean appFlag = false;
            for (autoDesigner1.Process process : app.getProcess()) {
                boolean isMappedOnThisNode = false;
                for (Mapping mapping : process.getApplication().getMappings()) {
                    if (mapping.getNode().getName().equals(nodeName)) {
                        isMappedOnThisNode = true;
                        break;
                    }
                }
                if (isMappedOnThisNode) {
                    appFlag = true;
                    periods.add(process.getPeriod());
                    String color = this.colors.get(colorCounter);
                    processAndColor.put(process, color);

                }
            }
            if (appFlag)
                colorCounter = (colorCounter + 1) % this.colors.size();
        }

        int hyperPeriod = this.getHyperPeriod(periods);
        jsonArray.add(Json.createObjectBuilder().add("hyperperiod", hyperPeriod)); //$NON-NLS-1$

        for (Map.Entry<autoDesigner1.Process, String> entry : processAndColor.entrySet()) {
            autoDesigner1.Process process = entry.getKey();
            String color = entry.getValue();
            String pName = process.getName();
            if (process.getRecieveData() != null) {
                pName += " (Receiver of " + //$NON-NLS-1$
                        process.getRecieveData().getName() + ")"; //$NON-NLS-1$
            }
            if (process.getSendData() != null) {
                pName += " (Sender of " + //$NON-NLS-1$
                        process.getSendData().getName() + ")"; //$NON-NLS-1$
            }
            System.out.println("PName: " + process.getName()); //$NON-NLS-1$
            double wcet = process.getWcet();
            int period = process.getPeriod();
            for (double time = 0; time + wcet <= hyperPeriod; time += period) {
                double startingTime = time + process.getStartingTimeVal();
                double endingTime = startingTime + process.getWcet();
                String roundedSTime = df.format(startingTime);
                String roundedETime = df.format(endingTime);

                jsonArray.add(Json.createObjectBuilder().add("x", pName) //$NON-NLS-1$
                        .add("y", Json.createArrayBuilder() //$NON-NLS-1$
                                .add(roundedSTime).add(roundedETime))
                        .add("fillColor", color)); //$NON-NLS-1$
            }
        }

        // this.addDummyJSONObj(jsonArray, periods);

        return jsonArray.build();
    }

    // // Amir added
    // public void addDummyJSONObj(javax.json.JsonArrayBuilder jsonArray, List<Integer> periods) {
    // if (periods.size() == 0)
    // return;
    //
    // int hyperPeriod = this.getHyperPeriod(periods);
    // // Add a dummy inorder to extend the axis to the hyperperiod
    // jsonArray.add(Json.createObjectBuilder().add("x", "Dummy") //$NON-NLS-1$ //$NON-NLS-2$
    // .add("y", Json.createArrayBuilder() //$NON-NLS-1$
    // .add(hyperPeriod).add(hyperPeriod)));
    // }

    // Amir added
    public int getHyperPeriod(List<Integer> periods) {
        if (periods.size() == 0)
            return 0;
        int result = periods.get(0);
        for (int element : periods) {
            result = (result * element) / this.gcd(result, element);
        }

        return result;
    }

    // Amir added
    public int gcd(int a, int b) {
        if (a == 0)
            return b;
        return this.gcd(b % a, a);
    }

    // Amir added
    public JsonArray getTaskSchedules(EEDImpl modelInstance, String routeName) {
        List<Integer> periods = new ArrayList();
        List<Task> tasksList = new ArrayList();

        javax.json.JsonArrayBuilder jsonArray = Json.createArrayBuilder();

        for (Route route : modelInstance.getRoute()) {
            if (route.getName().equals(routeName)) {
                for (Task task : route.getTasks()) {
                    periods.add(task.getPeriod());
                    tasksList.add(task);
                }
            }
        }

        if (periods.size() > 0) {
            int hyperPeriod = this.getHyperPeriod(periods);
            jsonArray.add(Json.createObjectBuilder().add("hyperperiod", hyperPeriod)); //$NON-NLS-1$
            for (Task task : tasksList) {
                double wcet = task.getFrameLength();
                int period = task.getPeriod();
                for (double time = 0; time + wcet <= hyperPeriod; time += period) {
                    String tName = task.getName();
                    double startingTime = time + task.getStartingTimeVal();
                    double endingTime = startingTime + task.getFrameLength();
                    String roundedSTime = df.format(startingTime);
                    String roundedETime = df.format(endingTime);
                    jsonArray.add(Json.createObjectBuilder().add("x", tName).add("y", Json.createArrayBuilder().add(roundedSTime).add(roundedETime))); //$NON-NLS-1$ //$NON-NLS-2$
                }

            }

        }

        return jsonArray.build();
    }

    // returns a json-array of this format: [{ x:"name", y:[1,2]},{x:"name2", y:[3,4]},...] where the y defines the
    // startingTime and the endingTime
    // public JsonArray getTaskSchedules(EEDImpl modelInstance, String linkName) {
    // List<Integer> periods = new ArrayList();
    // List<Task> tasksList = new ArrayList();
    //
    // javax.json.JsonArrayBuilder jsonArray = Json.createArrayBuilder();
    //
    // for (Task task : modelInstance.getTasks()) {
    // if (task.getLink().getName().equals(linkName)) {
    // periods.add(task.getPeriod());
    // tasksList.add(task);
    // }
    // }
    //
    // if (periods.size() > 0) {
    // int hyperPeriod = this.getHyperPeriod(periods);
    // for (Task task : tasksList) {
    // double wcet = task.getFrameLength();
    // int period = task.getPeriod();
    // for (int time = 0; time + wcet <= hyperPeriod; time += period) {
    // String tName = task.getName();
    // double startingTime = task.getStartingTimeVal();
    // double endingTime = startingTime + task.getFrameLength();
    // String roundedSTime = df.format(startingTime);
    // String roundedETime = df.format(endingTime);
    // jsonArray.add(Json.createObjectBuilder().add("x", tName).add("y",
    // Json.createArrayBuilder().add(roundedSTime).add(roundedETime))); //$NON-NLS-1$ //$NON-NLS-2$
    // }
    //
    // }
    //
    // }
    //
    // return jsonArray.build();
    // }

    public String getLinkNameOfRoute(EEDImpl modelInstance, String routeName) {
        for (Route route : modelInstance.getRoute()) {
            if (route.getName().equals(routeName)) {
                for (Link l : modelInstance.getLinks()) {
                    if (l.getLs().equals(route.getStartNode()) && l.getLf().equals(route.getEndNode())) {
                        return l.getName();
                    } else if (l.getLs().equals(route.getEndNode()) && l.getLf().equals(route.getStartNode())) {
                        return l.getName();
                    }

                }
            }
        }
        return null;
    }

    // @GetMapping("schedule")
    // public RedirectView createSchedule(@RequestParam(value = "projectId") String projectId, @RequestParam(value =
    // "objectId") String objectId) throws IOException {
    // String projId = projectId;
    // String objId = objectId;
    //
    // System.out.println("createSchedule? projectId: " + projectId + ", objectId: " + objId); //$NON-NLS-1$
    // //$NON-NLS-2$
    //
    // CreateRepresentation.createRepresentation(projId, objectId, "diagram-test"); //$NON-NLS-1$
    //
    // RedirectView redirectView = new RedirectView();
    // redirectView.setUrl("http://localhost:8080/projects/" + projId + "/edit"); //$NON-NLS-1$ //$NON-NLS-2$
    //
    // System.out.println("yes is there!"); //$NON-NLS-1$
    // return redirectView;
    // }

    // added by Amir: creates the sample topology in userAssignment as xml
    public void saveSampleTopAsXML() {
        int x = 4;
        int p = 4;// before was 6
        int b = 2;// the number of applications
        userAssignment us = new userAssignment();
        EEDImpl emfModel = us.createTopology(x, p, b);
        System.out.println("size of process of app1: " + emfModel.getApplications().get(0).getProcess().size()); //$NON-NLS-1$
        try {
            this.saveAsXML(emfModel, "SampleTopology.xml"); //$NON-NLS-1$
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readModelInstance() throws IOException {
        // Reads the contents behind the url and saves it as .xml
        URL website = new URL("http://localhost:8080/api/editingcontexts/" + this.projectId + "/documents/" + this.documentId); //$NON-NLS-1$ //$NON-NLS-2$
        ReadableByteChannel rbc = Channels.newChannel(website.openStream());

        FileOutputStream fos = new FileOutputStream(this.filename);
        fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
        fos.close();

        this.setObject(this.readXmlObject());
    }

    public void saveAsXML(EEDImpl routing, String fileName) throws IOException {

        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xml", new XMIResourceFactoryImpl()); //$NON-NLS-1$

        ResourceSet resSet = new ResourceSetImpl();
        Resource resource = resSet.createResource(URI.createFileURI(fileName));
        resource.getContents().add(routing);
        resource.save(Collections.EMPTY_MAP);
    }

    public Object readXmlObject() {

        org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createFileURI(this.filename);
        // Register the package for the ResourceFactory
        AutoDesigner1Package.eINSTANCE.eClass();

        ResourceSet resourceSet = new ResourceSetImpl();
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", new XMIResourceFactoryImpl()); //$NON-NLS-1$
        Resource resource = resourceSet.getResource(uri, true);

        return resource.getContents().get(0);
    }

    public RedirectView solve() throws IOException {
        int redundantRoutes = 2;

        EEDImpl eedModel = (EEDImpl) this.object;

        List<Link> userCreatedLinks = new ArrayList<>();
        List<Data_Out> dataouts = new ArrayList<>();

        for (Link l : eedModel.getLinks()) {
            userCreatedLinks.add(l);
        }

        // The user only creates links in one direction. The solver needs a link in both directions. The method copies
        // the attributes
        EEDImpl routingLink = Services.createOppositeLink(eedModel);
        // The user does not create any DataIn or DataOut elements. We create them only for the solver and delete them
        // afterwards
        EEDImpl routingData = Services.createDataInDataOut(routingLink);

        // Amir added
        routingData = this.setPropsBeforeSolving(routingData);

        if (eedModel.getSettings() != null) {
            // The number of redundant routes which should be created based on the userInput
            redundantRoutes = eedModel.getSettings().getRedundantRoutes();
        }

        try {
            Services.createTasks(routingData);
            // The following method changes the grbVar of the user created mappings to 1.
            // ahpcc = cs.addExistingMappings(ahpcc);
            // ahpcc = addMappings(ahpcc);
            // Amir changed from TopologySolver to ArchSolving
            ArchSolving ts = new ArchSolving();
            ts.initSolver();
            // Amir added
            // routingData = ts.addExistingMappings(routingData);
            ts.addMappings(routingData);
            ts.createGRBVars(routingData);
            // I assume the Int is the number of high-redundant routes which should be returned for sc apps
            // The method returns all Data_ins with grbvar=1

            // Amir commented out
            // dataIns = ts.createConstrAppMapping(routingData, redundantRoutes);
            dataouts = ts.createConstrAppMapping(routingData);
        } catch (Exception e) {
            e.printStackTrace();
            RedirectView redirectView = new RedirectView();
            redirectView.setUrl("http://localhost:8080/projects/" + this.projectId + "/errorgurobi"); //$NON-NLS-1$ //$NON-NLS-2$
            return redirectView;

        }

        try {
            this.setMissingPropsAfterSolving(routingData);
        } catch (GRBException e) {
            e.printStackTrace();
        }

        try {
            this.cleanUpModel(eedModel, dataouts);
        } catch (GRBException e) {
            e.printStackTrace();
        }

        // The user should see routing elements as the result and not DataIn/DataOut elements
        eedModel = this.createRoute(dataouts, eedModel);
        // remove opposite links and more

        // Amir commented out
        eedModel = this.keepLinks(userCreatedLinks, eedModel);

        // Not used anymore. We instead use routes for the display
        // routing = this.keepDataIns(dataIns, routing);

        // if (routing.getDataSelection() == null) {
        // AutoDesigner1FactoryImpl fact = new AutoDesigner1FactoryImpl();
        // DataSelection userinput = fact.createDataSelection();
        // routing.setDataSelection(userinput);
        //
        // }

        String modelFilename = "SolvedModel.xml"; //$NON-NLS-1$
        // routing.getLink().clear();
        // routing.getLink().addAll(userCreatedLinks);
        // routing.getData_in().retainAll(dataIns);
        // System.out.println(routing.getLink().toString());
        this.saveAsXML(eedModel, modelFilename);

        // Change modelFilename
        // Changed from C:\\Users\\Andre\\TUM\\eclipse-workspace-mapping\\ahpccSolver\\SolvedModel.xml

        @SuppressWarnings("unused")
        UploadDocument upload = new UploadDocument(this.projectId, modelFilename);

        /*
         * try { this.saveAsXML(routing, "SolvedModel.xml"); //$NON-NLS-1$ } catch (IOException e) {
         * e.printStackTrace(); } // Change modelFilename // Changed from
         * C:\\Users\\Andre\\TUM\\eclipse-workspace-mapping\\ahpccSolver\\SolvedModel.xml String modelFilename =
         * "SolvedModel.xml"; //$NON-NLS-1$
         * @SuppressWarnings("unused") UploadDocument upload = new UploadDocument(this.projectId, modelFilename);
         */

        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("http://localhost:8080/projects/" + this.projectId + "/edit"); //$NON-NLS-1$ //$NON-NLS-2$

        return redirectView;

    }

    // Amir added
    // called before the solving
    public EEDImpl setPropsBeforeSolving(EEDImpl modelInstance) {
        // do some cleanup. The model could be a solvedmodel
        // reset the startingtimes

        for (Data data : modelInstance.getData()) {
            data.getSentby().setSendData(data);
            for (autoDesigner1.Process p : data.getReceivedby()) {
                p.setRecieveData(data);
            }

        }

        // remove Mapping whose apps are none
        List<Mapping> mappingToBeDeleted = new ArrayList<>();

        for (Mapping mapping : modelInstance.getMappings()) {
            if (mapping.getApp() == null || mapping.getNode() == null) {
                mappingToBeDeleted.add(mapping);
            }
        }

        EcoreUtil.deleteAll(mappingToBeDeleted, false);

        return modelInstance;
    }

    // Amir added
    // called after the solving
    public EEDImpl setMissingPropsAfterSolving(EEDImpl modelInstance) throws GRBException {
        List<Mapping> mappings = Services.getActivMappings(modelInstance);
        modelInstance.getMappings().clear();
        modelInstance.getMappings().addAll(mappings);

        for (Node node : modelInstance.getNodes()) {
            node.getMappings().clear();
        }

        // add the mappings in the nodes
        for (Mapping mapping : modelInstance.getMappings()) {
            mapping.getNode().getMappings().add(mapping);
        }

        return modelInstance;
    }

    public void cleanUpModel(EEDImpl modelInstance, List<Data_Out> activDIns) throws GRBException {

        // TODO remove inactive tasks from links

        // remove inactive tasks
        // List<Task> inactiveTasks = new ArrayList<>();
        //
        // for (Task task : modelInstance.getTasks()) {
        // boolean taskActiv = false;
        // if (task.getLink() == null) {
        // inactiveTasks.add(task);
        // continue;
        // }
        //
        // for (Data_In dIn : task.getLink().getBelongs_data_in()) {
        // if (dIn.getDatain_has().equals(task.getData())) {
        // // is the data even sent over the link that belongs to task?
        // try {
        // System.out.println(dIn.getData_in_gurobi().get(GRB.DoubleAttr.X) == 1);
        // } catch (GRBException e) {
        // e.printStackTrace();
        // }
        //
        // if (activDIns.contains(dIn)) {
        // taskActiv = true;
        // }
        // }
        // }
        //
        // if (!taskActiv) {
        // inactiveTasks.add(task);
        // }
        //
        // }
        //
        // for (Task task : inactiveTasks) {
        // EcoreUtil.delete(task);
        // }

        // ArrayList<Task> inActiveTasks = new ArrayList<>();
        // ArrayList<Task> activeTasks = new ArrayList<>();

        // for (Link link : modelInstance.getLinks()) {
        // for (Task task : link.getTask()) {
        // for (Data_In data_in : activDIns) {
        //
        // // if (data_in.getData_in_gurobi().get(GRB.DoubleAttr.X) != 1) {
        // // activeTasks.addAll(data_out.getData().getTask());
        //
        // for (Task task2 : data_in.getLink().getTask()) {
        // // if(task2.get)
        // activeTasks.addAll(data_in.getLink().getTask());
        // }
        //
        // // }
        // }
        // }
        // }

        // for (Task task : modelInstance.getTasks()) {
        // if (task.getLink() == null) {
        // inActiveTasks.add(task);
        // continue;
        // }
        //
        // boolean activ = false;
        //
        // Link opposite_link = null;
        //
        // for (Link l : modelInstance.getLinks()) {
        // if (l.getLf() == task.getLink().getLs() && l.getLs() == task.getLink().getLf()) {
        // opposite_link = l;
        // break;
        // }
        //
        // }
        //
        // for (Data_In dIn : opposite_link.getD_in()) {
        // if (task.getData() == dIn.getData() && dIn.getData_in_gurobi().get(GRB.DoubleAttr.X) == 1) {
        // // check if the dataIn of the opposite directed link is aktiv
        //
        // System.out.println("taskaktiv: " + task.getName()); //$NON-NLS-1$
        // activ = true;
        //
        // // set The Task of the Link to the opposite one
        //
        // }
        // }
        //
        // if (!activ) {
        // inActiveTasks.add(task);
        // }
        // }

        // for (Task task : inActiveTasks) {
        // EcoreUtil.delete(task);
        // }

        // Delete the elements which we only created for the solver. The user does not need them
        EcoreUtil.deleteAll(modelInstance.getData_outs(), true);
        EcoreUtil.deleteAll(modelInstance.getData_ins(), true);

    }

    // activ dataIns as parameter
    public EEDImpl createRoute(List<Data_Out> dataouts, EEDImpl routing) {
        for (Data_Out d : dataouts) {
            AutoDesigner1FactoryImpl fact = new AutoDesigner1FactoryImpl();
            Route route = fact.createRoute();

            route.setName("Route" + d.getLink().getLs().getName() + d.getLink().getLf().getName()); //$NON-NLS-1$
            route.setStartNode(d.getLink().getLs());
            route.setEndNode(d.getLink().getLf());
            route.setData(d.getData());

            for (Task task : d.getLink().getTask()) {
                boolean activ = false;
                for (Data_Out d2 : dataouts) {
                    if (d2.getData() == task.getData() && d2.getLink() == task.getLink()) {
                        activ = true;
                    }
                }
                if (activ) {
                    route.getTasks().add(task);
                }
            }
            routing.getRoute().add(route);
        }

        return routing;
    }

    // Amir added
    public void keepTasks(List<Task> tasks, EEDImpl modelInstance) {
        List<Task> deleteTasks = new ArrayList<>();

        for (Task task : modelInstance.getTasks()) {
            if (!tasks.contains(task)) {
                deleteTasks.add(task);
            }
        }

        for (int i = 0; i < deleteTasks.size(); i++) {
            EcoreUtil.delete(deleteTasks.get(i));
        }
    }

    public EEDImpl keepDataIns(List<Data_In> dataIns, EEDImpl routing) {
        List<Data_In> deleteDataIns = new ArrayList<>();

        for (Data_In d : routing.getData_ins()) {
            if (!dataIns.contains(d)) {
                deleteDataIns.add(d);
            }
        }
        for (int i = 0; i < deleteDataIns.size(); i++) {
            EcoreUtil.delete(deleteDataIns.get(i));
        }

        return routing;
    }

    // Keeps all the links which are given in the first list and deletes the others in routing
    public EEDImpl keepLinks(List<Link> links, EEDImpl routing) {
        List<Link> deleteLinks = new ArrayList<>();
        System.out.println(routing.getLinks().size());
        for (Link l : routing.getLinks()) {
            if (!links.contains(l)) {
                deleteLinks.add(l);
            }
        }
        for (int i = 0; i < deleteLinks.size(); i++) {
            EcoreUtil.delete(deleteLinks.get(i));
        }
        return routing;
    }

    // returns "routing" or "eed" depending on model type
    public String extractModelType(Object object) {

        String[] parts = object.toString().split("\\."); //$NON-NLS-1$

        return parts[0];
    }

    public String getFilename() {
        return this.filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getDocumentId() {
        return this.documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getProjectId() {
        return this.projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Object getObject() {
        return this.object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

}
