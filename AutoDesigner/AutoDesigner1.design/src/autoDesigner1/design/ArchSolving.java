package autoDesigner1.design;

import java.io.DataInput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.equinox.internal.app.AppPersistence;

import gurobi.GRB;
import gurobi.GRB.DoubleAttr;
import gurobi.GRBEnv;
import gurobi.GRBException;
import gurobi.GRBLinExpr;
import gurobi.GRBModel;
import gurobi.GRBQuadExpr;
import gurobi.GRBVar;
import autoDesigner1.impl.VehicleTopologyImpl;

import autoDesigner1.Application;
import autoDesigner1.Process;
import autoDesigner1.Data;
import autoDesigner1.Data_In;
import autoDesigner1.Data_Out;
import autoDesigner1.ECU;
import autoDesigner1.HPCU;
import autoDesigner1.Link;
import autoDesigner1.Mapping;
import autoDesigner1.Node;
import autoDesigner1.Optimization_Goal;
import autoDesigner1.Task;
import autoDesigner1.impl.AutoDesigner1FactoryImpl;
import autoDesigner1.impl.DataImpl;
import autoDesigner1.impl.EEDImpl;
import autoDesigner1.impl.MappingImpl;

public class ArchSolving {

	private GRBModel model;
	private EObject emfModel;

	public void initSolver(EObject self) throws GRBException {
		GRBEnv env = new GRBEnv(true);
		env.set("logFile", "mip1.log");
		env.start();
		// Create empty model
		GRBModel model = new GRBModel(env);
		this.model = model;
		this.emfModel = self;
	}

	// added by Amir
	public void initSolver() throws GRBException {
		GRBEnv env = new GRBEnv(true);
		env.set("logFile", "mip1.log");
		env.start();
		// Create empty model
		GRBModel model = new GRBModel(env);
		this.model = model;
		// this.emfModel=self;
	}

	public ArrayList<EObject> findEmfElements(EObject root, String elementName) {
		// root element
		ArrayList<EObject> listOfElements = new ArrayList<EObject>();
		TreeIterator<EObject> emfModelElements = root.eContainer().eAllContents();
		while (emfModelElements.hasNext()) {
			EObject next = emfModelElements.next();
			System.out.println(next.getClass().getName());
			if (next.getClass().getName() == elementName) {
				System.out.println(next.getClass().getName());
				// System.out.println("hadi");
				listOfElements.add(next);
			}

		}
		return listOfElements;
	}

	public ArrayList<EObject> findEmfElements(EObject root) {
		// root element
		ArrayList<EObject> listOfElements = new ArrayList<EObject>();
		TreeIterator<EObject> emfModelElements = root.eContainer().eAllContents();
		while (emfModelElements.hasNext()) {
			EObject next = emfModelElements.next();

			listOfElements.add(next);

		}
		return listOfElements;
	}
	
	//Amir added 
	public void addMappings(EEDImpl eedModel) throws GRBException {
		AutoDesigner1FactoryImpl fact = new AutoDesigner1FactoryImpl();
		EList<Mapping> mappings = eedModel.getMappings();
		for (Node node : eedModel.getNodes()) {
			if (node instanceof ECU || node instanceof HPCU) {
				for (Application app : eedModel.getApplications()) {// create mapping variables and set the parameters
					Boolean mapExists = false;
					for (Mapping map : mappings) {
						if (map.getNode() == node && map.getApp() == app) {
							map.setName("Map" + map.getApp().getName()
									+ map.getNode().getName());
							map.setM_gurobi(this.model.addVar(1.0, 1.0, 1.0, GRB.BINARY, "Mapping" + map.getName()));
							mapExists = true;
						}
					}
					if (!mapExists) { // Only create mapping if not created by user
						MappingImpl mapping = (MappingImpl) fact.createMapping();
						mapping.setName("Map" + app.getName() + node.getName()); //$NON-NLS-1$
						mapping.setApp(app);
						mapping.setNode(node);
						mapping.setM_gurobi(this.model.addVar(0.0, 1.0, 0.0, GRB.BINARY, "M" + mapping.getName()));
						eedModel.getMappings().add(mapping);
						app.getMappings().add(mapping);
						node.getMappings().add(mapping);
					}

				}

			}
		}

	}
	
	public void createGRBVars(EEDImpl emfModel) throws GRBException {

		// todo: parse emf model
		// ArrayList<EObject> list= findEmfElements(emfModel, "test1.impl.NodeImpl");
		// create GRBVars and add to this.model
		// EObject next=((Iterator<EObject>) list).next();
		// ArrayList<GRBVar> listOfMapping = new ArrayList<GRBVar>();
		// root element
		TreeIterator<EObject> variables = emfModel.eAllContents();
		ArrayList<GRBVar> listOfMapping = new ArrayList<GRBVar>();
		while (variables.hasNext()) {
			EObject next = variables.next();
			
			//Amir commented out: this now done in addMappings  
//			if (next instanceof Mapping && ((Mapping) next).getM_gurobi() == null) {
//				((Mapping) next)
//						.setM_gurobi(this.model.addVar(0.0, 1.0, 0.0, GRB.BINARY, "M" + ((Mapping) next).getName()));
//			}

			if (next instanceof Data_In) {
				((Data_In) next).setData_in_gurobi(
						this.model.addVar(0.0, 1.0, 0.0, GRB.BINARY, "Data_IN" + ((Data_In) next).getName()));
			}
			if (next instanceof Data_Out) {
				((Data_Out) next).setData_out_gurobi(
						this.model.addVar(0.0, 1.0, 0.0, GRB.BINARY, "Data_OUT" + ((Data_Out) next).getName()));
			}
			if (next instanceof Task) {
				((Task) next).setStartTime(
						this.model.addVar(0.0, 10000, 0.0, GRB.CONTINUOUS, "Data_OUT" + ((Task) next).getName()));
			}
			if (next instanceof Process) {
				((Process) next).setStartingTime(
						this.model.addVar(0.0, 1000, 0, GRB.CONTINUOUS, "StartingTime" + ((Process) next).getName()));

			}

			/*
			 * if(next instanceof Mapping) { ((Mapping)
			 * next).setM_gurobi(this.model.addVar(0.0, 10000,
			 * 0.0,GRB.BINARY,"Mapping"+((Mapping) next).getName())); }
			 */
			// set the gurobi variables for in_links and out_links
			/*
			 * if(next instanceof L_In) { ((L_In)
			 * next).setL_in_gurobi(this.model.addVar(0.0, 1.0, 0.0,GRB.BINARY,"L_IN"));
			 * 
			 * }
			 * 
			 * if(next instanceof L_Out ) { ((L_Out)
			 * next).setL_out_gurobi(this.model.addVar(0.0, 1.0, 0.0,GRB.BINARY,"L_OUT"));
			 * 
			 * }
			 */
			/*
			 * if(next instanceof Order) { ((Order)
			 * next).setOrder_gurobi(this.model.addVar(0.0, 1.0, 0.0,GRB.BINARY,"Order")); }
			 */

		}

	}

