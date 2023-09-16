/**
 */
package autoDesigner1.impl;

import autoDesigner1.Application;
import autoDesigner1.AutoDesigner1Package;
import autoDesigner1.Data;
import autoDesigner1.Data_In;
import autoDesigner1.Data_Out;
import autoDesigner1.Link;
import autoDesigner1.Mapping;
import autoDesigner1.Node;
import autoDesigner1.Task;
import autoDesigner1.VehicleTopology;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vehicle Topology</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link autoDesigner1.impl.VehicleTopologyImpl#getMapping <em>Mapping</em>}</li>
 *   <li>{@link autoDesigner1.impl.VehicleTopologyImpl#getNode <em>Node</em>}</li>
 *   <li>{@link autoDesigner1.impl.VehicleTopologyImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link autoDesigner1.impl.VehicleTopologyImpl#getLink <em>Link</em>}</li>
 *   <li>{@link autoDesigner1.impl.VehicleTopologyImpl#getData <em>Data</em>}</li>
 *   <li>{@link autoDesigner1.impl.VehicleTopologyImpl#getData_in <em>Data in</em>}</li>
 *   <li>{@link autoDesigner1.impl.VehicleTopologyImpl#getData_out <em>Data out</em>}</li>
 *   <li>{@link autoDesigner1.impl.VehicleTopologyImpl#getTask <em>Task</em>}</li>
 *   <li>{@link autoDesigner1.impl.VehicleTopologyImpl#getProcess <em>Process</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VehicleTopologyImpl extends MinimalEObjectImpl.Container implements VehicleTopology {
	/**
	 * The cached value of the '{@link #getMapping() <em>Mapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<Mapping> mapping;

	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> node;

	/**
	 * The cached value of the '{@link #getApplication() <em>Application</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplication()
	 * @generated
	 * @ordered
	 */
	protected EList<Application> application;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> link;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> data;

	/**
	 * The cached value of the '{@link #getData_in() <em>Data in</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData_in()
	 * @generated
	 * @ordered
	 */
	protected EList<Data_In> data_in;

	/**
	 * The cached value of the '{@link #getData_out() <em>Data out</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData_out()
	 * @generated
	 * @ordered
	 */
	protected EList<Data_Out> data_out;

	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> task;

	/**
	 * The cached value of the '{@link #getProcess() <em>Process</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcess()
	 * @generated
	 * @ordered
	 */
	protected EList<autoDesigner1.Process> process;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VehicleTopologyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AutoDesigner1Package.Literals.VEHICLE_TOPOLOGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mapping> getMapping() {
		if (mapping == null) {
			mapping = new EObjectContainmentEList<Mapping>(Mapping.class, this,
					AutoDesigner1Package.VEHICLE_TOPOLOGY__MAPPING);
		}
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getNode() {
		if (node == null) {
			node = new EObjectContainmentEList<Node>(Node.class, this, AutoDesigner1Package.VEHICLE_TOPOLOGY__NODE);
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Application> getApplication() {
		if (application == null) {
			application = new EObjectContainmentEList<Application>(Application.class, this,
					AutoDesigner1Package.VEHICLE_TOPOLOGY__APPLICATION);
		}
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLink() {
		if (link == null) {
			link = new EObjectContainmentEList<Link>(Link.class, this, AutoDesigner1Package.VEHICLE_TOPOLOGY__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data> getData() {
		if (data == null) {
			data = new EObjectContainmentEList<Data>(Data.class, this, AutoDesigner1Package.VEHICLE_TOPOLOGY__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data_In> getData_in() {
		if (data_in == null) {
			data_in = new EObjectContainmentEList<Data_In>(Data_In.class, this,
					AutoDesigner1Package.VEHICLE_TOPOLOGY__DATA_IN);
		}
		return data_in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data_Out> getData_out() {
		if (data_out == null) {
			data_out = new EObjectContainmentEList<Data_Out>(Data_Out.class, this,
					AutoDesigner1Package.VEHICLE_TOPOLOGY__DATA_OUT);
		}
		return data_out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTask() {
		if (task == null) {
			task = new EObjectContainmentEList<Task>(Task.class, this, AutoDesigner1Package.VEHICLE_TOPOLOGY__TASK);
		}
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<autoDesigner1.Process> getProcess() {
		if (process == null) {
			process = new EObjectContainmentEList<autoDesigner1.Process>(autoDesigner1.Process.class, this,
					AutoDesigner1Package.VEHICLE_TOPOLOGY__PROCESS);
		}
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AutoDesigner1Package.VEHICLE_TOPOLOGY__MAPPING:
			return ((InternalEList<?>) getMapping()).basicRemove(otherEnd, msgs);
		case AutoDesigner1Package.VEHICLE_TOPOLOGY__NODE:
			return ((InternalEList<?>) getNode()).basicRemove(otherEnd, msgs);
		case AutoDesigner1Package.VEHICLE_TOPOLOGY__APPLICATION:
			return ((InternalEList<?>) getApplication()).basicRemove(otherEnd, msgs);
		case AutoDesigner1Package.VEHICLE_TOPOLOGY__LINK:
			return ((InternalEList<?>) getLink()).basicRemove(otherEnd, msgs);
		case AutoDesigner1Package.VEHICLE_TOPOLOGY__DATA:
			return ((InternalEList<?>) getData()).basicRemove(otherEnd, msgs);
		case AutoDesigner1Package.VEHICLE_TOPOLOGY__DATA_IN:
			return ((InternalEList<?>) getData_in()).basicRemove(otherEnd, msgs);
		case AutoDesigner1Package.VEHICLE_TOPOLOGY__DATA_OUT:
			return ((InternalEList<?>) getData_out()).basicRemove(otherEnd, msgs);
		case AutoDesigner1Package.VEHICLE_TOPOLOGY__TASK:
			return ((InternalEList<?>) getTask()).basicRemove(otherEnd, msgs);
		case AutoDesigner1Package.VEHICLE_TOPOLOGY__PROCESS:
			return ((InternalEList<?>) getProcess()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AutoDesigner1Package.VEHICLE_TOPOLOGY__MAPPING:
			return getMapping();
		case AutoDesigner1Package.VEHICLE_TOPOLOGY__NODE:
			return getNode();
		case AutoDesigner1Package.VEHICLE_TOPOLOGY__APPLICATION:
			return getApplication();
		case AutoDesigner1Package.VEHICLE_TOPOLOGY__LINK:
			return getLink();
		case AutoDesigner1Package.VEHICLE_TOPOLOGY__DATA:
			return getData();
		case AutoDesigner1Package.VEHICLE_TOPOLOGY__DATA_IN:
			return getData_in();
		case AutoDesigner1Package.VEHICLE_TOPOLOGY__DATA_OUT:
			return getData_out();
		case AutoDesigner1Package.VEHICLE_TOPOLOGY__TASK:
			return getTask();
		case AutoDesigner1Package.VEHICLE_TOPOLOGY__PROCESS:
			return getProcess();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AutoDesigner1Package.VEHICLE_TOPOLOGY__MAPPING:
			getMapping().clear();
			getMapping().addAll((Collection<? extends Mapping>) newValue);
			return;
		case AutoDesigner1Package.VEHICLE_TOPOLOGY__NODE:
			getNode().clear();
			getNode().addAll((Collection<? extends Node>) newValue);
			return;
		case AutoDesigner1Package.VEHICLE_TOPOLOGY__APPLICATION:
			getApplication().clear();
			getApplication().addAll((Collection<? extends Application>) newValue);
			return;
		case AutoDesigner1Package.VEHICLE_TOPOLOGY__LINK:
			getLink().clear();
			getLink().addAll((Collection<? extends Link>) newValue);
			return;
		case AutoDesigner1Package.VEHICLE_TOPOLOGY__DATA:
			getData().clear();
			getData().addAll((Collection<? extends Data>) newValue);
			return;
		case AutoDesigner1Package.VEHICLE_TOPOLOGY__DATA_IN:
			getData_in().clear();
			getData_in().addAll((Collection<? extends Data_In>) newValue);
			return;
		case AutoDesigner1Package.VEHICLE_TOPOLOGY__DATA_OUT:
			getData_out().clear();
			getData_out().addAll((Collection<? extends Data_Out>) newValue);
			return;
		case AutoDesigner1Package.VEHICLE_TOPOLOGY__TASK:
			getTask().clear();
			getTask().addAll((Collection<? extends Task>) newValue);
			return;
		case AutoDesigner1Package.VEHICLE_TOPOLOGY__PROCESS:
			getProcess().clear();
			getProcess().addAll((Collection<? extends autoDesigner1.Process>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case AutoDesigner1Package.VEHICLE_TOPOLOGY__MAPPING:
			getMapping().clear();
			return;
		case AutoDesigner1Package.VEHICLE_TOPOLOGY__NODE:
			getNode().clear();
			return;
		case AutoDesigner1Package.VEHICLE_TOPOLOGY__APPLICATION:
			getApplication().clear();
			return;
		case AutoDesigner1Package.VEHICLE_TOPOLOGY__LINK:
			getLink().clear();
			return;
		case AutoDesigner1Package.VEHICLE_TOPOLOGY__DATA:
			getData().clear();
			return;
		case AutoDesigner1Package.VEHICLE_TOPOLOGY__DATA_IN:
			getData_in().clear();
			return;
		case AutoDesigner1Package.VEHICLE_TOPOLOGY__DATA_OUT:
			getData_out().clear();
			return;
		case AutoDesigner1Package.VEHICLE_TOPOLOGY__TASK:
			getTask().clear();
			return;
		case AutoDesigner1Package.VEHICLE_TOPOLOGY__PROCESS:
			getProcess().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case AutoDesigner1Package.VEHICLE_TOPOLOGY__MAPPING:
			return mapping != null && !mapping.isEmpty();
		case AutoDesigner1Package.VEHICLE_TOPOLOGY__NODE:
			return node != null && !node.isEmpty();
		case AutoDesigner1Package.VEHICLE_TOPOLOGY__APPLICATION:
			return application != null && !application.isEmpty();
		case AutoDesigner1Package.VEHICLE_TOPOLOGY__LINK:
			return link != null && !link.isEmpty();
		case AutoDesigner1Package.VEHICLE_TOPOLOGY__DATA:
			return data != null && !data.isEmpty();
		case AutoDesigner1Package.VEHICLE_TOPOLOGY__DATA_IN:
			return data_in != null && !data_in.isEmpty();
		case AutoDesigner1Package.VEHICLE_TOPOLOGY__DATA_OUT:
			return data_out != null && !data_out.isEmpty();
		case AutoDesigner1Package.VEHICLE_TOPOLOGY__TASK:
			return task != null && !task.isEmpty();
		case AutoDesigner1Package.VEHICLE_TOPOLOGY__PROCESS:
			return process != null && !process.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VehicleTopologyImpl
