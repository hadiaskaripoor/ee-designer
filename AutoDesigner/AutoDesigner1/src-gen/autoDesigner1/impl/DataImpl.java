/**
 */
package autoDesigner1.impl;

import autoDesigner1.AutoDesigner1Package;
import autoDesigner1.Data;
import autoDesigner1.Data_In;
import autoDesigner1.Data_Out;
import autoDesigner1.Task;

import autoDesigner1.UserCreatedTask;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link autoDesigner1.impl.DataImpl#getName <em>Name</em>}</li>
 *   <li>{@link autoDesigner1.impl.DataImpl#getSentby <em>Sentby</em>}</li>
 *   <li>{@link autoDesigner1.impl.DataImpl#getReceivedby <em>Receivedby</em>}</li>
 *   <li>{@link autoDesigner1.impl.DataImpl#getD_in <em>Din</em>}</li>
 *   <li>{@link autoDesigner1.impl.DataImpl#getD_out <em>Dout</em>}</li>
 *   <li>{@link autoDesigner1.impl.DataImpl#getTask <em>Task</em>}</li>
 *   <li>{@link autoDesigner1.impl.DataImpl#getId <em>Id</em>}</li>
 *   <li>{@link autoDesigner1.impl.DataImpl#getUsercreatedtask <em>Usercreatedtask</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataImpl extends MinimalEObjectImpl.Container implements Data {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSentby() <em>Sentby</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSentby()
	 * @generated
	 * @ordered
	 */
	protected autoDesigner1.Process sentby;

	/**
	 * The cached value of the '{@link #getReceivedby() <em>Receivedby</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivedby()
	 * @generated
	 * @ordered
	 */
	protected EList<autoDesigner1.Process> receivedby;

	/**
	 * The cached value of the '{@link #getD_in() <em>Din</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD_in()
	 * @generated
	 * @ordered
	 */
	protected EList<Data_In> d_in;

	/**
	 * The cached value of the '{@link #getD_out() <em>Dout</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD_out()
	 * @generated
	 * @ordered
	 */
	protected EList<Data_Out> d_out;

	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> task;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = "0";

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUsercreatedtask() <em>Usercreatedtask</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsercreatedtask()
	 * @generated
	 * @ordered
	 */
	protected UserCreatedTask usercreatedtask;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected DataImpl() {
		super();
		//Amir added
		this.id = (EcoreUtil.generateUUID());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AutoDesigner1Package.Literals.DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.DATA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public autoDesigner1.Process getSentby() {
		if (sentby != null && sentby.eIsProxy()) {
			InternalEObject oldSentby = (InternalEObject) sentby;
			sentby = (autoDesigner1.Process) eResolveProxy(oldSentby);
			if (sentby != oldSentby) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AutoDesigner1Package.DATA__SENTBY,
							oldSentby, sentby));
			}
		}
		return sentby;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public autoDesigner1.Process basicGetSentby() {
		return sentby;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSentby(autoDesigner1.Process newSentby) {
		autoDesigner1.Process oldSentby = sentby;
		sentby = newSentby;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.DATA__SENTBY, oldSentby,
					sentby));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<autoDesigner1.Process> getReceivedby() {
		if (receivedby == null) {
			receivedby = new EObjectResolvingEList<autoDesigner1.Process>(autoDesigner1.Process.class, this,
					AutoDesigner1Package.DATA__RECEIVEDBY);
		}
		return receivedby;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data_In> getD_in() {
		if (d_in == null) {
			d_in = new EObjectResolvingEList<Data_In>(Data_In.class, this, AutoDesigner1Package.DATA__DIN);
		}
		return d_in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data_Out> getD_out() {
		if (d_out == null) {
			d_out = new EObjectResolvingEList<Data_Out>(Data_Out.class, this, AutoDesigner1Package.DATA__DOUT);
		}
		return d_out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTask() {
		if (task == null) {
			task = new EObjectResolvingEList<Task>(Task.class, this, AutoDesigner1Package.DATA__TASK);
		}
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.DATA__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserCreatedTask getUsercreatedtask() {
		return usercreatedtask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsercreatedtask(UserCreatedTask newUsercreatedtask, NotificationChain msgs) {
		UserCreatedTask oldUsercreatedtask = usercreatedtask;
		usercreatedtask = newUsercreatedtask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AutoDesigner1Package.DATA__USERCREATEDTASK, oldUsercreatedtask, newUsercreatedtask);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsercreatedtask(UserCreatedTask newUsercreatedtask) {
		if (newUsercreatedtask != usercreatedtask) {
			NotificationChain msgs = null;
			if (usercreatedtask != null)
				msgs = ((InternalEObject) usercreatedtask).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - AutoDesigner1Package.DATA__USERCREATEDTASK, null, msgs);
			if (newUsercreatedtask != null)
				msgs = ((InternalEObject) newUsercreatedtask).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - AutoDesigner1Package.DATA__USERCREATEDTASK, null, msgs);
			msgs = basicSetUsercreatedtask(newUsercreatedtask, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.DATA__USERCREATEDTASK,
					newUsercreatedtask, newUsercreatedtask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AutoDesigner1Package.DATA__USERCREATEDTASK:
			return basicSetUsercreatedtask(null, msgs);
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
		case AutoDesigner1Package.DATA__NAME:
			return getName();
		case AutoDesigner1Package.DATA__SENTBY:
			if (resolve)
				return getSentby();
			return basicGetSentby();
		case AutoDesigner1Package.DATA__RECEIVEDBY:
			return getReceivedby();
		case AutoDesigner1Package.DATA__DIN:
			return getD_in();
		case AutoDesigner1Package.DATA__DOUT:
			return getD_out();
		case AutoDesigner1Package.DATA__TASK:
			return getTask();
		case AutoDesigner1Package.DATA__ID:
			return getId();
		case AutoDesigner1Package.DATA__USERCREATEDTASK:
			return getUsercreatedtask();
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
		case AutoDesigner1Package.DATA__NAME:
			setName((String) newValue);
			return;
		case AutoDesigner1Package.DATA__SENTBY:
			setSentby((autoDesigner1.Process) newValue);
			return;
		case AutoDesigner1Package.DATA__RECEIVEDBY:
			getReceivedby().clear();
			getReceivedby().addAll((Collection<? extends autoDesigner1.Process>) newValue);
			return;
		case AutoDesigner1Package.DATA__DIN:
			getD_in().clear();
			getD_in().addAll((Collection<? extends Data_In>) newValue);
			return;
		case AutoDesigner1Package.DATA__DOUT:
			getD_out().clear();
			getD_out().addAll((Collection<? extends Data_Out>) newValue);
			return;
		case AutoDesigner1Package.DATA__TASK:
			getTask().clear();
			getTask().addAll((Collection<? extends Task>) newValue);
			return;
		case AutoDesigner1Package.DATA__ID:
			setId((String) newValue);
			return;
		case AutoDesigner1Package.DATA__USERCREATEDTASK:
			setUsercreatedtask((UserCreatedTask) newValue);
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
		case AutoDesigner1Package.DATA__NAME:
			setName(NAME_EDEFAULT);
			return;
		case AutoDesigner1Package.DATA__SENTBY:
			setSentby((autoDesigner1.Process) null);
			return;
		case AutoDesigner1Package.DATA__RECEIVEDBY:
			getReceivedby().clear();
			return;
		case AutoDesigner1Package.DATA__DIN:
			getD_in().clear();
			return;
		case AutoDesigner1Package.DATA__DOUT:
			getD_out().clear();
			return;
		case AutoDesigner1Package.DATA__TASK:
			getTask().clear();
			return;
		case AutoDesigner1Package.DATA__ID:
			setId(ID_EDEFAULT);
			return;
		case AutoDesigner1Package.DATA__USERCREATEDTASK:
			setUsercreatedtask((UserCreatedTask) null);
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
		case AutoDesigner1Package.DATA__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case AutoDesigner1Package.DATA__SENTBY:
			return sentby != null;
		case AutoDesigner1Package.DATA__RECEIVEDBY:
			return receivedby != null && !receivedby.isEmpty();
		case AutoDesigner1Package.DATA__DIN:
			return d_in != null && !d_in.isEmpty();
		case AutoDesigner1Package.DATA__DOUT:
			return d_out != null && !d_out.isEmpty();
		case AutoDesigner1Package.DATA__TASK:
			return task != null && !task.isEmpty();
		case AutoDesigner1Package.DATA__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case AutoDesigner1Package.DATA__USERCREATEDTASK:
			return usercreatedtask != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //DataImpl
