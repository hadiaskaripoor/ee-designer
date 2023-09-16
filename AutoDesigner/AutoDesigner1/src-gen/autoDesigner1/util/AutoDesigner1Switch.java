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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see autoDesigner1.AutoDesigner1Package
 * @generated
 */
public class AutoDesigner1Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AutoDesigner1Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutoDesigner1Switch() {
		if (modelPackage == null) {
			modelPackage = AutoDesigner1Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case AutoDesigner1Package.VEHICLE_TOPOLOGY: {
			VehicleTopology vehicleTopology = (VehicleTopology) theEObject;
			T result = caseVehicleTopology(vehicleTopology);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AutoDesigner1Package.APPLICATION: {
			Application application = (Application) theEObject;
			T result = caseApplication(application);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AutoDesigner1Package.MAPPING: {
			Mapping mapping = (Mapping) theEObject;
			T result = caseMapping(mapping);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AutoDesigner1Package.TASK: {
			Task task = (Task) theEObject;
			T result = caseTask(task);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AutoDesigner1Package.LINK: {
			Link link = (Link) theEObject;
			T result = caseLink(link);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AutoDesigner1Package.DATA_IN: {
			Data_In data_In = (Data_In) theEObject;
			T result = caseData_In(data_In);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AutoDesigner1Package.DATA: {
			Data data = (Data) theEObject;
			T result = caseData(data);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AutoDesigner1Package.NODE: {
			Node node = (Node) theEObject;
			T result = caseNode(node);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AutoDesigner1Package.DATA_OUT: {
			Data_Out data_Out = (Data_Out) theEObject;
			T result = caseData_Out(data_Out);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AutoDesigner1Package.PROCESS: {
			autoDesigner1.Process process = (autoDesigner1.Process) theEObject;
			T result = caseProcess(process);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AutoDesigner1Package.EED: {
			EED eed = (EED) theEObject;
			T result = caseEED(eed);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AutoDesigner1Package.ECU: {
			ECU ecu = (ECU) theEObject;
			T result = caseECU(ecu);
			if (result == null)
				result = caseNode(ecu);
			if (result == null)
				result = caseControllNode(ecu);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AutoDesigner1Package.HPCU: {
			HPCU hpcu = (HPCU) theEObject;
			T result = caseHPCU(hpcu);
			if (result == null)
				result = caseNode(hpcu);
			if (result == null)
				result = caseControllNode(hpcu);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AutoDesigner1Package.NETWORK_SWITCH: {
			NetworkSwitch networkSwitch = (NetworkSwitch) theEObject;
			T result = caseNetworkSwitch(networkSwitch);
			if (result == null)
				result = caseNode(networkSwitch);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AutoDesigner1Package.GATEWAY: {
			Gateway gateway = (Gateway) theEObject;
			T result = caseGateway(gateway);
			if (result == null)
				result = caseNode(gateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AutoDesigner1Package.SETTINGS: {
			Settings settings = (Settings) theEObject;
			T result = caseSettings(settings);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AutoDesigner1Package.ROUTE: {
			Route route = (Route) theEObject;
			T result = caseRoute(route);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AutoDesigner1Package.LIN: {
			L_In l_In = (L_In) theEObject;
			T result = caseL_In(l_In);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AutoDesigner1Package.LOUT: {
			L_Out l_Out = (L_Out) theEObject;
			T result = caseL_Out(l_Out);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AutoDesigner1Package.ORDER: {
			Order order = (Order) theEObject;
			T result = caseOrder(order);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AutoDesigner1Package.GPU: {
			GPU gpu = (GPU) theEObject;
			T result = caseGPU(gpu);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AutoDesigner1Package.MEMORY: {
			Memory memory = (Memory) theEObject;
			T result = caseMemory(memory);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AutoDesigner1Package.PROCESSOR: {
			Processor processor = (Processor) theEObject;
			T result = caseProcessor(processor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AutoDesigner1Package.CORE: {
			Core core = (Core) theEObject;
			T result = caseCore(core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AutoDesigner1Package.PARTITION: {
			Partition partition = (Partition) theEObject;
			T result = casePartition(partition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AutoDesigner1Package.ETHERNET: {
			Ethernet ethernet = (Ethernet) theEObject;
			T result = caseEthernet(ethernet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AutoDesigner1Package.USB: {
			USB usb = (USB) theEObject;
			T result = caseUSB(usb);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AutoDesigner1Package.CACHE: {
			Cache cache = (Cache) theEObject;
			T result = caseCache(cache);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AutoDesigner1Package.LIDAR: {
			Lidar lidar = (Lidar) theEObject;
			T result = caseLidar(lidar);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AutoDesigner1Package.CAMERA: {
			Camera camera = (Camera) theEObject;
			T result = caseCamera(camera);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AutoDesigner1Package.CONTROLL_NODE: {
			ControllNode controllNode = (ControllNode) theEObject;
			T result = caseControllNode(controllNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AutoDesigner1Package.USER_CREATED_TASK: {
			UserCreatedTask userCreatedTask = (UserCreatedTask) theEObject;
			T result = caseUserCreatedTask(userCreatedTask);
			if (result == null)
				result = caseTask(userCreatedTask);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AutoDesigner1Package.LIDAR_MAPPING: {
			LidarMapping lidarMapping = (LidarMapping) theEObject;
			T result = caseLidarMapping(lidarMapping);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AutoDesigner1Package.CAM_MAPPING: {
			CamMapping camMapping = (CamMapping) theEObject;
			T result = caseCamMapping(camMapping);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vehicle Topology</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vehicle Topology</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVehicleTopology(VehicleTopology object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplication(Application object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapping(Mapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data In</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data In</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseData_In(Data_In object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseData(Data object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Out</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Out</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseData_Out(Data_Out object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcess(autoDesigner1.Process object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EED</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EED</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEED(EED object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ECU</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ECU</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseECU(ECU object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HPCU</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HPCU</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHPCU(HPCU object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Switch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkSwitch(NetworkSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGateway(Gateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Settings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Settings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSettings(Settings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Route</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Route</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoute(Route object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LIn</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LIn</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseL_In(L_In object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LOut</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LOut</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseL_Out(L_Out object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrder(Order object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GPU</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GPU</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGPU(GPU object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemory(Memory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessor(Processor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCore(Core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartition(Partition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ethernet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ethernet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEthernet(Ethernet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>USB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>USB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUSB(USB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cache</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cache</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCache(Cache object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lidar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lidar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLidar(Lidar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Camera</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Camera</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCamera(Camera object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controll Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controll Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControllNode(ControllNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Created Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Created Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserCreatedTask(UserCreatedTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lidar Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lidar Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLidarMapping(LidarMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cam Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cam Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCamMapping(CamMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AutoDesigner1Switch
