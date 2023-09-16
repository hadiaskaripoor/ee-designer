/**
 */
package autoDesigner1.impl;

import autoDesigner1.AutoDesigner1Package;
import autoDesigner1.Data;
import autoDesigner1.Link;
import autoDesigner1.Task;

import gurobi.GRBVar;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link autoDesigner1.impl.TaskImpl#getName <em>Name</em>}</li>
 *   <li>{@link autoDesigner1.impl.TaskImpl#getFrameLength <em>Frame Length</em>}</li>
 *   <li>{@link autoDesigner1.impl.TaskImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link autoDesigner1.impl.TaskImpl#getLink <em>Link</em>}</li>
 *   <li>{@link autoDesigner1.impl.TaskImpl#getData <em>Data</em>}</li>
 *   <li>{@link autoDesigner1.impl.TaskImpl#getStartingTimeVal <em>Starting Time Val</em>}</li>
 *   <li>{@link autoDesigner1.impl.TaskImpl#getStartTime <em>Start Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends MinimalEObjectImpl.Container implements Task {
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
	 * The default value of the '{@link #getFrameLength() <em>Frame Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameLength()
	 * @generated
	 * @ordered
	 */
	protected static final double FRAME_LENGTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFrameLength() <em>Frame Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameLength()
	 * @generated
	 * @ordered
	 */
	protected double frameLength = FRAME_LENGTH_EDEFAULT;

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
	 * The cached value of the '{@link #getLink() <em>Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected Link link;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected Data data;

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
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final GRBVar START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected GRBVar startTime = START_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AutoDesigner1Package.Literals.TASK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.TASK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GRBVar getStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTime(GRBVar newStartTime) {
		GRBVar oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.TASK__START_TIME, oldStartTime,
					startTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.TASK__PERIOD, oldPeriod,
					period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data getData() {
		if (data != null && data.eIsProxy()) {
			InternalEObject oldData = (InternalEObject) data;
			data = (Data) eResolveProxy(oldData);
			if (data != oldData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AutoDesigner1Package.TASK__DATA, oldData,
							data));
			}
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data basicGetData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(Data newData) {
		Data oldData = data;
		data = newData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.TASK__DATA, oldData, data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFrameLength() {
		return frameLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrameLength(double newFrameLength) {
		double oldFrameLength = frameLength;
		frameLength = newFrameLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.TASK__FRAME_LENGTH,
					oldFrameLength, frameLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link getLink() {
		if (link != null && link.eIsProxy()) {
			InternalEObject oldLink = (InternalEObject) link;
			link = (Link) eResolveProxy(oldLink);
			if (link != oldLink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AutoDesigner1Package.TASK__LINK, oldLink,
							link));
			}
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link basicGetLink() {
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLink(Link newLink) {
		Link oldLink = link;
		link = newLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.TASK__LINK, oldLink, link));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.TASK__STARTING_TIME_VAL,
					oldStartingTimeVal, startingTimeVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AutoDesigner1Package.TASK__NAME:
			return getName();
		case AutoDesigner1Package.TASK__FRAME_LENGTH:
			return getFrameLength();
		case AutoDesigner1Package.TASK__PERIOD:
			return getPeriod();
		case AutoDesigner1Package.TASK__LINK:
			if (resolve)
				return getLink();
			return basicGetLink();
		case AutoDesigner1Package.TASK__DATA:
			if (resolve)
				return getData();
			return basicGetData();
		case AutoDesigner1Package.TASK__STARTING_TIME_VAL:
			return getStartingTimeVal();
		case AutoDesigner1Package.TASK__START_TIME:
			return getStartTime();
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
		case AutoDesigner1Package.TASK__NAME:
			setName((String) newValue);
			return;
		case AutoDesigner1Package.TASK__FRAME_LENGTH:
			setFrameLength((Double) newValue);
			return;
		case AutoDesigner1Package.TASK__PERIOD:
			setPeriod((Integer) newValue);
			return;
		case AutoDesigner1Package.TASK__LINK:
			setLink((Link) newValue);
			return;
		case AutoDesigner1Package.TASK__DATA:
			setData((Data) newValue);
			return;
		case AutoDesigner1Package.TASK__STARTING_TIME_VAL:
			setStartingTimeVal((Double) newValue);
			return;
		case AutoDesigner1Package.TASK__START_TIME:
			setStartTime((GRBVar) newValue);
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
		case AutoDesigner1Package.TASK__NAME:
			setName(NAME_EDEFAULT);
			return;
		case AutoDesigner1Package.TASK__FRAME_LENGTH:
			setFrameLength(FRAME_LENGTH_EDEFAULT);
			return;
		case AutoDesigner1Package.TASK__PERIOD:
			setPeriod(PERIOD_EDEFAULT);
			return;
		case AutoDesigner1Package.TASK__LINK:
			setLink((Link) null);
			return;
		case AutoDesigner1Package.TASK__DATA:
			setData((Data) null);
			return;
		case AutoDesigner1Package.TASK__STARTING_TIME_VAL:
			setStartingTimeVal(STARTING_TIME_VAL_EDEFAULT);
			return;
		case AutoDesigner1Package.TASK__START_TIME:
			setStartTime(START_TIME_EDEFAULT);
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
		case AutoDesigner1Package.TASK__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case AutoDesigner1Package.TASK__FRAME_LENGTH:
			return frameLength != FRAME_LENGTH_EDEFAULT;
		case AutoDesigner1Package.TASK__PERIOD:
			return period != PERIOD_EDEFAULT;
		case AutoDesigner1Package.TASK__LINK:
			return link != null;
		case AutoDesigner1Package.TASK__DATA:
			return data != null;
		case AutoDesigner1Package.TASK__STARTING_TIME_VAL:
			return startingTimeVal != STARTING_TIME_VAL_EDEFAULT;
		case AutoDesigner1Package.TASK__START_TIME:
			return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
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
		result.append(", frameLength: ");
		result.append(frameLength);
		result.append(", period: ");
		result.append(period);
		result.append(", startingTimeVal: ");
		result.append(startingTimeVal);
		result.append(", startTime: ");
		result.append(startTime);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
