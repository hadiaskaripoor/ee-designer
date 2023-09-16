/**
 */
package autoDesigner1.util;

import autoDesigner1.Application;
import autoDesigner1.AutoDesigner1Package;
import autoDesigner1.Cache;
import autoDesigner1.CamMapping;
import autoDesigner1.Camera;
import autoDesigner1.ControllNode;
import autoDesigner1.Core;
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
import autoDesigner1.Mapping;
import autoDesigner1.Memory;
import autoDesigner1.NetworkSwitch;
import autoDesigner1.Node;
import autoDesigner1.Order;
import autoDesigner1.Partition;
import autoDesigner1.Processor;
import autoDesigner1.Route;
import autoDesigner1.Settings;
import autoDesigner1.Task;
import autoDesigner1.USB;
import autoDesigner1.UserCreatedTask;
import autoDesigner1.VehicleTopology;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see autoDesigner1.AutoDesigner1Package
 * @generated
 */
public class AutoDesigner1AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AutoDesigner1Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutoDesigner1AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AutoDesigner1Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AutoDesigner1Switch<Adapter> modelSwitch = new AutoDesigner1Switch<Adapter>() {
		@Override
		public Adapter caseVehicleTopology(VehicleTopology object) {
			return createVehicleTopologyAdapter();
		}

		@Override
		public Adapter caseApplication(Application object) {
			return createApplicationAdapter();
		}

		@Override
		public Adapter caseMapping(Mapping object) {
			return createMappingAdapter();
		}

		@Override
		public Adapter caseTask(Task object) {
			return createTaskAdapter();
		}

		@Override
		public Adapter caseLink(Link object) {
			return createLinkAdapter();
		}

		@Override
		public Adapter caseData_In(Data_In object) {
			return createData_InAdapter();
		}

		@Override
		public Adapter caseData(Data object) {
			return createDataAdapter();
		}

		@Override
		public Adapter caseNode(Node object) {
			return createNodeAdapter();
		}

		@Override
		public Adapter caseData_Out(Data_Out object) {
			return createData_OutAdapter();
		}

		@Override
		public Adapter caseProcess(autoDesigner1.Process object) {
			return createProcessAdapter();
		}

		@Override
		public Adapter caseEED(EED object) {
			return createEEDAdapter();
		}

		@Override
		public Adapter caseECU(ECU object) {
			return createECUAdapter();
		}

		@Override
		public Adapter caseHPCU(HPCU object) {
			return createHPCUAdapter();
		}

		@Override
		public Adapter caseNetworkSwitch(NetworkSwitch object) {
			return createNetworkSwitchAdapter();
		}

		@Override
		public Adapter caseGateway(Gateway object) {
			return createGatewayAdapter();
		}

		@Override
		public Adapter caseSettings(Settings object) {
			return createSettingsAdapter();
		}

		@Override
		public Adapter caseRoute(Route object) {
			return createRouteAdapter();
		}

		@Override
		public Adapter caseL_In(L_In object) {
			return createL_InAdapter();
		}

		@Override
		public Adapter caseL_Out(L_Out object) {
			return createL_OutAdapter();
		}

		@Override
		public Adapter caseOrder(Order object) {
			return createOrderAdapter();
		}

		@Override
		public Adapter caseGPU(GPU object) {
			return createGPUAdapter();
		}

		@Override
		public Adapter caseMemory(Memory object) {
			return createMemoryAdapter();
		}

		@Override
		public Adapter caseProcessor(Processor object) {
			return createProcessorAdapter();
		}

		@Override
		public Adapter caseCore(Core object) {
			return createCoreAdapter();
		}

		@Override
		public Adapter casePartition(Partition object) {
			return createPartitionAdapter();
		}

		@Override
		public Adapter caseEthernet(Ethernet object) {
			return createEthernetAdapter();
		}

		@Override
		public Adapter caseUSB(USB object) {
			return createUSBAdapter();
		}

		@Override
		public Adapter caseCache(Cache object) {
			return createCacheAdapter();
		}

		@Override
		public Adapter caseLidar(Lidar object) {
			return createLidarAdapter();
		}

		@Override
		public Adapter caseCamera(Camera object) {
			return createCameraAdapter();
		}

		@Override
		public Adapter caseControllNode(ControllNode object) {
			return createControllNodeAdapter();
		}

		@Override
		public Adapter caseUserCreatedTask(UserCreatedTask object) {
			return createUserCreatedTaskAdapter();
		}

		@Override
		public Adapter caseLidarMapping(LidarMapping object) {
			return createLidarMappingAdapter();
		}

