/**
 */
package autoDesigner1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vehicle Topology</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link autoDesigner1.VehicleTopology#getMapping <em>Mapping</em>}</li>
 *   <li>{@link autoDesigner1.VehicleTopology#getNode <em>Node</em>}</li>
 *   <li>{@link autoDesigner1.VehicleTopology#getApplication <em>Application</em>}</li>
 *   <li>{@link autoDesigner1.VehicleTopology#getLink <em>Link</em>}</li>
 *   <li>{@link autoDesigner1.VehicleTopology#getData <em>Data</em>}</li>
 *   <li>{@link autoDesigner1.VehicleTopology#getData_in <em>Data in</em>}</li>
 *   <li>{@link autoDesigner1.VehicleTopology#getData_out <em>Data out</em>}</li>
 *   <li>{@link autoDesigner1.VehicleTopology#getTask <em>Task</em>}</li>
 *   <li>{@link autoDesigner1.VehicleTopology#getProcess <em>Process</em>}</li>
 * </ul>
 *
 * @see autoDesigner1.AutoDesigner1Package#getVehicleTopology()
 * @model
 * @generated
 */
public interface VehicleTopology extends EObject {
	/**
	 * Returns the value of the '<em><b>Mapping</b></em>' containment reference list.
	 * The list contents are of type {@link autoDesigner1.Mapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping</em>' containment reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getVehicleTopology_Mapping()
	 * @model containment="true"
	 * @generated
	 */
	EList<Mapping> getMapping();

	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference list.
	 * The list contents are of type {@link autoDesigner1.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getVehicleTopology_Node()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNode();

	/**
	 * Returns the value of the '<em><b>Application</b></em>' containment reference list.
	 * The list contents are of type {@link autoDesigner1.Application}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' containment reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getVehicleTopology_Application()
	 * @model containment="true"
	 * @generated
	 */
	EList<Application> getApplication();

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link autoDesigner1.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getVehicleTopology_Link()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLink();

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link autoDesigner1.Data}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getVehicleTopology_Data()
	 * @model containment="true"
	 * @generated
	 */
	EList<Data> getData();

	/**
	 * Returns the value of the '<em><b>Data in</b></em>' containment reference list.
	 * The list contents are of type {@link autoDesigner1.Data_In}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data in</em>' containment reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getVehicleTopology_Data_in()
	 * @model containment="true"
	 * @generated
	 */
	EList<Data_In> getData_in();

	/**
	 * Returns the value of the '<em><b>Data out</b></em>' containment reference list.
	 * The list contents are of type {@link autoDesigner1.Data_Out}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data out</em>' containment reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getVehicleTopology_Data_out()
	 * @model containment="true"
	 * @generated
	 */
	EList<Data_Out> getData_out();

	/**
	 * Returns the value of the '<em><b>Task</b></em>' containment reference list.
	 * The list contents are of type {@link autoDesigner1.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' containment reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getVehicleTopology_Task()
	 * @model containment="true"
	 * @generated
	 */
	EList<Task> getTask();

	/**
	 * Returns the value of the '<em><b>Process</b></em>' containment reference list.
	 * The list contents are of type {@link autoDesigner1.Process}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' containment reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getVehicleTopology_Process()
	 * @model containment="true"
	 * @generated
	 */
	EList<autoDesigner1.Process> getProcess();

} // VehicleTopology
