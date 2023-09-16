package autoDesigner1.design;
//
////import GR
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//
//import org.eclipse.emf.common.util.TreeIterator;
//import org.eclipse.emf.ecore.EObject;
//import org.eclipse.equinox.internal.app.AppPersistence;
//
//import gurobi.GRB;
//import gurobi.GRBEnv;
//import gurobi.GRBException;
//import gurobi.GRBLinExpr;
//import gurobi.GRBModel;
//import gurobi.GRBVar;
//import autoDesigner1.Application;
//import autoDesigner1.Cr;
//import autoDesigner1.Data;
//import autoDesigner1.Data_In;
//import autoDesigner1.Data_Out;
//import autoDesigner1.L_In;
//import autoDesigner1.L_Out;
//import autoDesigner1.Link;
//import autoDesigner1.Mapping;
//import autoDesigner1.Node;
//import autoDesigner1.Order;
//import autoDesigner1.impl.EEDImpl;
//import autoDesigner1.impl.NodeImpl;
//
//public class TopologySolver {
//	private GRBModel model;
//	private EObject emfModel;
//
//	// public void initSolver(EObject self) throws GRBException{
//	public void initSolver() throws GRBException {
//		GRBEnv env = new GRBEnv(true);
//		env.set("logFile", "mip1.log");
//		env.start();
//		// Create empty model
//		GRBModel model = new GRBModel(env);
//		this.model = model;
//		// this.emfModel=self;
//	}
//
//	public ArrayList<EObject> findEmfElements(EObject root, String elementName) {
//		// root element
//		ArrayList<EObject> listOfElements = new ArrayList<EObject>();
//		TreeIterator<EObject> emfModelElements = root.eContainer().eAllContents();
//		while (emfModelElements.hasNext()) {
//			EObject next = emfModelElements.next();
//			System.out.println(next.getClass().getName());
//			if (next.getClass().getName() == elementName) {
//				System.out.println(next.getClass().getName());
//				System.out.println("hadi");
//				listOfElements.add(next);
//			}
//
//		}
//		return listOfElements;
//	}
//
//	public ArrayList<EObject> findEmfElements(EObject root) {
//		// root element
//		ArrayList<EObject> listOfElements = new ArrayList<EObject>();
//		TreeIterator<EObject> emfModelElements = root.eContainer().eAllContents();
//		while (emfModelElements.hasNext()) {
//			EObject next = emfModelElements.next();
//
//			listOfElements.add(next);
//
//		}
//		return listOfElements;
//	}
//
//	// public void createGRBVars(EObject emfModel) throws GRBException {
//	public void createGRBVars(EEDImpl emfModel) throws GRBException {
//		// todo: parse emf model
//		// ArrayList<EObject> list= findEmfElements(emfModel, "test1.impl.NodeImpl");
//		// create GRBVars and add to this.model
//		// EObject next=((Iterator<EObject>) list).next();
//		// ArrayList<GRBVar> listOfMapping = new ArrayList<GRBVar>();
//		// root element
//
//		// TreeIterator<EObject> variables = emfModel.eContainer().eAllContents();
//
//		EEDImpl test1 = (EEDImpl) emfModel.eContainer();
//		// Test1Impl variables = (Test1Impl) emfModel.eContainer().eAllContents();
//		// TreeIterator<EObject> variables = emfModel.eContainer().eAllContents();
//		// Changed by Andre
//		TreeIterator<EObject> variables = emfModel.eAllContents();
//		ArrayList<GRBVar> listOfMapping = new ArrayList<GRBVar>();
//		Integer counterData = 0;
//		// while (variables.hasNext()) {
//		while (((Iterator<EObject>) variables).hasNext()) {
//			// EObject next = variables.next();
//			EObject next = ((Iterator<EObject>) variables).next();
//			if (next instanceof Mapping) {
//				((Mapping) next).setM_gurobi(this.model.addVar(0.0, 1.0, 0.0, GRB.BINARY, "M"));
//
//			}
//
//			if (next instanceof Data_In) {
//				counterData++;
//				((Data_In) next).setData_in_gurobi(
//						this.model.addVar(0.0, 1.0, 0.0, GRB.BINARY, "Data_IN" + ((Data_In) next).getName()));
//
//			}
//			if (next instanceof Data_Out) {
//				counterData++;
//				((Data_Out) next).setData_out_gurobi(
//						this.model.addVar(0.0, 1.0, 0.0, GRB.BINARY, "Data_OUT" + ((Data_Out) next).getName()));
//			}
//
//			// set the gurobi variables for in_links and out_links
//			/*
//			 * if(next instanceof L_In) { ((L_In)
//			 * next).setL_in_gurobi(this.model.addVar(0.0, 1.0, 0.0,GRB.BINARY,"L_IN"));
//			 * 
//			 * }
//			 * 
//			 * if(next instanceof L_Out ) { ((L_Out)
//			 * next).setL_out_gurobi(this.model.addVar(0.0, 1.0, 0.0,GRB.BINARY,"L_OUT"));
//			 * 
//			 * }
//			 */
//			/*
//			 * if(next instanceof Order) { ((Order)
//			 * next).setOrder_gurobi(this.model.addVar(0.0, 1.0, 0.0,GRB.BINARY,"Order")); }
//			 */
//
//		}
//		System.out.println("Number of created DataIn/DataOut: " + counterData);
//	}
//
//	// public void createConstrAppMapping(EObject emfModel, int r) throws
//	// GRBException {
//	public List<Data_In> createConstrAppMapping(EEDImpl emfModel, int r) throws GRBException {
//		// todo: parse emf model
//		// Changed by Andre
//		// RoutingImpl test1 = (RoutingImpl) emfModel.eContainer();
//		EEDImpl test1 = (EEDImpl) emfModel;
//		// Changed by Andre
//		// TreeIterator<EObject> variables = emfModel.eContainer().eAllContents();
//		TreeIterator<EObject> variables = emfModel.eAllContents();
//		ArrayList<Mapping> listOfMappingApp1 = new ArrayList<Mapping>();
//		ArrayList<L_In> listOfInLinks1 = new ArrayList<L_In>();
//		ArrayList<L_Out> listOfOutLinks1 = new ArrayList<L_Out>();
//
//		ArrayList<Data_In> listOfAllDataIn = new ArrayList<Data_In>();
//		ArrayList<Data_Out> listOfAllDataOut = new ArrayList<Data_Out>();
//
//		while (variables.hasNext()) {
//
//			EObject next = variables.next();
//			ArrayList<Mapping> listOfMappingApp = new ArrayList<Mapping>();
//			ArrayList<L_In> listOfInLinks = new ArrayList<L_In>();
//			ArrayList<L_Out> listOfOutLinks = new ArrayList<L_Out>();
//
////------------------------------------------------------------------------------------------------------------	   		
//			if (next instanceof Application) {
//				ArrayList<Data_Out> listOfActivatedDOutForeachApp = new ArrayList<Data_Out>();
//				ArrayList<Data_In> listOfActivatedDInForeachApp = new ArrayList<Data_In>();
//				ArrayList<Order> listOfAllOrder = new ArrayList<Order>();
//
//				for (Node n : test1.getNodes()) {
//					if (n.getSource() == 1 || n.getDestination() == 1) {
//						n.setSource(0);
//						n.setDestination(0);
//					}
//
//					ArrayList<Data_In> listOfNodeDataIn = new ArrayList<Data_In>();
//					ArrayList<Data_Out> listOfNodeDataOut = new ArrayList<Data_Out>();
//					ArrayList<Data_Out> listOfDataOut = new ArrayList<Data_Out>();
//					ArrayList<Order> listOfOrder = new ArrayList<Order>();
//
//					ArrayList<Data_In> listOfDataIn = new ArrayList<Data_In>();
//
//					for (int i = 0; i < n.getIncludes_links().size(); i++) {
//
//						listOfNodeDataIn.addAll(n.getIncludes_links().get(i).getBelongs_data_in());
//						listOfNodeDataOut.addAll(n.getIncludes_links().get(i).getBelongsto_data_out());
//					}
//
//					for (int i = 0; i < listOfNodeDataIn.size(); i++) {
//						if (listOfNodeDataIn.get(i).getDatain_has().equals(((Application) next).getApp_sends())) {
//							listOfDataIn.add(listOfNodeDataIn.get(i));
//
//						}
//
//					}
//					listOfAllDataIn.addAll(listOfDataIn);
//					listOfActivatedDInForeachApp.addAll(listOfDataIn);
//
//					for (int i = 0; i < listOfNodeDataOut.size(); i++) {
//						if (listOfNodeDataOut.get(i).getDataout_has().equals(((Application) next).getApp_sends())) {
//							listOfDataOut.add(listOfNodeDataOut.get(i));
//
//						}
//
//					}
//					listOfAllDataOut.addAll(listOfDataOut);
//					listOfActivatedDOutForeachApp.addAll(listOfDataOut);
//
//					// -----------------create order list to be used for Fedor's method to break the
//					// loops
//					/*
//					 * for(int i=0;i<n.getIncludes_order().size();i++) {
//					 * if(n.getIncludes_order().get(i).getHas_datain().getDatain_has()
//					 * .equals(((Application) next).getApp_sends())) {
//					 * listOfOrder.add(n.getIncludes_order().get(i)); } }
//					 * listOfAllOrder.addAll(listOfOrder);
//					 */
//
//					if (((Application) next).getSentby().equals(n)) {
//						n.setSource(1);
//					}
//
//					if (((Application) next).getReceivedby().equals(n)) {
//						n.setDestination(1);
//					}
//
//					// -------------------------non safety-critical
//					// applications--------------------------
//					if (((Application) next).getSafetycritical() == 0) {
//						// for source-> ms - md - sigma(out links)<= 0
//						GRBLinExpr expr01 = new GRBLinExpr();
//						for (int i = 0; i < listOfDataOut.size(); i++) {
//							expr01.addTerm(-1, listOfDataOut.get(i).getData_out_gurobi());
//						}
//
//						this.model.addConstr(expr01, GRB.LESS_EQUAL, -1 * (n.getSource()) + n.getDestination(),
//								"1 Activated Out-Data");
//
//						// for source ->ms + sigma(in links)<=1
//						GRBLinExpr expr02 = new GRBLinExpr();
//						for (int i = 0; i < listOfDataIn.size(); i++) {
//							expr02.addTerm(1, listOfDataIn.get(i).getData_in_gurobi());
//						}
//						this.model.addConstr(expr02, GRB.LESS_EQUAL, 1 - n.getSource(), "No Activated In-Data");
//
//						// for destination-> md - ms - sigma(in links)<= 0
//						GRBLinExpr expr03 = new GRBLinExpr();
//						for (int i = 0; i < listOfDataIn.size(); i++) {
//							expr03.addTerm(-1, listOfDataIn.get(i).getData_in_gurobi());
//						}
//
//						this.model.addConstr(expr03, GRB.LESS_EQUAL, n.getSource() - n.getDestination(),
//								"1 Activated In-Data");
//
//						// for destination-> md + sigma(out links)<= 1
//						GRBLinExpr expr04 = new GRBLinExpr();
//						for (int i = 0; i < listOfDataOut.size(); i++) {
//							expr04.addTerm(1, listOfDataOut.get(i).getData_out_gurobi());
//						}
//
//						this.model.addConstr(expr04, GRB.LESS_EQUAL, 1 - n.getDestination(), "No Activated Out-Data");
//
//						// ----------------sigma datain=sigma datdaout-----------------------
//						GRBLinExpr expr05 = new GRBLinExpr();
//						for (int i = 0; i < listOfDataOut.size(); i++) {
//							expr05.addTerm(-1, listOfDataOut.get(i).getData_out_gurobi());
//						}
//
//						for (int i = 0; i < listOfDataIn.size(); i++) {
//							expr05.addTerm(1, listOfDataIn.get(i).getData_in_gurobi());
//						}
//						this.model.addConstr(expr05, GRB.EQUAL, n.getDestination() - n.getSource(),
//								"1 Activated Out-Data & 1 Acitvated In_Data ");
//
//					}
//
//					for (Data_In din : listOfDataIn) {
//						try {
//							GRBLinExpr expr07 = new GRBLinExpr();
//
//							GRBVar dingrb = din.getData_in_gurobi();
//
//							GRBVar doutgrb = din.getHas_d_out().getData_out_gurobi();
//
//							expr07.addTerm(-1, dingrb);
//							expr07.addTerm(1, doutgrb);
//							this.model.addConstr(expr07, GRB.EQUAL, 0, "connect d_out1_n1 to d_in1_n2");
//						} catch (Exception e) {
//							// Block of code to handle errors
//
//						}
//					}
//
//					// ------------------safety-critical
//					// applications-----------------------------------
//					// -----------redundancy constraints----------
//					if (((Application) next).getSafetycritical() == 1) {
//						// ms - md - sigma(out links)<= -1
//						if (n.getSource() == 1 && n.getDestination() == 0) {
//							GRBLinExpr expr1 = new GRBLinExpr();
//							for (int i = 0; i < listOfDataOut.size(); i++) {
//								expr1.addTerm(-1, listOfDataOut.get(i).getData_out_gurobi());
//							}
//
//							/*
//							 * this.model.addConstr(expr1, GRB.LESS_EQUAL,-1*(n.getSource()) +
//							 * n.getDestination()-1, "1 Activated Out-Data");
//							 */ // to generate more than two high-redundant routes
//
//							this.model.addConstr(expr1, GRB.EQUAL, -1 * (n.getSource()) + n.getDestination() - r,
//									"1 Activated Out-Data");// to generate exact r high-redundant routes
//						}
//						// ms+sigma(in links)<=1 ----> redundancy constraint
//						if (n.getSource() == 1 && n.getDestination() == 0) {
//							GRBLinExpr expr2 = new GRBLinExpr();// Constraint for redundancy
//							for (int i = 0; i < listOfDataIn.size(); i++) {
//								expr2.addTerm(1, listOfDataIn.get(i).getData_in_gurobi());
//							}
//							this.model.addConstr(expr2, GRB.LESS_EQUAL, 1 - n.getSource(), "No Activated In-Data");
//
//						}
//
//						// ---------------------redundancy constraint for preventing the
//						// cycle-->datain-nodei + dataout-nodei<=1---------------------
//
//						for (Data_In din : listOfDataIn) {
//							for (Data_Out dout : listOfDataOut) {
//								try {
//
//									GRBLinExpr expr = new GRBLinExpr();
//									GRBVar dincgrb = din.getData_in_gurobi();
//									GRBVar doutcgrb = dout.getData_out_gurobi();
//									if (din.getData_in_has_link().getLf().equals(dout.getData_out_has_link().getLf())
//											&& din.getData_in_has_link().getLs()
//													.equals(dout.getData_out_has_link().getLs())) {
//
//										expr.addTerm(1, dincgrb);
//										expr.addTerm(1, doutcgrb);
//										this.model.addConstr(expr, GRB.LESS_EQUAL, 1, "cycle avoidance");
//
//									}
//
//								} catch (Exception e) {
//									// Block of code to handle errors
//
//								}
//							}
//						}
//
//						// --------------redundancy-----------------------
//						// for destination-> md - ms - sigma(in links)<= 0
//						if (n.getDestination() == 1 && n.getSource() == 0) {
//							GRBLinExpr expr3 = new GRBLinExpr();
//							for (int i = 0; i < listOfDataIn.size(); i++) {
//								expr3.addTerm(-1, listOfDataIn.get(i).getData_in_gurobi());
//							}
//
//							/*
//							 * this.model.addConstr(expr3, GRB.LESS_EQUAL,n.getSource()-
//							 * n.getDestination()-1 , "1 Activated In-Data");
//							 */ // to generate more than two high-redundant routes
//
//							this.model.addConstr(expr3, GRB.EQUAL, n.getSource() - n.getDestination() - r,
//									"1 Activated In-Data");// to generate exact r high-redundant routes
//						}
//						// -----------------------------------------
//
//						// md+sigma(out links)<=1-----------------redundancy-----------------
//
//						if (n.getDestination() == 1 && n.getSource() == 0) {
//							GRBLinExpr expr4 = new GRBLinExpr();
//							for (int i = 0; i < listOfDataOut.size(); i++) {
//								expr4.addTerm(1, listOfDataOut.get(i).getData_out_gurobi());
//							}
//
//							this.model.addConstr(expr4, GRB.LESS_EQUAL, 1 - n.getDestination(),
//									"No Activated Out-Data");
//						}
//
//						if (n.getSource() == 0 && n.getDestination() == 0) {// id added for redundancy constraint
//							// all other nodes-> have either no edges or 1 in-edge and 1 out-edge
//
//							GRBLinExpr expr5 = new GRBLinExpr();
//							for (int i = 0; i < listOfDataOut.size(); i++) {
//								expr5.addTerm(1, listOfDataOut.get(i).getData_out_gurobi());
//							}
//
//							/*
//							 * for(int i=0; i< listOfDataIn.size();i++) { expr5.addTerm(1,
//							 * listOfDataIn.get(i).getData_in_gurobi() ); }
//							 */
//							GRBLinExpr expr15 = new GRBLinExpr();
//							for (int i = 0; i < listOfDataIn.size(); i++) {
//								expr15.addTerm(1, listOfDataIn.get(i).getData_in_gurobi());
//							}
//
//							this.model.addConstr(expr5, GRB.LESS_EQUAL, 1 + n.getDestination() - n.getSource(),
//									"1 Activated Out-Data<=1 ");
//
//							this.model.addConstr(expr15, GRB.LESS_EQUAL, 1 + n.getDestination() - n.getSource(),
//									" Acitvated In_Data <=1");
//
//							GRBLinExpr expr25 = new GRBLinExpr();
//							for (int i = 0; i < listOfDataOut.size(); i++) {
//								expr25.addTerm(1, listOfDataOut.get(i).getData_out_gurobi());
//							}
//
//							for (int i = 0; i < listOfDataIn.size(); i++) {
//								expr25.addTerm(-1, listOfDataIn.get(i).getData_in_gurobi());
//							}
//
//							this.model.addConstr(expr25, GRB.EQUAL, n.getDestination() - n.getSource(),
//									"1 Activated Out-Data & 1 Acitvated In_Data");
//
//							/*
//							 * this.model.addConstr(expr5, GRB.GREATER_EQUAL, n.getDestination() -
//							 * n.getSource(), "1 Activated Out-Data & 1 Acitvated In_Data ");
//							 */
//
//						}
//
//						for (Data_In din : listOfDataIn) {
//							try {
//								GRBLinExpr expr = new GRBLinExpr();
//								expr = new GRBLinExpr();
//								GRBVar dingrb = din.getData_in_gurobi();
//
//								GRBVar doutgrb = din.getHas_d_out().getData_out_gurobi();
//
//								expr.addTerm(-1, dingrb);
//								expr.addTerm(1, doutgrb);
//								this.model.addConstr(expr, GRB.EQUAL, 0, "connect d_out1_n1 to d_in1_n2");
//							} catch (Exception e) {
//								// Block of code to handle errors
//
//							}
//						}
//
//					}
//					// ----------------------------------------------
//
//					// -------------------------------------
//
//					// ---------------------------------------------cycle
//					// avoidance------------------------
//					/*
//					 * for(Order o:listOfOrder) {
//					 * 
//					 * GRBVar ogrb=o.getOrder_gurobi(); GRBVar
//					 * odingrb=o.getHas_datain().getData_in_gurobi(); GRBVar
//					 * odoutgrb=o.getHas_dataout().getData_out_gurobi();
//					 * 
//					 * GRBLinExpr expr = new GRBLinExpr(); expr.addTerm(1, ogrb);
//					 * expr.addTerm(-1,odingrb); this.model.addConstr(expr, GRB.LESS_EQUAL, 0,
//					 * "order relation between used datain");
//					 * 
//					 * GRBLinExpr expr01 = new GRBLinExpr(); expr01.addTerm(1, ogrb);
//					 * expr01.addTerm(-1,odoutgrb); this.model.addConstr(expr01, GRB.LESS_EQUAL, 0,
//					 * "order relation between used dataout");
//					 * 
//					 * GRBLinExpr expr02 = new GRBLinExpr(); expr02.addTerm(-1, ogrb);
//					 * expr02.addTerm(1,odoutgrb); expr02.addTerm(1, odingrb);
//					 * this.model.addConstr(expr02, GRB.LESS_EQUAL, 1,
//					 * "a datain of each resource precedes its dataout ");
//					 * 
//					 * }
//					 */
//
//					/*
//					 * for(Data_In din:listOfDataIn) { for(Data_Out dout:listOfDataOut) { try {
//					 * GRBLinExpr expr = new GRBLinExpr(); GRBVar dingrb=din.getData_in_gurobi();
//					 * GRBVar orderingrb=din.getData_in_has_order().getOrder_gurobi();
//					 * 
//					 * 
//					 * 
//					 * if(din.getData_in_has_link().getLf().equals(dout.getData_out_has_link().getLf
//					 * ())&&
//					 * din.getData_in_has_link().getLs().equals(dout.getData_out_has_link().getLs())
//					 * ) {
//					 * 
//					 * expr.addTerm(1, orderingrb); expr.addTerm(-1,dingrb);
//					 * this.model.addConstr(expr, GRB.LESS_EQUAL, 0,
//					 * "order relation between used datain");
//					 * 
//					 * GRBLinExpr expr0 = new GRBLinExpr(); GRBVar
//					 * doutgrb=dout.getData_out_gurobi(); expr0.addTerm(1, orderingrb);
//					 * expr0.addTerm(-1,doutgrb); this.model.addConstr(expr0, GRB.LESS_EQUAL, 0,
//					 * "order relation between used dataout");
//					 * 
//					 * GRBLinExpr expr01 = new GRBLinExpr(); expr01.addTerm(-1, orderingrb);
//					 * expr01.addTerm(1,doutgrb); expr01.addTerm(1, dingrb);
//					 * this.model.addConstr(expr01, GRB.LESS_EQUAL, 1,
//					 * "order relation between used dataout");
//					 * 
//					 * 
//					 * 
//					 * } } catch(Exception e){
//					 * 
//					 * 
//					 * }
//					 * 
//					 * }
//					 * 
//					 * }
//					 */
//
//					// -----------------------------------------------------------------------------------------------------
//
//					/*
//					 * //for(int i listOfDataIn)
//					 * 
//					 * GRBLinExpr expr20 = new GRBLinExpr(); for(int i=0; i<1;i++) {
//					 * if(listOfDataIn.get(i).getData_in_has_link().getLs().equals(listOfDataOut.get
//					 * (i).getData_out_has_link().getLs())&&
//					 * listOfDataIn.get(i).getData_in_has_link().getLf().equals(listOfDataOut.get(i)
//					 * .getData_out_has_link().getLf()) ){ //Constraint for redundancy
//					 * expr20.addTerm(1, listOfDataIn.get(i).getData_in_gurobi() );
//					 * expr20.addTerm(1, listOfDataOut.get(i).getData_out_gurobi());
//					 * 
//					 * }
//					 * 
//					 * } this.model.addConstr(expr20, GRB.LESS_EQUAL,1 , "10 Activated In-Data");
//					 * 
//					 * GRBLinExpr expr21 = new GRBLinExpr(); for(int i=1; i<2;i++) {
//					 * if(listOfDataIn.get(i).getData_in_has_link().getLs().equals(listOfDataOut.get
//					 * (i).getData_out_has_link().getLs())&&
//					 * listOfDataIn.get(i).getData_in_has_link().getLf().equals(listOfDataOut.get(i)
//					 * .getData_out_has_link().getLf()) ){ //Constraint for redundancy
//					 * expr21.addTerm(1, listOfDataIn.get(i).getData_in_gurobi() );
//					 * expr21.addTerm(1, listOfDataOut.get(i).getData_out_gurobi());
//					 * 
//					 * }
//					 * 
//					 * } this.model.addConstr(expr21, GRB.LESS_EQUAL,1 , "14 Activated In-Data");
//					 * 
//					 * GRBLinExpr expr22 = new GRBLinExpr(); for(int i=2; i<3;i++) {
//					 * if(listOfDataIn.get(i).getData_in_has_link().getLs().equals(listOfDataOut.get
//					 * (i).getData_out_has_link().getLs())&&
//					 * listOfDataIn.get(i).getData_in_has_link().getLf().equals(listOfDataOut.get(i)
//					 * .getData_out_has_link().getLf()) ){ //Constraint for redundancy
//					 * expr22.addTerm(1, listOfDataIn.get(i).getData_in_gurobi() );
//					 * expr22.addTerm(1, listOfDataOut.get(i).getData_out_gurobi());
//					 * 
//					 * }
//					 * 
//					 * } this.model.addConstr(expr22, GRB.LESS_EQUAL,1 , "15 Activated In-Data");
//					 * 
//					 * GRBLinExpr expr23 = new GRBLinExpr(); for(int i=3; i<4;i++) {
//					 * if(listOfDataIn.get(i).getData_in_has_link().getLs().equals(listOfDataOut.get
//					 * (i).getData_out_has_link().getLs())&&
//					 * listOfDataIn.get(i).getData_in_has_link().getLf().equals(listOfDataOut.get(i)
//					 * .getData_out_has_link().getLf()) ){ //Constraint for redundancy
//					 * expr23.addTerm(1, listOfDataIn.get(i).getData_in_gurobi() );
//					 * expr23.addTerm(1, listOfDataOut.get(i).getData_out_gurobi());
//					 * 
//					 * }
//					 * 
//					 * } this.model.addConstr(expr23, GRB.LESS_EQUAL,1 , "16 Activated In-Data");
//					 * 
//					 * 
//					 * GRBLinExpr expr24 = new GRBLinExpr(); for(int i=4; i<5;i++) {
//					 * if(listOfDataIn.get(i).getData_in_has_link().getLs().equals(listOfDataOut.get
//					 * (i).getData_out_has_link().getLs())&&
//					 * listOfDataIn.get(i).getData_in_has_link().getLf().equals(listOfDataOut.get(i)
//					 * .getData_out_has_link().getLf()) ){ //Constraint for redundancy
//					 * expr24.addTerm(1, listOfDataIn.get(i).getData_in_gurobi() );
//					 * expr24.addTerm(1, listOfDataOut.get(i).getData_out_gurobi());
//					 * 
//					 * }
//					 * 
//					 * } this.model.addConstr(expr24, GRB.LESS_EQUAL,1 , "17 Activated In-Data");
//					 */
//
//					// ------------------------------------------------------------------------------------
//
//					// ---------------------------Optimize the link
//					// costs--------------------------------------------------
//					/*
//					 * GRBLinExpr expr7 = new GRBLinExpr(); for(int
//					 * i=0;i<listOfAllDataOut.size();i++) {
//					 * expr7.addTerm(listOfAllDataOut.get(i).getData_out_has_link().getCost(),
//					 * listOfAllDataOut.get(i).getData_out_gurobi()); }
//					 * 
//					 * this.model.setObjective(expr7, GRB.MINIMIZE);
//					 */
//
//					// ---------------------------------------------------------------------------
//
//				}
//
//				// ----------------------------------create disjoint route :
//				// concept--------------------------------------
//				/*
//				 * for(Link link:test1.getLink()) { ArrayList<Data_Out> listOfLinkDataOut = new
//				 * ArrayList<Data_Out>(); ArrayList<Data_In> listOfLinkDataIn = new
//				 * ArrayList<Data_In>();
//				 * 
//				 * 
//				 * listOfLinkDataOut.addAll(link.getBelongsto_data_out());
//				 * listOfLinkDataIn.addAll(link.getBelongs_data_in()); GRBLinExpr expr40 = new
//				 * GRBLinExpr(); for(int i=0; i< listOfLinkDataOut.size();i++) {
//				 * expr40.addTerm(1, listOfLinkDataOut.get(i).getData_out_gurobi() ); }
//				 * this.model.addConstr(expr40, GRB.LESS_EQUAL, 1 , "One Dataout");
//				 * 
//				 * GRBLinExpr expr41 = new GRBLinExpr(); for(int i=0; i<
//				 * listOfLinkDataIn.size();i++) { expr41.addTerm(1,
//				 * listOfLinkDataIn.get(i).getData_in_gurobi() ); } this.model.addConstr(expr41,
//				 * GRB.LESS_EQUAL, 1 , "One Datain");
//				 * 
//				 * 
//				 * }
//				 */
//
//				// --------------------------------------------------------------------------------
//
//				// ------------------------order implementation regarding Fedor's
//				// slide------------------------------------
//				/*
//				 * for(Order oi:listOfAllOrder) { for(Order oj:listOfAllOrder) {
//				 * if(oi.getHas_dataout().equals(oj.getHas_dataout())) { for(Order
//				 * ot:listOfAllOrder) { if(oi.getHas_datain().equals(ot.getHas_datain()) &&
//				 * oj.getHas_dataout().equals(ot.getHas_dataout()) ) {
//				 * 
//				 * GRBLinExpr expr = new GRBLinExpr(); expr = new GRBLinExpr(); GRBVar oigrb=
//				 * oi.getOrder_gurobi(); GRBVar ojgrb= oj.getOrder_gurobi(); GRBVar otgrb=
//				 * ot.getOrder_gurobi(); expr.addTerm(1,oigrb); expr.addTerm(1, ojgrb);
//				 * expr.addTerm(-1, otgrb);
//				 * 
//				 * this.model.addConstr(expr, GRB.LESS_EQUAL,1 , "Order Transitive");
//				 * 
//				 * 
//				 * } } } } }
//				 */
//
//				// --------------------------------------------------cycle
//				// break----------------------------------------------
//
//				if (((Application) next).getSafetycritical() == 1) {
//
//					/*
//					 * for(Data_Out dout:listOfActivatedDOutForeachApp) { for(Data_Out
//					 * dout1:listOfActivatedDOutForeachApp) { for(Data_Out
//					 * dout2:listOfActivatedDOutForeachApp) {
//					 * if(dout.getData_out_has_link().getLf().equals(dout1.getData_out_has_link().
//					 * getLs()) &&
//					 * dout1.getData_out_has_link().getLf().equals(dout2.getData_out_has_link().
//					 * getLs())&&
//					 * dout2.getData_out_has_link().getLf().equals(dout.getData_out_has_link().getLs
//					 * ())) {
//					 * 
//					 * GRBLinExpr expr = new GRBLinExpr(); expr = new GRBLinExpr(); GRBVar doutgrb=
//					 * dout.getData_out_gurobi(); GRBVar dout1grb= dout1.getData_out_gurobi();
//					 * GRBVar dout2grb= dout2.getData_out_gurobi();
//					 * 
//					 * expr.addTerm(1, doutgrb ); expr.addTerm(1, dout1grb ); expr.addTerm(1,
//					 * dout2grb ); this.model.addConstr(expr, GRB.LESS_EQUAL,2 , "3cycle break");
//					 * 
//					 * } } } } long counter=0; for(Data_Out dout:listOfActivatedDOutForeachApp) {
//					 * for(Data_Out dout1:listOfActivatedDOutForeachApp) { for(Data_Out
//					 * dout2:listOfActivatedDOutForeachApp) { for(Data_Out
//					 * dout3:listOfActivatedDOutForeachApp) { counter++;
//					 * if(dout.getData_out_has_link().getLf().equals(dout1.getData_out_has_link().
//					 * getLs()) &&
//					 * dout1.getData_out_has_link().getLf().equals(dout2.getData_out_has_link().
//					 * getLs())&&
//					 * dout2.getData_out_has_link().getLf().equals(dout3.getData_out_has_link().
//					 * getLs())&&
//					 * dout3.getData_out_has_link().getLf().equals(dout.getData_out_has_link().getLs
//					 * ())) {
//					 * 
//					 * GRBLinExpr expr = new GRBLinExpr(); expr = new GRBLinExpr(); GRBVar doutgrb=
//					 * dout.getData_out_gurobi(); GRBVar dout1grb= dout1.getData_out_gurobi();
//					 * GRBVar dout2grb= dout2.getData_out_gurobi(); GRBVar dout3grb=
//					 * dout3.getData_out_gurobi();
//					 * 
//					 * expr.addTerm(1, doutgrb ); expr.addTerm(1, dout1grb ); expr.addTerm(1,
//					 * dout2grb ); expr.addTerm(1, dout3grb ); this.model.addConstr(expr,
//					 * GRB.LESS_EQUAL,3 , "4cycle break");
//					 * 
//					 * } } } } } System.out.println("Number="+counter);
//					 */
//				}
//
//				// --------------------------------------------------------------------------------------------
//
//				// -------------------------set optimization objective for minimizing the number
//				// of links as constraint-----------------
//				GRBLinExpr expr6 = new GRBLinExpr();
//				for (int i = 0; i < listOfActivatedDOutForeachApp.size(); i++) {
//					expr6.addTerm(1, listOfActivatedDOutForeachApp.get(i).getData_out_gurobi());
//				}
//				this.model.setObjective(expr6, GRB.MINIMIZE);
//				// -------------------------------------
//				GRBLinExpr expr06 = new GRBLinExpr();
//				for (int i = 0; i < listOfActivatedDInForeachApp.size(); i++) {
//					expr06.addTerm(1, listOfActivatedDInForeachApp.get(i).getData_in_gurobi());
//				}
//				this.model.setObjective(expr06, GRB.MINIMIZE);
//
//				// link cost minimization
//				/*
//				 * GRBLinExpr expr7 = new GRBLinExpr(); for(int
//				 * i=0;i<listOfAllDataOut.size();i++) {
//				 * expr7.addTerm(listOfAllDataOut.get(i).getData_out_has_link().getCost(),
//				 * listOfAllDataOut.get(i).getData_out_gurobi()); }
//				 * 
//				 * this.model.setObjective(expr7, GRB.MAXIMIZE);
//				 */
//
//			}
//
////-------------------------------------------------------------------------------------------------------------
//
//			/*
//			 * //listOfMappingApp = (ArrayList<Mapping>) ((Application)
//			 * next).getApp_has_m(); listOfMappingApp.addAll(((Application)
//			 * next).getApp_has_m()); listOfMappingApp1.addAll(((Application)
//			 * next).getApp_has_m());
//			 * 
//			 * 
//			 * //System.out.println(((Application)
//			 * next).getApp_has_m().get(1).getM_gurobi()); //((Application)
//			 * next).getApp_has_m().get(1).getCost(); GRBLinExpr expr = new GRBLinExpr();
//			 * for(int i=0; i< listOfMappingApp.size();i++) { expr.addTerm(1,
//			 * listOfMappingApp.get(i).getM_gurobi() ); } //this.model.setObjective(expr,
//			 * GRB.MAXIMIZE); this.model.addConstr(expr, GRB.EQUAL,1, "AppAssignment");
//			 */
//			// --------------------------------------------------------------------------------------------------------------------
//
//			// ------------------------------------------------------without
//			// Application----------------------------------
//			/*
//			 * if(next instanceof Node) {
//			 * 
//			 * listOfOutLinks.addAll(((Node) next).getL_out());
//			 * listOfOutLinks1.addAll(((Node) next).getL_out());
//			 * listOfInLinks.addAll(((Node) next).getL_in()); listOfInLinks1.addAll(((Node)
//			 * next).getL_in());
//			 */
//
//			// Source=((Node) next).getSource();
//			// Destination=((Node) next).getDestination();
//			/*
//			 * GRBVar v = listOfOutLinks.get(0).getL_out_gurobi(); v =
//			 * listOfOutLinks.get(0).getL_in().getL_in_gurobi();
//			 * 
//			 * System.out.println(listOfOutLinks.get(0).getL_out_gurobi());
//			 * System.out.println(v);
//			 * System.out.println(listOfInLinks.get(0).getL_in_gurobi());
//			 */
//			/*
//			 * if(((Node) next).getName().equals("ecu1")) { ((Node) next).setSource(1);
//			 * //GRBVar v = ((Node) next).getSource_gurobi(); //this.model.addConstr(v,
//			 * GRB.EQUAL,1, "AppAssignment"); } else { ((Node) next).setSource(0); }
//			 * if(((Node) next).getName().equals("ecu4")) { ((Node) next).setDestination(1);
//			 * } else { ((Node) next).setDestination(0); }
//			 */
//
//			// ---------------------------------routing
//			// constraints-------------------------------------------
//
//			/*
//			 * System.out.println(((Node) next).getSource()); System.out.println(((Node)
//			 * next).getDestination());
//			 * 
//			 * //for source-> ms - md - sigma(out links)<= 0
//			 * 
//			 * GRBLinExpr expr2 = new GRBLinExpr(); for(int i=0; i<
//			 * listOfOutLinks.size();i++) { expr2.addTerm(-1,
//			 * listOfOutLinks.get(i).getL_out_gurobi() ); } //expr2.addTerm(1, ((Node)
//			 * next).getSource_gurobi());expr2.addTerm(-1, ((Node)
//			 * next).getDestination_gurobi()); this.model.addConstr(expr2,
//			 * GRB.LESS_EQUAL,-1*((Node) next).getSource() + ((Node) next).getDestination(),
//			 * "1 Activated Out-Link"); //listOfOutLinks.get(0).get
//			 * 
//			 * 
//			 * //for ->ms + sigma(in links)<=1
//			 * 
//			 * GRBLinExpr expr3 = new GRBLinExpr(); for(int i=0; i<
//			 * listOfInLinks.size();i++) { expr3.addTerm(1,
//			 * listOfInLinks.get(i).getL_in_gurobi() ); }
//			 * 
//			 * //expr3.addTerm(1, ((Node) next).getSource_gurobi());
//			 * this.model.addConstr(expr3, GRB.LESS_EQUAL, 1 - ((Node) next).getSource(),
//			 * "No Activated In-Link");
//			 * 
//			 * 
//			 * //for destination-> md - ms - sigma(in links)<= 0
//			 * 
//			 * GRBLinExpr expr4 = new GRBLinExpr(); for(int i=0; i<
//			 * listOfInLinks.size();i++) { expr4.addTerm(-1,
//			 * listOfInLinks.get(i).getL_in_gurobi() ); } //expr4.addTerm(1, ((Node)
//			 * next).getDestination_gurobi());expr4.addTerm(-1, ((Node)
//			 * next).getSource_gurobi()); this.model.addConstr(expr4, GRB.LESS_EQUAL,((Node)
//			 * next).getSource()-((Node) next).getDestination() , "1 Activated In-Link");
//			 * 
//			 * 
//			 * //for destination-> md + sigma(out links)<= 1
//			 * 
//			 * GRBLinExpr expr5 = new GRBLinExpr(); for(int i=0; i<
//			 * listOfOutLinks.size();i++) { expr5.addTerm(1,
//			 * listOfOutLinks.get(i).getL_out_gurobi() ); } //expr4.addTerm(1, ((Node)
//			 * next).getDestination_gurobi());expr4.addTerm(-1, ((Node)
//			 * next).getSource_gurobi()); //((Node) next).getSource()-((Node)
//			 * next).getDestination() this.model.addConstr(expr5, GRB.LESS_EQUAL, 1-((Node)
//			 * next).getDestination() , "No Activated Out-Link");
//			 * 
//			 * 
//			 * //all other nodes-> have either no edges or 1 in-edge and 1 out-edge
//			 * 
//			 * GRBLinExpr expr6 = new GRBLinExpr(); for(int i=0; i<
//			 * listOfOutLinks.size();i++) { expr6.addTerm(-1,
//			 * listOfOutLinks.get(i).getL_out_gurobi() ); }
//			 * 
//			 * for(int i=0; i< listOfInLinks.size();i++) { expr6.addTerm(1,
//			 * listOfInLinks.get(i).getL_in_gurobi() ); }
//			 * 
//			 * 
//			 * this.model.addConstr(expr6, GRB.EQUAL, ((Node) next).getDestination() -
//			 * ((Node) next).getSource(),
//			 * "1 Activated Out-Link & 1 Acitvated In_Link or No Edges");
//			 * 
//			 * 
//			 * 
//			 * 
//			 * for(L_In lin : listOfInLinks ) { try { GRBLinExpr expr = new GRBLinExpr();
//			 * expr = new GRBLinExpr(); GRBVar lingrb= lin.getL_in_gurobi();
//			 * 
//			 * GRBVar loutgrb= lin.getL_out().getL_out_gurobi();
//			 * 
//			 * 
//			 * expr.addTerm(-1, lingrb ); expr.addTerm(1, loutgrb );
//			 * this.model.addConstr(expr, GRB.EQUAL,0 , "connect L_out1_n1 to L_in1_n2"); }
//			 * catch(Exception e) { // Block of code to handle errors
//			 * 
//			 * } }
//			 */
//			// -------------------------------define the constraints for mapping
//			// cost-----------------------------------------------------------------
//			/*
//			 * GRBLinExpr expr1 = new GRBLinExpr(); expr1 = new GRBLinExpr(); for(int i=0;
//			 * i< listOfMappingApp1.size();i++) {
//			 */
//			/*
//			 * if(listOfMappingApp1.get(i).getName().equals("m1") ||
//			 * listOfMappingApp1.get(i).getName().equals("m2")
//			 * ||listOfMappingApp1.get(i).getName().equals("m3") ||
//			 * listOfMappingApp1.get(i).getName().equals("m4") ) {
//			 * expr1.addTerm(-1*listOfMappingApp1.get(i).getCost(),
//			 * listOfMappingApp1.get(i).getM_gurobi() );
//			 * 
//			 * } else { expr1.addTerm(listOfMappingApp1.get(i).getCost(),
//			 * listOfMappingApp1.get(i).getM_gurobi() ); }
//			 */
//			// main term to optimize the cost
//			// expr1.addTerm(listOfMappingApp1.get(i).getCost(),
//			// listOfMappingApp1.get(i).getM_gurobi() );
//
//			// System.out.println(((Application) next).getApp_has_m().get(i).getCost());
//			// }
//			// this.model.setObjective(expr1, GRB.MINIMIZE);
//
//			// this.model.optimize();
//
//			// mapping + cost of mapping
//			/*
//			 * for(int i=0; i<listOfMappingApp1.size();i++) {
//			 * System.out.println(listOfMappingApp1.get(i).getName()+ " "
//			 * +listOfMappingApp1.get(i).getM_gurobi().get(GRB.DoubleAttr.X)+" "+
//			 * listOfMappingApp1.get(i).getCost()); }
//			 */
//
//			// }
//
//			// -----------------------uncomment the accolade in case of using the routing
//			// without application---------------
//		}
//		/*
//		 * GRBLinExpr expr20 = new GRBLinExpr(); for(Data_Out dout: test1.getData_out())
//		 * { expr20.addTerm(1,dout.getData_out_gurobi()); } for(Data_In din:
//		 * test1.getData_in()) { expr20.addTerm(1,din.getData_in_gurobi());
//		 * 
//		 * } this.model.setObjective(expr20, GRB.MINIMIZE);
//		 */
//
//		this.model.optimize();
////			 this.model.computeIIS();
////		     this.model.write("C:\\Users\\hadia\\eclipse-workspace\\hadi_design\\model.ilp");
//
//		/*
//		 * ArrayList<Data_In> listOfActivatedDataIn = new ArrayList<Data_In>();
//		 * ArrayList<Node> listOfActivatedNodeIn = new ArrayList<Node>();
//		 * for(Application app:test1.getApplication()) { for(int
//		 * i=0;i<listOfAllDataIn.size();i++) {
//		 * if(listOfAllDataIn.get(i).getDatain_has(). equals(app.getApp_sends()) &&
//		 * listOfAllDataIn.get(i).getData_in_gurobi().get(GRB.DoubleAttr.X)==1) {
//		 * listOfActivatedDataIn.add(listOfAllDataIn.get(i));
//		 * 
//		 * } } listOfActivatedNodeIn.add(app.getSentby());
//		 * 
//		 * }getIncludes_links
//		 */
//
//		// --------------------------------------main print for din and dout---------
//
//		for (int i = 0; i < listOfAllDataIn.size(); i++) {
//			if (listOfAllDataIn.get(i).getData_in_gurobi().get(GRB.DoubleAttr.X) == 1) {
//				System.out.println(listOfAllDataIn.get(i).getName() + "_" + "="
//						+ listOfAllDataIn.get(i).getData_in_gurobi().get(GRB.DoubleAttr.X) + " ");
//			}
//
//		}
//		for (int i = 0; i < listOfAllDataOut.size(); i++) {
//			if (listOfAllDataOut.get(i).getData_out_gurobi().get(GRB.DoubleAttr.X) == 1) {
//				System.out.println(listOfAllDataOut.get(i).getName() + "_" + "="
//						+ listOfAllDataOut.get(i).getData_out_gurobi().get(GRB.DoubleAttr.X) + " ");
//			}
//
//		}
//
//		// -----------------------------------------------------------------------------------
//
//		/*
//		 * for(int i=0; i<listOfOutLinks1.size(); i++) {
//		 * if(listOfOutLinks1.get(i).getL_out_gurobi().get(GRB.DoubleAttr.X)==1 &&
//		 * listOfOutLinks1.get(i).getLs().getSource()==1) {
//		 * System.out.println(" Source: "+ " "+
//		 * listOfOutLinks1.get(i).getLs().getName());
//		 * System.out.println(listOfOutLinks1.get(i).getLs().getName()+ "--->"+
//		 * listOfOutLinks1.get(i).getLf().getName());
//		 * 
//		 * } }
//		 * 
//		 * ArrayList<L_Out> listOfOutLinksOn = new ArrayList<L_Out>();
//		 * 
//		 * 
//		 * for(int i=0; i<listOfOutLinks1.size(); i++) {
//		 * 
//		 * if( listOfOutLinks1.get(i).getL_out_gurobi().get(GRB.DoubleAttr.X) == 1
//		 * &&listOfOutLinks1.get(i).getLs().getSource() == 0) {
//		 * listOfOutLinksOn.add(listOfOutLinks1.get(i));
//		 * 
//		 * System.out.println(listOfOutLinks1.get(i).getLs().getName()+
//		 * "  "+listOfOutLinks1.get(i).getLs().getName()+"--->"+listOfOutLinks1.get(i).
//		 * getLf().getName());
//		 * 
//		 * }
//		 * 
//		 * }
//		 * 
//		 * 
//		 * for(int i=0; i<listOfInLinks1.size();i++) {
//		 * if(listOfInLinks1.get(i).getL_in_gurobi().get(GRB.DoubleAttr.X)==1 &&
//		 * listOfInLinks1.get(i).getLf().getDestination()==1) {
//		 * System.out.println(listOfInLinks1.get(i).getLs().getName() +"--->"+
//		 * listOfInLinks1.get(i).getLf().getName());
//		 * System.out.println(" Destination:"+" "+listOfInLinks1.get(i).getLf().getName(
//		 * )); } }
//		 */
//
////---------------------------------------------------------------print the lins & louts-------------------------------
//		/*
//		 * for(int i=0; i<listOfOutLinks1.size(); i++) { //listOfOutLinks1.get(i).get
//		 * System.out.println(listOfOutLinks1.get(i).getName()+ " "+
//		 * listOfOutLinks1.get(i).getL_out_gurobi().get(GRB.DoubleAttr.X)+ " "+
//		 * listOfOutLinks1.get(i).getSends_cr().get(i).getName()+" "+
//		 * listOfInLinks1.get(i).getName()+" " +
//		 * listOfInLinks1.get(i).getL_in_gurobi().get(GRB.DoubleAttr.X)+" "+
//		 * listOfOutLinks1.get(i).getSends_cr().get(i).getName()+" "+
//		 * listOfOutLinks1.get(i).getSends_cr().get(i).getCr_gurobi().get(GRB.DoubleAttr
//		 * .X)); }
//		 * 
//		 * 
//		 * 
//		 * 
//		 * for(int i=0; i<listOfInLinks1.size(); i++) {
//		 * System.out.println(listOfInLinks1.get(i).getName()+ " "+
//		 * listOfInLinks1.get(i).getL_in_gurobi().get(GRB.DoubleAttr.X)+ " "); } for(int
//		 * i=0; i<listOfOutLinks1.size(); i++) {
//		 * System.out.println(listOfOutLinks1.get(i).getName()+ " "+
//		 * listOfOutLinks1.get(i).getL_out_gurobi().get(GRB.DoubleAttr.X)+ " "); }
//		 */
//
//		// ---------------------------------------------------------------------------------------------
//		// --------------------------------------returning dataIn with GrbVar=1---------
//		List<Data_In> dataIns = new ArrayList<Data_In>();
//		for (Data_In dataIn : emfModel.getData_ins()) {
//			if (dataIn.getData_in_gurobi().get(GRB.DoubleAttr.X) == 1) {
//				dataIns.add(dataIn);
//			}
//		}
//		return dataIns;
//	}
//
//	// public void solve(EObject emfModel) throws GRBException {
//	public void solve(EObject emfModel) throws GRBException {
//		// this.model.optimize();
//		// this.model.write("model.lp");
//
//	}
//
//	/*
//	 * public String grbVariables(EObject self) throws GRBException {
//	 * 
//	 * 
//	 * GRBEnv env = new GRBEnv(true); env.set("logFile", "mip1.log"); env.start();
//	 * // Create empty model GRBModel model = new GRBModel(env);
//	 * 
//	 * //set opt goals ArrayList<GRBVar> listOfMapping = new ArrayList<GRBVar>();
//	 * //root element TreeIterator<EObject> variables =
//	 * self.eContainer().eAllContents();
//	 * 
//	 * while (variables.hasNext()) { EObject next = variables.next();
//	 * 
//	 * if (next instanceof Mapping) {
//	 * 
//	 * GRBVar x = model.addVar(0.0, 1.0, 0.0,GRB.BINARY,"M"); GRBVar y = ((Mapping)
//	 * next).getM_gurobi(); y = x; listOfMapping.add((GRBVar) y);
//	 * 
//	 * System.out.println(y); //System.out.println(((Mapping) next).getName()); } if
//	 * (next instanceof Application) {
//	 * 
//	 * //System.out.println(((Application) next).getCost());
//	 * //System.out.println(((Application) next).getName()); }
//	 * 
//	 * } System.out.println(listOfMapping);
//	 * 
//	 * return "right"; }
//	 */
//	public GRBModel getModel() {
//		return model;
//	}
//
//	public void setModel(GRBModel model) {
//		this.model = model;
//	}
//
//	public EObject getEmfModel() {
//		return emfModel;
//	}
//
//	public void setEmfModel(EObject emfModel) {
//		this.emfModel = emfModel;
//	}
//}