		@Override
		public Adapter caseCamMapping(CamMapping object) {
			return createCamMappingAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link autoDesigner1.VehicleTopology <em>Vehicle Topology</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see autoDesigner1.VehicleTopology
	 * @generated
	 */
	public Adapter createVehicleTopologyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link autoDesigner1.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see autoDesigner1.Application
	 * @generated
	 */
	public Adapter createApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link autoDesigner1.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see autoDesigner1.Mapping
	 * @generated
	 */
	public Adapter createMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link autoDesigner1.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see autoDesigner1.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link autoDesigner1.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see autoDesigner1.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link autoDesigner1.Data_In <em>Data In</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see autoDesigner1.Data_In
	 * @generated
	 */
	public Adapter createData_InAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link autoDesigner1.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see autoDesigner1.Data
	 * @generated
	 */
	public Adapter createDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link autoDesigner1.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see autoDesigner1.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link autoDesigner1.Data_Out <em>Data Out</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see autoDesigner1.Data_Out
	 * @generated
	 */
	public Adapter createData_OutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link autoDesigner1.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see autoDesigner1.Process
	 * @generated
	 */
	public Adapter createProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link autoDesigner1.EED <em>EED</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see autoDesigner1.EED
	 * @generated
	 */
	public Adapter createEEDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link autoDesigner1.ECU <em>ECU</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see autoDesigner1.ECU
	 * @generated
	 */
	public Adapter createECUAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link autoDesigner1.HPCU <em>HPCU</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see autoDesigner1.HPCU
	 * @generated
	 */
	public Adapter createHPCUAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link autoDesigner1.NetworkSwitch <em>Network Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see autoDesigner1.NetworkSwitch
	 * @generated
	 */
	public Adapter createNetworkSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link autoDesigner1.Gateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see autoDesigner1.Gateway
	 * @generated
	 */
	public Adapter createGatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link autoDesigner1.Settings <em>Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see autoDesigner1.Settings
	 * @generated
	 */
	public Adapter createSettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link autoDesigner1.Route <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see autoDesigner1.Route
	 * @generated
	 */
	public Adapter createRouteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link autoDesigner1.L_In <em>LIn</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see autoDesigner1.L_In
	 * @generated
	 */
	public Adapter createL_InAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link autoDesigner1.L_Out <em>LOut</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see autoDesigner1.L_Out
	 * @generated
	 */
	public Adapter createL_OutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link autoDesigner1.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see autoDesigner1.Order
	 * @generated
	 */
	public Adapter createOrderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link autoDesigner1.GPU <em>GPU</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see autoDesigner1.GPU
	 * @generated
	 */
	public Adapter createGPUAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link autoDesigner1.Memory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see autoDesigner1.Memory
	 * @generated
	 */
	public Adapter createMemoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link autoDesigner1.Processor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see autoDesigner1.Processor
	 * @generated
	 */
	public Adapter createProcessorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link autoDesigner1.Core <em>Core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see autoDesigner1.Core
	 * @generated
	 */
	public Adapter createCoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link autoDesigner1.Partition <em>Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see autoDesigner1.Partition
	 * @generated
	 */
	public Adapter createPartitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link autoDesigner1.Ethernet <em>Ethernet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see autoDesigner1.Ethernet
	 * @generated
	 */
	public Adapter createEthernetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link autoDesigner1.USB <em>USB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see autoDesigner1.USB
	 * @generated
	 */
	public Adapter createUSBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link autoDesigner1.Cache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see autoDesigner1.Cache
	 * @generated
	 */
	public Adapter createCacheAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link autoDesigner1.Lidar <em>Lidar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see autoDesigner1.Lidar
	 * @generated
	 */
	public Adapter createLidarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link autoDesigner1.Camera <em>Camera</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see autoDesigner1.Camera
	 * @generated
	 */
	public Adapter createCameraAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link autoDesigner1.ControllNode <em>Controll Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see autoDesigner1.ControllNode
	 * @generated
	 */
	public Adapter createControllNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link autoDesigner1.UserCreatedTask <em>User Created Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see autoDesigner1.UserCreatedTask
	 * @generated
	 */
	public Adapter createUserCreatedTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link autoDesigner1.LidarMapping <em>Lidar Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see autoDesigner1.LidarMapping
	 * @generated
	 */
	public Adapter createLidarMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link autoDesigner1.CamMapping <em>Cam Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see autoDesigner1.CamMapping
	 * @generated
	 */
	public Adapter createCamMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AutoDesigner1AdapterFactory