	// changed by Amir
	// changed return type from void
	public List<Data_Out> createConstrAppMapping(EEDImpl emfModel) throws GRBException {
		// todo: parse emf model
		EEDImpl rs = (EEDImpl) emfModel;
		TreeIterator<EObject> variables = emfModel.eAllContents();
		// EObject root = variables.next();
		// NetworkTopologyImpl rtest = (NetworkTopologyImpl) root.eContainer();

		ArrayList<Mapping> listOfMappingApp1 = new ArrayList<Mapping>();
		ArrayList<Node> listOfNodes = new ArrayList<Node>();
		listOfNodes.addAll(emfModel.getNodes());
		// ArrayList<L_In> listOfInLinks1 = new ArrayList<L_In>();
		// ArrayList<L_Out> listOfOutLinks1 = new ArrayList<L_Out>();

		ArrayList<Data_In> listOfAllDataIn = new ArrayList<Data_In>();
		ArrayList<Data_Out> listOfAllDataOut = new ArrayList<Data_Out>();
		List<Integer> listofLCM = new ArrayList<Integer>();
		int maxlcm = 0;
		// while (variables.hasNext()) {

		EObject next = variables.next();
		ArrayList<Mapping> listOfMappingApp = new ArrayList<Mapping>();
		// ArrayList<L_In> listOfInLinks = new ArrayList<L_In>();
		// ArrayList<L_Out> listOfOutLinks = new ArrayList<L_Out>();

		// ********************************************Scheduling of Communication
		// Tasks*************************************************
		int bandwidth = 100;// unit of BW here is Mega bit per Second (Mbps). The unit of frame length is
							// byte!
		double bw1 = bandwidth * 1000000 * (0.08 / 8);// convert the bw to the us= each bit is 1/8 of a byte and mega is
														// 10^6 and each byte is equal 0.08 us around
		double bw = (bw1 / 0.08);// we remove the 0.08 since it does not affect the main equation bcs also frame
									// per length has 0.08
		double ifg = 0.96;// interframe gap: minimal link idle time between the transmission of two
							// consecutive frames 12 bytes or 0.96 us
		// frame length of each Ethernet packet is minimum 64 bytes or 5.12 us!
		ArrayList<Link> listOfOutLinks = new ArrayList<Link>();
		for (Node node : rs.getNodes()) {
			ArrayList<Link> listOfLinks = new ArrayList<Link>();
			listOfLinks.addAll(node.getLinks());
			for (int i = 0; i < listOfLinks.size(); i++) {
				ArrayList<Data_Out> listOfEachLinkDout = new ArrayList<Data_Out>();
				ArrayList<Task> listOfTasks = new ArrayList<Task>();
				listOfEachLinkDout.addAll(listOfLinks.get(i).getD_out());

				listOfTasks.addAll(listOfLinks.get(i).getTask());

				// ------------------- Two For Loop for creating the two paired processes out of
				// Processes List------------------------
				for (int t = 0; t < listOfTasks.size(); t++) {

					for (int j = 0; j < listOfTasks.size(); j++) {
						List<Task> listofPairedProcesses = new ArrayList<Task>();
						listofPairedProcesses.add(listOfTasks.get(t));

						if (t != j && j > t) {

							listofPairedProcesses.add(listOfTasks.get(j));
							// --------------------------creating the Ki, Kj by calculating LCM of two
							// paired processes----------------------------
							List<Double> ki = new ArrayList<Double>();
							List<Double> kj = new ArrayList<Double>();
							ki.add((double) 0.0);
							kj.add((double) 0.0);

							double maxki = 0;
							double maxkj = 0;
							int lcm = 0;

							double p1;
							double p2;

							int n1 = listofPairedProcesses.get(0).getPeriod();
							int n2 = listofPairedProcesses.get(1).getPeriod();
							lcm = (n1 > n2) ? n1 : n2;// maximum number between n1 and n2 is stored in least common
														// multiplier (lcm)
							while (true) {
								if (lcm % n1 == 0 && lcm % n2 == 0) {
									System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
									break;
								}
								++lcm;
							}
							listofLCM.add(lcm);
							maxlcm = Collections.max(listofLCM);
							p1 = (lcm / n1) - 1;// Ki E (0, (LCM/Pi) -1)
							ki.add(p1);
							System.out.println("Ki E:" + ki);
							System.out.println("LCM Max:" + maxlcm);

							p2 = (lcm / n2) - 1;
							kj.add(p2);
							System.out.println("Kj E:" + kj);
							System.out.println("LCMs: " + listofLCM);

							maxki = Collections.max(ki);
							maxkj = Collections.max(kj);

							// listofOffset.add(listofPairedProcesses.get(0));
							// listofOffset.add(listofPairedProcesses.get(1));

							int N = 1000000;

							// ----------------------Overlapping Constraints for
							// Scheduling--------------------------

							// defining m2 and m3 in order to activate the calculated task schedule only for
							// activated routes
							GRBVar m2 = null;
							GRBVar m3 = null;

							for (int k = 0; k < listOfEachLinkDout.size(); k++) {
								if (listofPairedProcesses.get(0).getData() == listOfEachLinkDout.get(k)
										.getData()) {
									m2 = listOfEachLinkDout.get(k).getData_out_gurobi();
								}
								if (listofPairedProcesses.get(1).getData() == listOfEachLinkDout.get(k)
										.getData()) {
									m3 = listOfEachLinkDout.get(k).getData_out_gurobi();
								}
							}
							// *************************************

							for (int l = 0; l <= maxki; l++) {

								for (int x = 0; x <= maxkj; x++) {
									GRBLinExpr expr10 = new GRBLinExpr();
									GRBLinExpr expr11 = new GRBLinExpr();
									GRBVar m1 = model.addVar(0.0, 1.0, 0.0, GRB.BINARY,
											"BIG M" + "Ki:" + l + "Kj:" + x);
									expr10.addTerm(1, listofPairedProcesses.get(0).getStartTime()); // starting time Pi
									expr10.addTerm(-1, listofPairedProcesses.get(1).getStartTime());// - starting time
																									// Pj
									expr10.addTerm(-N, m1);
									expr11.addTerm(-1, listofPairedProcesses.get(0).getStartTime()); // -
									expr11.addTerm(1, listofPairedProcesses.get(1).getStartTime());
									expr11.addTerm(N, m1);

									GRBVar v = model.addVar(0.0, 1.0, 0.0, GRB.BINARY, "v");
									// Model v = m2 * m3
									GRBQuadExpr quad_expr_v = new GRBQuadExpr();
									quad_expr_v.addTerm(1, m2, m3);
									model.addQConstr(quad_expr_v, GRB.EQUAL, v, "MutiplicationOfTwoDoutGurobi_v=m2*m3");

									// **************define all variables in the left side of the equation and
									// multiply to V
									expr10.addTerm(ifg, v);
									expr11.addTerm(ifg, v);
									expr10.addTerm((listofPairedProcesses.get(0).getFrameLength() / bw), v);
									expr11.addTerm((listofPairedProcesses.get(1).getFrameLength() / bw), v);

									expr10.addTerm((listofPairedProcesses.get(0).getPeriod() * l), v);
									expr10.addTerm((listofPairedProcesses.get(1).getPeriod() * -x), v);

									expr11.addTerm((listofPairedProcesses.get(1).getPeriod() * x), v);
									expr11.addTerm((listofPairedProcesses.get(0).getPeriod() * -l), v);
									expr11.addTerm(-N, v);
									// Multiply v by the linear expression
									GRBQuadExpr quad_expr = new GRBQuadExpr();

									GRBQuadExpr quad_expr1 = new GRBQuadExpr();
									GRBQuadExpr quad_expr2 = new GRBQuadExpr();

									for (int k = 0; k < expr10.size(); k++) {

										double coeff_1 = expr10.getCoeff(k);
										GRBVar var_1 = expr10.getVar(k);
										quad_expr1.addTerm(coeff_1, var_1, v);

									}

									for (int k = 0; k < expr11.size(); k++) {
										double coeff_2 = expr11.getCoeff(k);
										GRBVar var_2 = expr11.getVar(k);
										quad_expr2.addTerm(coeff_2, var_2, v);

									}

									this.model.addQConstr(quad_expr1, GRB.LESS_EQUAL, 0,
											listofPairedProcesses.get(0).getName()
													+ listofPairedProcesses.get(1).getName() + "Ki:" + l + "Kj:" + x
													+ "first constraint for slots overlapping scheduling"
													+ listOfLinks.get(i).getName());
									this.model.addQConstr(quad_expr2, GRB.LESS_EQUAL, 0,
											listofPairedProcesses.get(0).getName()
													+ listofPairedProcesses.get(1).getName() + "Kj:" + x + "Ki:" + l
													+ "second constraint for slots overlapping scheduling"
													+ listOfLinks.get(i).getName());

								}
							}

							for (int g = 0; g < listOfTasks.size(); g++) {
								GRBLinExpr expr17 = new GRBLinExpr();
								GRBLinExpr expr18 = new GRBLinExpr();// starting time of each task must be <= task
																		// period - frame length
								expr17.addTerm(1, listOfTasks.get(g).getStartTime());
								this.model.addConstr(expr17, GRB.LESS_EQUAL,
										listOfTasks.get(g).getPeriod() - listOfTasks.get(g).getFrameLength(),
										listOfTasks.get(g).getName() + "STofTask" + g
												+ "MustBeLessThanItsPeriod-FrameLength" + node.getName());
								expr18.addTerm(1, listOfTasks.get(g).getStartTime());
								this.model.addConstr(expr18, GRB.GREATER_EQUAL, 0, listOfTasks.get(g).getName()
										+ "STofTask" + g + "MustBeGreaterThanZero" + node.getName());

							}

						}
					}

				}

			}

		}

		// ******************************************************Path Dependency in
		// Communication Tasks************************************************

		ArrayList<Data> listOfAllData = new ArrayList<Data>();
		for (Data data : rs.getData()) {
			listOfAllData.add(data);
		}
		for (int i = 0; i < listOfAllData.size(); i++) {// for each Data
			Task task = null;
			// Task task1=null;
			Data_Out dout = null;
			for (Link link : rs.getLinks()) {// for each Link
				ArrayList<Task> listOfTasks = new ArrayList<Task>();
				listOfTasks.addAll(link.getTask());
				for (int d = 0; d < listOfTasks.size(); d++) {
					if (listOfTasks.get(d).getData() == listOfAllData.get(i)) {
						task = listOfTasks.get(d);
					}

				}
				ArrayList<Task> listOfTasks1 = new ArrayList<Task>();
				ArrayList<Link> listOfLinks = new ArrayList<Link>();
				listOfLinks.addAll(link.getLf().getLinks());
				ArrayList<Data_Out> listOfEachLinkDout = new ArrayList<Data_Out>();
				for (int u = 0; u < listOfLinks.size(); u++) {
					if (listOfLinks.get(u).getLs() == link.getLf() && listOfLinks.get(u).getLf() != link.getLs()) {
						listOfTasks1.addAll(listOfLinks.get(u).getTask());// "listofLinks" is actually l2 in
																			// the following equation and "link" is l1
						listOfEachLinkDout.addAll(listOfLinks.get(u).getD_out());
					}

				}

				ArrayList<Data_Out> listOfDout = new ArrayList<Data_Out>();
				ArrayList<Data_Out> listOfDoutinLink1 = new ArrayList<Data_Out>();
				listOfDoutinLink1.addAll(link.getD_out());
				for (int f = 0; f < listOfDoutinLink1.size(); f++) {
					if (listOfDoutinLink1.get(f).getData() == listOfAllData.get(i)) {
						listOfDout.add(listOfDoutinLink1.get(f));

					}
				}

				ArrayList<Task> listOfTasks2 = new ArrayList<Task>();
				for (int d = 0; d < listOfTasks1.size(); d++) {
					if (listOfTasks1.get(d).getData() == listOfAllData.get(i)) {
						listOfTasks2.add(listOfTasks1.get(d));
					}

				}
				// Basically here the dout related to each Data will be extracted for each link.
				// In the next step, the related task of each Data over a link and the same task
				// over the next links are found.
				// Afterwards, the extracted dout is multiplied to each of the tasks in such way
				// that the result of
				// the second multiplication must be greater than the first link:
				// dout of Data0 * task Data0 over link1 <= dout of Data0 * task Data0 over
				// link2
				for (int p = 0; p < listOfDout.size(); p++) {// ----> the extracted dout for each Data
					for (int t = 0; t < listOfTasks2.size(); t++) {// ---->the same task over the next links

						// dout of Data0 * task ST of Data0 over link1 <= dout of Data0 * task ST of
						// Data0 over link2/links(more than one link which have the task)

						if (listOfDout.get(p).getLink() == task.getLink()) { // check if the first link,
																							// which the related task is
																							// routing over it,
																							// is the same as the link
																							// which dout is routing
																							// over it.
							double c = 0.1;// consider the constant value as a offset to remove the effect of equality
											// in the equation "="
											// because we only need "less than" not "less than equal"
							GRBLinExpr expr20 = new GRBLinExpr();
							expr20.addTerm(1, task.getStartTime());// the related task ST on the first link
							GRBVar m1 = listOfDout.get(p).getData_out_gurobi();// the related dout
							expr20.addTerm(-1, listOfTasks2.get(t).getStartTime());// the related task ST on the next
																					// links
							expr20.addTerm(c, m1);// dout*the constant value
							GRBQuadExpr quad_expr = new GRBQuadExpr();
							for (int k = 0; k < expr20.size(); ++k) {
								double coeff = expr20.getCoeff(k);
								GRBVar var_1 = expr20.getVar(k);
								quad_expr.addTerm(coeff, var_1, m1);
							}
							// dout of Data*task ST of Data over first link - dout of Data* task ST of Data
							// over next links - c*dout of Data <=0
							this.model.addQConstr(quad_expr, GRB.LESS_EQUAL, 0, "the path dependency contraint"
									+ link.getName() + listOfDout.get(p).getName() + listOfTasks2.get(t).getName());

						}
					}

				}

			}
		}

//**************************************************Application Mapping***********************************************************************	   		   		
		for (Application app : rs.getApplications()) {

			ArrayList<Mapping> listOfMappingApp11 = new ArrayList<Mapping>();

			ArrayList<Mapping> listOfMappingSafetyApp = new ArrayList<Mapping>();
			listOfMappingApp11.addAll(app.getMappings());// add all mappings of each app to a
																					// list

			GRBLinExpr expr1 = new GRBLinExpr();
			GRBLinExpr expr3 = new GRBLinExpr();
			for (int i = 0; i < listOfMappingApp11.size(); i++) {
				//System.out.println(listOfMappingApp11.get(i).getM_gurobi().get(GRB.DoubleAttr.X)==1);
				expr1.addTerm(1, listOfMappingApp11.get(i).getM_gurobi());// sigma all mappings gurobi values of each
																			// app
				expr3.addTerm(1, listOfMappingApp11.get(i).getM_gurobi());
			}

			if (app.isSafetycritical()) {

				this.model.addConstr(expr3, GRB.EQUAL, 2, "each safety-critical App mapped only on two Cores");// assign
																												// each
																												// app
																												// to
																												// the
																												// cores
			} else {
				this.model.addConstr(expr1, GRB.EQUAL, 1, "each App mapped only on one Core");
			}

		}

		// ************************oblige the safety-critical App be mapped on two
		// ASIL-D core one as redundant***************************
		/*
		 * GRBLinExpr expr2 = new GRBLinExpr(); boolean b = false; b = ((Application)
		 * next).isSafety_critical(); if(b==true) {
		 * listOfMappingSafetyApp.addAll(((Application)
		 * next).getEach_app_has_one_to_many_mapping()); for(int i=0; i<
		 * listOfMappingSafetyApp.size();i++) {
		 * if(listOfMappingSafetyApp.get(i).getEach_mapping_has_one_core().isAsil_d()) {
		 * expr2.addTerm(1, listOfMappingSafetyApp.get(i).getM_gurobi());
		 * 
		 * 
		 * }
		 * 
		 * } this.model.addConstr(expr2, GRB.EQUAL, 2 ,
		 * "each safe-critical App mapped only on one ASIL-D Core");
		 * 
		 * }
		 */

		for (Node node : rs.getNodes()) {
			ArrayList<Mapping> listOfMappingNode = new ArrayList<Mapping>();
			listOfMappingNode.addAll(node.getMappings());

			GRBLinExpr expr01 = new GRBLinExpr();
			for (int i = 0; i < listOfMappingNode.size(); i++) {
				expr01.addTerm(1, listOfMappingNode.get(i).getM_gurobi());// assign at least one app to each core

			}
			this.model.addConstr(expr01, GRB.GREATER_EQUAL, 1, "1Core has atleast 1APP");

		}
		// the sender and receiver which transferring a data cannot be mapped on the
		// same node//

		for (Node node : rs.getNodes()) {
			ArrayList<Mapping> listOfMappingNode1 = new ArrayList<Mapping>();
			listOfMappingNode1.addAll(node.getMappings());

			for (Data data : rs.getData()) {

				GRBVar m_sender = null;
				GRBVar m_receiver = null;
				for (int i = 0; i < listOfMappingNode1.size(); i++) {

					/*
					 * if(listOfMappingNode1.get(i).getEach_mapping_has_one_app().getRecieveData()!
					 * =null &&
					 * listOfMappingNode1.get(i).getEach_mapping_has_one_app().getRecieveData()==
					 * data) {
					 * 
					 * m_receiver = listOfMappingNode1.get(i).getM_gurobi();
					 * 
					 * }
					 */

					// find the process as receiver and then extract the mapping variable the
					// application related to the process
					ArrayList<Process> listOfMappingProcess = new ArrayList<Process>();
					listOfMappingProcess.addAll(listOfMappingNode1.get(i).getApp().getProcess());

					for (int h = 0; h < listOfMappingProcess.size(); h++) {
						if ((listOfMappingProcess.get(h).getRecieveData() != null
								|| listOfMappingProcess.get(h).getSendData() != null)
								&& listOfMappingProcess.get(h).getRecieveData() == data) {

							m_receiver = listOfMappingNode1.get(i).getM_gurobi();

						}
						// find the process as sender and then extract the mapping variable the
						// application related to the process

						if ((listOfMappingProcess.get(h).getSendData() != null
								|| listOfMappingProcess.get(h).getRecieveData() != null)
								&& listOfMappingProcess.get(h).getSendData() == data) {

							m_sender = listOfMappingNode1.get(i).getM_gurobi();

						}

					}

				}

				// m_sender + m_receiver = 1//
				GRBLinExpr expr001 = new GRBLinExpr();
				expr001.addTerm(1, m_receiver);
				expr001.addTerm(1, m_sender);
				this.model.addConstr(expr001, GRB.LESS_EQUAL, 1,
						"One Application related to one Data only be mapped on one Node");

			}

		}

		// this iteration is done for creating routes while mapping the application on
		// the nodes

		for (Data data : rs.getData()) {

			for (Node n : rs.getNodes()) {

				ArrayList<Data_Out> listOfActivatedDOutForeachApp = new ArrayList<Data_Out>();
				ArrayList<Data_In> listOfActivatedDInForeachApp = new ArrayList<Data_In>();

				ArrayList<Data_In> listOfNodeDataIn = new ArrayList<Data_In>();
				ArrayList<Data_Out> listOfNodeDataOut = new ArrayList<Data_Out>();
				ArrayList<Data_Out> listOfDataOut = new ArrayList<Data_Out>();
				// ArrayList<Order> listOfOrder = new ArrayList<Order>();

				ArrayList<Data_In> listOfDataIn = new ArrayList<Data_In>();

				for (int i = 0; i < n.getLinks().size(); i++) {

					listOfNodeDataIn.addAll(n.getLinks().get(i).getD_in());
					listOfNodeDataOut.addAll(n.getLinks().get(i).getD_out());
				}

				for (int i = 0; i < listOfNodeDataIn.size(); i++) {
					if (listOfNodeDataIn.get(i).getData().equals(data)) {
						listOfDataIn.add(listOfNodeDataIn.get(i));

					}

				}

				listOfAllDataIn.addAll(listOfDataIn);
				listOfActivatedDInForeachApp.addAll(listOfDataIn);

				for (int i = 0; i < listOfNodeDataOut.size(); i++) {
					if (listOfNodeDataOut.get(i).getData().equals(data)) {
						listOfDataOut.add(listOfNodeDataOut.get(i));

					}

				}

				listOfAllDataOut.addAll(listOfDataOut);
				listOfActivatedDOutForeachApp.addAll(listOfDataOut);

				// -------------------------non safety-critical
				// applications--------------------------
				// if(((Application) next).getSafetycritical()==0) {
				// if(listOfPairedApps.get(0).getSafetycritical()==0) {

				// extract the mapping gurobi variable of the mapping list for each node for
				// each specific data
				// the extracted gurobi variable is integrated into the routing constraints
				// instead of "n.getDestination()" and "n.getSource()"
				// this provides automated mapping while generate routes and schedules in one
				// single step solving
				ArrayList<Mapping> listOfMappings = new ArrayList<Mapping>();
				// n.getEach_node_has_zero_to_many_mappings().get(0).getEach_mapping_has_one_app().getDestination();
				listOfMappings.addAll(n.getMappings());

				GRBVar m_destination = null;
				GRBVar m_source = null;
				/*
				 * ArrayList<Mapping> listOfMappingsOfEachNode = new ArrayList<Mapping>();
				 * for(int d=0; d<listOfMappings.size();d++) {
				 * if(listOfMappings.get(d).getEach_mapping_has_one_node()==n &&
				 * listOfMappings.get(d).getEach_mapping_has_one_app().getRecieveData() ) {
				 * listOfMappingsOfEachNode.add(listOfMappings.get(d)); }
				 * 
				 * }
				 */

				// for(Data data: rs.getData()) {

				// Mapping m11=null, m12=null, m13=null, m14=null;

				for (int q = 0; q < listOfMappings.size(); q++) {

					// find the receiver application and extract its mapping gurobi variable
					/*
					 * if(listOfMappings.get(q).getEach_mapping_has_one_app().getRecieveData()!=
					 * null &&
					 * listOfMappings.get(q).getEach_mapping_has_one_app().getRecieveData()==data)
					 * {
					 * 
					 * System.out.println(listOfMappings.get(q).getName()); //m11=
					 * listOfMappings.get(q); m_destination=listOfMappings.get(q).getM_gurobi();
					 * 
					 * 
					 * }
					 */

					// find the process as receiver and then extract the mapping variable the
					// application related to the process
					ArrayList<Process> listOfMappingProcess1 = new ArrayList<Process>();
					listOfMappingProcess1.addAll(listOfMappings.get(q).getApp().getProcess());
					for (int f = 0; f < listOfMappingProcess1.size(); f++) {
						if ((listOfMappingProcess1.get(f).getRecieveData() != null
								|| listOfMappingProcess1.get(f).getRecieveData() != null)
								&& listOfMappingProcess1.get(f).getRecieveData() == data) {

							System.out.println(listOfMappings.get(q).getName());
							// m11= listOfMappings.get(q);

							m_destination = listOfMappings.get(q).getM_gurobi();

						}
						// find the sender application and extract its mapping gurobi variable, make
						// sure that the sender
						// has the same data as data iteration

						// find the process as sender and then extract the mapping variable the
						// application related to the process
						if ((listOfMappingProcess1.get(f).getSendData() != null
								|| listOfMappingProcess1.get(f).getRecieveData() != null)
								&& listOfMappingProcess1.get(f).getSendData() == data) {

							System.out.println(listOfMappings.get(q).getName());
							m_source = listOfMappings.get(q).getM_gurobi();

						}

					}

				}

				/*
				 * if(listOfMappings.get(q).getEach_mapping_has_one_app().getSendData()!=null
				 * && listOfMappings.get(q).getEach_mapping_has_one_app().getSendData()==data)
				 * {
				 * 
				 * System.out.println(listOfMappings.get(q).getName());
				 * m_source=listOfMappings.get(q).getM_gurobi();
				 * 
				 * }
				 */

				// for source-> ms -md - sigma(out links)<=0
				GRBLinExpr expr01 = new GRBLinExpr();
				for (int i = 0; i < listOfDataOut.size(); i++) {
					expr01.addTerm(-1, listOfDataOut.get(i).getData_out_gurobi());
				}
				expr01.addTerm(1, m_source);
				expr01.addTerm(-1, m_destination);

				this.model.addConstr(expr01, GRB.LESS_EQUAL, 0, "1 Activated Out-Data");

				// for source ->ms + sigma(in links)<=1

				// this "m_source" variable has multiplied to the expr02 to activate multicast
				// routing for one specific data. This
				// actually include the following constraint only for the source node.
				GRBLinExpr expr02 = new GRBLinExpr();
				for (int i = 0; i < listOfDataIn.size(); i++) {
					expr02.addTerm(1, listOfDataIn.get(i).getData_in_gurobi());
				}

				expr02.addTerm(1, m_source);

				// this.model.addConstr(expr02, GRB.LESS_EQUAL, 1 - n.getSource() , "No
				// Activated In-Data");

				// the following constraint is related to uni-cast routing
				this.model.addConstr(expr02, GRB.LESS_EQUAL, 1, "No Activated In-Data");

				// The following constraint states the muti-case routing for one specific data
				/*
				 * GRBQuadExpr quad_expr_source = new GRBQuadExpr(); for (int k=0; k <
				 * expr02.size(); ++k) { double coeff = expr02.getCoeff(k); GRBVar var_1 =
				 * expr02.getVar(k); quad_expr_source.addTerm(coeff, var_1, m_source); }
				 * 
				 * this.model.addQConstr(quad_expr_source, GRB.LESS_EQUAL, 1,
				 * "No Activated Data_In");
				 */

				// for destination-> md - ms - sigma(in links)<= 0

				// This "m_destination" variable has multiplied to the expr03 to activate
				// multicast
				// routing for one specific data. This
				// actually include the following constraint only for the destination node.
				GRBLinExpr expr03 = new GRBLinExpr();
				for (int i = 0; i < listOfDataIn.size(); i++) {
					expr03.addTerm(-1, listOfDataIn.get(i).getData_in_gurobi());
				}
				expr03.addTerm(-1, m_source);
				expr03.addTerm(1, m_destination);
				// this.model.addConstr(expr03, GRB.LESS_EQUAL,n.getSource()-n.getDestination()
				// , "1 Activated In-Data");
				this.model.addConstr(expr03, GRB.LESS_EQUAL, 0, "1 Activated In-Data");

				// for destination-> md + sigma(out links)<= 1
				GRBLinExpr expr04 = new GRBLinExpr();
				for (int i = 0; i < listOfDataOut.size(); i++) {
					expr04.addTerm(1, listOfDataOut.get(i).getData_out_gurobi());
				}
				expr04.addTerm(1, m_destination);

				// this.model.addConstr(expr04, GRB.LESS_EQUAL, 1- n.getDestination() , "No
				// Activated Out-Data");
				// the following constraint is related to the uni-cast routing
				this.model.addConstr(expr04, GRB.LESS_EQUAL, 1, "No Activated Out-Data");

				// The following constraint states the muti-case routing for one specific data
				/*
				 * GRBQuadExpr quad_expr_destination = new GRBQuadExpr(); for (int k=0; k <
				 * expr04.size(); ++k) { double coeff1 = expr04.getCoeff(k); GRBVar var_2 =
				 * expr04.getVar(k); quad_expr_destination.addTerm(coeff1, var_2,
				 * m_destination); } this.model.addQConstr(quad_expr_destination,
				 * GRB.LESS_EQUAL, 1 , "No Activated Out-Data");
				 */

				// ----------------sigma dataout<=sigma datain either OR sigma datain<=sigma
				// datdaout -----------------------
				// implement Either OR constraint using "Big M" method
				int M = 1000000;
				GRBVar m1 = model.addVar(0.0, 1.0, 0.0, GRB.BINARY, "BIG M");// define Big M
				GRBLinExpr expr05 = new GRBLinExpr();
				GRBLinExpr expr06 = new GRBLinExpr();
				expr05.addTerm(-M, m1);
				expr06.addTerm(M, m1);
				for (int i = 0; i < listOfDataOut.size(); i++) {
					expr05.addTerm(1, listOfDataOut.get(i).getData_out_gurobi());
					expr06.addTerm(-1, listOfDataOut.get(i).getData_out_gurobi());
				}

				for (int i = 0; i < listOfDataIn.size(); i++) {
					expr05.addTerm(-1, listOfDataIn.get(i).getData_in_gurobi());
					expr06.addTerm(1, listOfDataIn.get(i).getData_in_gurobi());
				}
				expr05.addTerm(-1, m_source);
				expr05.addTerm(1, m_destination);
				expr06.addTerm(1, m_source);
				expr06.addTerm(-1, m_destination);
				// this.model.addConstr(expr05, GRB.LESS_EQUAL, n.getDestination()-
				// n.getSource(), "1 Activated Out-Data & 1 or more Acitvated In_Data ");
				//this.model.addConstr(expr05, GRB.LESS_EQUAL, 0, "1 Activated Out-Data & 1 or more Acitvated In_Data ");
				this.model.addConstr(expr05, GRB.EQUAL, 0, "1 Activated Out-Data & 1 or more Acitvated In_Data ");
				// this.model.addConstr(expr06, GRB.GREATER_EQUAL, n.getDestination() -
				// n.getSource() + M, "1 or more Activated Out-Data & 1 Acitvated In_Data ");
				//this.model.addConstr(expr06, GRB.LESS_EQUAL, M, "1 or more Activated Out-Data & 1 Acitvated In_Data ");

				// }

				for (Data_In din : listOfDataIn) {
					try {
						GRBLinExpr expr07 = new GRBLinExpr();

						GRBVar dingrb = din.getData_in_gurobi();

						GRBVar doutgrb = din.getD_out().getData_out_gurobi();

						expr07.addTerm(-1, dingrb);
						expr07.addTerm(1, doutgrb);
						this.model.addConstr(expr07, GRB.EQUAL, 0, "connect d_out1_n1 to d_in1_n2");
					} catch (Exception e) {
						// Block of code to handle errors

					}
				}
				// ----------------------------------------------------cycle break
				// ---------------------------------------------------------
				for (Data_In din : listOfDataIn) {
					for (Data_Out dout : listOfDataOut) {
						try {

							GRBLinExpr expr = new GRBLinExpr();
							GRBVar dincgrb = din.getData_in_gurobi();
							GRBVar doutcgrb = dout.getData_out_gurobi();
							if (din.getLink().getLf().equals(dout.getLink().getLf())
									&& din.getLink().getLs().equals(dout.getLink().getLs())) {

								expr.addTerm(1, dincgrb);
								expr.addTerm(1, doutcgrb);
								this.model.addConstr(expr, GRB.LESS_EQUAL, 1, "cycle avoidance");

							}

						} catch (Exception e) {
							// Block of code to handle errors

						}
					}
				}

				// -------------------------------------------------------------------------------------------------------

			}

			// }

		}
		// ********************************Link Occupation Rate
		// constraint*************************************
		//Amir added condition
		if(rs.getSettings().isLOR()) {
			for (Link link : rs.getLinks()) {
				GRBLinExpr expr_LOR = new GRBLinExpr();
				ArrayList<Data_Out> listOfDataOut = new ArrayList<Data_Out>();
				listOfDataOut.addAll(link.getD_out());
				for (int i = 0; i < listOfDataOut.size(); i++) {
					expr_LOR.addTerm(1, listOfDataOut.get(i).getData_out_gurobi());
				}
				
				//Amir added. Before the LOR was always 3
				int LORVal = rs.getSettings().getLORValue(); 
				System.out.println("LOR: "+LORVal); 
				this.model.addConstr(expr_LOR, GRB.LESS_EQUAL, LORVal, "LOR constraint");
			}
		}
		

		// ********************************************process scheduling on each
		// core**********************************
		for (Node node : rs.getNodes()) {
			ArrayList<Mapping> listOfMappingNode1 = new ArrayList<Mapping>();
			listOfMappingNode1.addAll(node.getMappings());
			List<Process> listofProcesses = new ArrayList<Process>();
			for (int i = 0; i < listOfMappingNode1.size(); i++) {
				listofProcesses.addAll(listOfMappingNode1.get(i).getApp().getProcess());
			}

			if (listofProcesses.get(0).getApplication() == listOfMappingNode1.get(0).getApp()) {
				listOfMappingNode1.get(0).getM_gurobi();
			}

			// double x=0;
			// ------------------- Two ForLoop for creating the two paired processes out of
			// Processes List------------------------
			for (int i = 0; i < listofProcesses.size(); i++) {

				for (int j = 0; j < listofProcesses.size(); j++) {
					List<Process> listofPairedProcesses = new ArrayList<Process>();
					listofPairedProcesses.add(listofProcesses.get(i));

					if (i != j && j > i) {

						listofPairedProcesses.add(listofProcesses.get(j));
						// --------------------------creating the Ki, Kj by calculating LCM of two
						// paired processes----------------------------
						List<Double> ki = new ArrayList<Double>();
						List<Double> kj = new ArrayList<Double>();
						ki.add((double) 0.0);
						kj.add((double) 0.0);

						double maxki = 0;
						double maxkj = 0;
						int lcm = 0;

						double p1;
						double p2;
						// calculate the least of common multiplier --> LCM
						int n1 = listofPairedProcesses.get(0).getPeriod();
						int n2 = listofPairedProcesses.get(1).getPeriod();
						lcm = (n1 > n2) ? n1 : n2;// maximum number between n1 and n2 is stored in least common
													// multiplier (lcm)
						while (true) {
							if (lcm % n1 == 0 && lcm % n2 == 0) {
								System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
								break;
							}
							++lcm;
						}
						listofLCM.add(lcm);
						maxlcm = Collections.max(listofLCM);
						p1 = (lcm / n1) - 1;// Ki E (0, (LCM/Pi) -1)
						ki.add(p1);
						System.out.println("Ki E:" + ki);
						System.out.println("LCM Max:" + maxlcm);

						p2 = (lcm / n2) - 1;
						kj.add(p2);
						System.out.println("Kj E:" + kj);
						System.out.println("LCMs: " + listofLCM);

						maxki = Collections.max(ki);
						maxkj = Collections.max(kj);

						// listofPairedProcesses.get(0).getApplication().getEach_app_has_one_to_many_mapping().get(0).get
						// listofOffset.add(listofPairedProcesses.get(0));
						// listofOffset.add(listofPairedProcesses.get(1));

						int M = 1000000;
						GRBVar m10 = null;
						GRBVar m11 = null;
						ArrayList<Mapping> listOfMappingNode2 = new ArrayList<Mapping>();
						ArrayList<Mapping> listOfMappingNode3 = new ArrayList<Mapping>();
						listOfMappingNode2.addAll(
								listofPairedProcesses.get(0).getApplication().getMappings());
						listOfMappingNode3.addAll(
								listofPairedProcesses.get(1).getApplication().getMappings());
						// extract the correct mapping Gurobi variable for each process and store it in
						// "m" variables
						// this is chosen from the mapping list so that the related application and
						// Node of each mapping is compared with the process
						for (int f = 0; f < listOfMappingNode2.size(); f++) {

							if (listofPairedProcesses.get(0).getApplication() == listOfMappingNode2.get(f)
									.getApp()
									&& listOfMappingNode2.get(f).getNode() == node) {

								m10 = listOfMappingNode2.get(f).getM_gurobi();
							}
						}

						for (int b = 0; b < listOfMappingNode3.size(); b++) {

							if (listofPairedProcesses.get(1).getApplication() == listOfMappingNode3.get(b)
									.getApp()
									&& listOfMappingNode3.get(b).getNode() == node) {

								m11 = listOfMappingNode3.get(b).getM_gurobi();
							}
						}

						for (int l = 0; l <= maxki; l++) {

							for (int x = 0; x <= maxkj; x++) {
								GRBLinExpr expr10 = new GRBLinExpr();
								GRBLinExpr expr11 = new GRBLinExpr();
								GRBVar m1 = model.addVar(0.0, 1.0, 0.0, GRB.BINARY, "BIG M" + "Ki:" + l + "Kj:" + x);
								expr10.addTerm(1, listofPairedProcesses.get(0).getStartingTime()); // starting time Pi
								expr10.addTerm(-1, listofPairedProcesses.get(1).getStartingTime());// - starting time Pj
								expr10.addTerm(-M, m1);
								expr11.addTerm(-1, listofPairedProcesses.get(0).getStartingTime()); // -
								expr11.addTerm(1, listofPairedProcesses.get(1).getStartingTime());
								expr11.addTerm(M, m1);

								GRBVar v = model.addVar(0.0, 1.0, 0.0, GRB.BINARY, "v");
								// Model v = m10 * m11
								GRBQuadExpr quad_expr_v = new GRBQuadExpr();
								quad_expr_v.addTerm(1, m10, m11);
								model.addQConstr(quad_expr_v, GRB.EQUAL, v, "MutiplicationOfTwoDoutGurobi_v=m10*m11");

								// **************define all variables in the left side of the equation and
								// multiply to V
								// expr10.addTerm(ifg, v);
								// expr11.addTerm(ifg, v);
								expr10.addTerm((listofPairedProcesses.get(0).getWcet()), v);
								expr11.addTerm((listofPairedProcesses.get(1).getWcet()), v);

								expr10.addTerm((listofPairedProcesses.get(0).getPeriod() * l), v);
								expr10.addTerm((listofPairedProcesses.get(1).getPeriod() * -x), v);

								expr11.addTerm((listofPairedProcesses.get(1).getPeriod() * x), v);
								expr11.addTerm((listofPairedProcesses.get(0).getPeriod() * -l), v);
								expr11.addTerm(-M, v);
								// Multiply v by the linear expression
								GRBQuadExpr quad_expr = new GRBQuadExpr();

								GRBQuadExpr quad_expr1 = new GRBQuadExpr();
								GRBQuadExpr quad_expr2 = new GRBQuadExpr();

								for (int k = 0; k < expr10.size(); k++) {

									double coeff_1 = expr10.getCoeff(k);
									GRBVar var_1 = expr10.getVar(k);
									quad_expr1.addTerm(coeff_1, var_1, v);

								}

								for (int k = 0; k < expr11.size(); k++) {
									double coeff_2 = expr11.getCoeff(k);
									GRBVar var_2 = expr11.getVar(k);
									quad_expr2.addTerm(coeff_2, var_2, v);

								}

								this.model.addQConstr(quad_expr1, GRB.LESS_EQUAL, 0,
										listofPairedProcesses.get(0).getName() + listofPairedProcesses.get(1).getName()
												+ "Ki:" + l + "Kj:" + x
												+ "first constraint for slots overlapping scheduling" + node.getName());
								this.model.addQConstr(quad_expr2, GRB.LESS_EQUAL, 0,
										listofPairedProcesses.get(0).getName() + listofPairedProcesses.get(1).getName()
												+ "Kj:" + x + "Ki:" + l
												+ "second constraint for slots overlapping scheduling"
												+ node.getName());

							}
						}

					}
				}

			}

			for (int i = 0; i < listofProcesses.size(); i++) {
				GRBLinExpr expr17 = new GRBLinExpr();
				GRBLinExpr expr18 = new GRBLinExpr();
				expr17.addTerm(1, listofProcesses.get(i).getStartingTime());
				this.model.addConstr(expr17, GRB.LESS_EQUAL,
						listofProcesses.get(i).getPeriod() - listofProcesses.get(i).getWcet(),
						listofProcesses.get(i).getName() + "STofProcess" + i + "MustBeLessThanItsPeriod+ExecutionTime"
								+ node.getName());
				expr18.addTerm(1, listofProcesses.get(i).getStartingTime());
				this.model.addConstr(expr18, GRB.GREATER_EQUAL, 0, listofProcesses.get(i).getName() + "STofProcess" + i
						+ "MustBeGreaterThanZero" + node.getName());

			}

		}
		// **************************************************************************************************
		// path dependency for the starting time of the processes which are either
		// sender or receiver
		// which must follow the path dependency of the tasks so that the ST of the
		// process as sender is the least and the
		// ST of the process as receiver is the most
		// again, activate this constraint only for the activated routes

		for (Data data : rs.getData()) {
			// GRBVar m10 = model.addVar(0.0, 1.0, 0.0, GRB.CONTINUOUS, "m10");
			// GRBVar m11 = model.addVar(0.0, 1.0, 0.0, GRB.CONTINUOUS, "m11");
			GRBVar z = model.addVar(0.0, 1000, 0.0, GRB.CONTINUOUS, "z");// to define minmax objectives,
																			// more info in the book and paper
			// GRBVar m11=null;
			// GRBVar m10=null;
			ArrayList<Process> listOfSenderProcesses = new ArrayList<Process>();

			Process p_sender = null;
			// Amir added this outer loop, because process are stored in applications not
			// in the EED
			for (Application app : rs.getApplications()) {
				for (Process process : app.getProcess()) {

					if (process.getSendData() != null && process.getSendData() == data) {
						p_sender = process;
						// m10=process.getStartingTime();
						for (Task task : rs.getTasks()) {
							if (task.getData() == process.getSendData()) {
								// define m01 to activate this constraint only for the activated routes
								ArrayList<Data_Out> listOfEachLinkDout1 = new ArrayList<Data_Out>();
								listOfEachLinkDout1.addAll(task.getLink().getD_out());
								GRBVar m01 = null;
								for (int i = 0; i < listOfEachLinkDout1.size(); i++) {
									if (listOfEachLinkDout1.get(i).getData() == data) {

										m01 = listOfEachLinkDout1.get(i).getData_out_gurobi();
									}
								}

								GRBQuadExpr quad_expr01 = new GRBQuadExpr();

								GRBLinExpr expr19 = new GRBLinExpr();
								expr19.addTerm(1, task.getStartTime());
								expr19.addTerm(-1, process.getStartingTime());
								expr19.addTerm(-process.getWcet(), m01);
								for (int k = 0; k < expr19.size(); k++) {

									double coeff_1 = expr19.getCoeff(k);
									GRBVar var_1 = expr19.getVar(k);
									quad_expr01.addTerm(coeff_1, var_1, m01);

								}

								this.model.addQConstr(quad_expr01, GRB.GREATER_EQUAL, 0,
										process.getName() + data.getName());
							}

						}

					}

					if (process.getRecieveData() != null && process.getRecieveData() == data) {
						ArrayList<Task> listOfEachTaskData = new ArrayList<Task>();

						// m11=process.getStartingTime();

						for (Task task : rs.getTasks()) {
							if (task.getData() == process.getRecieveData()) {
								// define m01 to activate this constraint only for the activated routes

								ArrayList<Data_Out> listOfEachLinkDout1 = new ArrayList<Data_Out>();
								listOfEachLinkDout1.addAll(task.getLink().getD_out());
								listOfEachTaskData.add(task);
								GRBVar m01 = null;
								for (int i = 0; i < listOfEachLinkDout1.size(); i++) {
									if (listOfEachLinkDout1.get(i).getData() == data) {

										m01 = listOfEachLinkDout1.get(i).getData_out_gurobi();
									}
								}

								// add the frame length of each communication task, it means that the
								// the starting time of the receiver process must be greater than
								// the starting time + frame length of the last communication task
								GRBQuadExpr quad_expr02 = new GRBQuadExpr();
								GRBLinExpr expr20 = new GRBLinExpr();
								expr20.addTerm(-1, task.getStartTime());
								expr20.addTerm(-task.getFrameLength(), m01);
								expr20.addTerm(1, process.getStartingTime());

								for (int k = 0; k < expr20.size(); k++) {

									double coeff_1 = expr20.getCoeff(k);
									GRBVar var_1 = expr20.getVar(k);
									quad_expr02.addTerm(coeff_1, var_1, m01);

								}
								this.model.addQConstr(quad_expr02, GRB.GREATER_EQUAL, 0,
										process.getName() + data.getName());
							}

						}
						// *****************************************OPTIMIZATION
						// GOALS***************************************************

						// Amir added
//						Optimization_Goal optGoal = rs.getSettings().getOptimizationGoal();
//						GRBLinExpr expr25 = new GRBLinExpr();
//						GRBLinExpr expr31 = new GRBLinExpr();
//						
//						if(optGoal == Optimization_Goal.RESPONSETIME||optGoal == Optimization_Goal.MULTI_OBJECTIVE) {
//							System.out.println("response time optimization!");
//							// *defining the response time optimization goal
//							GRBLinExpr expr21 = new GRBLinExpr();
//							
//							for (int i = 0; i < listOfEachTaskData.size(); i++) {
//								expr21.addTerm(1, listOfEachTaskData.get(i).getStartTime());
//							}
//
//							expr21.addTerm(1, process.getStartingTime());
//							expr21.addTerm(-1, z);// to define minmax objective
//							expr25.addTerm(1, z);// to define minmax objective, refering to the book and the paper
//							expr25.addTerm(1, process.getStartingTime());
//							// this.model.setObjective(expr21, GRB.MINIMIZE);
//							// this.model.setObjective(expr25, GRB.MINIMIZE);
//
//							this.model.addConstr(expr21, GRB.LESS_EQUAL, 0, "Respone time Minimization");
//
//							// this.model.setObjective(expr25, GRB.MINIMIZE);
//						}
//						
//						if(optGoal == Optimization_Goal.END_TO_END_LATENCY || optGoal == Optimization_Goal.MULTI_OBJECTIVE) {
//							System.out.println("end to end optimization!");
//							// ************************Latency Opt goal***********************************
//							GRBLinExpr expr30 = new GRBLinExpr();
//							
//							expr30.addTerm(1, process.getStartingTime());
//							expr30.addTerm(-1, p_sender.getStartingTime());
//							/*
//							 * for(int i=0; i<listOfEachTaskData.size();i++) { expr30.addTerm(1,
//							 * listOfEachTaskData.get(i).getStartTime()); }
//							 */
//							expr30.addTerm(-1, z);
//							expr31.addTerm(1, z);
//							this.model.addConstr(expr30, GRB.LESS_EQUAL, -process.getWcet(),
//									"end-to-end Latency Minimization");
//							// this.model.setObjective(expr31, GRB.MINIMIZE);
//						}
//						
//						if(optGoal == Optimization_Goal.MULTI_OBJECTIVE) {
//							System.out.println("multi objective optimization!");
//							// ********************************multi Objective
//							// Optimization*************************
//							/*
//							 * multiobjective optimization = setting the priority and index for each
//							 * objective. the third variable shows the priority of each objective, the
//							 * higher number, the higher priority the second variable shows the index of
//							 * each objective which index=0 means this objective is considered as a primary
//							 * objective. Besides, using "setObjectiveN" by default the objectives will be
//							 * minimized. Gurobi has two types of multi objective optimization--> 1.
//							 * Blended: A blending approach creates a single objective by taking a linear
//							 * combination of your objectives. You provide a weight for each objective as an
//							 * argument to setObjectiveN. Alternatively, you can use the ObjNWeight
//							 * attribute, together with ObjNumber. The default weight for an objective is
//							 * 1.0.To give an example, if your model has two objectives, 1 + x + 2y and y+
//							 * 2z, and if you give weights of -1 and 2to them, respectively, then Gurobi
//							 * would solve your model with a blended objective of -1 * (1 + x + 2y) + 2 * (y
//							 * + 2z) = -1 - x + 4z 2. Hierarchical: A hierarchical or lexicographic approach
//							 * assigns a priority to each objective, and optimizes for the objectives in
//							 * decreasing priority order. At each step, it finds the best solution for the
//							 * current objective, but only from among those that would not degrade the
//							 * solution quality for higher-priority objectives. You provide the priority for
//							 * each objective as an argument to setObjectiveN. Alternatively, you can use
//							 * the ObjNPriority attribute. Priorities are integral, not continuous. Larger
//							 * values indicate higher priorities. The default priority for an objective is
//							 * 0.
//							 * 
//							 * To give an example, if your model has two objectives, with priorities 10 and
//							 * 5, and the optimal solution for the first objective has value 100, then the
//							 * solver will find the solution that optimizes the second objective from among
//							 * all solutions with objective 100 for the first objective.
//							 */
//							// Hierarchical optimization approach defining priority
//							this.model.setObjectiveN(expr31, 0, 2, 0, 0, 0, "latency");
//							this.model.setObjectiveN(expr25, 1, 1, 0, 0, 0, "responsetime");
//
//							// Blended optimization approach
//							/*
//							 * this.model.setObjectiveN(expr31, 0, 0, -2,0,0, "latency");
//							 * this.model.setObjectiveN(expr25, 1, 0, -1,0,0, "responsetime");
//							 */
//
//							// ************************************************
//						}

					}

				}
			}

			/*
			 * GRBLinExpr expr30 = new GRBLinExpr();
			 * 
			 * expr30.addTerm(-1, m10); expr30.addTerm(1, m11); this.model.addConstr(expr30,
			 * GRB.LESS_EQUAL, 6, "Respone time Minimization" );
			 */
			// this.model.setObjective(expr30, GRB.MINIMIZE);
		}

		// **************************************************************************************
		// defining the response time optimization goal
		ArrayList<Process> listOfReceiverProcesses = new ArrayList<Process>();
		for (Application app : rs.getApplications()) {
			for (Process process : app.getProcess()) {
				if (process.getRecieveData() != null) {
					listOfReceiverProcesses.add(process);
					GRBLinExpr expr021 = new GRBLinExpr();
					// expr021.addTerm(1, process.getStartingTime());
					// this.model.addConstr(expr021, GRB.LESS_EQUAL, 6, "Respone time Minimization"
					// );
					// this.model.setObjective(expr021, GRB.MINIMIZE);
				}
			}
		}

		for (int i = 0; i < listOfReceiverProcesses.size(); i++) {

			// expr21.addTerm(1,listOfReceiverProcesses.get(i).getStartingTime());
		}

		// this.model.setObjective(expr21, GRB.MINIMIZE);

		/*
		 * for(Task task:rs.getTask()) {
		 * 
		 * ArrayList<Data_In> listOfEachTaskDin = new ArrayList<Data_In>();
		 * listOfEachTaskDin.addAll(task.getLink().getD_in()); for(int
		 * j=0;j<listOfEachTaskDin.size(); j++) { GRBVar m =null; GRBVar m1 =null; m=
		 * listOfEachTaskDin.get(j).getData_in_gurobi();
		 * m1=listOfEachTaskDin.get(j).getD_out().getData_out_gurobi();
		 * 
		 * GRBVar v = model.addVar(0.0, 1.0, 0.0, GRB.BINARY, "v"); // Model v = m10 *
		 * m11 GRBQuadExpr quad_expr_v = new GRBQuadExpr(); quad_expr_v.addTerm(1, m,
		 * m1); model.addQConstr(quad_expr_v, GRB.EQUAL, v,
		 * "MutiplicationOfTwoDoutGurobi_v=m10*m11");
		 * 
		 * GRBLinExpr expr22 = new GRBLinExpr(); GRBQuadExpr quad_expr03 = new
		 * GRBQuadExpr(); expr22.addTerm(1, task.getStartTime());
		 * 
		 * for (int k=0; k < expr22.size(); k++) {
		 * 
		 * double coeff_1 = expr22.getCoeff(k); GRBVar var_1 = expr22.getVar(k);
		 * quad_expr03.addTerm(coeff_1, var_1, v);
		 * 
		 * } this.model.addQConstr(quad_expr03, GRB.GREATER_EQUAL, 0, task.getName());
		 * 
		 * }
		 * 
		 * 
		 * }
		 */

		// **************************************************************************************************************************

		// }
		// model.write("C:\\Users\\\\hadia\\eclipse-EE-Designer\\ee_designer\\AutoDesigner\\AutoDesigner1\\myfile.lp");
		this.model.optimize();

		 //this.model.computeIIS();
		 //this.model.write("/home/amir2000/Abschluss-Arbeit/logging/model.ilp");

		/*
		 * ArrayList<Data_In> listOfActivatedDataIn = new ArrayList<Data_In>();
		 * ArrayList<Node> listOfActivatedNodeIn = new ArrayList<Node>();
		 * for(Application app:test1.getApplication()) { for(int
		 * i=0;i<listOfAllDataIn.size();i++) {
		 * if(listOfAllDataIn.get(i).getData(). equals(app.getSendData()) &&
		 * listOfAllDataIn.get(i).getData_in_gurobi().get(GRB.DoubleAttr.X)==1) {
		 * listOfActivatedDataIn.add(listOfAllDataIn.get(i));
		 * 
		 * } } listOfActivatedNodeIn.add(app.getSentby());
		 * 
		 * }
		 */
		
		for (Mapping mapping : emfModel.getMappings()) {
			if (mapping.getM_gurobi().get(DoubleAttr.X) == 1) {
				System.out.println(" Mapping: " + " " + mapping.getName());
			}
		}

		for (int i = 0; i < listOfAllDataIn.size(); i++) {
			if (listOfAllDataIn.get(i).getData_in_gurobi().get(GRB.DoubleAttr.X) == 1) {
				System.out.println(listOfAllDataIn.get(i).getName() + "_" + "="
						+ listOfAllDataIn.get(i).getData_in_gurobi().get(GRB.DoubleAttr.X) + " ");
			}

		}
		for (int i = 0; i < listOfAllDataOut.size(); i++) {
			if (listOfAllDataOut.get(i).getData_out_gurobi().get(GRB.DoubleAttr.X) == 1) {
				System.out.println(listOfAllDataOut.get(i).getName() + "_" + "="
						+ listOfAllDataOut.get(i).getData_out_gurobi().get(GRB.DoubleAttr.X) + " ");
			}

		}

		// Amir added condition
		if (listOfAllDataIn != null && listOfAllDataIn.size() > 0)
			System.out.println(listOfAllDataIn.get(0).getLink().getName());
		// Amir added condition
		if (listOfAllDataOut != null && listOfAllDataOut.size() > 0)
			System.out.println(listOfAllDataOut.get(0).getLink().getName());

		// -----------------------------------------------------------------------------------
		for (Data_Out dout : rs.getData_outs()) {
			if (dout.getData_out_gurobi().get(GRB.DoubleAttr.X) == 1) {
				ArrayList<Task> listOfTasks = new ArrayList<Task>();
				listOfTasks.addAll(dout.getLink().getTask());
				for (int i = 0; i < listOfTasks.size(); i++) {
					if (listOfTasks.get(i).getData() == dout.getData()) {
						System.out.println(listOfTasks.get(i).getName() + "ST" + ":"
								+ listOfTasks.get(i).getStartTime().get(GRB.DoubleAttr.X));
					}
				}

			}

			ArrayList<Task> listOfActivatedDataIn = new ArrayList<Task>();

			// if(dout.getData()==dout.getLink().getTask().get(0).getData())
		}
		for (Task task : rs.getTasks()) {
			// if(task.getLink().get)

			System.out.println(task.getName() + "ST" + ":" + task.getStartTime().get(GRB.DoubleAttr.X));
			// Amir added
			double startingTime = task.getStartTime().get(GRB.DoubleAttr.X);
			task.setStartingTimeVal(startingTime);
		}

		// Amir added this outer loop, because process are stored in applications not
		// in the EED
		for (Application app : rs.getApplications()) {
			for (Process process : app.getProcess()) {
				if(process.getStartingTime()!=null) {
					System.out.println(
							process.getName() + "STofProcess" + ":" + process.getStartingTime().get(GRB.DoubleAttr.X));

					// Amir added
					// set starting time
					double startingTime = process.getStartingTime().get(GRB.DoubleAttr.X);
					process.setStartingTimeVal(startingTime);
				}
			}
		}

		/*
		 * for(int i=0; i<listOfOutLinks1.size(); i++) {
		 * if(listOfOutLinks1.get(i).getL_out_gurobi().get(GRB.DoubleAttr.X)==1 &&
		 * listOfOutLinks1.get(i).getLs().getSource()==1) {
		 * System.out.println(" Source: "+ " "+
		 * listOfOutLinks1.get(i).getLs().getName());
		 * System.out.println(listOfOutLinks1.get(i).getLs().getName()+ "--->"+
		 * listOfOutLinks1.get(i).getLf().getName());
		 * 
		 * } }
		 * 
		 * ArrayList<L_Out> listOfOutLinksOn = new ArrayList<L_Out>();
		 * 
		 * 
		 * for(int i=0; i<listOfOutLinks1.size(); i++) {
		 * 
		 * if( listOfOutLinks1.get(i).getL_out_gurobi().get(GRB.DoubleAttr.X) == 1
		 * &&listOfOutLinks1.get(i).getLs().getSource() == 0) {
		 * listOfOutLinksOn.add(listOfOutLinks1.get(i));
		 * 
		 * System.out.println(listOfOutLinks1.get(i).getLs().getName()+
		 * "  "+listOfOutLinks1.get(i).getLs().getName()+"--->"+listOfOutLinks1.get(i).
		 * getLf().getName());
		 * 
		 * }
		 * 
		 * }
		 * 
		 * 
		 * for(int i=0; i<listOfInLinks1.size();i++) {
		 * if(listOfInLinks1.get(i).getL_in_gurobi().get(GRB.DoubleAttr.X)==1 &&
		 * listOfInLinks1.get(i).getLf().getDestination()==1) {
		 * System.out.println(listOfInLinks1.get(i).getLs().getName() +"--->"+
		 * listOfInLinks1.get(i).getLf().getName());
		 * System.out.println(" Destination:"+" "+listOfInLinks1.get(i).getLf().getName(
		 * )); } }
		 */

//---------------------------------------------------------------print the lins & louts-------------------------------
		/*
		 * for(int i=0; i<listOfOutLinks1.size(); i++) { //listOfOutLinks1.get(i).get
		 * System.out.println(listOfOutLinks1.get(i).getName()+ " "+
		 * listOfOutLinks1.get(i).getL_out_gurobi().get(GRB.DoubleAttr.X)+ " "+
		 * listOfOutLinks1.get(i).getSends_cr().get(i).getName()+" "+
		 * listOfInLinks1.get(i).getName()+" " +
		 * listOfInLinks1.get(i).getL_in_gurobi().get(GRB.DoubleAttr.X)+" "+
		 * listOfOutLinks1.get(i).getSends_cr().get(i).getName()+" "+
		 * listOfOutLinks1.get(i).getSends_cr().get(i).getCr_gurobi().get(GRB.DoubleAttr
		 * .X)); }
		 * 
		 * 
		 * 
		 * 
		 * for(int i=0; i<listOfInLinks1.size(); i++) {
		 * System.out.println(listOfInLinks1.get(i).getName()+ " "+
		 * listOfInLinks1.get(i).getL_in_gurobi().get(GRB.DoubleAttr.X)+ " "); } for(int
		 * i=0; i<listOfOutLinks1.size(); i++) {
		 * System.out.println(listOfOutLinks1.get(i).getName()+ " "+
		 * listOfOutLinks1.get(i).getL_out_gurobi().get(GRB.DoubleAttr.X)+ " "); }
		 */

		// ---------------------------------------------------------------------------------------------

		// added by Amir
		List<Data_Out> dataouts = new ArrayList<Data_Out>();
		for (Data_Out dataout : emfModel.getData_outs()) {
			if (dataout.getData_out_gurobi().get(GRB.DoubleAttr.X) == 1) {
				dataouts.add(dataout);
			}
		}
		
//		List<Data_In> dataIns = new ArrayList<Data_In>();
//		for (Data_In dataIn : emfModel.getData_ins()) {
//			if (dataIn.getData_in_gurobi().get(GRB.DoubleAttr.X) == 1) {
//				dataIns.add(dataIn);
//			}
//		}
		
		for (Task task:emfModel.getTasks()) {
			for(Data_In dIn:task.getLink().getD_in()) {
				if(task.getData()==dIn.getData()&&dIn.getData_in_gurobi().get(GRB.DoubleAttr.X) == 1) {
					System.out.println("taskaktiv: "+task.getName()); 
				}
			}
		}
		return dataouts;

	}
	
	
	
