package autoDesigner1.design;

import java.io.DataInput;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.equinox.internal.app.AppPersistence;

import gurobi.GRB;
import gurobi.GRB.DoubleAttr;
import gurobi.GRB.StringAttr;
import gurobi.GRBConstr;
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
import autoDesigner1.impl.UserCreatedTaskImpl;

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
						this.model.addVar(0.0, 10000, 0.0, GRB.CONTINUOUS, "Task" + ((Task) next).getName()));
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
	
	//******************************************DesignError_Analysis_Approach******************************
	
	public void constraint_counter(Map<GRBConstr, Integer> constr_dict, GRBConstr constr, Integer weight) {
		if (constr_dict.containsKey(constr)) {
			Integer freq = constr_dict.get(constr);
			constr_dict.put(constr, freq+weight);
		}
			
		else {
			constr_dict.put(constr, weight);
		}
		
	}
	// function to sort hashmap by values
    public static HashMap<String, Integer> sortByValue(Map<String, Integer> constr_Name_dict)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer> > list =
               new LinkedList<Map.Entry<String, Integer> >(constr_Name_dict.entrySet());
 
        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2)
            {
                return -(o1.getValue()).compareTo(o2.getValue());
            }
        });
         
        // put data from sorted list to hashmap
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
//***************************************************************************************************************************
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	

	// changed by Amir
	// changed return type from void
	public List<Data_Out> createConstrAppMapping(EEDImpl emfModel) throws GRBException, IOException {
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
		//double ifg = 0.96;// 0.96us - interframe gap: minimal link idle time between the transmission of two
		double ifg = 0;					// consecutive frames 12 bytes or 0.96 us
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
						List<Task> listofPairedTasks = new ArrayList<Task>();
						listofPairedTasks.add(listOfTasks.get(t));

						if (t != j && j > t) {

							listofPairedTasks.add(listOfTasks.get(j));
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

							int n1 = listofPairedTasks.get(0).getPeriod();
							int n2 = listofPairedTasks.get(1).getPeriod();
							lcm = (n1 > n2) ? n1 : n2;// maximum number between n1 and n2 is stored in least common
														// multiplier (lcm)
							while (true) {
								if (lcm % n1 == 0 && lcm % n2 == 0) {
									//System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
									break;
								}
								++lcm;
							}
							listofLCM.add(lcm);
							maxlcm = Collections.max(listofLCM);
							p1 = (lcm / n1) - 1;// Ki E (0, (LCM/Pi) -1)
							ki.add(p1);
							//System.out.println("Ki E:" + ki);
							//System.out.println("LCM Max:" + maxlcm);

							p2 = (lcm / n2) - 1;
							kj.add(p2);
							//System.out.println("Kj E:" + kj);
							//System.out.println("LCMs: " + listofLCM);

							maxki = Collections.max(ki);
							maxkj = Collections.max(kj);

							// listofOffset.add(listofPairedTasks.get(0));
							// listofOffset.add(listofPairedTasks.get(1));

							int N = 1000000;

							// ----------------------Overlapping Constraints for
							// Scheduling--------------------------

							// defining m2 and m3 in order to activate the calculated task schedule only for
							// activated routes
							GRBVar m2 = null;
							GRBVar m3 = null;

							for (int k = 0; k < listOfEachLinkDout.size(); k++) {
								if (listofPairedTasks.get(0).getData() == listOfEachLinkDout.get(k)
										.getData()) {
									m2 = listOfEachLinkDout.get(k).getData_out_gurobi();
								}
								if (listofPairedTasks.get(1).getData() == listOfEachLinkDout.get(k)
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
									expr10.addTerm(1, listofPairedTasks.get(0).getStartTime()); // starting time Pi
									expr10.addTerm(-1, listofPairedTasks.get(1).getStartTime());// - starting time
																									// Pj
									expr10.addTerm(-N, m1);
									expr11.addTerm(-1, listofPairedTasks.get(0).getStartTime()); // -
									expr11.addTerm(1, listofPairedTasks.get(1).getStartTime());
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
									
									/*expr10.addTerm((listofPairedTasks.get(0).getFrameLength() / bw), v); this bw value has not been considered in the Front-end
									expr11.addTerm((listofPairedTasks.get(1).getFrameLength() / bw), v);So, it should be corrected*/
									
									expr10.addTerm((listofPairedTasks.get(0).getFrameLength() ), v);//this is a test to check the values of tasks
									expr11.addTerm((listofPairedTasks.get(1).getFrameLength() ), v);
									
									expr10.addTerm((listofPairedTasks.get(0).getPeriod() * l), v);
									expr10.addTerm((listofPairedTasks.get(1).getPeriod() * -x), v);

									expr11.addTerm((listofPairedTasks.get(1).getPeriod() * x), v);
									expr11.addTerm((listofPairedTasks.get(0).getPeriod() * -l), v);
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
											listofPairedTasks.get(0).getName()
													+ listofPairedTasks.get(1).getName() + "Ki:" + l + "Kj:" + x
													+ "first constraint for slots overlapping scheduling"
													+ listOfLinks.get(i).getName());
									this.model.addQConstr(quad_expr2, GRB.LESS_EQUAL, 0,
											listofPairedTasks.get(0).getName()
													+ listofPairedTasks.get(1).getName() + "Kj:" + x + "Ki:" + l
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
							double c = 0.001;// consider the constant value as a offset to remove the effect of equality
							//double c = 15;	 // in the equation "=",, here we define c = pd + sync = 10 us + 5 us as our assumption
											// because we only need "less than" not "less than equal"
							GRBLinExpr expr20 = new GRBLinExpr();
							expr20.addTerm(1, task.getStartTime());// the related task ST on the first link
							GRBVar m1 = listOfDout.get(p).getData_out_gurobi();// the related dout
							expr20.addTerm(-1, listOfTasks2.get(t).getStartTime());// the related task ST on the next
							expr20.addTerm(task.getFrameLength(), m1);// task.ST + its frameLength < subsequent task.ST (T2)														// links
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
																												// each app to 	the cores
				
				//***************add a Data for a redundant application (safety-critical) to achieve a correct routing******************* 
				/*AutoDesigner1FactoryImpl fact = new AutoDesigner1FactoryImpl();
				// NetworkTopologyImpl r = (NetworkTopologyImpl) fact.eContainer();
				//EEDImpl rs = (EEDImpl) fact.createEED();
				DataImpl data = (DataImpl) fact.createData();
				data.setName("RedundantData" + app.getName());
				//data.setId(i);
				rs.getData().add(data);																							// 
				
				UserCreatedTaskImpl task = (UserCreatedTaskImpl) fact.createUserCreatedTask(); 
				task.setName("Task" + data.getName());
				task.setData(data);
				task.setPeriod(500);
				task.setFrameLength(0.05);
				data.setUsercreatedtask(task); */
				//*****************************************************************************************************************
																												
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
			this.model.addConstr(expr01, GRB.GREATER_EQUAL, 1, "1Core has at least 1APP");
			
			//**************************memory utilization constraint***********************
			
			GRBLinExpr memory_cap_expr = new GRBLinExpr();
			for( int i =0; i< listOfMappingNode.size(); i++) {
				
				GRBVar m_memoryCap = null;
				m_memoryCap = listOfMappingNode.get(i).getM_gurobi();
				
				memory_cap_expr.addTerm(listOfMappingNode.get(i).getApp().getMaxMemoryReq(), m_memoryCap);
												
			}
			
				this.model.addConstr(memory_cap_expr, GRB.LESS_EQUAL, node.getMaxMemory_utilization(), "MemoryCapacity_Limit");					
		}
		
	//******************************************************************************************************	
		
		
		// the sender and receiver which transferring a data cannot be mapped on the
		// same node//

		for (Node node : rs.getNodes()) {
			ArrayList<Mapping> listOfMappingNode1 = new ArrayList<Mapping>();
			listOfMappingNode1.addAll(node.getMappings());

			for (Data data : rs.getData()) {
				

				data.getSentby().setSendData(data);
				for(int i=0; i< data.getReceivedby().size(); i++) {
					
					data.getReceivedby().get(i).setRecieveData(data);
				}
				
				
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
					//listOfMappingProcess1.get(f).getRecieveData() != null)
					for (int f = 0; f < listOfMappingProcess1.size(); f++) {
						if ((listOfMappingProcess1.get(f).getRecieveData() != null
								|| listOfMappingProcess1.get(f).getSendData() != null)
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
				
		
				
				if(rs.getSettings().getRedundantRoutes()==10 ) {//non redundant routes
					
				
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
				GRBLinExpr expr005 = new GRBLinExpr();
				GRBLinExpr expr06 = new GRBLinExpr();
				expr05.addTerm(-M, m1);
				expr06.addTerm(M, m1);
				for (int i = 0; i < listOfDataOut.size(); i++) {
					expr05.addTerm(1, listOfDataOut.get(i).getData_out_gurobi());
					expr005.addTerm(1, listOfDataOut.get(i).getData_out_gurobi());

					expr06.addTerm(-1, listOfDataOut.get(i).getData_out_gurobi());
					
					//*******************
					//expr05.addTerm(-1, listOfDataOut.get(i).getData_out_gurobi());
					//expr06.addTerm(-1, listOfDataOut.get(i).getData_out_gurobi());
					//********************
				}

				for (int i = 0; i < listOfDataIn.size(); i++) {
					expr05.addTerm(-1, listOfDataIn.get(i).getData_in_gurobi());
					expr005.addTerm(-1, listOfDataIn.get(i).getData_in_gurobi());

					expr06.addTerm(1, listOfDataIn.get(i).getData_in_gurobi());
					
					//****************
					//expr05.addTerm(1, listOfDataIn.get(i).getData_in_gurobi());
					//expr06.addTerm(1, listOfDataIn.get(i).getData_in_gurobi());
					//****************
				}
				expr05.addTerm(-1, m_source);
				expr05.addTerm(1, m_destination);
				expr005.addTerm(-1, m_source);
				expr005.addTerm(1, m_destination);
				
				expr06.addTerm(1, m_source);
				expr06.addTerm(-1, m_destination);
				
				/*expr05.addTerm(1, m_source);
				expr05.addTerm(-1, m_destination);
				expr06.addTerm(1, m_source);
				expr06.addTerm(-1, m_destination);*/
				
				
				
				 //this.model.addConstr(expr05, GRB.LESS_EQUAL, n.getDestination()-
				 //n.getSource(), "1 Activated Out-Data & 1 or more Acitvated In_Data ");
				//this.model.addConstr(expr05, GRB.LESS_EQUAL, 0, "1 Activated Out-Data & 1 or more Acitvated In_Data ");
				
				
				
				//****************************************
				this.model.addConstr(expr005, GRB.EQUAL, 0, "1 Activated Out-Data & 1 or more Acitvated In_Data ");
				//*********************************************
				
				//this.model.addConstr(expr05, GRB.GREATER_EQUAL, 0, "1 Activated Out-Data & 1 or more Acitvated In_Data ");
				//this.model.addConstr(expr06, GRB.EQUAL, M, "1 or more Activated Out-Data & 1 Acitvated In_Data ");
				
				// this.model.addConstr(expr06, GRB.GREATER_EQUAL, n.getDestination() 
				// n.getSource() + M, "1 or more Activated Out-Data & 1 Acitvated In_Data ");
				//this.model.addConstr(expr06, GRB.LESS_EQUAL, M, "1 or more Activated Out-Data & 1 Acitvated In_Data ");
				//this.model.addConstr(expr06, GRB.LESS_EQUAL, M,
				//		"1 or more Activated Out-Data & 1 Acitvated In_Data ");

				// }
				
				
				
				}//if condition for non redundant routes
				
				
				
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
				}//dout_din connection
				
				
				
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
				}//cycle aviddance

	     //------------------------------------------------safety-critical applications----------------------------------- 
	     //------------------------------------------------redundancy constraints----------
		
		
		if(rs.getSettings().getRedundantRoutes()==1) {
			
			
		//ms - md - sigma(out links)<= -1 * ms		
			
			GRBLinExpr expr50 = new GRBLinExpr();
			expr50.addTerm(1, m_source);
			expr50.addTerm(-1, m_destination);
			expr50.addTerm(1, m_source);//to activate single-step solving
			for(int i=0; i< listOfDataOut.size();i++) {	
				expr50.addTerm(-1, listOfDataOut.get(i).getData_out_gurobi()); 			    	 
	     	}
	      
			this.model.addConstr(expr50, GRB.LESS_EQUAL,0, "1 Activated Out-Data"); // to generate more than two high-redundant routes

	      
	      //ms * ms+ ms * sigma(in links)<= ms * 1 --> redundancy constraint: to activate once ms is activated
			GRBLinExpr expr51 = new GRBLinExpr();//Constraint for redundancy
			GRBQuadExpr quad_expr51 = new GRBQuadExpr();
	  	  	
			expr51.addTerm(1, m_source);
			expr51.addTerm(-1, m_source);
	  	  	for(int i=0; i< listOfDataIn.size();i++) {
	    	  expr51.addTerm(1, listOfDataIn.get(i).getData_in_gurobi()); 			    	 
	  	  	}
	  	  	
	  		
			for (int k = 0; k < expr51.size(); k++) {

				double coeff_1 = expr51.getCoeff(k);
				GRBVar var_1 = expr51.getVar(k);
				quad_expr51.addTerm(coeff_1, var_1, m_source);

			}
	  	  		  	
	  	  	this.model.addQConstr(quad_expr51, GRB.LESS_EQUAL,  0 , "No Activated In-Data");
	      				      	      
		

	      
	      
		  //--------------redundancy-----------------------
		    //for destination-> md - ms - sigma(in links)<= -1*md 
		      
		      GRBLinExpr expr52 = new GRBLinExpr();
		      expr52.addTerm(-1, m_source);
		      expr52.addTerm(1, m_destination);
		      expr52.addTerm(1, m_destination);// to activate single-step solving  
		      for(int i=0; i< listOfDataIn.size();i++) {  
				  expr52.addTerm(-1, listOfDataIn.get(i).getData_in_gurobi()); 			    	 
			  }
			 
			  this.model.addConstr(expr52, GRB.LESS_EQUAL,0 , "1 Activated In-Data"); // to generate more than two high-redundant routes
		   
			  //-----------------------------------------
	      
			  //md * md+ md * sigma(out links)<= md * 1 --> activates this constraint once md is activated
			  
			  //if(n.getDestination()==1 && n.getSource()==0) {
			  
			  GRBLinExpr expr53 = new GRBLinExpr();		
			  GRBQuadExpr quad_expr53 = new GRBQuadExpr();
			  for(int i=0; i< listOfDataOut.size();i++) {  
				  expr53.addTerm(1, listOfDataOut.get(i).getData_out_gurobi()); 			    	 
			  }
			  expr53.addTerm(1, m_destination);
			  expr53.addTerm(-1, m_destination);
			  
			  for (int k = 0; k < expr53.size(); k++) {

					double coeff_1 = expr53.getCoeff(k);
					GRBVar var_1 = expr53.getVar(k);
					quad_expr53.addTerm(coeff_1, var_1, m_destination);

				}

			  this.model.addQConstr(quad_expr53, GRB.LESS_EQUAL, 0  , "No Activated Out-Data");
			  //}
			  
			  
			  
			 
			  
			  //if(n.getSource()==0 && n.getDestination()==0) {// id added for redundancy constraint
		      //all other nodes-> have either no edges or 1 in-edge and 1 out-edge 
			  
			  //md- ms + sigma dout <= 1
		      GRBLinExpr expr5 = new GRBLinExpr();
		      for(int i=0; i< listOfDataOut.size();i++) {
		    	  expr5.addTerm(1, listOfDataOut.get(i).getData_out_gurobi() ); 			    	 
		      }
		      	
		      //for(int i=0; i< listOfDataIn.size();i++) {
		    	//  expr5.addTerm(1, listOfDataIn.get(i).getData_in_gurobi() ); 			    	 
		      //}
		      
		      expr5.addTerm(-1, m_source);
		      expr5.addTerm(1, m_destination);
		      
		      //this.model.addConstr(expr5, GRB.LESS_EQUAL,1 , "1 Activated Out-Data<=1 ");
			  GRBQuadExpr quad_expr5 = new GRBQuadExpr();
			  
			  for (int k = 0; k < expr5.size(); k++) {

					double coeff_1 = expr5.getCoeff(k);
					GRBVar var_1 = expr5.getVar(k);
					quad_expr5.addTerm(coeff_1, var_1, m_destination);

				}
		      this.model.addQConstr(quad_expr5, GRB.LESS_EQUAL,1 , "1 Activated Out-Data<=1 ");

		      
		      //ms- md + sigma din <= 1
		      GRBLinExpr expr15 = new GRBLinExpr();
		      for(int i=0; i< listOfDataIn.size();i++) {
		    	  expr15.addTerm(1, listOfDataIn.get(i).getData_in_gurobi() );
		      } 
		      
		      expr15.addTerm(1, m_source);
		      expr15.addTerm(-1, m_destination);
		      
		      //this.model.addConstr(expr15, GRB.LESS_EQUAL, 1, " Acitvated In_Data <=1");
			  
		      GRBQuadExpr quad_expr15 = new GRBQuadExpr();
			  for (int k = 0; k < expr15.size(); k++) {

					double coeff_1 = expr15.getCoeff(k);
					GRBVar var_1 = expr15.getVar(k);
					quad_expr15.addTerm(coeff_1, var_1, m_source);

				}
		      this.model.addQConstr(quad_expr15, GRB.LESS_EQUAL,1 , "1 Activated In-Data<=1 ");
		      
		      
		      // md + md - ms - ms + sigma dout - sigma din = 0  
		      GRBLinExpr expr25 = new GRBLinExpr();
		      for(int i=0; i< listOfDataOut.size();i++) {
		    	  expr25.addTerm(1, listOfDataOut.get(i).getData_out_gurobi() ); 			    	 
		      }

		      for(int i=0; i< listOfDataIn.size();i++) {
		    	  expr25.addTerm(-1, listOfDataIn.get(i).getData_in_gurobi() );
		      } 
		      
		      expr25.addTerm(-2, m_source);
		      expr25.addTerm(2, m_destination);
		      
		      this.model.addConstr(expr25, GRB.EQUAL, 0, "1 Activated Out-Data & 1 Acitvated In_Data");


			  
		//}
			  		  
	      
		}//redundancy condition
		
		
		//****************************************Homogeneous Redundancy*****************************
	     
		if(rs.getSettings().getHomogeneousRedundantRoutes()==1) {
			

			int r = rs.getSettings().getHomogeneousRedundantRoutes();
			
			//ms * ms - ms * md - ms* sigma dout <= -r*ms 
			GRBLinExpr expr50 = new GRBLinExpr();
			expr50.addTerm(1, m_source);//to activate single-step solving
			expr50.addTerm(-1, m_destination);
			for(int i=0; i< listOfDataOut.size();i++) {	
				expr50.addTerm(-1, listOfDataOut.get(i).getData_out_gurobi()); 			    	 
	     	}
				
			GRBQuadExpr quad_expr50 = new GRBQuadExpr();
			expr50.addTerm(r, m_source); //to generate exact r+ms high-redundant routes

			for (int k = 0; k < expr50.size(); k++) {

				double coeff_1 = expr50.getCoeff(k);
				GRBVar var_1 = expr50.getVar(k);
				quad_expr50.addTerm(coeff_1, var_1, m_source);

			}
			this.model.addQConstr(quad_expr50, GRB.LESS_EQUAL,0, "r+1 Activated Out-Data");
    	  // to generate exact r high-redundant routes
						
			
	      //ms * ms+ ms * sigma(in links)<= ms * 1 --> redundancy constraint: to activate once ms is activated
			GRBLinExpr expr51 = new GRBLinExpr();//Constraint for redundancy
			GRBQuadExpr quad_expr51 = new GRBQuadExpr();
	  	  	
			expr51.addTerm(1, m_source);
			expr51.addTerm(-1, m_source);
	  	  	for(int i=0; i< listOfDataIn.size();i++) {
	    	  expr51.addTerm(1, listOfDataIn.get(i).getData_in_gurobi()); 			    	 
	  	  	}
	  	  	  		
			for (int k = 0; k < expr51.size(); k++) {

				double coeff_1 = expr51.getCoeff(k);
				GRBVar var_1 = expr51.getVar(k);
				quad_expr51.addTerm(coeff_1, var_1, m_source);

			}
	  	  		  	
	  	  	this.model.addQConstr(quad_expr51, GRB.LESS_EQUAL,  0 , "No Activated In-Data");
	  	  	  
	  	  	//md * md - ms * md - md* sigma din <= -r*md 
			  GRBLinExpr expr52 = new GRBLinExpr();
		      expr52.addTerm(-1, m_source);
		      expr52.addTerm(1, m_destination);// to activate single-step solving  
		      for(int i=0; i< listOfDataIn.size();i++) {  
		    	  expr52.addTerm(-1, listOfDataIn.get(i).getData_in_gurobi()); 			    	 
					  }
		          	  
			  expr52.addTerm(r, m_destination);//to generate exact r+md high-redundant route
			  GRBQuadExpr quad_expr52 = new GRBQuadExpr();
				
			  for (int k = 0; k < expr52.size(); k++) {
		
				double coeff_1 = expr52.getCoeff(k);
				GRBVar var_1 = expr52.getVar(k);
				quad_expr52.addTerm(coeff_1, var_1, m_destination);
			  }
			  
			  this.model.addQConstr(quad_expr52, GRB.LESS_EQUAL,0, "r Activated In-Data");// to generate exact r high-redundant route
				  			  
			  //md * md+ md * sigma(out links)<= md * 1 --> activates this constraint once md is activated
			  
			  GRBLinExpr expr53 = new GRBLinExpr();		
			  GRBQuadExpr quad_expr53 = new GRBQuadExpr();
			  for(int i=0; i< listOfDataOut.size();i++) {  
				  expr53.addTerm(1, listOfDataOut.get(i).getData_out_gurobi()); 			    	 
			  }
			  expr53.addTerm(1, m_destination);
			  expr53.addTerm(-1, m_destination);			  
			  for (int k = 0; k < expr53.size(); k++) {

					double coeff_1 = expr53.getCoeff(k);
					GRBVar var_1 = expr53.getVar(k);
					quad_expr53.addTerm(coeff_1, var_1, m_destination);
				}
			  this.model.addQConstr(quad_expr53, GRB.LESS_EQUAL, 0  , "No Activated Out-Data");
		
			  //--------------------------------------redundancy-specific constraints-----------------------------
			  //md- ms + sigma dout <= 1
			  // md+ ms+ r*ms - sigmadout <=md
		      GRBLinExpr expr5 = new GRBLinExpr();
		      GRBQuadExpr quad_expr5 = new GRBQuadExpr();
		      for(int i=0; i< listOfDataOut.size();i++) {
		    	  expr5.addTerm(-1, listOfDataOut.get(i).getData_out_gurobi() ); 			    	 
		      }
		      			      
		      expr5.addTerm(1, m_source);
		      expr5.addTerm(r, m_source);
		      expr5.addTerm(1, m_destination);
		      expr5.addTerm(-1, m_destination);
		      
		      for (int k = 0; k < expr5.size(); k++) {//activating only for m_source or sender

					double coeff_1 = expr5.getCoeff(k);
					GRBVar var_1 = expr5.getVar(k);
					quad_expr5.addTerm(coeff_1, var_1, m_source);
				}
		      this.model.addConstr(expr5, GRB.LESS_EQUAL,0 , " Activated Out-Data<=r ");
		      //this.model.addQConstr(quad_expr5, GRB.LESS_EQUAL,0 , " Activated Out-Data<=r ");
		      
		      
		      //ms- md + sigma din <= 1
		      //ms+ md + md *r  -sigma din <=ms
		      GRBLinExpr expr15 = new GRBLinExpr();
		      GRBQuadExpr quad_expr15 = new GRBQuadExpr();
		      for(int i=0; i< listOfDataIn.size();i++) {
		    	  expr15.addTerm(-1, listOfDataIn.get(i).getData_in_gurobi() );
		      } 
		      
		      expr15.addTerm(1, m_source);
		      expr15.addTerm(-1, m_source);
		      expr15.addTerm(1, m_destination);
		      expr15.addTerm(r, m_destination);

		      for (int k = 0; k < expr15.size(); k++) {//activating only for m_destination or destination

					double coeff_1 = expr15.getCoeff(k);
					GRBVar var_1 = expr15.getVar(k);
					quad_expr15.addTerm(coeff_1, var_1, m_destination);
						}
		      //this.model.addQConstr(quad_expr15, GRB.LESS_EQUAL, 0, " Acitvated In_Data <=r");
		      this.model.addConstr(expr15, GRB.LESS_EQUAL, 0, " Acitvated In_Data <=r+1");
		      
		      
		      
		      
		      
		      GRBVar v = model.addVar(0.0, 1.0, 0.0, GRB.BINARY, "v");
		      GRBVar m = model.addVar(1.0, 1.0, 1.0, GRB.BINARY, "constantNum_1");
				// Model v = (1-ms) * (1-md)
				GRBQuadExpr quad_expr_v = new GRBQuadExpr();
				quad_expr_v.addTerm(1, m_source, m_destination);
				quad_expr_v.addTerm(-1, m_source);
				quad_expr_v.addTerm(-1, m_destination);
				quad_expr_v.addTerm(1, m);
				
				
				model.addQConstr(quad_expr_v, GRB.EQUAL, v, "MutiplicationOf_v = (1-ms)*(1-md)");
		      
		      
				   GRBLinExpr expr015 = new GRBLinExpr();
				      GRBQuadExpr quad_expr015 = new GRBQuadExpr();
				      for(int i=0; i< listOfDataIn.size();i++) {
				    	  expr015.addTerm(1, listOfDataIn.get(i).getData_in_gurobi() );
				      } 
				      

				      for (int k = 0; k < expr015.size(); k++) {//activating only for m_destination or destination

							double coeff_1 = expr015.getCoeff(k);
							GRBVar var_1 = expr015.getVar(k);
							quad_expr015.addTerm(coeff_1, var_1, v);
								}
				      //this.model.addQConstr(quad_expr15, GRB.LESS_EQUAL, 0, " Acitvated In_Data <=r");
				      this.model.addQConstr(quad_expr015, GRB.LESS_EQUAL, v, " Acitvated In_Data <=r+1");
		      
		      
		      
		      
		      // md + md - ms - ms + sigma dout - sigma din = 0  
		      //md + md* r - ms *r - ms + sigma dout - sigma din = 0
		      GRBLinExpr expr25 = new GRBLinExpr();
		      for(int i=0; i< listOfDataOut.size();i++) {
		    	  expr25.addTerm(1, listOfDataOut.get(i).getData_out_gurobi() ); 			    	 
		      }

		      for(int i=0; i< listOfDataIn.size();i++) {
		    	  expr25.addTerm(-1, listOfDataIn.get(i).getData_in_gurobi() );
		      } 
		      
		      expr25.addTerm(-1, m_source);
		      expr25.addTerm(1, m_destination);
		      expr25.addTerm(-r, m_source);
		      expr25.addTerm(r, m_destination);
		      this.model.addConstr(expr25, GRB.EQUAL, 0, "1 Activated Out-Data & 1 Acitvated In_Data");
		
		
				}//homogeneous redundancy condition
		
		
		//***************************************Multicast Routing******************
		
		if(data.getName().equals("Data1")) {
			//data.setMultiCast(true);
		}
		

    	if(n.getName().equals("ecu4")||n.getName().equals("ecu5")) {
    		//n.setMultiCast(true);	
    		n.setMaxMemory_utilization(10);
    	}
    	
    	if(n.getName().equals("ecu1")) {
    		
    		n.setMaxMemory_utilization(100);
    	}
    	
    	
    	
		if(data.isMultiCast()== true){
			
			System.out.println("MultiCast_Routing");
			ArrayList<Process> listOfProc = new ArrayList<Process>();
			ArrayList<Node> listOfN = new ArrayList<Node>();

			for(Application app:rs.getApplications()) {
				listOfProc.addAll(app.getProcess());
			}

			for(Node node:rs.getNodes()) {
				listOfN.add(node);
			}
			

			        
			
			
			/*for (int k = 0; k < listOfProc.size(); k++) {
			    Process p1 = listOfProc.get(k);
	
			    for (int j = 0; j < listOfProc.size(); j++) {
			        Process p2 = listOfProc.get(j);
	
			        if(p1.getSendData() == p2.getRecieveData() && 
			        		p1.getSendData()!=null && p1.getSendData()==data) {*/
			        	
			        	GRBVar m_s = null;
			        	GRBVar m_d = null;
	        			Node n_s = null;
	        			Node n_d = null;

			        	//m_s= m_source;
			        	//m_d = m_destination;
			        	
			        	/*for(int p=0; p< n.getMappings().size(); p++) {
			        	
			        		if(n.getMappings().get(p).getApp()==p1.getApplication()) {
			        			
			        			m_s = n.getMappings().get(p).getM_gurobi();
			        			n_s = n.getMappings().get(p).getNode();
			        		}
			        		
			        		else if (n.getMappings().get(p).getApp()==p2.getApplication()) {
			        			

			        			m_d = n.getMappings().get(p).getM_gurobi();
			        			n_d = n.getMappings().get(p).getNode();
			        		}
			        		
			        	}*/
			        	
			        	
			        	/*for(Application app: rs.getApplications()) {

			        		if (app.getName().equals("App1")) {
			        			
			        			for(int p=0; p< n.getMappings().size(); p++) {
			        				
			        				if(n.getMappings().get(p).getApp().equals(app) && n.getMaxMemory_utilization()==100) {
			        					
			        					m_s = n.getMappings().get(p).getM_gurobi();
			        			}
			        				
			        				
			        		}
			        			if(app.getName().equals("App2"))
			        			
			        			if(n.getMappings().get(p).getApp().)
			        	}*/
			        	
			        	
	
			      
						
						
						//if(n.isMultiCast()==false) {
						if(n.getMaxMemory_utilization()==100) {
							m_s= model.addVar(1.0, 1.0, 1.0, GRB.BINARY, "m_s");
						// for source-> ms -md - sigma(out links)<=0
						GRBLinExpr expr01 = new GRBLinExpr();
						for (int i = 0; i < listOfDataOut.size(); i++) {
							expr01.addTerm(-1, listOfDataOut.get(i).getData_out_gurobi());
						}
						//expr01.addTerm(1, m_source);
						//expr01.addTerm(-1, m_destination);
						
						expr01.addTerm(1, m_s);
						//expr01.addTerm(-1, m_d);
						
						//this.model.addConstr(expr01, GRB.LESS_EQUAL, 0, "1 Activated Out-Data_multicast");
						GRBQuadExpr quad_expr01 = new GRBQuadExpr();					      			      
							
					  

					    for (int t = 0; t < expr01.size(); t++) {//activating only for m_source or sender

								double coeff_1 = expr01.getCoeff(t);
								GRBVar var_1 = expr01.getVar(t);
								quad_expr01.addTerm(coeff_1, var_1, m_s);
							}
					    this.model.addQConstr(quad_expr01, GRB.LESS_EQUAL, 0, "1 Activated Out-Data_multicast");
						
						
												
						
						// for source ->ms + sigma(in links)<=1
						// this "m_source" variable has multiplied to the expr02 to activate multicast
						// routing for one specific data. This
						// actually include the following constraint only for the source node.
						GRBLinExpr expr02 = new GRBLinExpr();
						for (int i = 0; i < listOfDataIn.size(); i++) {
							expr02.addTerm(1, listOfDataIn.get(i).getData_in_gurobi());
						}
	
						//expr02.addTerm(1, m_source);
						expr02.addTerm(1, m_s);
						// the following constraint is related to uni-cast routing
						//this.model.addConstr(expr02, GRB.LESS_EQUAL, 1, "No Activated In-Data");
						  GRBQuadExpr quad_expr02 = new GRBQuadExpr();					      			      
							
					      expr02.addTerm(-1, m_s);

					      for (int t = 0; t < expr02.size(); t++) {//activating only for m_source or sender

								double coeff_1 = expr02.getCoeff(t);
								GRBVar var_1 = expr02.getVar(t);
								quad_expr02.addTerm(coeff_1, var_1, m_s);
							}
					      this.model.addQConstr(quad_expr02, GRB.LESS_EQUAL, 0, "No Activated In-Data_multicast");
						
						}
					      					      					     
						if(n.getMaxMemory_utilization()==10) {
					      
					     // for destination-> md - ms - sigma(in links)<= 0
					      
					    m_d= model.addVar(1.0, 1.0, 1.0, GRB.BINARY, "m_d");
						GRBLinExpr expr03 = new GRBLinExpr();
						for (int i = 0; i < listOfDataIn.size(); i++) {
							expr03.addTerm(-1, listOfDataIn.get(i).getData_in_gurobi());
						}
						//expr03.addTerm(-1, m_source);
						//expr03.addTerm(1, m_destination);
						
						//expr03.addTerm(-1, m_s);
						expr03.addTerm(1, m_d);

						//this.model.addConstr(expr03, GRB.LESS_EQUAL, 0, "1 Activated In-Data_multicast");

						  GRBQuadExpr quad_expr03 = new GRBQuadExpr();					      			      
							

					      for (int t = 0; t < expr03.size(); t++) {//activating only for m_d or receiver

								double coeff_1 = expr03.getCoeff(t);
								GRBVar var_1 = expr03.getVar(t);
								quad_expr03.addTerm(coeff_1, var_1, m_d);
							}
					      //this.model.addQConstr(quad_expr03, GRB.LESS_EQUAL, 0, "1 Activated In-Data_multicast");
					      this.model.addQConstr(quad_expr03, GRB.EQUAL, 0, "1 Activated In-Data_multicast");
						
						
						
						// for destination-> md + sigma(out links)<= 1
						GRBLinExpr expr04 = new GRBLinExpr();
						for (int i = 0; i < listOfDataOut.size(); i++) {
							expr04.addTerm(1, listOfDataOut.get(i).getData_out_gurobi());
						}
						//expr04.addTerm(1, m_destination);
						expr04.addTerm(1, m_d);
						
				      GRBQuadExpr quad_expr04 = new GRBQuadExpr();					      			      
		
				      expr04.addTerm(-1, m_d);

				      for (int t = 0; t < expr04.size(); t++) {//activating only for m_source or sender

							double coeff_1 = expr04.getCoeff(t);
							GRBVar var_1 = expr04.getVar(t);
							quad_expr04.addTerm(coeff_1, var_1, m_d);
						}
					     
						
						
						this.model.addQConstr(quad_expr04, GRB.LESS_EQUAL, 0, "No Activated Out-Data_multicast");
						//this.model.addConstr(expr04, GRB.LESS_EQUAL, 1, "No Activated Out-Data");
						
						// ----------------sigma dataout<=sigma datain either OR sigma datain<=sigma
						//double N = 100000;
						//GRBVar m_flow = model.addVar(0.0, 1.0, 0.0, GRB.BINARY, "BIG M");// define Big M
						}
						
						
						GRBVar x_or = model.addVar(0.0, 1.0, 0.0, GRB.BINARY, "OR x");
						GRBVar y_or = model.addVar(0.0, 1.0, 0.0, GRB.BINARY, "OR y");
						GRBVar z = model.addVar(1.0, 1.0, 1.0, GRB.BINARY, "z");

						GRBLinExpr expr_flow_conservation = new GRBLinExpr();
						GRBLinExpr expr_flow_conservation1 = new GRBLinExpr();
						GRBLinExpr expr_flow_conservation2 = new GRBLinExpr();
						
						for (int i = 0; i < listOfDataOut.size(); i++) {
							
							expr_flow_conservation.addTerm(1, listOfDataOut.get(i).getData_out_gurobi());
							expr_flow_conservation1.addTerm(-1, listOfDataOut.get(i).getData_out_gurobi());
							expr_flow_conservation2.addTerm(1, listOfDataOut.get(i).getData_out_gurobi());
						}
						
						for (int i = 0; i < listOfDataIn.size(); i++) {
							
							expr_flow_conservation.addTerm(-1, listOfDataIn.get(i).getData_in_gurobi());					
							expr_flow_conservation1.addTerm(1, listOfDataIn.get(i).getData_in_gurobi());					
							expr_flow_conservation2.addTerm(-1, listOfDataIn.get(i).getData_in_gurobi());					

						}
										      
					      GRBQuadExpr quad_expr_flow_conservation = new GRBQuadExpr();					      			      
							     
					      expr_flow_conservation.addTerm(-1, z);
					      for (int t = 0; t < expr_flow_conservation.size(); t++) {//activating only for m_source or sender

								double coeff_1 = expr_flow_conservation.getCoeff(t);
								GRBVar var_1 = expr_flow_conservation.getVar(t);
								quad_expr_flow_conservation.addTerm(coeff_1, var_1, x_or);
							}
						
					      
					      GRBQuadExpr quad_expr_flow_conservation1 = new GRBQuadExpr();					      			      
						      
					      for (int t = 0; t < expr_flow_conservation1.size(); t++) {//activating only for m_source or sender

								double coeff_1 = expr_flow_conservation1.getCoeff(t);
								GRBVar var_1 = expr_flow_conservation1.getVar(t);
								quad_expr_flow_conservation1.addTerm(coeff_1, var_1, y_or);
							}
					      
					    
					      
					      if(n.getMaxMemory_utilization()!=10 && n.getMaxMemory_utilization()!=100 ) {
					    	  
					    	  this.model.addQConstr(quad_expr_flow_conservation, GRB.GREATER_EQUAL,0 , "1 Activated Out-Data & 1 or more Acitvated In_Data_multicast with Num ");

						
					    	  this.model.addQConstr(quad_expr_flow_conservation1, GRB.EQUAL, 0, "1 Activated Out-Data & 1 or more Acitvated In_Data_multicast_Num1 ");
					      

						
						GRBLinExpr expr_OR= new GRBLinExpr();
						expr_OR.addTerm(1, y_or);
						expr_OR.addTerm(1, x_or);
						//expr_OR.addTerm(1, z_or);
						this.model.addConstr(expr_OR, GRB.EQUAL, 1, "OR_Constr");
					      }
					      
					      
					      
					      
					      
					      /*GRBVar v = model.addVar(0.0, 1.0, 0.0, GRB.BINARY, "v");
					      GRBVar m = model.addVar(1.0, 1.0, 1.0, GRB.BINARY, "constantNum_1");
							// Model v = (1-ms) * (1-md)
							GRBQuadExpr quad_expr_v = new GRBQuadExpr();
							quad_expr_v.addTerm(1, m_s, m_d);
							quad_expr_v.addTerm(-1, m_s);
							quad_expr_v.addTerm(-1, m_d);
							quad_expr_v.addTerm(1, m);
							
							
							model.addQConstr(quad_expr_v, GRB.EQUAL, v, "MutiplicationOf_v = (1-ms)*(1-md)");
					      
							 GRBVar i = model.addVar(0.0, 1.0, 0.0, GRB.BINARY, "i");
							// Model i = v * x_or
							GRBQuadExpr quad_expr_i = new GRBQuadExpr();
							quad_expr_i.addTerm(1, v, x_or);					
							
							model.addQConstr(quad_expr_i, GRB.EQUAL, i, "MutiplicationOf_i = v * x_or");
							
	      
					      GRBLinExpr expr_flow_IntNode = new GRBLinExpr();
					      GRBQuadExpr quad_expr_flow_IntNode = new GRBQuadExpr();					      			      
					     
					      for (int t = 0; t < expr_flow_conservation.size(); t++) {//activating only for m_source or sender

								double coeff_1 = expr_flow_conservation.getCoeff(t);
								GRBVar var_1 = expr_flow_conservation.getVar(t);
								quad_expr_flow_conservation.addTerm(coeff_1, var_1, i);
								
							}   */
					      
					     // ArrayList<Mapping> listOfM = new ArrayList<Mapping>();
					     // listOfM.addAll(p1.getApplication().getMappings());
					     // for(int b=0; b< listOfM.size(); b++) {					      
					    //	  if (listOfM.get(b).getM_gurobi().get(GRB.DoubleAttr.X) == 1) {
					    //		  System.out.println(p1.getName());
					    //	  }
					    	  
					     // }
					      

					      

					      
						//expr_flow_conservation.addTerm(1, m_source);
						//expr_flow_conservation.addTerm(-1, m_destination);
						
				
						//expr_flow_conservation.addTerm(-N, m_flow);

						//this.model.addConstr(expr_flow_conservation, GRB.GREATER_EQUAL, 0, "1 Activated Out-Data & 1 or more Acitvated In_Data_multicast ");
					    // was sigma dout - sigma din >= -1  
					      //if(n.getMaxMemory_utilization()!=10) {
					    	 // this.model.addQConstr(quad_expr_flow_conservation, GRB.GREATER_EQUAL, 1, "1 Activated Out-Data & 1 or more Acitvated In_Data_multicast with Num ");

					      //}
						
						
						//expr_flow_conservation1.addTerm(-1, m_d);
						//expr_flow_conservation1.addTerm(1, m_s);
					      //else if(n.isMultiCast()==false && n.getMaxMemory_utilization()!=10){
				      /*GRBQuadExpr quad_expr_flow_conservation1 = new GRBQuadExpr();					      			      
					     
				      GRBVar in = model.addVar(0.0, 1.0, 0.0, GRB.BINARY, "in");
						// i = v * y_or
						GRBQuadExpr quad_expr_in = new GRBQuadExpr();
						quad_expr_in.addTerm(1, v, y_or);					
						
						model.addQConstr(quad_expr_in, GRB.EQUAL, in, "MutiplicationOf_i = v * y_or");*/
				      
				      
				     /* for (int t = 0; t < expr_flow_conservation1.size(); t++) {//activating only for m_source or sender

							double coeff_1 = expr_flow_conservation1.getCoeff(t);
							GRBVar var_1 = expr_flow_conservation1.getVar(t);
							quad_expr_flow_conservation1.addTerm(coeff_1, var_1, in);
						}*/
						
						//expr_flow_conservation1.addTerm(N, m_flow);
						
						//this.model.addQConstr(quad_expr_flow_conservation1, GRB.EQUAL, 0, "1 Activated Out-Data & 1 or more Acitvated In_Data_multicast_Num1 ");
						//this.model.addQConstr(quad_expr_flow_conservation1, GRB.GREATER_EQUAL, 0, "1 Activated Out-Data & 1 or more Acitvated In_Data_multicast1 ");
					      
		
			

 
				}//multicast Routing
		
			}//Node iteration
		}//Data Iteration
				
		
		
		
		
	      //----------------------------------------------

	      
	      //---------------------------Optimize the link costs--------------------------------------------------
	     /*GRBLinExpr expr7 = new GRBLinExpr();
		  for(int i=0;i<listOfAllDataOut.size();i++) {
			expr7.addTerm(listOfAllDataOut.get(i).getData_out_has_link().getCost(), listOfAllDataOut.get(i).getData_out_gurobi());
			 }
			 
		  this.model.setObjective(expr7, GRB.MINIMIZE);*/
		  
		  //---------------------------------------------------------------------------
	      

		
		// ********************************Link Occupation Rate
		// constraint*************************************
		if(rs.getSettings().isLOR()) {
			for (Link link : rs.getLinks()) {
				GRBLinExpr expr_LOR = new GRBLinExpr();
				ArrayList<Data_Out> listOfDataOut = new ArrayList<Data_Out>();
				listOfDataOut.addAll(link.getD_out());
				for (int i = 0; i < listOfDataOut.size(); i++) {
					expr_LOR.addTerm(1, listOfDataOut.get(i).getData_out_gurobi());
		
				}
				
				int LORVal = rs.getSettings().getLORValue(); 
				//	System.out.println("LOR: "+LORVal); 
				this.model.addConstr(expr_LOR, GRB.LESS_EQUAL, LORVal, "LOR constraint");
			}
		}
		

		

		// ********************************************process scheduling on each
		// core**********************************
		
		//int n = 100;
        //GRBVar[] m100 = new GRBVar[n];
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
								//System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
								break;
							}
							++lcm;
						}
						listofLCM.add(lcm);
						maxlcm = Collections.max(listofLCM);
						p1 = (lcm / n1) - 1;// Ki E (0, (LCM/Pi) -1)
						ki.add(p1);
						//System.out.println("Ki E:" + ki);
						//System.out.println("LCM Max:" + maxlcm);

						p2 = (lcm / n2) - 1;
						kj.add(p2);
						//System.out.println("Kj E:" + kj);
						//System.out.println("LCMs: " + listofLCM);

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
						
						
						
						/*if(listofPairedProcesses.get(0).getApplication().isSafetycritical()) {
							if (node.getName().equals("ecu1") && listofPairedProcesses.get(0).getApplication().getName().equals("App1")) {
								m100[0] = model.addVar(0.0, 1.0, 0.0, GRB.CONTINUOUS, "m100_" +i+j+ node.getName());
								m100[0]= listofPairedProcesses.get(0).getStartingTime();
								}
							
							if (node.getName().equals("ecu2")&& listofPairedProcesses.get(0).getApplication().getName().equals("App1")) {
								m100[1] = model.addVar(0.0, 1.0, 0.0, GRB.CONTINUOUS, "m100_" +i+j+ node.getName());
								m100[1]= listofPairedProcesses.get(0).getStartingTime();
							}
						}
						
						if(listofPairedProcesses.get(1).getApplication().isSafetycritical()) {
							m100[i] = model.addVar(0.0, 1.0, 0.0, GRB.CONTINUOUS, "m100_" +i+j+ node.getName());
	 						m100[1]= listofPairedProcesses.get(1).getStartingTime();
						}*/
						
						
						
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
								//GRBQuadExpr quad_expr = new GRBQuadExpr();

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
			ArrayList<Process> listOfAllProcesses = new ArrayList<Process>();

			Process p_sender = null;
			Process p_receiver= null;
			// added this outer loop, because process are stored in applications not
			// in the EED
			
			//double sd = 10; //sd is considered 10 us. If a thread finishes its job, it requires some time prior to the data can be packed in frames
			//and sent over the network which is indicated as sd
			double sd = 0.0001;
			
			//double rd = 10;//once a frame arrives at a control node, it needs a specific amount of time to be unpacked and
			//processed before the data can be used by the related node which is denoted as
			double rd = 0.0001;
			
			for (Application app : rs.getApplications()) {
				listOfAllProcesses.addAll(app.getProcess());
			}
				
			//for (Process process : app.getProcess()) {
			for(Process process : listOfAllProcesses) {

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
								
								expr19.addTerm(-sd, m01);
								
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
					ArrayList<Task> listOfEachTaskData = new ArrayList<Task>();
					if (process.getRecieveData() != null && process.getRecieveData() == data) {
						//ArrayList<Task> listOfEachTaskData = new ArrayList<Task>();
						p_receiver = process;
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
								expr20.addTerm(-rd, m01);
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
					}
						// *****************************************OPTIMIZAT GOALS***************************************************

						if(p_sender !=null && p_receiver!=null && p_sender != p_receiver 
								&& p_sender.getSendData() == p_receiver.getRecieveData()){
							
						
							if(rs.getSettings().isUseOptimizationGoals()){
							Optimization_Goal optGoal = rs.getSettings().getOptimizationGoal();
						
						GRBLinExpr expr25 = new GRBLinExpr();
						GRBLinExpr expr31 = new GRBLinExpr();
						GRBLinExpr expr21 = new GRBLinExpr();
						
						for (int i = 0; i < listOfEachTaskData.size(); i++) {
							expr21.addTerm(1, listOfEachTaskData.get(i).getStartTime());
						}
						//********************************Response time*****************************
						GRBLinExpr rs_expr = new GRBLinExpr();
						GRBVar response_time = model.addVar(0.0, GRB.INFINITY, 0.0, GRB.CONTINUOUS, "response_time");
						GRBVar start_time = model.addVar(0.0, 0.0, 0.0, GRB.CONTINUOUS, "start_time" );

						rs_expr.addTerm(1, p_receiver.getStartingTime());
						rs_expr.addTerm(1, start_time);
					    this.model.addConstr(response_time, GRB.GREATER_EQUAL, rs_expr, "end_to_end_latency_" + p_receiver.getName());

					    GRBLinExpr rs_obj_expr = new GRBLinExpr();
					    rs_obj_expr.addTerm(1.0, response_time);
						
						// ************************************Latency Opt goal***********************************						
						
						GRBLinExpr latency_expr = new GRBLinExpr();
						GRBVar end_time = model.addVar(0.0, GRB.INFINITY, 0.0, GRB.CONTINUOUS, "end_time");
					    
						latency_expr.addTerm(1, p_receiver.getStartingTime());
						latency_expr.addTerm(-1, p_sender.getStartingTime());
					    					    						 					
					    this.model.addConstr(end_time, GRB.GREATER_EQUAL, latency_expr, "end_to_end_latency_" + p_receiver.getName());
					    GRBLinExpr latency_obj_expr = new GRBLinExpr();
					    latency_obj_expr.addTerm(1.0, end_time);
					    
					    
						if(optGoal == Optimization_Goal.RESPONSETIME) {
							
							System.out.println("response time optimization!");					

							this.model.setObjective(rs_obj_expr, GRB.MINIMIZE);
						}
						
						if(optGoal == Optimization_Goal.END_TO_END_LATENCY) {
							//System.out.println("end to end optimization!");

							
							 this.model.setObjective(latency_obj_expr, GRB.MINIMIZE);
						}
						
						if(optGoal == Optimization_Goal.MULTI_OBJECTIVE) {
							//System.out.println("multi objective optimization!");
							// ********************************multi Objective Optimization*************************
							/*
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
 * 
 * 							In the code, setting two objectives: minimizing the latency_obj_expr expression
 *  						as the first objective, and minimizing the rs_obj_expr expression as the second objective. 
 * 							The parameters 0 and 1 specify the indices of the objectives, and the values 2 and 1 specify
 *  						the priorities of the objectives (higher priorities mean that the corresponding objectives
 *   						will be optimized more aggressively).The remaining parameters (0, 0, 0) are not relevant for this case.
 * 								
 */
//							 */
//							// Hierarchical optimization approach defining priority
							this.model.setObjectiveN(latency_obj_expr, 0, 2, 0, 0, 0, "latency");
							this.model.setObjectiveN(rs_obj_expr, 1, 1, 0, 0, 0, "responsetime");
							
//
//							// Blended optimization approach
//							/*
//							 * this.model.setObjectiveN(expr31, 0, 0, -2,0,0, "latency");
//							 * this.model.setObjectiveN(expr25, 1, 0, -1,0,0, "responsetime");
//							 */
//
//							// ************************************************
								}
						
							}
							p_sender =null;
							p_receiver =null;
						}

				}
		

		}

		
		//*****************Resource consumption optimization goal****************************
	if(rs.getSettings().isResourceUsage()) {
		
		for(Node node : rs.getNodes()) {
			ArrayList<Mapping> listOfMappingNode = new ArrayList<Mapping>();

			listOfMappingNode.addAll(node.getMappings());
			GRBVar resource_usage = model.addVar(0.0, GRB.INFINITY, 0.0, GRB.CONTINUOUS, "resource_usage");//
	
		
			GRBLinExpr resource_usage_expr = new GRBLinExpr();
			for(int i=0; i<listOfMappingNode.size(); i++) {
			
				resource_usage_expr.addTerm(1, listOfMappingNode.get(i).getM_gurobi());
			}
			double avg_app_per_node	= rs.getApplications().size() / rs.getNodes().size();
			
			//this.model.addConstr(resource_usage, GRB.LESS_EQUAL, resource_usage_expr, "resource usage minimization" +node.getName() );
			
			this.model.addConstr(resource_usage_expr, GRB.GREATER_EQUAL, avg_app_per_node, "Resource usage minimization");


				//*******boundary objective****************
				//this.model.addConstr(expr021, GRB.LESS_EQUAL, 6, "Resource usage minimization");
				//this.model.addConstr(expr021, GRB.LESS_EQUAL, 6, "Resource usage minimization");
				//*******minimize objective****************
				
				//this.model.setObjective(expr021, GRB.MINIMIZE);
				//this.model.setObjectiveN(expr021, 0, 2, 0,0,0, "resourceUsageMinimization");
				
		}
	}
		//********************									
	//}

	    /*
	
	


	}
	
		//*****************************************************

		//for (int i = 0; i < listOfReceiverProcesses.size(); i++) {

			// expr21.addTerm(1,listOfReceiverProcesses.get(i).getStartingTime());
		//}

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
		model.write("C:\\Users\\hadia\\OneDrive\\Desktop\\Projects\\EE_Designer_Framework_Test\\AutoDesigner\\AutoDesigner1\\myfile.lp");
		
		this.model.optimize();
		
		
		//************************ measure the solving time for evaluation purposes*****************************
		//FileWriter sl = new FileWriter("solving_8APP_10P_8E.csv");
		//PrintWriter out = new PrintWriter(sl);
		//out.print("TimeOfSolvingFor6Processesof8Appsand8ECUs");
		//out.println();
		//long startTime = System.currentTimeMillis();
		//this.model.optimize();
		//long stopTime = System.currentTimeMillis();
	    //long soltime = stopTime - startTime;
	    //out.print(soltime);
		//out.println();
		//out.flush();
	    //********************************************************************************************************
	    
		//this.model.computeIIS();
		//this.model.write("C:\\Users\\hadia\\OneDrive\\Desktop\\Projects\\EE_Designer_Framework_Test\\AutoDesigner\\AutoDesigner1\\model.ilp");


		
		
		
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
		
		
		
		
		  //for (int i = 0; i < n; i++) {
			 
		     // System.out.println( "redundancy1: " +m100[0].get(StringAttr.VarName) +"="+ m100[0].get(GRB.DoubleAttr.X));
		     // System.out.println( " redundancy2:" + m100[1].get(GRB.DoubleAttr.X));
		    //}
		
		  
		  
		  
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