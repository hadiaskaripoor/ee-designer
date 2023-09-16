/**
 */
package autoDesigner1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see autoDesigner1.AutoDesigner1Factory
 * @model kind="package"
 * @generated
 */
public interface AutoDesigner1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "autoDesigner1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/autoDesigner1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "autoDesigner1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AutoDesigner1Package eINSTANCE = autoDesigner1.impl.AutoDesigner1PackageImpl.init();

	/**
	 * The meta object id for the '{@link autoDesigner1.impl.VehicleTopologyImpl <em>Vehicle Topology</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see autoDesigner1.impl.VehicleTopologyImpl
	 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getVehicleTopology()
	 * @generated
	 */
	int VEHICLE_TOPOLOGY = 0;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_TOPOLOGY__MAPPING = 0;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_TOPOLOGY__NODE = 1;

	/**
	 * The feature id for the '<em><b>Application</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_TOPOLOGY__APPLICATION = 2;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_TOPOLOGY__LINK = 3;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_TOPOLOGY__DATA = 4;

	/**
	 * The feature id for the '<em><b>Data in</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_TOPOLOGY__DATA_IN = 5;

	/**
	 * The feature id for the '<em><b>Data out</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_TOPOLOGY__DATA_OUT = 6;

	/**
	 * The feature id for the '<em><b>Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_TOPOLOGY__TASK = 7;

	/**
	 * The feature id for the '<em><b>Process</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_TOPOLOGY__PROCESS = 8;

	/**
	 * The number of structural features of the '<em>Vehicle Topology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_TOPOLOGY_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Vehicle Topology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_TOPOLOGY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link autoDesigner1.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see autoDesigner1.impl.ApplicationImpl
	 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__COST = 1;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__MAPPINGS = 2;

	/**
	 * The feature id for the '<em><b>App gurobi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__APP_GUROBI = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__SOURCE = 4;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__DESTINATION = 5;

	/**
	 * The feature id for the '<em><b>Safetycritical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__SAFETYCRITICAL = 6;

	/**
	 * The feature id for the '<em><b>Process</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__PROCESS = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__ID = 8;

	/**
	 * The feature id for the '<em><b>Cammapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__CAMMAPPING = 9;

	/**
	 * The feature id for the '<em><b>Lidarmapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__LIDARMAPPING = 10;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link autoDesigner1.impl.MappingImpl <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see autoDesigner1.impl.MappingImpl
	 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getMapping()
	 * @generated
	 */
	int MAPPING = 2;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__NODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__NAME = 1;

	/**
	 * The feature id for the '<em><b>Mgurobi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__MGUROBI = 2;

	/**
	 * The feature id for the '<em><b>App</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__APP = 3;

	/**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link autoDesigner1.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see autoDesigner1.impl.TaskImpl
	 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getTask()
	 * @generated
	 */
	int TASK = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Frame Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__FRAME_LENGTH = 1;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PERIOD = 2;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__LINK = 3;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DATA = 4;

	/**
	 * The feature id for the '<em><b>Starting Time Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__STARTING_TIME_VAL = 5;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__START_TIME = 6;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link autoDesigner1.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see autoDesigner1.impl.LinkImpl
	 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getLink()
	 * @generated
	 */
	int LINK = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__COST = 1;

	/**
	 * The feature id for the '<em><b>Ls</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__LS = 2;

	/**
	 * The feature id for the '<em><b>Lf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__LF = 3;

	/**
	 * The feature id for the '<em><b>Dout</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__DOUT = 4;

	/**
	 * The feature id for the '<em><b>Din</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__DIN = 5;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TASK = 6;

	/**
	 * The feature id for the '<em><b>Link type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__LINK_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ID = 8;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link autoDesigner1.impl.Data_InImpl <em>Data In</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see autoDesigner1.impl.Data_InImpl
	 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getData_In()
	 * @generated
	 */
	int DATA_IN = 5;

	/**
	 * The feature id for the '<em><b>Dout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_IN__DOUT = 0;

	/**
	 * The feature id for the '<em><b>Data in gurobi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_IN__DATA_IN_GUROBI = 1;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_IN__LINK = 2;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_IN__DATA = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_IN__NAME = 4;

	/**
	 * The number of structural features of the '<em>Data In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_IN_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Data In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_IN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link autoDesigner1.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see autoDesigner1.impl.DataImpl
	 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getData()
	 * @generated
	 */
	int DATA = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Sentby</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__SENTBY = 1;

	/**
	 * The feature id for the '<em><b>Receivedby</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__RECEIVEDBY = 2;

	/**
	 * The feature id for the '<em><b>Din</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__DIN = 3;

	/**
	 * The feature id for the '<em><b>Dout</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__DOUT = 4;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__TASK = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__ID = 6;

	/**
	 * The feature id for the '<em><b>Usercreatedtask</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__USERCREATEDTASK = 7;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link autoDesigner1.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see autoDesigner1.impl.NodeImpl
	 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getNode()
	 * @generated
	 */
	int NODE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__COST = 1;

	/**
	 * The feature id for the '<em><b>Ngurobi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NGUROBI = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SOURCE = 3;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__DESTINATION = 4;

	/**
	 * The feature id for the '<em><b>Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__LINKS = 5;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SENDER = 6;

	/**
	 * The feature id for the '<em><b>Receiver</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__RECEIVER = 7;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__MAPPINGS = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ID = 9;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link autoDesigner1.impl.Data_OutImpl <em>Data Out</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see autoDesigner1.impl.Data_OutImpl
	 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getData_Out()
	 * @generated
	 */
	int DATA_OUT = 8;

	/**
	 * The feature id for the '<em><b>Din</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUT__DIN = 0;

	/**
	 * The feature id for the '<em><b>Data out gurobi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUT__DATA_OUT_GUROBI = 1;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUT__LINK = 2;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUT__DATA = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUT__NAME = 4;

	/**
	 * The number of structural features of the '<em>Data Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Data Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link autoDesigner1.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see autoDesigner1.impl.ProcessImpl
	 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 9;

	/**
	 * The feature id for the '<em><b>Application</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__APPLICATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = 1;

	/**
	 * The feature id for the '<em><b>Wcet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__WCET = 2;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PERIOD = 3;

	/**
	 * The feature id for the '<em><b>Starting Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__STARTING_TIME = 4;

	/**
	 * The feature id for the '<em><b>Recieve Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__RECIEVE_DATA = 5;

	/**
	 * The feature id for the '<em><b>Send Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__SEND_DATA = 6;

	/**
	 * The feature id for the '<em><b>Starting Time Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__STARTING_TIME_VAL = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ID = 8;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link autoDesigner1.impl.EEDImpl <em>EED</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see autoDesigner1.impl.EEDImpl
	 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getEED()
	 * @generated
	 */
	int EED = 10;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EED__NODES = 0;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EED__LINKS = 1;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EED__DATA = 2;

	/**
	 * The feature id for the '<em><b>Applications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EED__APPLICATIONS = 3;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EED__MAPPINGS = 4;

	/**
	 * The feature id for the '<em><b>Data ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EED__DATA_INS = 5;

	/**
	 * The feature id for the '<em><b>Data outs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EED__DATA_OUTS = 6;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EED__SETTINGS = 7;

	/**
	 * The feature id for the '<em><b>Route</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EED__ROUTE = 8;

	/**
	 * The feature id for the '<em><b>Process</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EED__PROCESS = 9;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EED__TASKS = 10;

	/**
	 * The feature id for the '<em><b>Cores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EED__CORES = 11;

	/**
	 * The feature id for the '<em><b>Partitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EED__PARTITIONS = 12;

	/**
	 * The feature id for the '<em><b>Gpus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EED__GPUS = 13;

	/**
	 * The feature id for the '<em><b>Cameras</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EED__CAMERAS = 14;

	/**
	 * The feature id for the '<em><b>Memories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EED__MEMORIES = 15;

	/**
	 * The feature id for the '<em><b>Processors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EED__PROCESSORS = 16;

	/**
	 * The feature id for the '<em><b>Lidars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EED__LIDARS = 17;

	/**
	 * The feature id for the '<em><b>Caches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EED__CACHES = 18;

	/**
	 * The feature id for the '<em><b>Usbs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EED__USBS = 19;

	/**
	 * The feature id for the '<em><b>Ethernets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EED__ETHERNETS = 20;

	/**
	 * The feature id for the '<em><b>Cam Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EED__CAM_MAPPINGS = 21;

	/**
	 * The feature id for the '<em><b>Lidar Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EED__LIDAR_MAPPINGS = 22;

	/**
	 * The number of structural features of the '<em>EED</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EED_FEATURE_COUNT = 23;

	/**
	 * The number of operations of the '<em>EED</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link autoDesigner1.impl.ECUImpl <em>ECU</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see autoDesigner1.impl.ECUImpl
	 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getECU()
	 * @generated
	 */
	int ECU = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__COST = NODE__COST;

	/**
	 * The feature id for the '<em><b>Ngurobi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__NGUROBI = NODE__NGUROBI;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__SOURCE = NODE__SOURCE;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__DESTINATION = NODE__DESTINATION;

	/**
	 * The feature id for the '<em><b>Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__LINKS = NODE__LINKS;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__SENDER = NODE__SENDER;

	/**
	 * The feature id for the '<em><b>Receiver</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__RECEIVER = NODE__RECEIVER;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__MAPPINGS = NODE__MAPPINGS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__ID = NODE__ID;

	/**
	 * The feature id for the '<em><b>Memories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__MEMORIES = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Processors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__PROCESSORS = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ECU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>ECU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link autoDesigner1.impl.HPCUImpl <em>HPCU</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see autoDesigner1.impl.HPCUImpl
	 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getHPCU()
	 * @generated
	 */
	int HPCU = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HPCU__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HPCU__COST = NODE__COST;

	/**
	 * The feature id for the '<em><b>Ngurobi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HPCU__NGUROBI = NODE__NGUROBI;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HPCU__SOURCE = NODE__SOURCE;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HPCU__DESTINATION = NODE__DESTINATION;

	/**
	 * The feature id for the '<em><b>Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HPCU__LINKS = NODE__LINKS;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HPCU__SENDER = NODE__SENDER;

	/**
	 * The feature id for the '<em><b>Receiver</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HPCU__RECEIVER = NODE__RECEIVER;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HPCU__MAPPINGS = NODE__MAPPINGS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HPCU__ID = NODE__ID;

	/**
	 * The feature id for the '<em><b>Gpus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HPCU__GPUS = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Memories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HPCU__MEMORIES = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Processors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HPCU__PROCESSORS = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Partitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HPCU__PARTITIONS = NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>HPCU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HPCU_FEATURE_COUNT = NODE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>HPCU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HPCU_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link autoDesigner1.impl.NetworkSwitchImpl <em>Network Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see autoDesigner1.impl.NetworkSwitchImpl
	 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getNetworkSwitch()
	 * @generated
	 */
	int NETWORK_SWITCH = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_SWITCH__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_SWITCH__COST = NODE__COST;

	/**
	 * The feature id for the '<em><b>Ngurobi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_SWITCH__NGUROBI = NODE__NGUROBI;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_SWITCH__SOURCE = NODE__SOURCE;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_SWITCH__DESTINATION = NODE__DESTINATION;

	/**
	 * The feature id for the '<em><b>Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_SWITCH__LINKS = NODE__LINKS;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_SWITCH__SENDER = NODE__SENDER;

	/**
	 * The feature id for the '<em><b>Receiver</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_SWITCH__RECEIVER = NODE__RECEIVER;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_SWITCH__MAPPINGS = NODE__MAPPINGS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_SWITCH__ID = NODE__ID;

	/**
	 * The number of structural features of the '<em>Network Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_SWITCH_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Network Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_SWITCH_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link autoDesigner1.impl.GatewayImpl <em>Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see autoDesigner1.impl.GatewayImpl
	 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getGateway()
	 * @generated
	 */
	int GATEWAY = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__COST = NODE__COST;

	/**
	 * The feature id for the '<em><b>Ngurobi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__NGUROBI = NODE__NGUROBI;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__SOURCE = NODE__SOURCE;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__DESTINATION = NODE__DESTINATION;

	/**
	 * The feature id for the '<em><b>Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__LINKS = NODE__LINKS;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__SENDER = NODE__SENDER;

	/**
	 * The feature id for the '<em><b>Receiver</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__RECEIVER = NODE__RECEIVER;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__MAPPINGS = NODE__MAPPINGS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__ID = NODE__ID;

	/**
	 * The number of structural features of the '<em>Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link autoDesigner1.impl.SettingsImpl <em>Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see autoDesigner1.impl.SettingsImpl
	 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getSettings()
	 * @generated
	 */
	int SETTINGS = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Optimization Goal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS__OPTIMIZATION_GOAL = 1;

	/**
	 * The feature id for the '<em><b>LOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS__LOR = 2;

	/**
	 * The feature id for the '<em><b>LOR Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS__LOR_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Cost Optimization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS__COST_OPTIMIZATION = 4;

	/**
	 * The feature id for the '<em><b>Show Mappings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS__SHOW_MAPPINGS = 5;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS__DATA = 6;

	/**
	 * The feature id for the '<em><b>Redundant Routes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS__REDUNDANT_ROUTES = 7;

	/**
	 * The feature id for the '<em><b>Homogeneous Redundant Routes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS__HOMOGENEOUS_REDUNDANT_ROUTES = 8;

	/**
	 * The feature id for the '<em><b>Use Optimization Goals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS__USE_OPTIMIZATION_GOALS = 9;

	/**
	 * The feature id for the '<em><b>LOR Prop Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS__LOR_PROP_POSITION = 10;

	/**
	 * The feature id for the '<em><b>Opt Prop Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS__OPT_PROP_POSITION = 11;

	/**
	 * The feature id for the '<em><b>Resource Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS__RESOURCE_USAGE = 12;

	/**
	 * The number of structural features of the '<em>Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link autoDesigner1.impl.RouteImpl <em>Route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see autoDesigner1.impl.RouteImpl
	 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getRoute()
	 * @generated
	 */
	int ROUTE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Start Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__START_NODE = 1;

	/**
	 * The feature id for the '<em><b>End Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__END_NODE = 2;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__DATA = 3;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__TASKS = 4;

	/**
	 * The number of structural features of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link autoDesigner1.impl.L_InImpl <em>LIn</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see autoDesigner1.impl.L_InImpl
	 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getL_In()
	 * @generated
	 */
	int LIN = 17;

	/**
	 * The feature id for the '<em><b>Lin gurobi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIN__LIN_GUROBI = 0;

	/**
	 * The feature id for the '<em><b>Lout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIN__LOUT = 1;

	/**
	 * The number of structural features of the '<em>LIn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>LIn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link autoDesigner1.impl.L_OutImpl <em>LOut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see autoDesigner1.impl.L_OutImpl
	 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getL_Out()
	 * @generated
	 */
	int LOUT = 18;

	/**
	 * The feature id for the '<em><b>Lout gurobi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOUT__LOUT_GUROBI = 0;

	/**
	 * The feature id for the '<em><b>Lin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOUT__LIN = 1;

	/**
	 * The number of structural features of the '<em>LOut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOUT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>LOut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link autoDesigner1.impl.OrderImpl <em>Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see autoDesigner1.impl.OrderImpl
	 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getOrder()
	 * @generated
	 */
	int ORDER = 19;

	/**
	 * The feature id for the '<em><b>Order gurobi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__ORDER_GUROBI = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Has dataout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__HAS_DATAOUT = 2;

	/**
	 * The feature id for the '<em><b>Has datain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__HAS_DATAIN = 3;

	/**
	 * The number of structural features of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link autoDesigner1.impl.GPUImpl <em>GPU</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see autoDesigner1.impl.GPUImpl
	 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getGPU()
	 * @generated
	 */
	int GPU = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU__NAME = 0;

	/**
	 * The feature id for the '<em><b>Memory size in GB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU__MEMORY_SIZE_IN_GB = 1;

	/**
	 * The feature id for the '<em><b>Cuda cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU__CUDA_CORES = 2;

	/**
	 * The number of structural features of the '<em>GPU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>GPU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link autoDesigner1.impl.MemoryImpl <em>Memory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see autoDesigner1.impl.MemoryImpl
	 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getMemory()
	 * @generated
	 */
	int MEMORY = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__NAME = 0;

	/**
	 * The feature id for the '<em><b>DDR Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__DDR_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Memory size gb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__MEMORY_SIZE_GB = 2;

	/**
	 * The number of structural features of the '<em>Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link autoDesigner1.impl.ProcessorImpl <em>Processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see autoDesigner1.impl.ProcessorImpl
	 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getProcessor()
	 * @generated
	 */
	int PROCESSOR = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Turbo boost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__TURBO_BOOST = 1;

	/**
	 * The feature id for the '<em><b>Cores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__CORES = 2;

	/**
	 * The number of structural features of the '<em>Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link autoDesigner1.impl.CoreImpl <em>Core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see autoDesigner1.impl.CoreImpl
	 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getCore()
	 * @generated
	 */
	int CORE = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Clock frequency ghz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__CLOCK_FREQUENCY_GHZ = 1;

	/**
	 * The feature id for the '<em><b>Asil d</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__ASIL_D = 2;

	/**
	 * The feature id for the '<em><b>Asil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__ASIL = 3;

	/**
	 * The feature id for the '<em><b>Turbo boost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__TURBO_BOOST = 4;

	/**
	 * The number of structural features of the '<em>Core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link autoDesigner1.impl.PartitionImpl <em>Partition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see autoDesigner1.impl.PartitionImpl
	 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getPartition()
	 * @generated
	 */
	int PARTITION = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Safety critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__SAFETY_CRITICAL = 1;

	/**
	 * The feature id for the '<em><b>Capacity GB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__CAPACITY_GB = 2;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__MEMORY = 3;

	/**
	 * The feature id for the '<em><b>Ethernet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__ETHERNET = 4;

	/**
	 * The feature id for the '<em><b>Usb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__USB = 5;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__CACHE = 6;

	/**
	 * The number of structural features of the '<em>Partition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Partition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link autoDesigner1.impl.EthernetImpl <em>Ethernet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see autoDesigner1.impl.EthernetImpl
	 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getEthernet()
	 * @generated
	 */
	int ETHERNET = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET__NAME = 0;

	/**
	 * The number of structural features of the '<em>Ethernet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Ethernet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link autoDesigner1.impl.USBImpl <em>USB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see autoDesigner1.impl.USBImpl
	 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getUSB()
	 * @generated
	 */
	int USB = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USB__NAME = 0;

	/**
	 * The number of structural features of the '<em>USB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USB_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>USB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link autoDesigner1.impl.CacheImpl <em>Cache</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see autoDesigner1.impl.CacheImpl
	 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getCache()
	 * @generated
	 */
	int CACHE = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Cache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Cache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link autoDesigner1.impl.LidarImpl <em>Lidar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see autoDesigner1.impl.LidarImpl
	 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getLidar()
	 * @generated
	 */
	int LIDAR = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIDAR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Lidarmapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIDAR__LIDARMAPPING = 1;

	/**
	 * The number of structural features of the '<em>Lidar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIDAR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Lidar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIDAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link autoDesigner1.impl.CameraImpl <em>Camera</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see autoDesigner1.impl.CameraImpl
	 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getCamera()
	 * @generated
	 */
	int CAMERA = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Cammapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__CAMMAPPING = 1;

	/**
	 * The number of structural features of the '<em>Camera</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Camera</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link autoDesigner1.impl.ControllNodeImpl <em>Controll Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see autoDesigner1.impl.ControllNodeImpl
	 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getControllNode()
	 * @generated
	 */
	int CONTROLL_NODE = 30;

	/**
	 * The number of structural features of the '<em>Controll Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLL_NODE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Controll Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLL_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link autoDesigner1.impl.UserCreatedTaskImpl <em>User Created Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see autoDesigner1.impl.UserCreatedTaskImpl
	 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getUserCreatedTask()
	 * @generated
	 */
	int USER_CREATED_TASK = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_CREATED_TASK__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Frame Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_CREATED_TASK__FRAME_LENGTH = TASK__FRAME_LENGTH;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_CREATED_TASK__PERIOD = TASK__PERIOD;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_CREATED_TASK__LINK = TASK__LINK;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_CREATED_TASK__DATA = TASK__DATA;

	/**
	 * The feature id for the '<em><b>Starting Time Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_CREATED_TASK__STARTING_TIME_VAL = TASK__STARTING_TIME_VAL;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_CREATED_TASK__START_TIME = TASK__START_TIME;

	/**
	 * The number of structural features of the '<em>User Created Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_CREATED_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>User Created Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_CREATED_TASK_OPERATION_COUNT = TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link autoDesigner1.impl.LidarMappingImpl <em>Lidar Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see autoDesigner1.impl.LidarMappingImpl
	 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getLidarMapping()
	 * @generated
	 */
	int LIDAR_MAPPING = 32;

	/**
	 * The feature id for the '<em><b>Lidar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIDAR_MAPPING__LIDAR = 0;

	/**
	 * The feature id for the '<em><b>Application</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIDAR_MAPPING__APPLICATION = 1;

	/**
	 * The number of structural features of the '<em>Lidar Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIDAR_MAPPING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Lidar Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIDAR_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link autoDesigner1.impl.CamMappingImpl <em>Cam Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see autoDesigner1.impl.CamMappingImpl
	 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getCamMapping()
	 * @generated
	 */
	int CAM_MAPPING = 33;

	/**
	 * The feature id for the '<em><b>Camera</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAM_MAPPING__CAMERA = 0;

	/**
	 * The feature id for the '<em><b>Application</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAM_MAPPING__APPLICATION = 1;

	/**
	 * The number of structural features of the '<em>Cam Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAM_MAPPING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Cam Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAM_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link autoDesigner1.Link_Type <em>Link Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see autoDesigner1.Link_Type
	 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getLink_Type()
	 * @generated
	 */
	int LINK_TYPE = 34;

	/**
	 * The meta object id for the '{@link autoDesigner1.Optimization_Goal <em>Optimization Goal</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see autoDesigner1.Optimization_Goal
	 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getOptimization_Goal()
	 * @generated
	 */
	int OPTIMIZATION_GOAL = 35;

	/**
	 * The meta object id for the '{@link autoDesigner1.Node_type <em>Node type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see autoDesigner1.Node_type
	 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getNode_type()
	 * @generated
	 */
	int NODE_TYPE = 36;

	/**
	 * The meta object id for the '{@link autoDesigner1.DDRType <em>DDR Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see autoDesigner1.DDRType
	 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getDDRType()
	 * @generated
	 */
	int DDR_TYPE = 37;

	/**
	 * The meta object id for the '{@link autoDesigner1.Asil_Level <em>Asil Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see autoDesigner1.Asil_Level
	 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getAsil_Level()
	 * @generated
	 */
	int ASIL_LEVEL = 38;

	/**
	 * The meta object id for the '<em>GRBRS</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gurobi.GRBVar
	 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getGRBRS()
	 * @generated
	 */
	int GRBRS = 39;

	/**
	 * Returns the meta object for class '{@link autoDesigner1.VehicleTopology <em>Vehicle Topology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vehicle Topology</em>'.
	 * @see autoDesigner1.VehicleTopology
	 * @generated
	 */
	EClass getVehicleTopology();

	/**
	 * Returns the meta object for the containment reference list '{@link autoDesigner1.VehicleTopology#getMapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mapping</em>'.
	 * @see autoDesigner1.VehicleTopology#getMapping()
	 * @see #getVehicleTopology()
	 * @generated
	 */
	EReference getVehicleTopology_Mapping();

	/**
	 * Returns the meta object for the containment reference list '{@link autoDesigner1.VehicleTopology#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node</em>'.
	 * @see autoDesigner1.VehicleTopology#getNode()
	 * @see #getVehicleTopology()
	 * @generated
	 */
	EReference getVehicleTopology_Node();

	/**
	 * Returns the meta object for the containment reference list '{@link autoDesigner1.VehicleTopology#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Application</em>'.
	 * @see autoDesigner1.VehicleTopology#getApplication()
	 * @see #getVehicleTopology()
	 * @generated
	 */
	EReference getVehicleTopology_Application();

	/**
	 * Returns the meta object for the containment reference list '{@link autoDesigner1.VehicleTopology#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see autoDesigner1.VehicleTopology#getLink()
	 * @see #getVehicleTopology()
	 * @generated
	 */
	EReference getVehicleTopology_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link autoDesigner1.VehicleTopology#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see autoDesigner1.VehicleTopology#getData()
	 * @see #getVehicleTopology()
	 * @generated
	 */
	EReference getVehicleTopology_Data();

	/**
	 * Returns the meta object for the containment reference list '{@link autoDesigner1.VehicleTopology#getData_in <em>Data in</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data in</em>'.
	 * @see autoDesigner1.VehicleTopology#getData_in()
	 * @see #getVehicleTopology()
	 * @generated
	 */
	EReference getVehicleTopology_Data_in();

	/**
	 * Returns the meta object for the containment reference list '{@link autoDesigner1.VehicleTopology#getData_out <em>Data out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data out</em>'.
	 * @see autoDesigner1.VehicleTopology#getData_out()
	 * @see #getVehicleTopology()
	 * @generated
	 */
	EReference getVehicleTopology_Data_out();

	/**
	 * Returns the meta object for the containment reference list '{@link autoDesigner1.VehicleTopology#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task</em>'.
	 * @see autoDesigner1.VehicleTopology#getTask()
	 * @see #getVehicleTopology()
	 * @generated
	 */
	EReference getVehicleTopology_Task();

	/**
	 * Returns the meta object for the containment reference list '{@link autoDesigner1.VehicleTopology#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Process</em>'.
	 * @see autoDesigner1.VehicleTopology#getProcess()
	 * @see #getVehicleTopology()
	 * @generated
	 */
	EReference getVehicleTopology_Process();

	/**
	 * Returns the meta object for class '{@link autoDesigner1.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see autoDesigner1.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Application#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see autoDesigner1.Application#getName()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Name();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Application#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see autoDesigner1.Application#getCost()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Cost();

	/**
	 * Returns the meta object for the reference list '{@link autoDesigner1.Application#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mappings</em>'.
	 * @see autoDesigner1.Application#getMappings()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Mappings();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Application#getApp_gurobi <em>App gurobi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>App gurobi</em>'.
	 * @see autoDesigner1.Application#getApp_gurobi()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_App_gurobi();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Application#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see autoDesigner1.Application#getSource()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Source();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Application#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destination</em>'.
	 * @see autoDesigner1.Application#getDestination()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Destination();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Application#isSafetycritical <em>Safetycritical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Safetycritical</em>'.
	 * @see autoDesigner1.Application#isSafetycritical()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Safetycritical();

	/**
	 * Returns the meta object for the containment reference list '{@link autoDesigner1.Application#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Process</em>'.
	 * @see autoDesigner1.Application#getProcess()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Process();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Application#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see autoDesigner1.Application#getId()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Id();

	/**
	 * Returns the meta object for the reference '{@link autoDesigner1.Application#getCammapping <em>Cammapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cammapping</em>'.
	 * @see autoDesigner1.Application#getCammapping()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Cammapping();

	/**
	 * Returns the meta object for the reference '{@link autoDesigner1.Application#getLidarmapping <em>Lidarmapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lidarmapping</em>'.
	 * @see autoDesigner1.Application#getLidarmapping()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Lidarmapping();

	/**
	 * Returns the meta object for class '{@link autoDesigner1.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping</em>'.
	 * @see autoDesigner1.Mapping
	 * @generated
	 */
	EClass getMapping();

	/**
	 * Returns the meta object for the reference '{@link autoDesigner1.Mapping#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see autoDesigner1.Mapping#getNode()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Node();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Mapping#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see autoDesigner1.Mapping#getName()
	 * @see #getMapping()
	 * @generated
	 */
	EAttribute getMapping_Name();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Mapping#getM_gurobi <em>Mgurobi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mgurobi</em>'.
	 * @see autoDesigner1.Mapping#getM_gurobi()
	 * @see #getMapping()
	 * @generated
	 */
	EAttribute getMapping_M_gurobi();

	/**
	 * Returns the meta object for the reference '{@link autoDesigner1.Mapping#getApp <em>App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>App</em>'.
	 * @see autoDesigner1.Mapping#getApp()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_App();

	/**
	 * Returns the meta object for class '{@link autoDesigner1.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see autoDesigner1.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see autoDesigner1.Task#getName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Name();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Task#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see autoDesigner1.Task#getStartTime()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Task#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see autoDesigner1.Task#getPeriod()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Period();

	/**
	 * Returns the meta object for the reference '{@link autoDesigner1.Task#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data</em>'.
	 * @see autoDesigner1.Task#getData()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Data();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Task#getFrameLength <em>Frame Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frame Length</em>'.
	 * @see autoDesigner1.Task#getFrameLength()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_FrameLength();

	/**
	 * Returns the meta object for the reference '{@link autoDesigner1.Task#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Link</em>'.
	 * @see autoDesigner1.Task#getLink()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Link();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Task#getStartingTimeVal <em>Starting Time Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Starting Time Val</em>'.
	 * @see autoDesigner1.Task#getStartingTimeVal()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_StartingTimeVal();

	/**
	 * Returns the meta object for class '{@link autoDesigner1.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see autoDesigner1.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Link#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see autoDesigner1.Link#getName()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Name();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Link#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see autoDesigner1.Link#getCost()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Cost();

	/**
	 * Returns the meta object for the reference '{@link autoDesigner1.Link#getLs <em>Ls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ls</em>'.
	 * @see autoDesigner1.Link#getLs()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Ls();

	/**
	 * Returns the meta object for the reference '{@link autoDesigner1.Link#getLf <em>Lf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lf</em>'.
	 * @see autoDesigner1.Link#getLf()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Lf();

	/**
	 * Returns the meta object for the reference list '{@link autoDesigner1.Link#getD_out <em>Dout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dout</em>'.
	 * @see autoDesigner1.Link#getD_out()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_D_out();

	/**
	 * Returns the meta object for the reference list '{@link autoDesigner1.Link#getD_in <em>Din</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Din</em>'.
	 * @see autoDesigner1.Link#getD_in()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_D_in();

	/**
	 * Returns the meta object for the reference list '{@link autoDesigner1.Link#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Task</em>'.
	 * @see autoDesigner1.Link#getTask()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Task();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Link#getLink_type <em>Link type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link type</em>'.
	 * @see autoDesigner1.Link#getLink_type()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Link_type();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Link#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see autoDesigner1.Link#getId()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Id();

	/**
	 * Returns the meta object for class '{@link autoDesigner1.Data_In <em>Data In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data In</em>'.
	 * @see autoDesigner1.Data_In
	 * @generated
	 */
	EClass getData_In();

	/**
	 * Returns the meta object for the reference '{@link autoDesigner1.Data_In#getD_out <em>Dout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dout</em>'.
	 * @see autoDesigner1.Data_In#getD_out()
	 * @see #getData_In()
	 * @generated
	 */
	EReference getData_In_D_out();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Data_In#getData_in_gurobi <em>Data in gurobi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data in gurobi</em>'.
	 * @see autoDesigner1.Data_In#getData_in_gurobi()
	 * @see #getData_In()
	 * @generated
	 */
	EAttribute getData_In_Data_in_gurobi();

	/**
	 * Returns the meta object for the reference '{@link autoDesigner1.Data_In#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Link</em>'.
	 * @see autoDesigner1.Data_In#getLink()
	 * @see #getData_In()
	 * @generated
	 */
	EReference getData_In_Link();

	/**
	 * Returns the meta object for the reference '{@link autoDesigner1.Data_In#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data</em>'.
	 * @see autoDesigner1.Data_In#getData()
	 * @see #getData_In()
	 * @generated
	 */
	EReference getData_In_Data();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Data_In#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see autoDesigner1.Data_In#getName()
	 * @see #getData_In()
	 * @generated
	 */
	EAttribute getData_In_Name();

	/**
	 * Returns the meta object for class '{@link autoDesigner1.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see autoDesigner1.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Data#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see autoDesigner1.Data#getName()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Name();

	/**
	 * Returns the meta object for the reference '{@link autoDesigner1.Data#getSentby <em>Sentby</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sentby</em>'.
	 * @see autoDesigner1.Data#getSentby()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Sentby();

	/**
	 * Returns the meta object for the reference list '{@link autoDesigner1.Data#getReceivedby <em>Receivedby</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Receivedby</em>'.
	 * @see autoDesigner1.Data#getReceivedby()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Receivedby();

	/**
	 * Returns the meta object for the reference list '{@link autoDesigner1.Data#getD_in <em>Din</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Din</em>'.
	 * @see autoDesigner1.Data#getD_in()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_D_in();

	/**
	 * Returns the meta object for the reference list '{@link autoDesigner1.Data#getD_out <em>Dout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dout</em>'.
	 * @see autoDesigner1.Data#getD_out()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_D_out();

	/**
	 * Returns the meta object for the reference list '{@link autoDesigner1.Data#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Task</em>'.
	 * @see autoDesigner1.Data#getTask()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Task();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Data#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see autoDesigner1.Data#getId()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Id();

	/**
	 * Returns the meta object for the containment reference '{@link autoDesigner1.Data#getUsercreatedtask <em>Usercreatedtask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Usercreatedtask</em>'.
	 * @see autoDesigner1.Data#getUsercreatedtask()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Usercreatedtask();

	/**
	 * Returns the meta object for class '{@link autoDesigner1.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see autoDesigner1.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see autoDesigner1.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Node#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see autoDesigner1.Node#getCost()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Cost();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Node#getN_gurobi <em>Ngurobi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ngurobi</em>'.
	 * @see autoDesigner1.Node#getN_gurobi()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_N_gurobi();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Node#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see autoDesigner1.Node#getSource()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Source();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Node#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destination</em>'.
	 * @see autoDesigner1.Node#getDestination()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Destination();

	/**
	 * Returns the meta object for the reference list '{@link autoDesigner1.Node#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Links</em>'.
	 * @see autoDesigner1.Node#getLinks()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Links();

	/**
	 * Returns the meta object for the reference list '{@link autoDesigner1.Node#getSender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sender</em>'.
	 * @see autoDesigner1.Node#getSender()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Sender();

	/**
	 * Returns the meta object for the reference list '{@link autoDesigner1.Node#getReceiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Receiver</em>'.
	 * @see autoDesigner1.Node#getReceiver()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Receiver();

	/**
	 * Returns the meta object for the reference list '{@link autoDesigner1.Node#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mappings</em>'.
	 * @see autoDesigner1.Node#getMappings()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Mappings();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Node#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see autoDesigner1.Node#getId()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Id();

	/**
	 * Returns the meta object for class '{@link autoDesigner1.Data_Out <em>Data Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Out</em>'.
	 * @see autoDesigner1.Data_Out
	 * @generated
	 */
	EClass getData_Out();

	/**
	 * Returns the meta object for the reference '{@link autoDesigner1.Data_Out#getD_in <em>Din</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Din</em>'.
	 * @see autoDesigner1.Data_Out#getD_in()
	 * @see #getData_Out()
	 * @generated
	 */
	EReference getData_Out_D_in();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Data_Out#getData_out_gurobi <em>Data out gurobi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data out gurobi</em>'.
	 * @see autoDesigner1.Data_Out#getData_out_gurobi()
	 * @see #getData_Out()
	 * @generated
	 */
	EAttribute getData_Out_Data_out_gurobi();

	/**
	 * Returns the meta object for the reference '{@link autoDesigner1.Data_Out#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Link</em>'.
	 * @see autoDesigner1.Data_Out#getLink()
	 * @see #getData_Out()
	 * @generated
	 */
	EReference getData_Out_Link();

	/**
	 * Returns the meta object for the reference '{@link autoDesigner1.Data_Out#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data</em>'.
	 * @see autoDesigner1.Data_Out#getData()
	 * @see #getData_Out()
	 * @generated
	 */
	EReference getData_Out_Data();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Data_Out#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see autoDesigner1.Data_Out#getName()
	 * @see #getData_Out()
	 * @generated
	 */
	EAttribute getData_Out_Name();

	/**
	 * Returns the meta object for class '{@link autoDesigner1.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see autoDesigner1.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the reference '{@link autoDesigner1.Process#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Application</em>'.
	 * @see autoDesigner1.Process#getApplication()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Application();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Process#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see autoDesigner1.Process#getName()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Name();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Process#getWcet <em>Wcet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wcet</em>'.
	 * @see autoDesigner1.Process#getWcet()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Wcet();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Process#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see autoDesigner1.Process#getPeriod()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Period();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Process#getStartingTime <em>Starting Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Starting Time</em>'.
	 * @see autoDesigner1.Process#getStartingTime()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_StartingTime();

	/**
	 * Returns the meta object for the reference '{@link autoDesigner1.Process#getRecieveData <em>Recieve Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Recieve Data</em>'.
	 * @see autoDesigner1.Process#getRecieveData()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_RecieveData();

	/**
	 * Returns the meta object for the reference '{@link autoDesigner1.Process#getSendData <em>Send Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Send Data</em>'.
	 * @see autoDesigner1.Process#getSendData()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_SendData();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Process#getStartingTimeVal <em>Starting Time Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Starting Time Val</em>'.
	 * @see autoDesigner1.Process#getStartingTimeVal()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_StartingTimeVal();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Process#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see autoDesigner1.Process#getId()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Id();

	/**
	 * Returns the meta object for class '{@link autoDesigner1.EED <em>EED</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EED</em>'.
	 * @see autoDesigner1.EED
	 * @generated
	 */
	EClass getEED();

	/**
	 * Returns the meta object for the containment reference list '{@link autoDesigner1.EED#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see autoDesigner1.EED#getNodes()
	 * @see #getEED()
	 * @generated
	 */
	EReference getEED_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link autoDesigner1.EED#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see autoDesigner1.EED#getLinks()
	 * @see #getEED()
	 * @generated
	 */
	EReference getEED_Links();

	/**
	 * Returns the meta object for the containment reference list '{@link autoDesigner1.EED#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see autoDesigner1.EED#getData()
	 * @see #getEED()
	 * @generated
	 */
	EReference getEED_Data();

	/**
	 * Returns the meta object for the containment reference list '{@link autoDesigner1.EED#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Applications</em>'.
	 * @see autoDesigner1.EED#getApplications()
	 * @see #getEED()
	 * @generated
	 */
	EReference getEED_Applications();

	/**
	 * Returns the meta object for the containment reference list '{@link autoDesigner1.EED#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mappings</em>'.
	 * @see autoDesigner1.EED#getMappings()
	 * @see #getEED()
	 * @generated
	 */
	EReference getEED_Mappings();

	/**
	 * Returns the meta object for the containment reference list '{@link autoDesigner1.EED#getData_ins <em>Data ins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data ins</em>'.
	 * @see autoDesigner1.EED#getData_ins()
	 * @see #getEED()
	 * @generated
	 */
	EReference getEED_Data_ins();

	/**
	 * Returns the meta object for the containment reference list '{@link autoDesigner1.EED#getData_outs <em>Data outs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data outs</em>'.
	 * @see autoDesigner1.EED#getData_outs()
	 * @see #getEED()
	 * @generated
	 */
	EReference getEED_Data_outs();

	/**
	 * Returns the meta object for the containment reference '{@link autoDesigner1.EED#getSettings <em>Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Settings</em>'.
	 * @see autoDesigner1.EED#getSettings()
	 * @see #getEED()
	 * @generated
	 */
	EReference getEED_Settings();

	/**
	 * Returns the meta object for the containment reference list '{@link autoDesigner1.EED#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Route</em>'.
	 * @see autoDesigner1.EED#getRoute()
	 * @see #getEED()
	 * @generated
	 */
	EReference getEED_Route();

	/**
	 * Returns the meta object for the containment reference list '{@link autoDesigner1.EED#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Process</em>'.
	 * @see autoDesigner1.EED#getProcess()
	 * @see #getEED()
	 * @generated
	 */
	EReference getEED_Process();

	/**
	 * Returns the meta object for the containment reference list '{@link autoDesigner1.EED#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see autoDesigner1.EED#getTasks()
	 * @see #getEED()
	 * @generated
	 */
	EReference getEED_Tasks();

	/**
	 * Returns the meta object for the containment reference list '{@link autoDesigner1.EED#getCores <em>Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cores</em>'.
	 * @see autoDesigner1.EED#getCores()
	 * @see #getEED()
	 * @generated
	 */
	EReference getEED_Cores();

	/**
	 * Returns the meta object for the containment reference list '{@link autoDesigner1.EED#getPartitions <em>Partitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Partitions</em>'.
	 * @see autoDesigner1.EED#getPartitions()
	 * @see #getEED()
	 * @generated
	 */
	EReference getEED_Partitions();

	/**
	 * Returns the meta object for the containment reference list '{@link autoDesigner1.EED#getGpus <em>Gpus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gpus</em>'.
	 * @see autoDesigner1.EED#getGpus()
	 * @see #getEED()
	 * @generated
	 */
	EReference getEED_Gpus();

	/**
	 * Returns the meta object for the containment reference list '{@link autoDesigner1.EED#getLidars <em>Lidars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lidars</em>'.
	 * @see autoDesigner1.EED#getLidars()
	 * @see #getEED()
	 * @generated
	 */
	EReference getEED_Lidars();

	/**
	 * Returns the meta object for the containment reference list '{@link autoDesigner1.EED#getCaches <em>Caches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Caches</em>'.
	 * @see autoDesigner1.EED#getCaches()
	 * @see #getEED()
	 * @generated
	 */
	EReference getEED_Caches();

	/**
	 * Returns the meta object for the containment reference list '{@link autoDesigner1.EED#getUsbs <em>Usbs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Usbs</em>'.
	 * @see autoDesigner1.EED#getUsbs()
	 * @see #getEED()
	 * @generated
	 */
	EReference getEED_Usbs();

	/**
	 * Returns the meta object for the containment reference list '{@link autoDesigner1.EED#getEthernets <em>Ethernets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ethernets</em>'.
	 * @see autoDesigner1.EED#getEthernets()
	 * @see #getEED()
	 * @generated
	 */
	EReference getEED_Ethernets();

	/**
	 * Returns the meta object for the containment reference list '{@link autoDesigner1.EED#getCamMappings <em>Cam Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cam Mappings</em>'.
	 * @see autoDesigner1.EED#getCamMappings()
	 * @see #getEED()
	 * @generated
	 */
	EReference getEED_CamMappings();

	/**
	 * Returns the meta object for the containment reference list '{@link autoDesigner1.EED#getLidarMappings <em>Lidar Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lidar Mappings</em>'.
	 * @see autoDesigner1.EED#getLidarMappings()
	 * @see #getEED()
	 * @generated
	 */
	EReference getEED_LidarMappings();

	/**
	 * Returns the meta object for the containment reference list '{@link autoDesigner1.EED#getCameras <em>Cameras</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cameras</em>'.
	 * @see autoDesigner1.EED#getCameras()
	 * @see #getEED()
	 * @generated
	 */
	EReference getEED_Cameras();

	/**
	 * Returns the meta object for the containment reference list '{@link autoDesigner1.EED#getMemories <em>Memories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Memories</em>'.
	 * @see autoDesigner1.EED#getMemories()
	 * @see #getEED()
	 * @generated
	 */
	EReference getEED_Memories();

	/**
	 * Returns the meta object for the containment reference list '{@link autoDesigner1.EED#getProcessors <em>Processors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processors</em>'.
	 * @see autoDesigner1.EED#getProcessors()
	 * @see #getEED()
	 * @generated
	 */
	EReference getEED_Processors();

	/**
	 * Returns the meta object for class '{@link autoDesigner1.ECU <em>ECU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ECU</em>'.
	 * @see autoDesigner1.ECU
	 * @generated
	 */
	EClass getECU();

	/**
	 * Returns the meta object for the containment reference list '{@link autoDesigner1.ECU#getMemories <em>Memories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Memories</em>'.
	 * @see autoDesigner1.ECU#getMemories()
	 * @see #getECU()
	 * @generated
	 */
	EReference getECU_Memories();

	/**
	 * Returns the meta object for the containment reference list '{@link autoDesigner1.ECU#getProcessors <em>Processors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processors</em>'.
	 * @see autoDesigner1.ECU#getProcessors()
	 * @see #getECU()
	 * @generated
	 */
	EReference getECU_Processors();

	/**
	 * Returns the meta object for class '{@link autoDesigner1.HPCU <em>HPCU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HPCU</em>'.
	 * @see autoDesigner1.HPCU
	 * @generated
	 */
	EClass getHPCU();

	/**
	 * Returns the meta object for the containment reference list '{@link autoDesigner1.HPCU#getGpus <em>Gpus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gpus</em>'.
	 * @see autoDesigner1.HPCU#getGpus()
	 * @see #getHPCU()
	 * @generated
	 */
	EReference getHPCU_Gpus();

	/**
	 * Returns the meta object for the containment reference list '{@link autoDesigner1.HPCU#getMemories <em>Memories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Memories</em>'.
	 * @see autoDesigner1.HPCU#getMemories()
	 * @see #getHPCU()
	 * @generated
	 */
	EReference getHPCU_Memories();

	/**
	 * Returns the meta object for the containment reference list '{@link autoDesigner1.HPCU#getProcessors <em>Processors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processors</em>'.
	 * @see autoDesigner1.HPCU#getProcessors()
	 * @see #getHPCU()
	 * @generated
	 */
	EReference getHPCU_Processors();

	/**
	 * Returns the meta object for the containment reference list '{@link autoDesigner1.HPCU#getPartitions <em>Partitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Partitions</em>'.
	 * @see autoDesigner1.HPCU#getPartitions()
	 * @see #getHPCU()
	 * @generated
	 */
	EReference getHPCU_Partitions();

	/**
	 * Returns the meta object for class '{@link autoDesigner1.NetworkSwitch <em>Network Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Switch</em>'.
	 * @see autoDesigner1.NetworkSwitch
	 * @generated
	 */
	EClass getNetworkSwitch();

	/**
	 * Returns the meta object for class '{@link autoDesigner1.Gateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gateway</em>'.
	 * @see autoDesigner1.Gateway
	 * @generated
	 */
	EClass getGateway();

	/**
	 * Returns the meta object for class '{@link autoDesigner1.Settings <em>Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Settings</em>'.
	 * @see autoDesigner1.Settings
	 * @generated
	 */
	EClass getSettings();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Settings#getRedundantRoutes <em>Redundant Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Redundant Routes</em>'.
	 * @see autoDesigner1.Settings#getRedundantRoutes()
	 * @see #getSettings()
	 * @generated
	 */
	EAttribute getSettings_RedundantRoutes();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Settings#getHomogeneousRedundantRoutes <em>Homogeneous Redundant Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Homogeneous Redundant Routes</em>'.
	 * @see autoDesigner1.Settings#getHomogeneousRedundantRoutes()
	 * @see #getSettings()
	 * @generated
	 */
	EAttribute getSettings_HomogeneousRedundantRoutes();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Settings#isUseOptimizationGoals <em>Use Optimization Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Optimization Goals</em>'.
	 * @see autoDesigner1.Settings#isUseOptimizationGoals()
	 * @see #getSettings()
	 * @generated
	 */
	EAttribute getSettings_UseOptimizationGoals();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Settings#getLORPropPosition <em>LOR Prop Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LOR Prop Position</em>'.
	 * @see autoDesigner1.Settings#getLORPropPosition()
	 * @see #getSettings()
	 * @generated
	 */
	EAttribute getSettings_LORPropPosition();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Settings#getOptPropPosition <em>Opt Prop Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opt Prop Position</em>'.
	 * @see autoDesigner1.Settings#getOptPropPosition()
	 * @see #getSettings()
	 * @generated
	 */
	EAttribute getSettings_OptPropPosition();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Settings#isResourceUsage <em>Resource Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Usage</em>'.
	 * @see autoDesigner1.Settings#isResourceUsage()
	 * @see #getSettings()
	 * @generated
	 */
	EAttribute getSettings_ResourceUsage();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Settings#getOptimizationGoal <em>Optimization Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optimization Goal</em>'.
	 * @see autoDesigner1.Settings#getOptimizationGoal()
	 * @see #getSettings()
	 * @generated
	 */
	EAttribute getSettings_OptimizationGoal();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Settings#isShowMappings <em>Show Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Mappings</em>'.
	 * @see autoDesigner1.Settings#isShowMappings()
	 * @see #getSettings()
	 * @generated
	 */
	EAttribute getSettings_ShowMappings();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Settings#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see autoDesigner1.Settings#getName()
	 * @see #getSettings()
	 * @generated
	 */
	EAttribute getSettings_Name();

	/**
	 * Returns the meta object for the reference '{@link autoDesigner1.Settings#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data</em>'.
	 * @see autoDesigner1.Settings#getData()
	 * @see #getSettings()
	 * @generated
	 */
	EReference getSettings_Data();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Settings#isCostOptimization <em>Cost Optimization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost Optimization</em>'.
	 * @see autoDesigner1.Settings#isCostOptimization()
	 * @see #getSettings()
	 * @generated
	 */
	EAttribute getSettings_CostOptimization();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Settings#isLOR <em>LOR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LOR</em>'.
	 * @see autoDesigner1.Settings#isLOR()
	 * @see #getSettings()
	 * @generated
	 */
	EAttribute getSettings_LOR();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Settings#getLORValue <em>LOR Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LOR Value</em>'.
	 * @see autoDesigner1.Settings#getLORValue()
	 * @see #getSettings()
	 * @generated
	 */
	EAttribute getSettings_LORValue();

	/**
	 * Returns the meta object for class '{@link autoDesigner1.Route <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route</em>'.
	 * @see autoDesigner1.Route
	 * @generated
	 */
	EClass getRoute();

	/**
	 * Returns the meta object for the reference '{@link autoDesigner1.Route#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data</em>'.
	 * @see autoDesigner1.Route#getData()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_Data();

	/**
	 * Returns the meta object for the reference list '{@link autoDesigner1.Route#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tasks</em>'.
	 * @see autoDesigner1.Route#getTasks()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_Tasks();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Route#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see autoDesigner1.Route#getName()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_Name();

	/**
	 * Returns the meta object for the reference '{@link autoDesigner1.Route#getStartNode <em>Start Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start Node</em>'.
	 * @see autoDesigner1.Route#getStartNode()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_StartNode();

	/**
	 * Returns the meta object for the reference '{@link autoDesigner1.Route#getEndNode <em>End Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End Node</em>'.
	 * @see autoDesigner1.Route#getEndNode()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_EndNode();

	/**
	 * Returns the meta object for class '{@link autoDesigner1.L_In <em>LIn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LIn</em>'.
	 * @see autoDesigner1.L_In
	 * @generated
	 */
	EClass getL_In();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.L_In#getL_in_gurobi <em>Lin gurobi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lin gurobi</em>'.
	 * @see autoDesigner1.L_In#getL_in_gurobi()
	 * @see #getL_In()
	 * @generated
	 */
	EAttribute getL_In_L_in_gurobi();

	/**
	 * Returns the meta object for the reference '{@link autoDesigner1.L_In#getL_out <em>Lout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lout</em>'.
	 * @see autoDesigner1.L_In#getL_out()
	 * @see #getL_In()
	 * @generated
	 */
	EReference getL_In_L_out();

	/**
	 * Returns the meta object for class '{@link autoDesigner1.L_Out <em>LOut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LOut</em>'.
	 * @see autoDesigner1.L_Out
	 * @generated
	 */
	EClass getL_Out();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.L_Out#getL_out_gurobi <em>Lout gurobi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lout gurobi</em>'.
	 * @see autoDesigner1.L_Out#getL_out_gurobi()
	 * @see #getL_Out()
	 * @generated
	 */
	EAttribute getL_Out_L_out_gurobi();

	/**
	 * Returns the meta object for the reference '{@link autoDesigner1.L_Out#getL_in <em>Lin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lin</em>'.
	 * @see autoDesigner1.L_Out#getL_in()
	 * @see #getL_Out()
	 * @generated
	 */
	EReference getL_Out_L_in();

	/**
	 * Returns the meta object for class '{@link autoDesigner1.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order</em>'.
	 * @see autoDesigner1.Order
	 * @generated
	 */
	EClass getOrder();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Order#getOrder_gurobi <em>Order gurobi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order gurobi</em>'.
	 * @see autoDesigner1.Order#getOrder_gurobi()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Order_gurobi();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Order#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see autoDesigner1.Order#getName()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Name();

	/**
	 * Returns the meta object for the reference '{@link autoDesigner1.Order#getHas_dataout <em>Has dataout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has dataout</em>'.
	 * @see autoDesigner1.Order#getHas_dataout()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_Has_dataout();

	/**
	 * Returns the meta object for the reference '{@link autoDesigner1.Order#getHas_datain <em>Has datain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has datain</em>'.
	 * @see autoDesigner1.Order#getHas_datain()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_Has_datain();

	/**
	 * Returns the meta object for class '{@link autoDesigner1.GPU <em>GPU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GPU</em>'.
	 * @see autoDesigner1.GPU
	 * @generated
	 */
	EClass getGPU();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.GPU#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see autoDesigner1.GPU#getName()
	 * @see #getGPU()
	 * @generated
	 */
	EAttribute getGPU_Name();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.GPU#getMemory_size_in_GB <em>Memory size in GB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory size in GB</em>'.
	 * @see autoDesigner1.GPU#getMemory_size_in_GB()
	 * @see #getGPU()
	 * @generated
	 */
	EAttribute getGPU_Memory_size_in_GB();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.GPU#getCuda_cores <em>Cuda cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cuda cores</em>'.
	 * @see autoDesigner1.GPU#getCuda_cores()
	 * @see #getGPU()
	 * @generated
	 */
	EAttribute getGPU_Cuda_cores();

	/**
	 * Returns the meta object for class '{@link autoDesigner1.Memory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory</em>'.
	 * @see autoDesigner1.Memory
	 * @generated
	 */
	EClass getMemory();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Memory#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see autoDesigner1.Memory#getName()
	 * @see #getMemory()
	 * @generated
	 */
	EAttribute getMemory_Name();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Memory#getDDR_Type <em>DDR Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DDR Type</em>'.
	 * @see autoDesigner1.Memory#getDDR_Type()
	 * @see #getMemory()
	 * @generated
	 */
	EAttribute getMemory_DDR_Type();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Memory#getMemory_size_gb <em>Memory size gb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory size gb</em>'.
	 * @see autoDesigner1.Memory#getMemory_size_gb()
	 * @see #getMemory()
	 * @generated
	 */
	EAttribute getMemory_Memory_size_gb();

	/**
	 * Returns the meta object for class '{@link autoDesigner1.Processor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processor</em>'.
	 * @see autoDesigner1.Processor
	 * @generated
	 */
	EClass getProcessor();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Processor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see autoDesigner1.Processor#getName()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_Name();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Processor#isTurbo_boost <em>Turbo boost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Turbo boost</em>'.
	 * @see autoDesigner1.Processor#isTurbo_boost()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_Turbo_boost();

	/**
	 * Returns the meta object for the containment reference list '{@link autoDesigner1.Processor#getCores <em>Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cores</em>'.
	 * @see autoDesigner1.Processor#getCores()
	 * @see #getProcessor()
	 * @generated
	 */
	EReference getProcessor_Cores();

	/**
	 * Returns the meta object for class '{@link autoDesigner1.Core <em>Core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Core</em>'.
	 * @see autoDesigner1.Core
	 * @generated
	 */
	EClass getCore();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Core#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see autoDesigner1.Core#getName()
	 * @see #getCore()
	 * @generated
	 */
	EAttribute getCore_Name();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Core#getClock_frequency_ghz <em>Clock frequency ghz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clock frequency ghz</em>'.
	 * @see autoDesigner1.Core#getClock_frequency_ghz()
	 * @see #getCore()
	 * @generated
	 */
	EAttribute getCore_Clock_frequency_ghz();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Core#isAsil_d <em>Asil d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asil d</em>'.
	 * @see autoDesigner1.Core#isAsil_d()
	 * @see #getCore()
	 * @generated
	 */
	EAttribute getCore_Asil_d();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Core#getAsil <em>Asil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asil</em>'.
	 * @see autoDesigner1.Core#getAsil()
	 * @see #getCore()
	 * @generated
	 */
	EAttribute getCore_Asil();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Core#isTurbo_boost <em>Turbo boost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Turbo boost</em>'.
	 * @see autoDesigner1.Core#isTurbo_boost()
	 * @see #getCore()
	 * @generated
	 */
	EAttribute getCore_Turbo_boost();

	/**
	 * Returns the meta object for class '{@link autoDesigner1.Partition <em>Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partition</em>'.
	 * @see autoDesigner1.Partition
	 * @generated
	 */
	EClass getPartition();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Partition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see autoDesigner1.Partition#getName()
	 * @see #getPartition()
	 * @generated
	 */
	EAttribute getPartition_Name();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Partition#isSafety_critical <em>Safety critical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Safety critical</em>'.
	 * @see autoDesigner1.Partition#isSafety_critical()
	 * @see #getPartition()
	 * @generated
	 */
	EAttribute getPartition_Safety_critical();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Partition#getCapacity_GB <em>Capacity GB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity GB</em>'.
	 * @see autoDesigner1.Partition#getCapacity_GB()
	 * @see #getPartition()
	 * @generated
	 */
	EAttribute getPartition_Capacity_GB();

	/**
	 * Returns the meta object for the reference '{@link autoDesigner1.Partition#getMemory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Memory</em>'.
	 * @see autoDesigner1.Partition#getMemory()
	 * @see #getPartition()
	 * @generated
	 */
	EReference getPartition_Memory();

	/**
	 * Returns the meta object for the reference '{@link autoDesigner1.Partition#getEthernet <em>Ethernet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ethernet</em>'.
	 * @see autoDesigner1.Partition#getEthernet()
	 * @see #getPartition()
	 * @generated
	 */
	EReference getPartition_Ethernet();

	/**
	 * Returns the meta object for the reference '{@link autoDesigner1.Partition#getUsb <em>Usb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Usb</em>'.
	 * @see autoDesigner1.Partition#getUsb()
	 * @see #getPartition()
	 * @generated
	 */
	EReference getPartition_Usb();

	/**
	 * Returns the meta object for the reference '{@link autoDesigner1.Partition#getCache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cache</em>'.
	 * @see autoDesigner1.Partition#getCache()
	 * @see #getPartition()
	 * @generated
	 */
	EReference getPartition_Cache();

	/**
	 * Returns the meta object for class '{@link autoDesigner1.Ethernet <em>Ethernet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ethernet</em>'.
	 * @see autoDesigner1.Ethernet
	 * @generated
	 */
	EClass getEthernet();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Ethernet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see autoDesigner1.Ethernet#getName()
	 * @see #getEthernet()
	 * @generated
	 */
	EAttribute getEthernet_Name();

	/**
	 * Returns the meta object for class '{@link autoDesigner1.USB <em>USB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>USB</em>'.
	 * @see autoDesigner1.USB
	 * @generated
	 */
	EClass getUSB();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.USB#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see autoDesigner1.USB#getName()
	 * @see #getUSB()
	 * @generated
	 */
	EAttribute getUSB_Name();

	/**
	 * Returns the meta object for class '{@link autoDesigner1.Cache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cache</em>'.
	 * @see autoDesigner1.Cache
	 * @generated
	 */
	EClass getCache();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Cache#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see autoDesigner1.Cache#getName()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_Name();

	/**
	 * Returns the meta object for class '{@link autoDesigner1.Lidar <em>Lidar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lidar</em>'.
	 * @see autoDesigner1.Lidar
	 * @generated
	 */
	EClass getLidar();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Lidar#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see autoDesigner1.Lidar#getName()
	 * @see #getLidar()
	 * @generated
	 */
	EAttribute getLidar_Name();

	/**
	 * Returns the meta object for the reference '{@link autoDesigner1.Lidar#getLidarmapping <em>Lidarmapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lidarmapping</em>'.
	 * @see autoDesigner1.Lidar#getLidarmapping()
	 * @see #getLidar()
	 * @generated
	 */
	EReference getLidar_Lidarmapping();

	/**
	 * Returns the meta object for class '{@link autoDesigner1.Camera <em>Camera</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Camera</em>'.
	 * @see autoDesigner1.Camera
	 * @generated
	 */
	EClass getCamera();

	/**
	 * Returns the meta object for the attribute '{@link autoDesigner1.Camera#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see autoDesigner1.Camera#getName()
	 * @see #getCamera()
	 * @generated
	 */
	EAttribute getCamera_Name();

	/**
	 * Returns the meta object for the reference '{@link autoDesigner1.Camera#getCammapping <em>Cammapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cammapping</em>'.
	 * @see autoDesigner1.Camera#getCammapping()
	 * @see #getCamera()
	 * @generated
	 */
	EReference getCamera_Cammapping();

	/**
	 * Returns the meta object for class '{@link autoDesigner1.ControllNode <em>Controll Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controll Node</em>'.
	 * @see autoDesigner1.ControllNode
	 * @generated
	 */
	EClass getControllNode();

	/**
	 * Returns the meta object for class '{@link autoDesigner1.UserCreatedTask <em>User Created Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Created Task</em>'.
	 * @see autoDesigner1.UserCreatedTask
	 * @generated
	 */
	EClass getUserCreatedTask();

	/**
	 * Returns the meta object for class '{@link autoDesigner1.LidarMapping <em>Lidar Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lidar Mapping</em>'.
	 * @see autoDesigner1.LidarMapping
	 * @generated
	 */
	EClass getLidarMapping();

	/**
	 * Returns the meta object for the reference '{@link autoDesigner1.LidarMapping#getLidar <em>Lidar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lidar</em>'.
	 * @see autoDesigner1.LidarMapping#getLidar()
	 * @see #getLidarMapping()
	 * @generated
	 */
	EReference getLidarMapping_Lidar();

	/**
	 * Returns the meta object for the reference '{@link autoDesigner1.LidarMapping#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Application</em>'.
	 * @see autoDesigner1.LidarMapping#getApplication()
	 * @see #getLidarMapping()
	 * @generated
	 */
	EReference getLidarMapping_Application();

	/**
	 * Returns the meta object for class '{@link autoDesigner1.CamMapping <em>Cam Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cam Mapping</em>'.
	 * @see autoDesigner1.CamMapping
	 * @generated
	 */
	EClass getCamMapping();

	/**
	 * Returns the meta object for the reference '{@link autoDesigner1.CamMapping#getCamera <em>Camera</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Camera</em>'.
	 * @see autoDesigner1.CamMapping#getCamera()
	 * @see #getCamMapping()
	 * @generated
	 */
	EReference getCamMapping_Camera();

	/**
	 * Returns the meta object for the reference '{@link autoDesigner1.CamMapping#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Application</em>'.
	 * @see autoDesigner1.CamMapping#getApplication()
	 * @see #getCamMapping()
	 * @generated
	 */
	EReference getCamMapping_Application();

	/**
	 * Returns the meta object for enum '{@link autoDesigner1.Link_Type <em>Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Link Type</em>'.
	 * @see autoDesigner1.Link_Type
	 * @generated
	 */
	EEnum getLink_Type();

	/**
	 * Returns the meta object for enum '{@link autoDesigner1.Optimization_Goal <em>Optimization Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Optimization Goal</em>'.
	 * @see autoDesigner1.Optimization_Goal
	 * @generated
	 */
	EEnum getOptimization_Goal();

	/**
	 * Returns the meta object for enum '{@link autoDesigner1.Node_type <em>Node type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Node type</em>'.
	 * @see autoDesigner1.Node_type
	 * @generated
	 */
	EEnum getNode_type();

	/**
	 * Returns the meta object for enum '{@link autoDesigner1.DDRType <em>DDR Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DDR Type</em>'.
	 * @see autoDesigner1.DDRType
	 * @generated
	 */
	EEnum getDDRType();

	/**
	 * Returns the meta object for enum '{@link autoDesigner1.Asil_Level <em>Asil Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Asil Level</em>'.
	 * @see autoDesigner1.Asil_Level
	 * @generated
	 */
	EEnum getAsil_Level();

	/**
	 * Returns the meta object for data type '{@link gurobi.GRBVar <em>GRBRS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>GRBRS</em>'.
	 * @see gurobi.GRBVar
	 * @model instanceClass="gurobi.GRBVar"
	 * @generated
	 */
	EDataType getGRBRS();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AutoDesigner1Factory getAutoDesigner1Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link autoDesigner1.impl.VehicleTopologyImpl <em>Vehicle Topology</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see autoDesigner1.impl.VehicleTopologyImpl
		 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getVehicleTopology()
		 * @generated
		 */
		EClass VEHICLE_TOPOLOGY = eINSTANCE.getVehicleTopology();

		/**
		 * The meta object literal for the '<em><b>Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE_TOPOLOGY__MAPPING = eINSTANCE.getVehicleTopology_Mapping();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE_TOPOLOGY__NODE = eINSTANCE.getVehicleTopology_Node();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE_TOPOLOGY__APPLICATION = eINSTANCE.getVehicleTopology_Application();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE_TOPOLOGY__LINK = eINSTANCE.getVehicleTopology_Link();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE_TOPOLOGY__DATA = eINSTANCE.getVehicleTopology_Data();

		/**
		 * The meta object literal for the '<em><b>Data in</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE_TOPOLOGY__DATA_IN = eINSTANCE.getVehicleTopology_Data_in();

		/**
		 * The meta object literal for the '<em><b>Data out</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE_TOPOLOGY__DATA_OUT = eINSTANCE.getVehicleTopology_Data_out();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE_TOPOLOGY__TASK = eINSTANCE.getVehicleTopology_Task();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE_TOPOLOGY__PROCESS = eINSTANCE.getVehicleTopology_Process();

		/**
		 * The meta object literal for the '{@link autoDesigner1.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see autoDesigner1.impl.ApplicationImpl
		 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__NAME = eINSTANCE.getApplication_Name();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__COST = eINSTANCE.getApplication_Cost();

		/**
		 * The meta object literal for the '<em><b>Mappings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__MAPPINGS = eINSTANCE.getApplication_Mappings();

		/**
		 * The meta object literal for the '<em><b>App gurobi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__APP_GUROBI = eINSTANCE.getApplication_App_gurobi();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__SOURCE = eINSTANCE.getApplication_Source();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__DESTINATION = eINSTANCE.getApplication_Destination();

		/**
		 * The meta object literal for the '<em><b>Safetycritical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__SAFETYCRITICAL = eINSTANCE.getApplication_Safetycritical();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__PROCESS = eINSTANCE.getApplication_Process();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__ID = eINSTANCE.getApplication_Id();

		/**
		 * The meta object literal for the '<em><b>Cammapping</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__CAMMAPPING = eINSTANCE.getApplication_Cammapping();

		/**
		 * The meta object literal for the '<em><b>Lidarmapping</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__LIDARMAPPING = eINSTANCE.getApplication_Lidarmapping();

		/**
		 * The meta object literal for the '{@link autoDesigner1.impl.MappingImpl <em>Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see autoDesigner1.impl.MappingImpl
		 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getMapping()
		 * @generated
		 */
		EClass MAPPING = eINSTANCE.getMapping();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__NODE = eINSTANCE.getMapping_Node();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING__NAME = eINSTANCE.getMapping_Name();

		/**
		 * The meta object literal for the '<em><b>Mgurobi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING__MGUROBI = eINSTANCE.getMapping_M_gurobi();

		/**
		 * The meta object literal for the '<em><b>App</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__APP = eINSTANCE.getMapping_App();

		/**
		 * The meta object literal for the '{@link autoDesigner1.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see autoDesigner1.impl.TaskImpl
		 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__NAME = eINSTANCE.getTask_Name();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__START_TIME = eINSTANCE.getTask_StartTime();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__PERIOD = eINSTANCE.getTask_Period();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__DATA = eINSTANCE.getTask_Data();

		/**
		 * The meta object literal for the '<em><b>Frame Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__FRAME_LENGTH = eINSTANCE.getTask_FrameLength();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__LINK = eINSTANCE.getTask_Link();

		/**
		 * The meta object literal for the '<em><b>Starting Time Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__STARTING_TIME_VAL = eINSTANCE.getTask_StartingTimeVal();

		/**
		 * The meta object literal for the '{@link autoDesigner1.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see autoDesigner1.impl.LinkImpl
		 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__NAME = eINSTANCE.getLink_Name();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__COST = eINSTANCE.getLink_Cost();

		/**
		 * The meta object literal for the '<em><b>Ls</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__LS = eINSTANCE.getLink_Ls();

		/**
		 * The meta object literal for the '<em><b>Lf</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__LF = eINSTANCE.getLink_Lf();

		/**
		 * The meta object literal for the '<em><b>Dout</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__DOUT = eINSTANCE.getLink_D_out();

		/**
		 * The meta object literal for the '<em><b>Din</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__DIN = eINSTANCE.getLink_D_in();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__TASK = eINSTANCE.getLink_Task();

		/**
		 * The meta object literal for the '<em><b>Link type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__LINK_TYPE = eINSTANCE.getLink_Link_type();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__ID = eINSTANCE.getLink_Id();

		/**
		 * The meta object literal for the '{@link autoDesigner1.impl.Data_InImpl <em>Data In</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see autoDesigner1.impl.Data_InImpl
		 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getData_In()
		 * @generated
		 */
		EClass DATA_IN = eINSTANCE.getData_In();

		/**
		 * The meta object literal for the '<em><b>Dout</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_IN__DOUT = eINSTANCE.getData_In_D_out();

		/**
		 * The meta object literal for the '<em><b>Data in gurobi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_IN__DATA_IN_GUROBI = eINSTANCE.getData_In_Data_in_gurobi();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_IN__LINK = eINSTANCE.getData_In_Link();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_IN__DATA = eINSTANCE.getData_In_Data();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_IN__NAME = eINSTANCE.getData_In_Name();

		/**
		 * The meta object literal for the '{@link autoDesigner1.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see autoDesigner1.impl.DataImpl
		 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__NAME = eINSTANCE.getData_Name();

		/**
		 * The meta object literal for the '<em><b>Sentby</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__SENTBY = eINSTANCE.getData_Sentby();

		/**
		 * The meta object literal for the '<em><b>Receivedby</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__RECEIVEDBY = eINSTANCE.getData_Receivedby();

		/**
		 * The meta object literal for the '<em><b>Din</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__DIN = eINSTANCE.getData_D_in();

		/**
		 * The meta object literal for the '<em><b>Dout</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__DOUT = eINSTANCE.getData_D_out();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__TASK = eINSTANCE.getData_Task();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__ID = eINSTANCE.getData_Id();

		/**
		 * The meta object literal for the '<em><b>Usercreatedtask</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__USERCREATEDTASK = eINSTANCE.getData_Usercreatedtask();

		/**
		 * The meta object literal for the '{@link autoDesigner1.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see autoDesigner1.impl.NodeImpl
		 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__COST = eINSTANCE.getNode_Cost();

		/**
		 * The meta object literal for the '<em><b>Ngurobi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NGUROBI = eINSTANCE.getNode_N_gurobi();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__SOURCE = eINSTANCE.getNode_Source();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__DESTINATION = eINSTANCE.getNode_Destination();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__LINKS = eINSTANCE.getNode_Links();

		/**
		 * The meta object literal for the '<em><b>Sender</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__SENDER = eINSTANCE.getNode_Sender();

		/**
		 * The meta object literal for the '<em><b>Receiver</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__RECEIVER = eINSTANCE.getNode_Receiver();

		/**
		 * The meta object literal for the '<em><b>Mappings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__MAPPINGS = eINSTANCE.getNode_Mappings();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__ID = eINSTANCE.getNode_Id();

		/**
		 * The meta object literal for the '{@link autoDesigner1.impl.Data_OutImpl <em>Data Out</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see autoDesigner1.impl.Data_OutImpl
		 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getData_Out()
		 * @generated
		 */
		EClass DATA_OUT = eINSTANCE.getData_Out();

		/**
		 * The meta object literal for the '<em><b>Din</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_OUT__DIN = eINSTANCE.getData_Out_D_in();

		/**
		 * The meta object literal for the '<em><b>Data out gurobi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_OUT__DATA_OUT_GUROBI = eINSTANCE.getData_Out_Data_out_gurobi();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_OUT__LINK = eINSTANCE.getData_Out_Link();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_OUT__DATA = eINSTANCE.getData_Out_Data();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_OUT__NAME = eINSTANCE.getData_Out_Name();

		/**
		 * The meta object literal for the '{@link autoDesigner1.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see autoDesigner1.impl.ProcessImpl
		 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__APPLICATION = eINSTANCE.getProcess_Application();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__NAME = eINSTANCE.getProcess_Name();

		/**
		 * The meta object literal for the '<em><b>Wcet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__WCET = eINSTANCE.getProcess_Wcet();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__PERIOD = eINSTANCE.getProcess_Period();

		/**
		 * The meta object literal for the '<em><b>Starting Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__STARTING_TIME = eINSTANCE.getProcess_StartingTime();

		/**
		 * The meta object literal for the '<em><b>Recieve Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__RECIEVE_DATA = eINSTANCE.getProcess_RecieveData();

		/**
		 * The meta object literal for the '<em><b>Send Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__SEND_DATA = eINSTANCE.getProcess_SendData();

		/**
		 * The meta object literal for the '<em><b>Starting Time Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__STARTING_TIME_VAL = eINSTANCE.getProcess_StartingTimeVal();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__ID = eINSTANCE.getProcess_Id();

		/**
		 * The meta object literal for the '{@link autoDesigner1.impl.EEDImpl <em>EED</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see autoDesigner1.impl.EEDImpl
		 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getEED()
		 * @generated
		 */
		EClass EED = eINSTANCE.getEED();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EED__NODES = eINSTANCE.getEED_Nodes();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EED__LINKS = eINSTANCE.getEED_Links();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EED__DATA = eINSTANCE.getEED_Data();

		/**
		 * The meta object literal for the '<em><b>Applications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EED__APPLICATIONS = eINSTANCE.getEED_Applications();

		/**
		 * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EED__MAPPINGS = eINSTANCE.getEED_Mappings();

		/**
		 * The meta object literal for the '<em><b>Data ins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EED__DATA_INS = eINSTANCE.getEED_Data_ins();

		/**
		 * The meta object literal for the '<em><b>Data outs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EED__DATA_OUTS = eINSTANCE.getEED_Data_outs();

		/**
		 * The meta object literal for the '<em><b>Settings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EED__SETTINGS = eINSTANCE.getEED_Settings();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EED__ROUTE = eINSTANCE.getEED_Route();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EED__PROCESS = eINSTANCE.getEED_Process();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EED__TASKS = eINSTANCE.getEED_Tasks();

		/**
		 * The meta object literal for the '<em><b>Cores</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EED__CORES = eINSTANCE.getEED_Cores();

		/**
		 * The meta object literal for the '<em><b>Partitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EED__PARTITIONS = eINSTANCE.getEED_Partitions();

		/**
		 * The meta object literal for the '<em><b>Gpus</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EED__GPUS = eINSTANCE.getEED_Gpus();

		/**
		 * The meta object literal for the '<em><b>Lidars</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EED__LIDARS = eINSTANCE.getEED_Lidars();

		/**
		 * The meta object literal for the '<em><b>Caches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EED__CACHES = eINSTANCE.getEED_Caches();

		/**
		 * The meta object literal for the '<em><b>Usbs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EED__USBS = eINSTANCE.getEED_Usbs();

		/**
		 * The meta object literal for the '<em><b>Ethernets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EED__ETHERNETS = eINSTANCE.getEED_Ethernets();

		/**
		 * The meta object literal for the '<em><b>Cam Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EED__CAM_MAPPINGS = eINSTANCE.getEED_CamMappings();

		/**
		 * The meta object literal for the '<em><b>Lidar Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EED__LIDAR_MAPPINGS = eINSTANCE.getEED_LidarMappings();

		/**
		 * The meta object literal for the '<em><b>Cameras</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EED__CAMERAS = eINSTANCE.getEED_Cameras();

		/**
		 * The meta object literal for the '<em><b>Memories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EED__MEMORIES = eINSTANCE.getEED_Memories();

		/**
		 * The meta object literal for the '<em><b>Processors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EED__PROCESSORS = eINSTANCE.getEED_Processors();

		/**
		 * The meta object literal for the '{@link autoDesigner1.impl.ECUImpl <em>ECU</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see autoDesigner1.impl.ECUImpl
		 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getECU()
		 * @generated
		 */
		EClass ECU = eINSTANCE.getECU();

		/**
		 * The meta object literal for the '<em><b>Memories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECU__MEMORIES = eINSTANCE.getECU_Memories();

		/**
		 * The meta object literal for the '<em><b>Processors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECU__PROCESSORS = eINSTANCE.getECU_Processors();

		/**
		 * The meta object literal for the '{@link autoDesigner1.impl.HPCUImpl <em>HPCU</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see autoDesigner1.impl.HPCUImpl
		 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getHPCU()
		 * @generated
		 */
		EClass HPCU = eINSTANCE.getHPCU();

		/**
		 * The meta object literal for the '<em><b>Gpus</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HPCU__GPUS = eINSTANCE.getHPCU_Gpus();

		/**
		 * The meta object literal for the '<em><b>Memories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HPCU__MEMORIES = eINSTANCE.getHPCU_Memories();

		/**
		 * The meta object literal for the '<em><b>Processors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HPCU__PROCESSORS = eINSTANCE.getHPCU_Processors();

		/**
		 * The meta object literal for the '<em><b>Partitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HPCU__PARTITIONS = eINSTANCE.getHPCU_Partitions();

		/**
		 * The meta object literal for the '{@link autoDesigner1.impl.NetworkSwitchImpl <em>Network Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see autoDesigner1.impl.NetworkSwitchImpl
		 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getNetworkSwitch()
		 * @generated
		 */
		EClass NETWORK_SWITCH = eINSTANCE.getNetworkSwitch();

		/**
		 * The meta object literal for the '{@link autoDesigner1.impl.GatewayImpl <em>Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see autoDesigner1.impl.GatewayImpl
		 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getGateway()
		 * @generated
		 */
		EClass GATEWAY = eINSTANCE.getGateway();

		/**
		 * The meta object literal for the '{@link autoDesigner1.impl.SettingsImpl <em>Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see autoDesigner1.impl.SettingsImpl
		 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getSettings()
		 * @generated
		 */
		EClass SETTINGS = eINSTANCE.getSettings();

		/**
		 * The meta object literal for the '<em><b>Redundant Routes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTINGS__REDUNDANT_ROUTES = eINSTANCE.getSettings_RedundantRoutes();

		/**
		 * The meta object literal for the '<em><b>Homogeneous Redundant Routes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTINGS__HOMOGENEOUS_REDUNDANT_ROUTES = eINSTANCE.getSettings_HomogeneousRedundantRoutes();

		/**
		 * The meta object literal for the '<em><b>Use Optimization Goals</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTINGS__USE_OPTIMIZATION_GOALS = eINSTANCE.getSettings_UseOptimizationGoals();

		/**
		 * The meta object literal for the '<em><b>LOR Prop Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTINGS__LOR_PROP_POSITION = eINSTANCE.getSettings_LORPropPosition();

		/**
		 * The meta object literal for the '<em><b>Opt Prop Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTINGS__OPT_PROP_POSITION = eINSTANCE.getSettings_OptPropPosition();

		/**
		 * The meta object literal for the '<em><b>Resource Usage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTINGS__RESOURCE_USAGE = eINSTANCE.getSettings_ResourceUsage();

		/**
		 * The meta object literal for the '<em><b>Optimization Goal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTINGS__OPTIMIZATION_GOAL = eINSTANCE.getSettings_OptimizationGoal();

		/**
		 * The meta object literal for the '<em><b>Show Mappings</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTINGS__SHOW_MAPPINGS = eINSTANCE.getSettings_ShowMappings();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTINGS__NAME = eINSTANCE.getSettings_Name();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETTINGS__DATA = eINSTANCE.getSettings_Data();

		/**
		 * The meta object literal for the '<em><b>Cost Optimization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTINGS__COST_OPTIMIZATION = eINSTANCE.getSettings_CostOptimization();

		/**
		 * The meta object literal for the '<em><b>LOR</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTINGS__LOR = eINSTANCE.getSettings_LOR();

		/**
		 * The meta object literal for the '<em><b>LOR Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTINGS__LOR_VALUE = eINSTANCE.getSettings_LORValue();

		/**
		 * The meta object literal for the '{@link autoDesigner1.impl.RouteImpl <em>Route</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see autoDesigner1.impl.RouteImpl
		 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getRoute()
		 * @generated
		 */
		EClass ROUTE = eINSTANCE.getRoute();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__DATA = eINSTANCE.getRoute_Data();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__TASKS = eINSTANCE.getRoute_Tasks();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE__NAME = eINSTANCE.getRoute_Name();

		/**
		 * The meta object literal for the '<em><b>Start Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__START_NODE = eINSTANCE.getRoute_StartNode();

		/**
		 * The meta object literal for the '<em><b>End Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__END_NODE = eINSTANCE.getRoute_EndNode();

		/**
		 * The meta object literal for the '{@link autoDesigner1.impl.L_InImpl <em>LIn</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see autoDesigner1.impl.L_InImpl
		 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getL_In()
		 * @generated
		 */
		EClass LIN = eINSTANCE.getL_In();

		/**
		 * The meta object literal for the '<em><b>Lin gurobi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIN__LIN_GUROBI = eINSTANCE.getL_In_L_in_gurobi();

		/**
		 * The meta object literal for the '<em><b>Lout</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIN__LOUT = eINSTANCE.getL_In_L_out();

		/**
		 * The meta object literal for the '{@link autoDesigner1.impl.L_OutImpl <em>LOut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see autoDesigner1.impl.L_OutImpl
		 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getL_Out()
		 * @generated
		 */
		EClass LOUT = eINSTANCE.getL_Out();

		/**
		 * The meta object literal for the '<em><b>Lout gurobi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOUT__LOUT_GUROBI = eINSTANCE.getL_Out_L_out_gurobi();

		/**
		 * The meta object literal for the '<em><b>Lin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOUT__LIN = eINSTANCE.getL_Out_L_in();

		/**
		 * The meta object literal for the '{@link autoDesigner1.impl.OrderImpl <em>Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see autoDesigner1.impl.OrderImpl
		 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getOrder()
		 * @generated
		 */
		EClass ORDER = eINSTANCE.getOrder();

		/**
		 * The meta object literal for the '<em><b>Order gurobi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__ORDER_GUROBI = eINSTANCE.getOrder_Order_gurobi();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__NAME = eINSTANCE.getOrder_Name();

		/**
		 * The meta object literal for the '<em><b>Has dataout</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER__HAS_DATAOUT = eINSTANCE.getOrder_Has_dataout();

		/**
		 * The meta object literal for the '<em><b>Has datain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER__HAS_DATAIN = eINSTANCE.getOrder_Has_datain();

		/**
		 * The meta object literal for the '{@link autoDesigner1.impl.GPUImpl <em>GPU</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see autoDesigner1.impl.GPUImpl
		 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getGPU()
		 * @generated
		 */
		EClass GPU = eINSTANCE.getGPU();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPU__NAME = eINSTANCE.getGPU_Name();

		/**
		 * The meta object literal for the '<em><b>Memory size in GB</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPU__MEMORY_SIZE_IN_GB = eINSTANCE.getGPU_Memory_size_in_GB();

		/**
		 * The meta object literal for the '<em><b>Cuda cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPU__CUDA_CORES = eINSTANCE.getGPU_Cuda_cores();

		/**
		 * The meta object literal for the '{@link autoDesigner1.impl.MemoryImpl <em>Memory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see autoDesigner1.impl.MemoryImpl
		 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getMemory()
		 * @generated
		 */
		EClass MEMORY = eINSTANCE.getMemory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY__NAME = eINSTANCE.getMemory_Name();

		/**
		 * The meta object literal for the '<em><b>DDR Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY__DDR_TYPE = eINSTANCE.getMemory_DDR_Type();

		/**
		 * The meta object literal for the '<em><b>Memory size gb</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY__MEMORY_SIZE_GB = eINSTANCE.getMemory_Memory_size_gb();

		/**
		 * The meta object literal for the '{@link autoDesigner1.impl.ProcessorImpl <em>Processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see autoDesigner1.impl.ProcessorImpl
		 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getProcessor()
		 * @generated
		 */
		EClass PROCESSOR = eINSTANCE.getProcessor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__NAME = eINSTANCE.getProcessor_Name();

		/**
		 * The meta object literal for the '<em><b>Turbo boost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__TURBO_BOOST = eINSTANCE.getProcessor_Turbo_boost();

		/**
		 * The meta object literal for the '<em><b>Cores</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR__CORES = eINSTANCE.getProcessor_Cores();

		/**
		 * The meta object literal for the '{@link autoDesigner1.impl.CoreImpl <em>Core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see autoDesigner1.impl.CoreImpl
		 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getCore()
		 * @generated
		 */
		EClass CORE = eINSTANCE.getCore();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORE__NAME = eINSTANCE.getCore_Name();

		/**
		 * The meta object literal for the '<em><b>Clock frequency ghz</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORE__CLOCK_FREQUENCY_GHZ = eINSTANCE.getCore_Clock_frequency_ghz();

		/**
		 * The meta object literal for the '<em><b>Asil d</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORE__ASIL_D = eINSTANCE.getCore_Asil_d();

		/**
		 * The meta object literal for the '<em><b>Asil</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORE__ASIL = eINSTANCE.getCore_Asil();

		/**
		 * The meta object literal for the '<em><b>Turbo boost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORE__TURBO_BOOST = eINSTANCE.getCore_Turbo_boost();

		/**
		 * The meta object literal for the '{@link autoDesigner1.impl.PartitionImpl <em>Partition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see autoDesigner1.impl.PartitionImpl
		 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getPartition()
		 * @generated
		 */
		EClass PARTITION = eINSTANCE.getPartition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTITION__NAME = eINSTANCE.getPartition_Name();

		/**
		 * The meta object literal for the '<em><b>Safety critical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTITION__SAFETY_CRITICAL = eINSTANCE.getPartition_Safety_critical();

		/**
		 * The meta object literal for the '<em><b>Capacity GB</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTITION__CAPACITY_GB = eINSTANCE.getPartition_Capacity_GB();

		/**
		 * The meta object literal for the '<em><b>Memory</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION__MEMORY = eINSTANCE.getPartition_Memory();

		/**
		 * The meta object literal for the '<em><b>Ethernet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION__ETHERNET = eINSTANCE.getPartition_Ethernet();

		/**
		 * The meta object literal for the '<em><b>Usb</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION__USB = eINSTANCE.getPartition_Usb();

		/**
		 * The meta object literal for the '<em><b>Cache</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION__CACHE = eINSTANCE.getPartition_Cache();

		/**
		 * The meta object literal for the '{@link autoDesigner1.impl.EthernetImpl <em>Ethernet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see autoDesigner1.impl.EthernetImpl
		 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getEthernet()
		 * @generated
		 */
		EClass ETHERNET = eINSTANCE.getEthernet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETHERNET__NAME = eINSTANCE.getEthernet_Name();

		/**
		 * The meta object literal for the '{@link autoDesigner1.impl.USBImpl <em>USB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see autoDesigner1.impl.USBImpl
		 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getUSB()
		 * @generated
		 */
		EClass USB = eINSTANCE.getUSB();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USB__NAME = eINSTANCE.getUSB_Name();

		/**
		 * The meta object literal for the '{@link autoDesigner1.impl.CacheImpl <em>Cache</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see autoDesigner1.impl.CacheImpl
		 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getCache()
		 * @generated
		 */
		EClass CACHE = eINSTANCE.getCache();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE__NAME = eINSTANCE.getCache_Name();

		/**
		 * The meta object literal for the '{@link autoDesigner1.impl.LidarImpl <em>Lidar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see autoDesigner1.impl.LidarImpl
		 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getLidar()
		 * @generated
		 */
		EClass LIDAR = eINSTANCE.getLidar();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIDAR__NAME = eINSTANCE.getLidar_Name();

		/**
		 * The meta object literal for the '<em><b>Lidarmapping</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIDAR__LIDARMAPPING = eINSTANCE.getLidar_Lidarmapping();

		/**
		 * The meta object literal for the '{@link autoDesigner1.impl.CameraImpl <em>Camera</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see autoDesigner1.impl.CameraImpl
		 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getCamera()
		 * @generated
		 */
		EClass CAMERA = eINSTANCE.getCamera();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMERA__NAME = eINSTANCE.getCamera_Name();

		/**
		 * The meta object literal for the '<em><b>Cammapping</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMERA__CAMMAPPING = eINSTANCE.getCamera_Cammapping();

		/**
		 * The meta object literal for the '{@link autoDesigner1.impl.ControllNodeImpl <em>Controll Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see autoDesigner1.impl.ControllNodeImpl
		 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getControllNode()
		 * @generated
		 */
		EClass CONTROLL_NODE = eINSTANCE.getControllNode();

		/**
		 * The meta object literal for the '{@link autoDesigner1.impl.UserCreatedTaskImpl <em>User Created Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see autoDesigner1.impl.UserCreatedTaskImpl
		 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getUserCreatedTask()
		 * @generated
		 */
		EClass USER_CREATED_TASK = eINSTANCE.getUserCreatedTask();

		/**
		 * The meta object literal for the '{@link autoDesigner1.impl.LidarMappingImpl <em>Lidar Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see autoDesigner1.impl.LidarMappingImpl
		 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getLidarMapping()
		 * @generated
		 */
		EClass LIDAR_MAPPING = eINSTANCE.getLidarMapping();

		/**
		 * The meta object literal for the '<em><b>Lidar</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIDAR_MAPPING__LIDAR = eINSTANCE.getLidarMapping_Lidar();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIDAR_MAPPING__APPLICATION = eINSTANCE.getLidarMapping_Application();

		/**
		 * The meta object literal for the '{@link autoDesigner1.impl.CamMappingImpl <em>Cam Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see autoDesigner1.impl.CamMappingImpl
		 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getCamMapping()
		 * @generated
		 */
		EClass CAM_MAPPING = eINSTANCE.getCamMapping();

		/**
		 * The meta object literal for the '<em><b>Camera</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAM_MAPPING__CAMERA = eINSTANCE.getCamMapping_Camera();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAM_MAPPING__APPLICATION = eINSTANCE.getCamMapping_Application();

		/**
		 * The meta object literal for the '{@link autoDesigner1.Link_Type <em>Link Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see autoDesigner1.Link_Type
		 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getLink_Type()
		 * @generated
		 */
		EEnum LINK_TYPE = eINSTANCE.getLink_Type();

		/**
		 * The meta object literal for the '{@link autoDesigner1.Optimization_Goal <em>Optimization Goal</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see autoDesigner1.Optimization_Goal
		 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getOptimization_Goal()
		 * @generated
		 */
		EEnum OPTIMIZATION_GOAL = eINSTANCE.getOptimization_Goal();

		/**
		 * The meta object literal for the '{@link autoDesigner1.Node_type <em>Node type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see autoDesigner1.Node_type
		 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getNode_type()
		 * @generated
		 */
		EEnum NODE_TYPE = eINSTANCE.getNode_type();

		/**
		 * The meta object literal for the '{@link autoDesigner1.DDRType <em>DDR Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see autoDesigner1.DDRType
		 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getDDRType()
		 * @generated
		 */
		EEnum DDR_TYPE = eINSTANCE.getDDRType();

		/**
		 * The meta object literal for the '{@link autoDesigner1.Asil_Level <em>Asil Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see autoDesigner1.Asil_Level
		 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getAsil_Level()
		 * @generated
		 */
		EEnum ASIL_LEVEL = eINSTANCE.getAsil_Level();

		/**
		 * The meta object literal for the '<em>GRBRS</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gurobi.GRBVar
		 * @see autoDesigner1.impl.AutoDesigner1PackageImpl#getGRBRS()
		 * @generated
		 */
		EDataType GRBRS = eINSTANCE.getGRBRS();

	}

} //AutoDesigner1Package
