package autoDesigner1.design;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.business.api.session.Session;

import autoDesigner1.Application;
import autoDesigner1.Data;
import autoDesigner1.ECU;
import autoDesigner1.EED;
import autoDesigner1.HPCU;
import autoDesigner1.Link;
import autoDesigner1.Mapping;
import autoDesigner1.Node;
import autoDesigner1.Task;
import autoDesigner1.impl.AutoDesigner1FactoryImpl;
import autoDesigner1.impl.Data_InImpl;
import autoDesigner1.impl.Data_OutImpl;
import autoDesigner1.impl.EEDImpl;
import autoDesigner1.impl.LinkImpl;
import autoDesigner1.impl.MappingImpl;
import autoDesigner1.impl.TaskImpl;
import gurobi.GRB.DoubleAttr;
import gurobi.GRB;
import gurobi.GRBException;

/**
 * The services class used by VSM.
 */
public class Services {

	/**
	 * See
	 * http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24
	 * for documentation on how to write service methods.
	 */
	public EObject myService(EObject self, String arg) {
		// TODO Auto-generated code
		System.out.println("test");
		
		return self;
	}

	/*
	 * public void transformToComponent(Component c, ArrayList<EObject>
	 * containingViews) { AutoDesigner1FactoryImpl fact= new
	 * AutoDesigner1FactoryImpl();
	 * 
	 * final ECU newComponent = fact.eINSTANCE.createECU(); // ... copy attributes
	 * ...
	 * 
	 * // Give to the new component the same size/position as the old one. if
	 * (containingViews != null && containingViews.size() > 0) { DNodeContainer
	 * existingNode = (DNodeContainer) containingViews.get(0); IGraphicalEditPart
	 * editPart = getEditPart(existingNode); if (editPart instanceof ShapeEditPart)
	 * { ShapeEditPart part = (ShapeEditPart) editPart;
	 * SiriusLayoutDataManager.INSTANCE .addData(new
	 * RootLayoutData(existingNode.eContainer(), part.getLocation(),
	 * part.getSize())); }
	 * 
	 * //TODO: Place bordered nodes at the same position:
	 * existingNode.getOwnedBorderedNodes().stream().forEach(bn -> {
	 * IGraphicalEditPart editPart2 = getEditPart(bn);
	 * System.out.println(editPart2.toString()); if (editPart2 instanceof
	 * ShapeEditPart) { ShapeEditPart part = (ShapeEditPart) editPart2;
	 * SiriusLayoutDataManager.INSTANCE .addData(new RootLayoutData(bn.eContainer(),
	 * part.getLocation(), part.getSize())); } }); }
	 * 
	 * // Delete the old component EcoreUtil.remove(c);
	 * 
	 * }
	 */

	public EObject test(EObject object) {
		System.out.println("service invoked;");
		return object;
	}

	// Creates a complete full mesh for models
	public static EEDImpl createFullMesh(EEDImpl routing) {
		AutoDesigner1FactoryImpl fact = new AutoDesigner1FactoryImpl();
		EList<Link> userCreatedLinks = routing.getLinks();

		// Copied from createTopology
		for (Node node1 : routing.getNodes()) {
			// j++;
			// int k=0;
			for (Node node2 : routing.getNodes()) {
				// k++;
				// if(!node1.equals(node2) && j<=k) {
				if (!node1.equals(node2) && !linkExists(userCreatedLinks, node1, node2)) {
					LinkImpl link = (LinkImpl) fact.createLink();
					link.setName("link_" + node1.getName() + "_" + node2.getName());
					node1.getLinks().add(link);
					link.setLf(node2);
					link.setLs(node1);
					routing.getLinks().add(link);

					System.out.println("Link created: " + link.getName());

				}
			}
		}

		return routing;
	}

	public static Boolean linkExists(EList<Link> userCreatedLinks, Node n1, Node n2) {

		for (Link l1 : userCreatedLinks) {
			if (l1.getLs() == n1 && l1.getLf() == n2 || l1.getLs() == n2 && l1.getLf() == n1) {
				System.out.println("There already exists a link: " + l1.getName());

				return true;
			}
		}

		return false;
	}

