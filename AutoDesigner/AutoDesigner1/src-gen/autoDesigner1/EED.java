/**
 */
package autoDesigner1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EED</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link autoDesigner1.EED#getNodes <em>Nodes</em>}</li>
 *   <li>{@link autoDesigner1.EED#getLinks <em>Links</em>}</li>
 *   <li>{@link autoDesigner1.EED#getData <em>Data</em>}</li>
 *   <li>{@link autoDesigner1.EED#getApplications <em>Applications</em>}</li>
 *   <li>{@link autoDesigner1.EED#getMappings <em>Mappings</em>}</li>
 *   <li>{@link autoDesigner1.EED#getData_ins <em>Data ins</em>}</li>
 *   <li>{@link autoDesigner1.EED#getData_outs <em>Data outs</em>}</li>
 *   <li>{@link autoDesigner1.EED#getSettings <em>Settings</em>}</li>
 *   <li>{@link autoDesigner1.EED#getRoute <em>Route</em>}</li>
 *   <li>{@link autoDesigner1.EED#getProcess <em>Process</em>}</li>
 *   <li>{@link autoDesigner1.EED#getTasks <em>Tasks</em>}</li>
 *   <li>{@link autoDesigner1.EED#getCores <em>Cores</em>}</li>
 *   <li>{@link autoDesigner1.EED#getPartitions <em>Partitions</em>}</li>
 *   <li>{@link autoDesigner1.EED#getGpus <em>Gpus</em>}</li>
 *   <li>{@link autoDesigner1.EED#getCameras <em>Cameras</em>}</li>
 *   <li>{@link autoDesigner1.EED#getMemories <em>Memories</em>}</li>
 *   <li>{@link autoDesigner1.EED#getProcessors <em>Processors</em>}</li>
 *   <li>{@link autoDesigner1.EED#getLidars <em>Lidars</em>}</li>
 *   <li>{@link autoDesigner1.EED#getCaches <em>Caches</em>}</li>
 *   <li>{@link autoDesigner1.EED#getUsbs <em>Usbs</em>}</li>
 *   <li>{@link autoDesigner1.EED#getEthernets <em>Ethernets</em>}</li>
 *   <li>{@link autoDesigner1.EED#getCamMappings <em>Cam Mappings</em>}</li>
 *   <li>{@link autoDesigner1.EED#getLidarMappings <em>Lidar Mappings</em>}</li>
 * </ul>
 *
 * @see autoDesigner1.AutoDesigner1Package#getEED()
 * @model
 * @generated
 */
public interface EED extends EObject {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link autoDesigner1.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getEED_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link autoDesigner1.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getEED_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLinks();

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link autoDesigner1.Data}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getEED_Data()
	 * @model containment="true"
	 * @generated
	 */
	EList<Data> getData();

	/**
	 * Returns the value of the '<em><b>Applications</b></em>' containment reference list.
	 * The list contents are of type {@link autoDesigner1.Application}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applications</em>' containment reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getEED_Applications()
	 * @model containment="true"
	 * @generated
	 */
	EList<Application> getApplications();

	/**
	 * Returns the value of the '<em><b>Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link autoDesigner1.Mapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappings</em>' containment reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getEED_Mappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Mapping> getMappings();

	/**
	 * Returns the value of the '<em><b>Data ins</b></em>' containment reference list.
	 * The list contents are of type {@link autoDesigner1.Data_In}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data ins</em>' containment reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getEED_Data_ins()
	 * @model containment="true"
	 * @generated
	 */
	EList<Data_In> getData_ins();

	/**
	 * Returns the value of the '<em><b>Data outs</b></em>' containment reference list.
	 * The list contents are of type {@link autoDesigner1.Data_Out}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data outs</em>' containment reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getEED_Data_outs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Data_Out> getData_outs();

	/**
	 * Returns the value of the '<em><b>Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Settings</em>' containment reference.
	 * @see #setSettings(Settings)
	 * @see autoDesigner1.AutoDesigner1Package#getEED_Settings()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Settings getSettings();

	/**
	 * Sets the value of the '{@link autoDesigner1.EED#getSettings <em>Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Settings</em>' containment reference.
	 * @see #getSettings()
	 * @generated
	 */
	void setSettings(Settings value);

	/**
	 * Returns the value of the '<em><b>Route</b></em>' containment reference list.
	 * The list contents are of type {@link autoDesigner1.Route}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route</em>' containment reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getEED_Route()
	 * @model containment="true"
	 * @generated
	 */
	EList<Route> getRoute();

	/**
	 * Returns the value of the '<em><b>Process</b></em>' containment reference list.
	 * The list contents are of type {@link autoDesigner1.Process}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' containment reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getEED_Process()
	 * @model containment="true"
	 * @generated
	 */
	EList<autoDesigner1.Process> getProcess();

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link autoDesigner1.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getEED_Tasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Task> getTasks();

	/**
	 * Returns the value of the '<em><b>Cores</b></em>' containment reference list.
	 * The list contents are of type {@link autoDesigner1.Core}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cores</em>' containment reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getEED_Cores()
	 * @model containment="true"
	 * @generated
	 */
	EList<Core> getCores();

	/**
	 * Returns the value of the '<em><b>Partitions</b></em>' containment reference list.
	 * The list contents are of type {@link autoDesigner1.Partition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partitions</em>' containment reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getEED_Partitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Partition> getPartitions();

	/**
	 * Returns the value of the '<em><b>Gpus</b></em>' containment reference list.
	 * The list contents are of type {@link autoDesigner1.GPU}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gpus</em>' containment reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getEED_Gpus()
	 * @model containment="true"
	 * @generated
	 */
	EList<GPU> getGpus();

	/**
	 * Returns the value of the '<em><b>Lidars</b></em>' containment reference list.
	 * The list contents are of type {@link autoDesigner1.Lidar}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lidars</em>' containment reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getEED_Lidars()
	 * @model containment="true"
	 * @generated
	 */
	EList<Lidar> getLidars();

	/**
	 * Returns the value of the '<em><b>Caches</b></em>' containment reference list.
	 * The list contents are of type {@link autoDesigner1.Cache}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caches</em>' containment reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getEED_Caches()
	 * @model containment="true"
	 * @generated
	 */
	EList<Cache> getCaches();

	/**
	 * Returns the value of the '<em><b>Usbs</b></em>' containment reference list.
	 * The list contents are of type {@link autoDesigner1.USB}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usbs</em>' containment reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getEED_Usbs()
	 * @model containment="true"
	 * @generated
	 */
	EList<USB> getUsbs();

	/**
	 * Returns the value of the '<em><b>Ethernets</b></em>' containment reference list.
	 * The list contents are of type {@link autoDesigner1.Ethernet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ethernets</em>' containment reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getEED_Ethernets()
	 * @model containment="true"
	 * @generated
	 */
	EList<Ethernet> getEthernets();

	/**
	 * Returns the value of the '<em><b>Cam Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link autoDesigner1.CamMapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cam Mappings</em>' containment reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getEED_CamMappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<CamMapping> getCamMappings();

	/**
	 * Returns the value of the '<em><b>Lidar Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link autoDesigner1.LidarMapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lidar Mappings</em>' containment reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getEED_LidarMappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<LidarMapping> getLidarMappings();

	/**
	 * Returns the value of the '<em><b>Cameras</b></em>' containment reference list.
	 * The list contents are of type {@link autoDesigner1.Camera}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cameras</em>' containment reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getEED_Cameras()
	 * @model containment="true"
	 * @generated
	 */
	EList<Camera> getCameras();

	/**
	 * Returns the value of the '<em><b>Memories</b></em>' containment reference list.
	 * The list contents are of type {@link autoDesigner1.Memory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memories</em>' containment reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getEED_Memories()
	 * @model containment="true"
	 * @generated
	 */
	EList<Memory> getMemories();

	/**
	 * Returns the value of the '<em><b>Processors</b></em>' containment reference list.
	 * The list contents are of type {@link autoDesigner1.Processor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processors</em>' containment reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getEED_Processors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Processor> getProcessors();

} // EED