	//this is now done in addMappings method
//	public EEDImpl addExistingMappings(EEDImpl emfModel) throws GRBException {
//
//		TreeIterator<EObject> variables = emfModel.eAllContents();
//		while (((Iterator<EObject>) variables).hasNext()) {
//
//			EObject next = ((Iterator<EObject>) variables).next();
//			if (next instanceof Mapping) {
//				MappingImpl mapping = (MappingImpl) next;
//				mapping.setName("Map" + mapping.getApp().getName()
//						+ mapping.getNode().getName());
//				mapping.setM_gurobi(this.model.addVar(1.0, 1.0, 1.0, GRB.BINARY, "Mapping" + mapping.getName()));
//				// emfModel.getMapping().add(mapping);
//			}
//
//			/*
//			 * //This is an old version which was used when the mapping was still saved
//			 * within the application and not within the ahpcc element if(next instanceof
//			 * Application && !((Application)
//			 * next).getEach_app_has_one_to_many_mapping().isEmpty()){
//			 * 
//			 * for(Mapping map : ((Application) next).getEach_app_has_one_to_many_mapping())
//			 * {
//			 * 
//			 * MappingImpl mapping = (MappingImpl) map; mapping.setName("Map" +
//			 * mapping.getEach_mapping_has_one_app().getName() +
//			 * mapping.getEach_mapping_has_one_core().getName());
//			 * mapping.setM_gurobi(this.model.addVar(1.0, 1.0,
//			 * 1.0,GRB.BINARY,"Mapping"+mapping.getName()));
//			 * emfModel.getMapping().add(mapping); //GRBLinExpr expr1 = new GRBLinExpr();
//			 * //expr1.addTerm(0, mapping.getM_gurobi()); //this.model.addConstr(expr1,
//			 * GRB.EQUAL, 1, "Use Map" + mapping.getName() +
//			 * mapping.getEach_mapping_has_one_app().getName() +
//			 * mapping.getEach_mapping_has_one_core().getName()); } }
//			 */
//
//		}
//		return emfModel;
//
//	}

	public void solve(EObject emfModel) throws GRBException {
		// this.model.optimize();

	}

	public String grbVariables(EObject self) throws GRBException {

		GRBEnv env = new GRBEnv(true);
		env.set("logFile", "mip1.log");
		env.start();
		// Create empty model
		GRBModel model = new GRBModel(env);

		// set opt goals
		ArrayList<GRBVar> listOfMapping = new ArrayList<GRBVar>();
		// root element
		TreeIterator<EObject> variables = self.eContainer().eAllContents();

		while (variables.hasNext()) {
			EObject next = variables.next();

			if (next instanceof Mapping) {

				GRBVar x = model.addVar(0.0, 1.0, 0.0, GRB.BINARY, "M");
				GRBVar y = ((Mapping) next).getM_gurobi();
				y = x;
				listOfMapping.add((GRBVar) y);

				System.out.println(y);
				// System.out.println(((Mapping) next).getName());
			}

		}
		System.out.println(listOfMapping);

		return "right";
	}

	public GRBModel getModel() {
		return model;
	}

	public void setModel(GRBModel model) {
		this.model = model;
	}

	public EObject getEmfModel() {
		return emfModel;
	}

	public void setEmfModel(EObject emfModel) {
		this.emfModel = emfModel;
	}

}
