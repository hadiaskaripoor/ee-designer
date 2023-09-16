/**
 */
package autoDesigner1.impl;

import autoDesigner1.AutoDesigner1Package;
import autoDesigner1.Data_In;
import autoDesigner1.Data_Out;
import autoDesigner1.Order;

import gurobi.GRBVar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link autoDesigner1.impl.OrderImpl#getOrder_gurobi <em>Order gurobi</em>}</li>
 *   <li>{@link autoDesigner1.impl.OrderImpl#getName <em>Name</em>}</li>
 *   <li>{@link autoDesigner1.impl.OrderImpl#getHas_dataout <em>Has dataout</em>}</li>
 *   <li>{@link autoDesigner1.impl.OrderImpl#getHas_datain <em>Has datain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderImpl extends MinimalEObjectImpl.Container implements Order {
	/**
	 * The default value of the '{@link #getOrder_gurobi() <em>Order gurobi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder_gurobi()
	 * @generated
	 * @ordered
	 */
	protected static final GRBVar ORDER_GUROBI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrder_gurobi() <em>Order gurobi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder_gurobi()
	 * @generated
	 * @ordered
	 */
	protected GRBVar order_gurobi = ORDER_GUROBI_EDEFAULT;

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
	 * The cached value of the '{@link #getHas_dataout() <em>Has dataout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas_dataout()
	 * @generated
	 * @ordered
	 */
	protected Data_Out has_dataout;

	/**
	 * The cached value of the '{@link #getHas_datain() <em>Has datain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas_datain()
	 * @generated
	 * @ordered
	 */
	protected Data_In has_datain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AutoDesigner1Package.Literals.ORDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GRBVar getOrder_gurobi() {
		return order_gurobi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder_gurobi(GRBVar newOrder_gurobi) {
		GRBVar oldOrder_gurobi = order_gurobi;
		order_gurobi = newOrder_gurobi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.ORDER__ORDER_GUROBI,
					oldOrder_gurobi, order_gurobi));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.ORDER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data_Out getHas_dataout() {
		if (has_dataout != null && has_dataout.eIsProxy()) {
			InternalEObject oldHas_dataout = (InternalEObject) has_dataout;
			has_dataout = (Data_Out) eResolveProxy(oldHas_dataout);
			if (has_dataout != oldHas_dataout) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AutoDesigner1Package.ORDER__HAS_DATAOUT,
							oldHas_dataout, has_dataout));
			}
		}
		return has_dataout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data_Out basicGetHas_dataout() {
		return has_dataout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHas_dataout(Data_Out newHas_dataout) {
		Data_Out oldHas_dataout = has_dataout;
		has_dataout = newHas_dataout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.ORDER__HAS_DATAOUT,
					oldHas_dataout, has_dataout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data_In getHas_datain() {
		if (has_datain != null && has_datain.eIsProxy()) {
			InternalEObject oldHas_datain = (InternalEObject) has_datain;
			has_datain = (Data_In) eResolveProxy(oldHas_datain);
			if (has_datain != oldHas_datain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AutoDesigner1Package.ORDER__HAS_DATAIN,
							oldHas_datain, has_datain));
			}
		}
		return has_datain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data_In basicGetHas_datain() {
		return has_datain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHas_datain(Data_In newHas_datain) {
		Data_In oldHas_datain = has_datain;
		has_datain = newHas_datain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.ORDER__HAS_DATAIN, oldHas_datain,
					has_datain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AutoDesigner1Package.ORDER__ORDER_GUROBI:
			return getOrder_gurobi();
		case AutoDesigner1Package.ORDER__NAME:
			return getName();
		case AutoDesigner1Package.ORDER__HAS_DATAOUT:
			if (resolve)
				return getHas_dataout();
			return basicGetHas_dataout();
		case AutoDesigner1Package.ORDER__HAS_DATAIN:
			if (resolve)
				return getHas_datain();
			return basicGetHas_datain();
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
		case AutoDesigner1Package.ORDER__ORDER_GUROBI:
			setOrder_gurobi((GRBVar) newValue);
			return;
		case AutoDesigner1Package.ORDER__NAME:
			setName((String) newValue);
			return;
		case AutoDesigner1Package.ORDER__HAS_DATAOUT:
			setHas_dataout((Data_Out) newValue);
			return;
		case AutoDesigner1Package.ORDER__HAS_DATAIN:
			setHas_datain((Data_In) newValue);
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
		case AutoDesigner1Package.ORDER__ORDER_GUROBI:
			setOrder_gurobi(ORDER_GUROBI_EDEFAULT);
			return;
		case AutoDesigner1Package.ORDER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case AutoDesigner1Package.ORDER__HAS_DATAOUT:
			setHas_dataout((Data_Out) null);
			return;
		case AutoDesigner1Package.ORDER__HAS_DATAIN:
			setHas_datain((Data_In) null);
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
		case AutoDesigner1Package.ORDER__ORDER_GUROBI:
			return ORDER_GUROBI_EDEFAULT == null ? order_gurobi != null : !ORDER_GUROBI_EDEFAULT.equals(order_gurobi);
		case AutoDesigner1Package.ORDER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case AutoDesigner1Package.ORDER__HAS_DATAOUT:
			return has_dataout != null;
		case AutoDesigner1Package.ORDER__HAS_DATAIN:
			return has_datain != null;
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
		result.append(" (order_gurobi: ");
		result.append(order_gurobi);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //OrderImpl
