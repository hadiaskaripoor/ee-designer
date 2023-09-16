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
 * An implementation of the model object '<em><b>LOut</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link autoDesigner1.impl.L_OutImpl#getL_out_gurobi <em>Lout gurobi</em>}</li>
 *   <li>{@link autoDesigner1.impl.L_OutImpl#getL_in <em>Lin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class L_OutImpl extends MinimalEObjectImpl.Container implements L_Out {
	/**
	 * The default value of the '{@link #getL_out_gurobi() <em>Lout gurobi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL_out_gurobi()
	 * @generated
	 * @ordered
	 */
	protected static final GRBVar LOUT_GUROBI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getL_out_gurobi() <em>Lout gurobi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL_out_gurobi()
	 * @generated
	 * @ordered
	 */
	protected GRBVar l_out_gurobi = LOUT_GUROBI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getL_in() <em>Lin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL_in()
	 * @generated
	 * @ordered
	 */
	protected L_In l_in;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected L_OutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AutoDesigner1Package.Literals.LOUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GRBVar getL_out_gurobi() {
		return l_out_gurobi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL_out_gurobi(GRBVar newL_out_gurobi) {
		GRBVar oldL_out_gurobi = l_out_gurobi;
		l_out_gurobi = newL_out_gurobi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.LOUT__LOUT_GUROBI,
					oldL_out_gurobi, l_out_gurobi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public L_In getL_in() {
		if (l_in != null && l_in.eIsProxy()) {
			InternalEObject oldL_in = (InternalEObject) l_in;
			l_in = (L_In) eResolveProxy(oldL_in);
			if (l_in != oldL_in) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AutoDesigner1Package.LOUT__LIN, oldL_in,
							l_in));
			}
		}
		return l_in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public L_In basicGetL_in() {
		return l_in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL_in(L_In newL_in) {
		L_In oldL_in = l_in;
		l_in = newL_in;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.LOUT__LIN, oldL_in, l_in));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AutoDesigner1Package.LOUT__LOUT_GUROBI:
			return getL_out_gurobi();
		case AutoDesigner1Package.LOUT__LIN:
			if (resolve)
				return getL_in();
			return basicGetL_in();
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
		case AutoDesigner1Package.LOUT__LOUT_GUROBI:
			setL_out_gurobi((GRBVar) newValue);
			return;
		case AutoDesigner1Package.LOUT__LIN:
			setL_in((L_In) newValue);
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
		case AutoDesigner1Package.LOUT__LOUT_GUROBI:
			setL_out_gurobi(LOUT_GUROBI_EDEFAULT);
			return;
		case AutoDesigner1Package.LOUT__LIN:
			setL_in((L_In) null);
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
		case AutoDesigner1Package.LOUT__LOUT_GUROBI:
			return LOUT_GUROBI_EDEFAULT == null ? l_out_gurobi != null : !LOUT_GUROBI_EDEFAULT.equals(l_out_gurobi);
		case AutoDesigner1Package.LOUT__LIN:
			return l_in != null;
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
		result.append(" (l_out_gurobi: ");
		result.append(l_out_gurobi);
		result.append(')');
		return result.toString();
	}

} //L_OutImpl
