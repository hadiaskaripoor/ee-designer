/**
 */
package autoDesigner1.impl;

import autoDesigner1.Application;
import autoDesigner1.AutoDesigner1Package;

import autoDesigner1.Data;
import gurobi.GRBVar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link autoDesigner1.impl.ProcessImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link autoDesigner1.impl.ProcessImpl#getName <em>Name</em>}</li>
 *   <li>{@link autoDesigner1.impl.ProcessImpl#getWcet <em>Wcet</em>}</li>
 *   <li>{@link autoDesigner1.impl.ProcessImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link autoDesigner1.impl.ProcessImpl#getStartingTime <em>Starting Time</em>}</li>
 *   <li>{@link autoDesigner1.impl.ProcessImpl#getRecieveData <em>Recieve Data</em>}</li>
 *   <li>{@link autoDesigner1.impl.ProcessImpl#getSendData <em>Send Data</em>}</li>
 *   <li>{@link autoDesigner1.impl.ProcessImpl#getStartingTimeVal <em>Starting Time Val</em>}</li>
 *   <li>{@link autoDesigner1.impl.ProcessImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessImpl extends MinimalEObjectImpl.Container implements autoDesigner1.Process {
	/**
	 * The cached value of the '{@link #getApplication() <em>Application</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplication()
	 * @generated
	 * @ordered
	 */
	protected Application application;

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
	 * The default value of the '{@link #getWcet() <em>Wcet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWcet()
	 * @generated
	 * @ordered
	 */
	protected static final double WCET_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWcet() <em>Wcet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWcet()
	 * @generated
	 * @ordered
	 */
	protected double wcet = WCET_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final int PERIOD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected int period = PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartingTime() <em>Starting Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingTime()
	 * @generated
	 * @ordered
	 */
	protected static final GRBVar STARTING_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartingTime() <em>Starting Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingTime()
	 * @generated
	 * @ordered
	 */
	protected GRBVar startingTime = STARTING_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRecieveData() <em>Recieve Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecieveData()
	 * @generated
	 * @ordered
	 */
	protected Data recieveData;

	/**
	 * The cached value of the '{@link #getSendData() <em>Send Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendData()
	 * @generated
	 * @ordered
	 */
	protected Data sendData;

	/**
	 * The default value of the '{@link #getStartingTimeVal() <em>Starting Time Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingTimeVal()
	 * @generated
	 * @ordered
	 */
	protected static final double STARTING_TIME_VAL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getStartingTimeVal() <em>Starting Time Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingTimeVal()
	 * @generated
	 * @ordered
	 */
	protected double startingTimeVal = STARTING_TIME_VAL_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected ProcessImpl() {
		super();
		this.id = (EcoreUtil.generateUUID());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AutoDesigner1Package.Literals.PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application getApplication() {
		if (application != null && application.eIsProxy()) {
			InternalEObject oldApplication = (InternalEObject) application;
			application = (Application) eResolveProxy(oldApplication);
			if (application != oldApplication) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AutoDesigner1Package.PROCESS__APPLICATION,
							oldApplication, application));
			}
		}
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application basicGetApplication() {
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplication(Application newApplication) {
		Application oldApplication = application;
		application = newApplication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.PROCESS__APPLICATION,
					oldApplication, application));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.PROCESS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWcet() {
		return wcet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWcet(double newWcet) {
		double oldWcet = wcet;
		wcet = newWcet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.PROCESS__WCET, oldWcet, wcet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(int newPeriod) {
		int oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.PROCESS__PERIOD, oldPeriod,
					period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GRBVar getStartingTime() {
		return startingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartingTime(GRBVar newStartingTime) {
		GRBVar oldStartingTime = startingTime;
		startingTime = newStartingTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.PROCESS__STARTING_TIME,
					oldStartingTime, startingTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data getRecieveData() {
		if (recieveData != null && recieveData.eIsProxy()) {
			InternalEObject oldRecieveData = (InternalEObject) recieveData;
			recieveData = (Data) eResolveProxy(oldRecieveData);
			if (recieveData != oldRecieveData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AutoDesigner1Package.PROCESS__RECIEVE_DATA, oldRecieveData, recieveData));
			}
		}
		return recieveData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data basicGetRecieveData() {
		return recieveData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecieveData(Data newRecieveData) {
		Data oldRecieveData = recieveData;
		recieveData = newRecieveData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.PROCESS__RECIEVE_DATA,
					oldRecieveData, recieveData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data getSendData() {
		if (sendData != null && sendData.eIsProxy()) {
			InternalEObject oldSendData = (InternalEObject) sendData;
			sendData = (Data) eResolveProxy(oldSendData);
			if (sendData != oldSendData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AutoDesigner1Package.PROCESS__SEND_DATA,
							oldSendData, sendData));
			}
		}
		return sendData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data basicGetSendData() {
		return sendData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendData(Data newSendData) {
		Data oldSendData = sendData;
		sendData = newSendData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.PROCESS__SEND_DATA, oldSendData,
					sendData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getStartingTimeVal() {
		return startingTimeVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartingTimeVal(double newStartingTimeVal) {
		double oldStartingTimeVal = startingTimeVal;
		startingTimeVal = newStartingTimeVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.PROCESS__STARTING_TIME_VAL,
					oldStartingTimeVal, startingTimeVal));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.PROCESS__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AutoDesigner1Package.PROCESS__APPLICATION:
			if (resolve)
				return getApplication();
			return basicGetApplication();
		case AutoDesigner1Package.PROCESS__NAME:
			return getName();
		case AutoDesigner1Package.PROCESS__WCET:
			return getWcet();
		case AutoDesigner1Package.PROCESS__PERIOD:
			return getPeriod();
		case AutoDesigner1Package.PROCESS__STARTING_TIME:
			return getStartingTime();
		case AutoDesigner1Package.PROCESS__RECIEVE_DATA:
			if (resolve)
				return getRecieveData();
			return basicGetRecieveData();
		case AutoDesigner1Package.PROCESS__SEND_DATA:
			if (resolve)
				return getSendData();
			return basicGetSendData();
		case AutoDesigner1Package.PROCESS__STARTING_TIME_VAL:
			return getStartingTimeVal();
		case AutoDesigner1Package.PROCESS__ID:
			return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AutoDesigner1Package.PROCESS__APPLICATION:
			setApplication((Application) newValue);
			return;
		case AutoDesigner1Package.PROCESS__NAME:
			setName((String) newValue);
			return;
		case AutoDesigner1Package.PROCESS__WCET:
			setWcet((Double) newValue);
			return;
		case AutoDesigner1Package.PROCESS__PERIOD:
			setPeriod((Integer) newValue);
			return;
		case AutoDesigner1Package.PROCESS__STARTING_TIME:
			setStartingTime((GRBVar) newValue);
			return;
		case AutoDesigner1Package.PROCESS__RECIEVE_DATA:
			setRecieveData((Data) newValue);
			return;
		case AutoDesigner1Package.PROCESS__SEND_DATA:
			setSendData((Data) newValue);
			return;
		case AutoDesigner1Package.PROCESS__STARTING_TIME_VAL:
			setStartingTimeVal((Double) newValue);
			return;
		case AutoDesigner1Package.PROCESS__ID:
			setId((String) newValue);
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
		case AutoDesigner1Package.PROCESS__APPLICATION:
			setApplication((Application) null);
			return;
		case AutoDesigner1Package.PROCESS__NAME:
			setName(NAME_EDEFAULT);
			return;
		case AutoDesigner1Package.PROCESS__WCET:
			setWcet(WCET_EDEFAULT);
			return;
		case AutoDesigner1Package.PROCESS__PERIOD:
			setPeriod(PERIOD_EDEFAULT);
			return;
		case AutoDesigner1Package.PROCESS__STARTING_TIME:
			setStartingTime(STARTING_TIME_EDEFAULT);
			return;
		case AutoDesigner1Package.PROCESS__RECIEVE_DATA:
			setRecieveData((Data) null);
			return;
		case AutoDesigner1Package.PROCESS__SEND_DATA:
			setSendData((Data) null);
			return;
		case AutoDesigner1Package.PROCESS__STARTING_TIME_VAL:
			setStartingTimeVal(STARTING_TIME_VAL_EDEFAULT);
			return;
		case AutoDesigner1Package.PROCESS__ID:
			setId(ID_EDEFAULT);
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
		case AutoDesigner1Package.PROCESS__APPLICATION:
			return application != null;
		case AutoDesigner1Package.PROCESS__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case AutoDesigner1Package.PROCESS__WCET:
			return wcet != WCET_EDEFAULT;
		case AutoDesigner1Package.PROCESS__PERIOD:
			return period != PERIOD_EDEFAULT;
		case AutoDesigner1Package.PROCESS__STARTING_TIME:
			return STARTING_TIME_EDEFAULT == null ? startingTime != null : !STARTING_TIME_EDEFAULT.equals(startingTime);
		case AutoDesigner1Package.PROCESS__RECIEVE_DATA:
			return recieveData != null;
		case AutoDesigner1Package.PROCESS__SEND_DATA:
			return sendData != null;
		case AutoDesigner1Package.PROCESS__STARTING_TIME_VAL:
			return startingTimeVal != STARTING_TIME_VAL_EDEFAULT;
		case AutoDesigner1Package.PROCESS__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(", wcet: ");
		result.append(wcet);
		result.append(", period: ");
		result.append(period);
		result.append(", startingTime: ");
		result.append(startingTime);
		result.append(", startingTimeVal: ");
		result.append(startingTimeVal);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ProcessImpl
