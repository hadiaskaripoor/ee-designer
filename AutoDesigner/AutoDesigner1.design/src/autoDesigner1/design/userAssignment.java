package autoDesigner1.design;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import gurobi.GRB;
import gurobi.GRBException;
import autoDesigner1.Application;
//import test1.Cr;
import autoDesigner1.Data;
import autoDesigner1.Data_In;
import autoDesigner1.Data_Out;
//import test1.L_Out;
import autoDesigner1.Link;
import autoDesigner1.Mapping;
import autoDesigner1.Node;
import autoDesigner1.Task;
import autoDesigner1.UserCreatedTask;
import autoDesigner1.Process;
//import test1.Order;
//import autoNetwork.autoNetwork;
import autoDesigner1.impl.ApplicationImpl;
//import autoDesigner1.impl.CrImpl;
//import test1.impl.CrImpl;
import autoDesigner1.impl.DataImpl;
import autoDesigner1.impl.Data_InImpl;
import autoDesigner1.impl.Data_OutImpl;
import autoDesigner1.impl.ECUImpl;
import autoDesigner1.impl.EEDImpl;
import autoDesigner1.impl.LinkImpl;
import autoDesigner1.impl.NodeImpl;
//import autoDesigner1.impl.OrderImpl;
import autoDesigner1.impl.TaskImpl;
import autoDesigner1.impl.UserCreatedTaskImpl;
//import test1.impl.Test1FactoryImpl;
import autoDesigner1.impl.AutoDesigner1FactoryImpl;
import autoDesigner1.impl.VehicleTopologyImpl;
import autoDesigner1.impl.ProcessImpl;
import autoDesigner1.impl.SettingsImpl;
import autoDesigner1.impl.MappingImpl;
//import autoNetwork.impl.autoNetworkImpl;
//import routingScheduling.impl.routeSchedImpl;

public class userAssignment {
	public static void main(String[] args) throws GRBException, IOException {

		userAssignment create = new userAssignment();

		create.myService();

	}

	/*
	 * public AHPCCImpl createHW(int a, int c, int p) {
	 * 
	 * EedFactoryImpl fact= new EedFactoryImpl(); AHPCCImpl ahpcc = (AHPCCImpl)
	 * fact.createAHPCC();
	 */

