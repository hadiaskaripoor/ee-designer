/**
 */
package autoDesigner1.impl;

import autoDesigner1.AutoDesigner1Package;
import autoDesigner1.L_In;
import autoDesigner1.L_Out;

import gurobi.GRBVar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LIn</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link autoDesigner1.impl.L_InImpl#getL_in_gurobi <em>Lin gurobi</em>}</li>
 *   <li>{@link autoDesigner1.impl.L_InImpl#getL_out <em>Lout</em>}</li>
 * </ul>
 *
 * @generated
 */
public class L_InImpl extends MinimalEObjectImpl.Container implements L_In {
	/**
	 * The default value of the '{@link #getL_in_gurobi() <em>Lin gurobi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL_in_gurobi()
	 * @generated
	 * @ordered
	 */
	protected static final GRBVar LIN_GUROBI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getL_in_gurobi() <em>Lin gurobi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL_in_gurobi()
	 * @generated
	 * @ordered
	 */
	protected GRBVar l_in_gurobi = LIN_GUROBI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getL_out() <em>Lout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL_out()
	 * @generated
	 * @ordered
	 */
	protected L_Out l_out;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected L_InImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AutoDesigner1Package.Literals.LIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GRBVar getL_in_gurobi() {
		return l_in_gurobi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL_in_gurobi(GRBVar newL_in_gurobi) {
		GRBVar oldL_in_gurobi = l_in_gurobi;
		l_in_gurobi = newL_in_gurobi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.LIN__LIN_GUROBI, oldL_in_gurobi,
					l_in_gurobi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public L_Out getL_out() {
		if (l_out != null && l_out.eIsProxy()) {
			InternalEObject oldL_out = (InternalEObject) l_out;
			l_out = (L_Out) eResolveProxy(oldL_out);
			if (l_out != oldL_out) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AutoDesigner1Package.LIN__LOUT, oldL_out,
							l_out));
			}
		}
		return l_out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public L_Out basicGetL_out() {
		return l_out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL_out(L_Out newL_out) {
		L_Out oldL_out = l_out;
		l_out = newL_out;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.LIN__LOUT, oldL_out, l_out));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AutoDesigner1Package.LIN__LIN_GUROBI:
			return getL_in_gurobi();
		case AutoDesigner1Package.LIN__LOUT:
			if (resolve)
				return getL_out();
			return basicGetL_out();
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
		case AutoDesigner1Package.LIN__LIN_GUROBI:
			setL_in_gurobi((GRBVar) newValue);
			return;
		case AutoDesigner1Package.LIN__LOUT:
			setL_out((L_Out) newValue);
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
		case AutoDesigner1Package.LIN__LIN_GUROBI:
			setL_in_gurobi(LIN_GUROBI_EDEFAULT);
			return;
		case AutoDesigner1Package.LIN__LOUT:
			setL_out((L_Out) null);
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
		case AutoDesigner1Package.LIN__LIN_GUROBI:
			return LIN_GUROBI_EDEFAULT == null ? l_in_gurobi != null : !LIN_GUROBI_EDEFAULT.equals(l_in_gurobi);
		case AutoDesigner1Package.LIN__LOUT:
			return l_out != null;
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
		result.append(" (l_in_gurobi: ");
		result.append(l_in_gurobi);
		result.append(')');
		return result.toString();
	}

} //L_InImpl
