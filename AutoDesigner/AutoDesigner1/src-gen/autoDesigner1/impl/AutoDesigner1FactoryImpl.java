/**
 */
package autoDesigner1.impl;

import autoDesigner1.Application;
import autoDesigner1.Asil_Level;
import autoDesigner1.AutoDesigner1Factory;
import autoDesigner1.AutoDesigner1Package;
import autoDesigner1.Cache;
import autoDesigner1.CamMapping;
import autoDesigner1.Camera;
import autoDesigner1.ControllNode;
import autoDesigner1.Core;
import autoDesigner1.DDRType;
import autoDesigner1.Data;
import autoDesigner1.Data_In;
import autoDesigner1.Data_Out;
import autoDesigner1.ECU;
import autoDesigner1.EED;
import autoDesigner1.Ethernet;
import autoDesigner1.GPU;
import autoDesigner1.Gateway;
import autoDesigner1.HPCU;
import autoDesigner1.L_In;
import autoDesigner1.L_Out;
import autoDesigner1.Lidar;
import autoDesigner1.LidarMapping;
import autoDesigner1.Link;
import autoDesigner1.Link_Type;
import autoDesigner1.Mapping;
import autoDesigner1.Memory;
import autoDesigner1.NetworkSwitch;
import autoDesigner1.Node;
import autoDesigner1.Node_type;
import autoDesigner1.Optimization_Goal;
import autoDesigner1.Order;
import autoDesigner1.Partition;
import autoDesigner1.Processor;
import autoDesigner1.Route;
import autoDesigner1.Settings;
import autoDesigner1.Task;
import autoDesigner1.USB;
import autoDesigner1.UserCreatedTask;
import autoDesigner1.VehicleTopology;
import gurobi.GRBVar;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AutoDesigner1FactoryImpl extends EFactoryImpl implements AutoDesigner1Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AutoDesigner1Factory init() {
		try {
			AutoDesigner1Factory theAutoDesigner1Factory = (AutoDesigner1Factory) EPackage.Registry.INSTANCE
					.getEFactory(AutoDesigner1Package.eNS_URI);
			if (theAutoDesigner1Factory != null) {
				return theAutoDesigner1Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AutoDesigner1FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutoDesigner1FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case AutoDesigner1Package.VEHICLE_TOPOLOGY:
			return createVehicleTopology();
		case AutoDesigner1Package.APPLICATION:
			return createApplication();
		case AutoDesigner1Package.MAPPING:
			return createMapping();
		case AutoDesigner1Package.TASK:
			return createTask();
		case AutoDesigner1Package.LINK:
			return createLink();
		case AutoDesigner1Package.DATA_IN:
			return createData_In();
		case AutoDesigner1Package.DATA:
			return createData();
		case AutoDesigner1Package.NODE:
			return createNode();
		case AutoDesigner1Package.DATA_OUT:
			return createData_Out();
		case AutoDesigner1Package.PROCESS:
			return createProcess();
		case AutoDesigner1Package.EED:
			return createEED();
		case AutoDesigner1Package.ECU:
			return createECU();
		case AutoDesigner1Package.HPCU:
			return createHPCU();
		case AutoDesigner1Package.NETWORK_SWITCH:
			return createNetworkSwitch();
		case AutoDesigner1Package.GATEWAY:
			return createGateway();
		case AutoDesigner1Package.SETTINGS:
			return createSettings();
		case AutoDesigner1Package.ROUTE:
			return createRoute();
		case AutoDesigner1Package.LIN:
			return createL_In();
		case AutoDesigner1Package.LOUT:
			return createL_Out();
		case AutoDesigner1Package.ORDER:
			return createOrder();
		case AutoDesigner1Package.GPU:
			return createGPU();
		case AutoDesigner1Package.MEMORY:
			return createMemory();
		case AutoDesigner1Package.PROCESSOR:
			return createProcessor();
		case AutoDesigner1Package.CORE:
			return createCore();
		case AutoDesigner1Package.PARTITION:
			return createPartition();
		case AutoDesigner1Package.ETHERNET:
			return createEthernet();
		case AutoDesigner1Package.USB:
			return createUSB();
		case AutoDesigner1Package.CACHE:
			return createCache();
		case AutoDesigner1Package.LIDAR:
			return createLidar();
		case AutoDesigner1Package.CAMERA:
			return createCamera();
		case AutoDesigner1Package.CONTROLL_NODE:
			return createControllNode();
		case AutoDesigner1Package.USER_CREATED_TASK:
			return createUserCreatedTask();
		case AutoDesigner1Package.LIDAR_MAPPING:
			return createLidarMapping();
		case AutoDesigner1Package.CAM_MAPPING:
			return createCamMapping();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case AutoDesigner1Package.LINK_TYPE:
			return createLink_TypeFromString(eDataType, initialValue);
		case AutoDesigner1Package.OPTIMIZATION_GOAL:
			return createOptimization_GoalFromString(eDataType, initialValue);
		case AutoDesigner1Package.NODE_TYPE:
			return createNode_typeFromString(eDataType, initialValue);
		case AutoDesigner1Package.DDR_TYPE:
			return createDDRTypeFromString(eDataType, initialValue);
		case AutoDesigner1Package.ASIL_LEVEL:
			return createAsil_LevelFromString(eDataType, initialValue);
		case AutoDesigner1Package.GRBRS:
			return createGRBRSFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case AutoDesigner1Package.LINK_TYPE:
			return convertLink_TypeToString(eDataType, instanceValue);
		case AutoDesigner1Package.OPTIMIZATION_GOAL:
			return convertOptimization_GoalToString(eDataType, instanceValue);
		case AutoDesigner1Package.NODE_TYPE:
			return convertNode_typeToString(eDataType, instanceValue);
		case AutoDesigner1Package.DDR_TYPE:
			return convertDDRTypeToString(eDataType, instanceValue);
		case AutoDesigner1Package.ASIL_LEVEL:
			return convertAsil_LevelToString(eDataType, instanceValue);
		case AutoDesigner1Package.GRBRS:
			return convertGRBRSToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehicleTopology createVehicleTopology() {
		VehicleTopologyImpl vehicleTopology = new VehicleTopologyImpl();
		return vehicleTopology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application createApplication() {
		ApplicationImpl application = new ApplicationImpl();
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mapping createMapping() {
		MappingImpl mapping = new MappingImpl();
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data_In createData_In() {
		Data_InImpl data_In = new Data_InImpl();
		return data_In;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data createData() {
		DataImpl data = new DataImpl();
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data_Out createData_Out() {
		Data_OutImpl data_Out = new Data_OutImpl();
		return data_Out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public autoDesigner1.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EED createEED() {
		EEDImpl eed = new EEDImpl();
		return eed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECU createECU() {
		ECUImpl ecu = new ECUImpl();
		return ecu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HPCU createHPCU() {
		HPCUImpl hpcu = new HPCUImpl();
		return hpcu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkSwitch createNetworkSwitch() {
		NetworkSwitchImpl networkSwitch = new NetworkSwitchImpl();
		return networkSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gateway createGateway() {
		GatewayImpl gateway = new GatewayImpl();
		return gateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Settings createSettings() {
		SettingsImpl settings = new SettingsImpl();
		return settings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Route createRoute() {
		RouteImpl route = new RouteImpl();
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public L_In createL_In() {
		L_InImpl l_In = new L_InImpl();
		return l_In;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public L_Out createL_Out() {
		L_OutImpl l_Out = new L_OutImpl();
		return l_Out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Order createOrder() {
		OrderImpl order = new OrderImpl();
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GPU createGPU() {
		GPUImpl gpu = new GPUImpl();
		return gpu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Memory createMemory() {
		MemoryImpl memory = new MemoryImpl();
		return memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Processor createProcessor() {
		ProcessorImpl processor = new ProcessorImpl();
		return processor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Core createCore() {
		CoreImpl core = new CoreImpl();
		return core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Partition createPartition() {
		PartitionImpl partition = new PartitionImpl();
		return partition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ethernet createEthernet() {
		EthernetImpl ethernet = new EthernetImpl();
		return ethernet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public USB createUSB() {
		USBImpl usb = new USBImpl();
		return usb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cache createCache() {
		CacheImpl cache = new CacheImpl();
		return cache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lidar createLidar() {
		LidarImpl lidar = new LidarImpl();
		return lidar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Camera createCamera() {
		CameraImpl camera = new CameraImpl();
		return camera;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllNode createControllNode() {
		ControllNodeImpl controllNode = new ControllNodeImpl();
		return controllNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserCreatedTask createUserCreatedTask() {
		UserCreatedTaskImpl userCreatedTask = new UserCreatedTaskImpl();
		return userCreatedTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LidarMapping createLidarMapping() {
		LidarMappingImpl lidarMapping = new LidarMappingImpl();
		return lidarMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CamMapping createCamMapping() {
		CamMappingImpl camMapping = new CamMappingImpl();
		return camMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link_Type createLink_TypeFromString(EDataType eDataType, String initialValue) {
		Link_Type result = Link_Type.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLink_TypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Optimization_Goal createOptimization_GoalFromString(EDataType eDataType, String initialValue) {
		Optimization_Goal result = Optimization_Goal.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOptimization_GoalToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node_type createNode_typeFromString(EDataType eDataType, String initialValue) {
		Node_type result = Node_type.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNode_typeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DDRType createDDRTypeFromString(EDataType eDataType, String initialValue) {
		DDRType result = DDRType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDDRTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asil_Level createAsil_LevelFromString(EDataType eDataType, String initialValue) {
		Asil_Level result = Asil_Level.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAsil_LevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GRBVar createGRBRSFromString(EDataType eDataType, String initialValue) {
		return (GRBVar) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGRBRSToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutoDesigner1Package getAutoDesigner1Package() {
		return (AutoDesigner1Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AutoDesigner1Package getPackage() {
		return AutoDesigner1Package.eINSTANCE;
	}

} //AutoDesigner1FactoryImpl