	public EEDImpl createTopology(int m, int a, int b) {
		// root element
		// routingSchedulingImpl rs = (routingSchedulingImpl) self.eContainer();

		AutoDesigner1FactoryImpl fact = new AutoDesigner1FactoryImpl();
		// NetworkTopologyImpl r = (NetworkTopologyImpl) fact.eContainer();
		EEDImpl rs = (EEDImpl) fact.createEED();

		for (int i = 0; i < m; i++) {
			// Amir changed
			// NodeImpl node=(NodeImpl) fact.createNode();
			NodeImpl node = (ECUImpl) fact.createECU();
			node.setName("Node" + i);
			//node.setId(i+1);
			rs.getNodes().add(node);

		}

		int counter = 0;
		rs.getNodes().get(0).setCost(50);
		rs.getNodes().get(1).setCost(50);
		// int j=0;
		for (Node node1 : rs.getNodes()) {

			for (Node node2 : rs.getNodes()) {
				if (!node1.equals(node2) && node1 == rs.getNodes().get(1) && node2 == rs.getNodes().get(0)
						) {
					LinkImpl link = (LinkImpl) fact.createLink();
					link.setName("link_" + node1.getName() + "_" + node2.getName());
					node1.getLinks().add(link);
					link.setLf(node2);
					link.setLs(node1);
					rs.getLinks().add(link);
				}
			}
		}
		for (Node node1 : rs.getNodes()) {

			for (Node node2 : rs.getNodes()) {
				if (!node1.equals(node2) && node1 == rs.getNodes().get(1) && node2 == rs.getNodes().get(2)
						) {
					LinkImpl link = (LinkImpl) fact.createLink();
					link.setName("link_" + node1.getName() + "_" + node2.getName());
					node1.getLinks().add(link);
					link.setLf(node2);
					link.setLs(node1);
					rs.getLinks().add(link);
				}

				else if (!node1.equals(node2) && node1 == rs.getNodes().get(1) && node2 == rs.getNodes().get(3)
						) {
					LinkImpl link = (LinkImpl) fact.createLink();
					link.setName("link_" + node1.getName() + "_" + node2.getName());
					node1.getLinks().add(link);
					link.setLf(node2);
					link.setLs(node1);
					rs.getLinks().add(link);
				}

			}
		}

		/*
		 * for(Node node1: rs.getNode()) { // j++; //int k=0; for(Node node2:
		 * rs.getNode()) { //k++; //if(!node1.equals(node2) && j<=k) {
		 * if(!node1.equals(node2)) { LinkImpl link= (LinkImpl) fact.createLink();
		 * link.setName("link_"+node1.getName()+"_"+node2.getName());
		 * node1.getLinks().add(link); link.setLf(node2); link.setLs(node1);
		 * rs.getLink().add(link);
		 * 
		 * 
		 * counter++; //}//added }
		 * 
		 * } }
		 */

		/*
		 * for(int i=0; i<test1.getLink().size();i++) { if(i<15) {
		 * test1.getLink().get(i).setCost(10); } if(i>15) {
		 * test1.getLink().get(i).setCost(20); } }
		 */

		/*
		 * rs.getLink().get(0).setCost(50);//100-0 rs.getLink().get(5).setCost(50);
		 * rs.getLink().get(1).setCost(40);//100-1 rs.getLink().get(4).setCost(40);
		 */
		// rs.getLink().get(7).setCost(400);//100-2
		// rs.getLink().get(11).setCost(400);
		// rs.getLink().get(3).setCost(1000);//100-3
		// rs.getLink().get(9).setCost(1000);

		// rs.getLink().get(4).setCost(80);
		// rs.getLink().get(25).setCost(50);
		// rs.getLink().get(6).setCost(20);//0-1

		/*
		 * rs.getLink().get(11).setCost(20); rs.getLink().get(7).setCost(30);//0-2
		 * rs.getLink().get(16).setCost(30); rs.getLink().get(8).setCost(10);//0-3
		 * rs.getLink().get(21).setCost(10); rs.getLink().get(9).setCost(5);//0-4
		 * rs.getLink().get(26).setCost(5); rs.getLink().get(12).setCost(90);//1-2
		 * rs.getLink().get(17).setCost(90); rs.getLink().get(14).setCost(150);//1-4
		 * rs.getLink().get(27).setCost(150); rs.getLink().get(19).setCost(250);//2-4
		 * rs.getLink().get(28).setCost(250);
		 * 
		 * 
		 * rs.getLink().get(4).setCost(100); rs.getLink().get(24).setCost(300);//3-4
		 * rs.getLink().get(25).setCost(100); rs.getLink().get(29).setCost(300);//4-3
		 * rs.getLink().get(23).setCost(400);//3-2
		 * rs.getLink().get(18).setCost(400);//2-3 rs.getLink().get(22).setCost(200);
		 * rs.getLink().get(13).setCost(200);//1-3
		 */

		for (int i = 0; i < a; i++) {
			DataImpl data = (DataImpl) fact.createData();
			data.setName("Data" + i);
			//data.setId(i);
			rs.getData().add(data);

			/*
			 * TaskImpl task=(TaskImpl) fact.createTask();
			 * task.setName("Task"+i+data.getName()); rs.getTask().add(task);
			 * task.setData(data); data.setTask(task);
			 */
			int p = 2;// the number of unicast or multicast applications--> one application as sender
						// and another one as receiver

			/*
			 * for(int j=0;j<p;j++) { //ApplicationImpl app=(ApplicationImpl)
			 * fact.createApplication(); //app.setName("Application"+j+data.getName()); //
			 * rs.getApplication().add(app); if(j==0) {
			 * //app.setSentby(rs.getNode().get(0)); //app.setApp_recieves(data);
			 * 
			 * app.setSendData(data); data.setSentby(app);
			 * 
			 * } if(j==1) {
			 * 
			 * //app.setReceivedby(rs.getNode().get(2)); app.setApp_recieves(data);
			 * //app.setSendData(data); data.set (app); }
			 * 
			 * 
			 * }
			 */
			
			for (int j = 0; j < b; j++) {
				ApplicationImpl app = (ApplicationImpl) fact.createApplication();
				app.setName("Application" + j + data.getName());
				rs.getApplications().add(app);
				int n = 3; // the number of processes
				
				for (int x = 0; x < n; x++) {// p is the number of processes
					//Amir added
					List<Process> processList = new ArrayList<>(); 
					ProcessImpl process = (ProcessImpl) fact.createProcess();
					process.setName("Process" + x + app.getName());
					process.setApplication(app);
					if (x == 0) {
						process.setPeriod(600);
						process.setWcet(5);
					}
					if (x == 1) {
						process.setPeriod(1200);
						process.setWcet(1);

					}

					if (x == 2) {
						process.setPeriod(300);
						process.setWcet(2);

					}

					if (j == 0 && x == 0) {
						process.setSendData(data);

						data.setSentby(process);
					}

					if (j == 1 && x == 1) {
						process.setRecieveData(data);
						processList.add(process);
						data.getReceivedby().add(process); 
					}

					/*
					 * if(x==2) { process.setPeriod(600); process.setWcet(20); }
					 */
					
					
					app.getProcess().add(process);
					//Amir commented out
					//process can not be contained in two resources!
					//rs.getProcess().add(process);
					System.out.println("process added: "+app.getProcess().size()); 

				}
				//0?
				System.out.println("number of process added: "+app.getProcess().size()); 
				System.out.println("number of process added in rs: "+rs.getProcess().size()); 

			}

		}

		/*
		 * for(int j=0;j<b;j++) { ApplicationImpl app=(ApplicationImpl)
		 * fact.createApplication(); app.setName("Application"+j);
		 * rs.getApplication().add(app); int n=0; for( int x=0; x<n; x++) {// p is the
		 * number of processes ProcessImpl process = (ProcessImpl) fact.createProcess();
		 * process.setName("Process"+x+ app.getName()); process.setApplication(app);
		 * if(x==0) { process.setPeriod(600); process.setWcet(5); } if(x==1) {
		 * process.setPeriod(1200); process.setWcet(1);
		 * 
		 * }
		 * 
		 * 
		 * 
		 * app.getProcess().add(process); rs.getProcess().add(process); }
		 * 
		 * 
		 * }
		 */

//		for (Application app : rs.getApplications()) {// create mapping variables and set the parameters
//
//			for (Node node : rs.getNodes()) {
//
//				MappingImpl mapping = (MappingImpl) fact.createMapping();
//
//				mapping.setName("Map" + app.getName() + node.getName());
//				mapping.setApp(app);
//				// ((Mapping) mapping).setName("Map"+app.getName()+node.getName());
//				// ((Mapping) mapping).setEach_mapping_has_one_app(app);
//				mapping.setNode(node);
//				// ((Object) mapping).setEach_mapping_has_one_core(node);
//				rs.getMappings().add(mapping);
//				app.getMappings().add(mapping);
//				node.getMappings().add(mapping);
//
//			}
//
//		}
		
		for(Data data : rs.getData()) {
			UserCreatedTaskImpl task = (UserCreatedTaskImpl) fact.createUserCreatedTask(); 
			task.setName("Task" + data.getName());
			task.setData(data);
			task.setPeriod(500);
			task.setFrameLength(0.05);
			data.setUsercreatedtask(task); 
		}

//		for (Data data : rs.getData()) {
//
//			for (Link link : rs.getLinks()) {
//
//				TaskImpl task = (TaskImpl) fact.createTask();
//				task.setName("Task" + data.getName() + link.getName());
//				rs.getTasks().add(task);
//				task.setData(data);
//				data.getTask().add(task);
//				link.getTask().add(task);
//				task.setLink(link);
//
//			}
//		}
		// setting manually the mapping of each application
		/*
		 * rs.getApplication().get(0).setSentby(rs.getNode().get(0));
		 * rs.getApplication().get(1).setReceivedby(rs.getNode().get(2));
		 * rs.getApplication().get(2).setSentby(rs.getNode().get(0));
		 * rs.getApplication().get(3).setReceivedby(rs.getNode().get(3));
		 */
		/*
		 * rs.getApplication().get(4).setSentby(rs.getNode().get(0));
		 * rs.getApplication().get(5).setReceivedby(rs.getNode().get(2));
		 * rs.getApplication().get(6).setSentby(rs.getNode().get(0));
		 * rs.getApplication().get(7).setReceivedby(rs.getNode().get(3));
		 * 
		 * rs.getApplication().get(8).setSentby(rs.getNode().get(3));
		 * rs.getApplication().get(9).setReceivedby(rs.getNode().get(0));
		 * rs.getApplication().get(10).setSentby(rs.getNode().get(3));
		 * rs.getApplication().get(11).setReceivedby(rs.getNode().get(0));
		 */

		//Amir commented out
//		for (Data data : rs.getData()) {
//
//			for (Task task : rs.getTasks()) {
//				if (task.getData() == data) {
//					task.setPeriod(500);
//					task.setFrameLength(0.05);
//				}
//			}
//		}
		// DataImpl data = (DataImpl) fact.createData();
		// rs.getData().add(data);
		/*
		 * for(int i=0; i<a;i++) { ApplicationImpl app=(ApplicationImpl)
		 * fact.createApplication(); app.setName("Application"+i);
		 * rs.getApplication().add(app);
		 * 
		 * data.setName("Data_"+app.getName());
		 * 
		 * 
		 * if(i==0) { app.setSentby(rs.getNode().get(0)); app.setSendData(data);
		 * data.setSentby(app); //app.setReceivedby(rs.getNode().get(3));
		 * //app.setSafetycritical(1);//specify this app as a safety-critical app ,
		 * obliged to generate redundant route } if(i==1) {
		 * //app.setSentby(rs.getNode().get(1)); app.setReceivedby(rs.getNode().get(2));
		 * app.setApp_recieves(data); data.setData_receivedby(app); }
		 * 
		 * if(i==2) { app.setSentby(rs.getNode().get(2));
		 * app.setReceivedby(rs.getNode().get(3)); } if(i==3) {
		 * app.setSentby(rs.getNode().get(3)); app.setReceivedby(rs.getNode().get(1)); }
		 * //********************* app.setSendData(data); app.setApp_recieves(data);
		 * 
		 * data.setSentby(app); data.setData_receivedby(app);
		 * //********************* //app.set
		 * 
		 * //CrImpl cr=(CrImpl) fact.createCr(); //cr.setName("Cr_"+ app.getName());
		 * //rs.getCr().add(cr);
		 * 
		 * //app.setSends_cr(cr); //cr.setSent_by_app(app);
		 * 
		 * }
		 */
		for (Node n : rs.getNodes()) {
			n.getSender().addAll(rs.getApplications());
			n.getReceiver().addAll(rs.getApplications());
		}
		ArrayList<Link> visitedLinks = new ArrayList<Link>();
		ArrayList<Data> visitedData = new ArrayList<Data>();

//		for (Link l1 : rs.getLinks()) {
//			for (Link l2 : rs.getLinks()) {
//				/*
//				 * !(visitedLinks.contains(l1)&& visitedLinks.contains(l2)) for(Data d:
//				 * test1.getData()) {//size of For is Size of number applications or Data if
//				 * (!l1.equals(l2))&& (!visitedData.contains(d))&&
//				 * (l1.getLf().equals(l2.getLs())&& l1.getLs().equals(l2.getLf()))&&
//				 * 
//				 * 
//				 * 
//				 * { Data_InImpl data_in1=(Data_InImpl) fact.createData_In();
//				 * data_in1.setLink(l1); l1.getD_in().add(data_in1);
//				 * data_in1.setData(d); data_in1.setName("datain_"+l1.getName()+
//				 * d.getName());
//				 * 
//				 * Data_InImpl data_in2=(Data_InImpl) fact.createData_In();
//				 * data_in2.setLink(l2); data_in2.setName("datain_"+l2.getName()+
//				 * d.getName()); l2.getD_in().add(data_in2);
//				 * data_in2.setData(d);
//				 * 
//				 * 
//				 * Data_OutImpl data_out1=(Data_OutImpl) fact.createData_Out();
//				 * l1.getD_out().add(data_out1);
//				 * data_out1.setData_out_has_link(l1); data_out1.setDataout_has(d);
//				 * data_out1.setName("dataout_"+l1.getName()+ d.getName());
//				 * 
//				 * Data_OutImpl data_out2=(Data_OutImpl) fact.createData_Out();
//				 * l2.getD_out().add(data_out2);
//				 * data_out2.setData_out_has_link(l2); data_out2.setDataout_has(d);
//				 * data_out2.setName("dataout_"+l2.getName()+ d.getName());
//				 * 
//				 * data_in1.setHas_d_out(data_out2); data_out1.setHas_d_in(data_in2);
//				 * 
//				 * data_in2.setHas_d_out(data_out1); data_out2.setHas_d_in(data_in1);
//				 * 
//				 * 
//				 * test1.getData_in().add(data_in1); test1.getData_out().add(data_out1);
//				 * test1.getData_in().add(data_in2); test1.getData_out().add(data_out2);
//				 * 
//				 * visitedData.add(d); visitedLinks.add(l1); visitedLinks.add(l2); }
//				 * 
//				 * 
//				 * 
//				 * }
//				 */
//
//				if (!l1.equals(l2)) {
//					if (l1.getLf().equals(l2.getLs()) && l1.getLs().equals(l2.getLf())
//							&& !(visitedLinks.contains(l1) && visitedLinks.contains(l2))) {
//						for (Data d : rs.getData()) {
//
//							Data_InImpl data_in1 = (Data_InImpl) fact.createData_In();
//							data_in1.setLink(l1);
//							l1.getD_in().add(data_in1);
//							data_in1.setData(d);
//							data_in1.setName("datain_" + l1.getName() + d.getName());
//
//							Data_InImpl data_in2 = (Data_InImpl) fact.createData_In();
//							data_in2.setLink(l2);
//							data_in2.setName("datain_" + l2.getName() + d.getName());
//							l2.getD_in().add(data_in2);
//							data_in2.setData(d);
//
//							Data_OutImpl data_out1 = (Data_OutImpl) fact.createData_Out();
//							l1.getD_out().add(data_out1);
//							data_out1.setLink(l1);
//							data_out1.setData(d);
//							data_out1.setName("dataout_" + l1.getName() + d.getName());
//
//							Data_OutImpl data_out2 = (Data_OutImpl) fact.createData_Out();
//							l2.getD_out().add(data_out2);
//							data_out2.setLink(l2);
//							data_out2.setData(d);
//							data_out2.setName("dataout_" + l2.getName() + d.getName());
//
//							/*
//							 * OrderImpl orderin_out1= (OrderImpl) fact.createOrder();
//							 * orderin_out1.setName("order_"+data_in1.getName()+data_out2.getName());
//							 * orderin_out1.setHas_datain(data_in1); orderin_out1.setHas_dataout(data_out2);
//							 */
//
//							/*
//							 * OrderImpl orderin_out2= (OrderImpl) fact.createOrder();
//							 * orderin_out2.setName("order_"+data_in2.getName()+data_out2.getName());
//							 * orderin_out2.setHas_datain(data_in2); orderin_out2.setHas_dataout(data_out2);
//							 */
//
//							data_in1.setD_out(data_out2);
//							data_out1.setD_in(data_in2);
//
//							data_in2.setD_out(data_out1);
//							data_out2.setD_in(data_in1);
//
//							rs.getData_ins().add(data_in1);
//							rs.getData_outs().add(data_out1);
//							rs.getData_ins().add(data_in2);
//							rs.getData_outs().add(data_out2);
//
//							// rs.getOrder().add(orderin_out1);
//							// rs.getOrder().add(orderin_out2);
//						}
//						visitedLinks.add(l1);
//						visitedLinks.add(l2);
//
//					}
//
//				}
//
//			}
//		}

		ArrayList<Data_Out> listOfDataOut = new ArrayList<Data_Out>();
		ArrayList<Data_In> listOfDataIn = new ArrayList<Data_In>();

		for (Link link : rs.getLinks()) {
			listOfDataOut.addAll(link.getD_out());
			listOfDataIn.addAll(link.getD_in());
		}
		// ***********************************************************************
		/*
		 * for(Node node:rs.getNode()) { for(int i=0;i<listOfDataOut.size();i++) {
		 * for(int j=0;j<listOfDataIn.size();j++) {
		 * if(listOfDataIn.get(i).getData_in_has_link().getLs().equals(node) &&
		 * listOfDataOut.get(j).getData_out_has_link().getLs().equals(node) &&
		 * !(listOfDataIn.get(i).getData_in_has_link().equals(listOfDataOut.get(j).
		 * getData_out_has_link())) &&
		 * listOfDataIn.get(i).getDatain_has().getData_sentby().equals(listOfDataOut.get
		 * (j).getDataout_has().getData_sentby())) {
		 * 
		 * OrderImpl orderin_out= (OrderImpl) fact.createOrder();
		 * orderin_out.setName("order_"+"_"+node.getName()+listOfDataIn.get(i).getName()
		 * +listOfDataOut.get(j).getName());
		 * orderin_out.setHas_datain(listOfDataIn.get(i));
		 * orderin_out.setHas_dataout(listOfDataOut.get(j));
		 * node.getIncludes_order().add(orderin_out); rs.getOrder().add(orderin_out);
		 * 
		 * } } }
		 * 
		 * }
		 */
		// ***************************************************************************

		System.out.println("counter=" + counter);

		// rs.getApplication().get(0).getSentby().getName();
		// System.out.println(rs.getNode().get(0).getSource()+"_"+rs.getApplication().get(0).getSentby().getName()+"_"
		// + rs.getApplication().get(0).getReceivedby().getName()+
		// rs.getNode().get(3).getSource());

		// test1.getCr().get(1).getUses_node().setSource(1);
		// test1.getCr().get(4).getUses_node().setDestination(1);
		// test1.getNode().get(4).setDestination(1);
		// test1.getNode().get(6).setSource(1);
		// test1.getNode().get(9).setDestination(1);
		
		//Amir added
		SettingsImpl settings = (SettingsImpl) fact.createSettings(); 
		settings.setName("Settings1");
		rs.setSettings(settings); 
		
		return (rs);

	}

//	public void printRoute(EEDImpl emfModel) throws GRBException {
//		AutoDesigner1FactoryImpl fact = new AutoDesigner1FactoryImpl();
//		EEDImpl rs = (EEDImpl) emfModel;
//
//		// Amir changed
//		// NodeImpl nodS = (NodeImpl) fact.createNode();
//		NodeImpl nodS = (NodeImpl) fact.createECU();
//		for (Application app : rs.getApplications()) {
//			ArrayList<Node> listOfactivatedNodes = new ArrayList<Node>();
//			/*
//			 * for(Node nodeS:test1.getNode()) { if(nodeS.getSource()==1) {
//			 * listOfactivatedNodes.add(nodeS); nodS=(NodeImpl) nodeS; } }
//			 */
//
//			listOfactivatedNodes.add(app.getSentby());
//
//			nodS = (NodeImpl) app.getSentby();
//
//			while (!nodS.equals(app.getReceivedby())) {
//				ArrayList<Link> listOfLinks = new ArrayList<Link>();
//				ArrayList<Data_In> listOfAllDataIn = new ArrayList<Data_In>();
//				ArrayList<Data_Out> listOfAllDataOut = new ArrayList<Data_Out>();
//				ArrayList<Data_In> listOfActivatedDataIn = new ArrayList<Data_In>();
//				ArrayList<Data_Out> listOfActivatedDataOut = new ArrayList<Data_Out>();
//
//				listOfLinks.addAll(nodS.getLinks());
//				for (int i = 0; i < listOfLinks.size(); i++) {
//					listOfAllDataIn.addAll(listOfLinks.get(i).getD_in());
//					listOfAllDataOut.addAll(listOfLinks.get(i).getD_out());
//				}
//
//				for (int i = 0; i < listOfAllDataOut.size(); i++) {
//					// if(listOfAllDataOut.get(i).getDataout_has().equals(app.getApp_sends()))
//					{
//						listOfActivatedDataOut.add(listOfAllDataOut.get(i));
//
//					}
//				}
//
//				for (int i = 0; i < listOfActivatedDataOut.size(); i++) {
//					if (listOfActivatedDataOut.get(i).getData_out_gurobi().get(GRB.DoubleAttr.X) == 1) {
//						nodS = (NodeImpl) listOfActivatedDataOut.get(i).getData_out_has_link().getLf();
//						listOfactivatedNodes.add(nodS);
//
//					}
//				}
//
//			}
//			System.out.println();
//			System.out.println();
//			System.out.println("Source For " + app.getName() + ": " + app.getSentby().getName());
//			System.out.println("Destination For " + app.getName() + ": " + app.getReceivedby().getName());
//			System.out.print("Route For " + app.getName() + " = ");
//			for (int i = 0; i < listOfactivatedNodes.size(); i++) {
//				System.out.print(listOfactivatedNodes.get(i).getName() + "-->");
//			}
//
//			/*
//			 * try { while(!getNext(nodS).equals(app.getReceivedby())) { NodeImpl next =
//			 * getNext(nodS); listOfactivatedNodes.add(next); nodS=next; } //in order to to
//			 * add the destination to the list which is the last node
//			 * listOfactivatedNodes.add(getNext(nodS));
//			 * 
//			 * } catch (GRBException e) { // TODO Auto-generated catch block
//			 * e.printStackTrace(); } for(int i=0; i< listOfactivatedNodes.size();i++) {
//			 * System.out.print(listOfactivatedNodes.get(i).getName()+"-->"); }
//			 */
//
//		}
//	}