	public static EEDImpl createOppositeLink(EEDImpl routing) {
		AutoDesigner1FactoryImpl fact = new AutoDesigner1FactoryImpl();
		EList<Link> newLinks = new BasicEList<Link>();

		for (Link l : routing.getLinks()) {
			LinkImpl newL = (LinkImpl) fact.createLink();
			newL.setLf(l.getLs());
			newL.setLs(l.getLf());
			System.out.println(l.getLf().getName());
			newL.setName("link_" + newL.getLs().getName() + "_" + newL.getLf().getName());
			newL.getLs().getLinks().add(newL);
			newL.setCost(l.getCost());
			newL.setLink_type(l.getLink_type());
			System.out.println("Link created: " + newL.getName());

			newLinks.add(newL);
		}
		routing.getLinks().addAll(newLinks);

		return routing;
	}
	
	
	//Amir added
	public static void createTasks(EEDImpl eedModel) throws Exception{     
		AutoDesigner1FactoryImpl fact = new AutoDesigner1FactoryImpl();
		for (Data data : eedModel.getData()) {
			Task userCreatedTask = data.getUsercreatedtask(); 
			if(userCreatedTask==null)
				continue; 
			
			for (Link link : eedModel.getLinks()) {
				TaskImpl task = (TaskImpl) fact.createTask();
				task.setName("Task" + data.getName() + link.getName());
				eedModel.getTasks().add(task);
				task.setData(data);
				data.getTask().add(task);
				link.getTask().add(task);
				task.setLink(link);
				task.setPeriod(userCreatedTask.getPeriod());
				task.setFrameLength(userCreatedTask.getFrameLength());
			}
			
		} 
	}
	

	// Takes a EEDImpl with links but no DataIn/DataOut and adds all 4
	// DataIn/DataOut for each link
	public static EEDImpl createDataInDataOut(EEDImpl routing) {
		AutoDesigner1FactoryImpl fact = new AutoDesigner1FactoryImpl();

		/*
		 * for(Link l1 : routing.getLink()) { //Link has a field which references dataIn
		 * and DataOut -> Dont forget to add the datain/dataouts there //TODO Check if I
		 * can reuse the DataIn/out creation of createTopology
		 * 
		 * 
		 * Node n1 = l1.getLs(); Node n2 = l1.getLf();
		 * 
		 * Data_InImpl data_in1 = (Data_InImpl) fact.createData_In(); //Change
		 * attributes data_in1.setLink(l1);
		 * l1.getD_in().add(data_in1);
		 * 
		 * //data_in1.setData(d); //data_in1.setName("datain_"+l1.getName()+
		 * d.getName());
		 * 
		 * Data_InImpl data_in2 = (Data_InImpl) fact.createData_In();
		 * data_in2.setLink(l1); l1.getD_in().add(data_in2);
		 * 
		 * Data_OutImpl data_out1 = (Data_OutImpl) fact.createData_Out();
		 * data_out1.setLink(l1);
		 * l1.getD_out().add(data_out1);
		 * 
		 * Data_OutImpl data_out2 = (Data_OutImpl) fact.createData_Out();
		 * data_out2.setLink(l1);
		 * l1.getD_out().add(data_out2);
		 * 
		 * 
		 * 
		 * l1.getD_in().add(data_in1); l1.getD_in().add(data_in2);
		 * l1.getD_out().add(data_out1);
		 * l1.getD_out().add(data_out2);
		 * 
		 * }
		 */
		// Copied from createTopology
		// The following for loops create all necessary dataIn/dataOut for the model
		ArrayList<Link> visitedLinks = new ArrayList<Link>();
		ArrayList<Data> visitedData = new ArrayList<Data>();

		for (Link l1 : routing.getLinks()) {
			for (Link l2 : routing.getLinks()) {

				if (!l1.equals(l2)) {
					// System.out.println("l1: name=" + l1.getName()+ " ls=" + l1.getLs().getName()
					// + " lf=" +l1.getLf().getName());
					// System.out.println("l2: name=" + l2.getName()+ " ls=" + l2.getLs().getName()
					// + " lf=" +l2.getLf().getName());
					// System.out.println("First condition: " + l1.getLf().equals(l2.getLs()));
					// System.out.println("Second condition: " + l1.getLs().equals(l2.getLf()));
					// System.out.println("Third condition: " + !(visitedLinks.contains(l1)&&
					// visitedLinks.contains(l2)));
					// two opposite links?
					if (l1.getLf().equals(l2.getLs()) && l1.getLs().equals(l2.getLf())
							&& !(visitedLinks.contains(l1) && visitedLinks.contains(l2))) {
						System.out.println(
								"Creating DataIn/DataOut for l1: " + l1.getName() + " and l2: " + l2.getName());
						for (Data d : routing.getData()) {

							Data_InImpl data_in1 = (Data_InImpl) fact.createData_In();
							data_in1.setLink(l1);
							l1.getD_in().add(data_in1);
							data_in1.setData(d);
							data_in1.setName("datain_" + l1.getName() + d.getName());
							d.getD_in().add(data_in1);

							Data_InImpl data_in2 = (Data_InImpl) fact.createData_In();
							data_in2.setLink(l2);
							data_in2.setName("datain_" + l2.getName() + d.getName());
							l2.getD_in().add(data_in2);
							data_in2.setData(d);
							d.getD_in().add(data_in2);

							Data_OutImpl data_out1 = (Data_OutImpl) fact.createData_Out();
							l1.getD_out().add(data_out1);
							data_out1.setLink(l1);
							data_out1.setData(d);
							data_out1.setName("dataout_" + l1.getName() + d.getName());
							d.getD_out().add(data_out1);

							Data_OutImpl data_out2 = (Data_OutImpl) fact.createData_Out();
							l2.getD_out().add(data_out2);
							data_out2.setLink(l2);
							data_out2.setData(d);
							data_out2.setName("dataout_" + l2.getName() + d.getName());
							d.getD_out().add(data_out2);
							/*
							 * OrderImpl orderin_out1= (OrderImpl) fact.createOrder();
							 * orderin_out1.setName("order_"+data_in1.getName()+data_out2.getName());
							 * orderin_out1.setHas_datain(data_in1); orderin_out1.setHas_dataout(data_out2);
							 */

							/*
							 * OrderImpl orderin_out2= (OrderImpl) fact.createOrder();
							 * orderin_out2.setName("order_"+data_in2.getName()+data_out2.getName());
							 * orderin_out2.setHas_datain(data_in2); orderin_out2.setHas_dataout(data_out2);
							 */

							data_in1.setD_out(data_out2);
							data_out1.setD_in(data_in2);

							data_in2.setD_out(data_out1);
							data_out2.setD_in(data_in1);

							routing.getData_ins().add(data_in1);
							routing.getData_outs().add(data_out1);
							routing.getData_ins().add(data_in2);
							routing.getData_outs().add(data_out2);

							// test1.getOrder().add(orderin_out1);
							// test1.getOrder().add(orderin_out2);
						}
						visitedLinks.add(l1);
						visitedLinks.add(l2);

					}

				}

			}
		}

		System.out.println("Number of links: " + routing.getLinks().size());
		System.out.println("Number of Data_ins: " + routing.getData_ins().size());
		System.out.println("Number of Data_outs: " + routing.getData_outs().size());

		return routing;
	}
	
	
	