	public NodeImpl getNext(NodeImpl n) throws GRBException {

		// ArrayList<L_Out> listOfOutLinksP = new ArrayList<L_Out>();
		// listOfOutLinksP.addAll(n.getL_out()); to do the route printing uncomment this
		// line
		/*
		 * for(int i=0; i<listOfOutLinksP.size();i++) {
		 * if(listOfOutLinksP.get(i).getL_out_gurobi().get(GRB.DoubleAttr.X)==1) { // n=
		 * (NodeImpl) listOfOutLinksP.get(i).getLf(); to do route printing, uncomment
		 * this line } else { continue; } }
		 */
		return n;

	}

	public void myService() throws GRBException {
		int x = 4;
		int p = 4;// before was 6
		int b = 2;// the number of applications
		EEDImpl emfModel = createTopology(x, p, b);
		// createTopology(self);
		ArchSolving rs_solver = new ArchSolving();
		rs_solver.initSolver(emfModel);
		rs_solver.createGRBVars(emfModel);
		rs_solver.createConstrAppMapping(emfModel);
		rs_solver.solve(emfModel);
		//printRoute(emfModel);
		// ArrayList<EObject> list=ts.findEmfElements(self, "test1.impl.NodeImpl");

		// set opt goals
		ArrayList<Node> listOfNode = new ArrayList<Node>();
		// root element
		/*
		 * TreeIterator<EObject> elements = self.eContainer().eAllContents();
		 * 
		 * while (elements.hasNext()) { EObject next = elements.next();
		 * 
		 * }
		 */

	}

}