	public static List<Mapping> getActivMappings(EEDImpl emfModel) throws GRBException{
		List<Mapping> mappings = new ArrayList<Mapping>();
	     
	     for(Mapping mapping:emfModel.getMappings()) {
	    	 if(mapping.getM_gurobi().get(DoubleAttr.X)==1) {
	    		 
	    		 //added for bug mappingimpl is not contained in a resource. -> Did not get expected result
	    		 //Potential error: deletes also the mappings with a gurobi variable set to 1
	    		 mapping.getApp().getMappings().clear();;
	    		 mapping.getApp().getMappings().add(mapping);
	    		 
	    		 mapping.getNode().getMappings().clear();
	    		 mapping.getNode().getMappings().add(mapping);
	    		 
	    		 System.out.println(" Mapping: "+ " "+ mapping.getName());
	    		 mappings.add(mapping);
	    	 }
	    	 
	     }
	     return mappings; 
	}
	/*
	 * public static EEDImpl addAllPossibleMappings(EEDImpl eed) {
	 * 
	 * AutoDesigner1FactoryImpl fact = new AutoDesigner1FactoryImpl();
	 * 
	 * EList<Mapping> mappings = eed.getMappings();
	 * 
	 * for (Chip chip : ahpcc.getChip()) {
	 * 
	 * for (Processor processor : chip.getProcessor()) {
	 * 
	 * for (Core core : processor.getCore()) {
	 * 
	 * for (Application app : ahpcc.getApplication()) {// create mapping variables
	 * and set the parameters Boolean mapExists = false;
	 * 
	 * for (Mapping map : mappings) { if (map.getEach_mapping_has_one_core() == core
	 * && map.getEach_mapping_has_one_app() == app) { mapExists = true; } }
	 * 
	 * if (!mapExists) { // Only create mapping if not created by user
	 * 
	 * MappingImpl mapping = (MappingImpl) fact.createMapping();
	 * mapping.setName("Map" + app.getName() + core.getName()); //$NON-NLS-1$
	 * mapping.setEach_mapping_has_one_app(app);
	 * mapping.setEach_mapping_has_one_core(core); ahpcc.getMapping().add(mapping);
	 * app.getEach_app_has_one_to_many_mapping().add(mapping);
	 * core.getEach_core_has_zero_to_many_mappings().add(mapping);
	 * 
	 * }
	 * 
	 * }
	 * 
	 * } } }
	 */

}
