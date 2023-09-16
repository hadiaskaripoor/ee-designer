/**
 */
package autoDesigner1.impl;

import autoDesigner1.AutoDesigner1Package;
import autoDesigner1.Data;
import autoDesigner1.Data_In;
import autoDesigner1.Data_Out;
import autoDesigner1.Link;

import gurobi.GRBVar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data In</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link autoDesigner1.impl.Data_InImpl#getD_out <em>Dout</em>}</li>
 *   <li>{@link autoDesigner1.impl.Data_InImpl#getData_in_gurobi <em>Data in gurobi</em>}</li>
 *   <li>{@link autoDesigner1.impl.Data_InImpl#getLink <em>Link</em>}</li>
 *   <li>{@link autoDesigner1.impl.Data_InImpl#getData <em>Data</em>}</li>
 *   <li>{@link autoDesigner1.impl.Data_InImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Data_InImpl extends MinimalEObjectImpl.Container implements Data_In {
	/**
	 * The cached value of the '{@link #getD_out() <em>Dout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD_out()
	 * @generated
	 * @ordered
	 */
	protected Data_Out d_out;

	/**
	 * The default value of the '{@link #getData_in_gurobi() <em>Data in gurobi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData_in_gurobi()
	 * @generated
	 * @ordered
	 */
	protected static final GRBVar DATA_IN_GUROBI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getData_in_gurobi() <em>Data in gurobi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData_in_gurobi()
	 * @generated
	 * @ordered
	 */
	protected GRBVar data_in_gurobi = DATA_IN_GUROBI_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Data_InImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AutoDesigner1Package.Literals.DATA_IN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data_Out getD_out() {
		if (d_out != null && d_out.eIsProxy()) {
			InternalEObject oldD_out = (InternalEObject) d_out;
			d_out = (Data_Out) eResolveProxy(oldD_out);
			if (d_out != oldD_out) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AutoDesigner1Package.DATA_IN__DOUT,
							oldD_out, d_out));
			}
		}
		return d_out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data_Out basicGetD_out() {
		return d_out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setD_out(Data_Out newD_out) {
		Data_Out oldD_out = d_out;
		d_out = newD_out;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.DATA_IN__DOUT, oldD_out, d_out));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GRBVar getData_in_gurobi() {
		return data_in_gurobi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData_in_gurobi(GRBVar newData_in_gurobi) {
		GRBVar oldData_in_gurobi = data_in_gurobi;
		data_in_gurobi = newData_in_gurobi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.DATA_IN__DATA_IN_GUROBI,
					oldData_in_gurobi, data_in_gurobi));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AutoDesigner1Package.DATA_IN__LINK,
							oldLink, link));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.DATA_IN__LINK, oldLink, link));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AutoDesigner1Package.DATA_IN__DATA,
							oldData, data));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.DATA_IN__DATA, oldData, data));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.DATA_IN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AutoDesigner1Package.DATA_IN__DOUT:
			if (resolve)
				return getD_out();
			return basicGetD_out();
		case AutoDesigner1Package.DATA_IN__DATA_IN_GUROBI:
			return getData_in_gurobi();
		case AutoDesigner1Package.DATA_IN__LINK:
			if (resolve)
				return getLink();
			return basicGetLink();
		case AutoDesigner1Package.DATA_IN__DATA:
			if (resolve)
				return getData();
			return basicGetData();
		case AutoDesigner1Package.DATA_IN__NAME:
			return getName();
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
		case AutoDesigner1Package.DATA_IN__DOUT:
			setD_out((Data_Out) newValue);
			return;
		case AutoDesigner1Package.DATA_IN__DATA_IN_GUROBI:
			setData_in_gurobi((GRBVar) newValue);
			return;
		case AutoDesigner1Package.DATA_IN__LINK:
			setLink((Link) newValue);
			return;
		case AutoDesigner1Package.DATA_IN__DATA:
			setData((Data) newValue);
			return;
		case AutoDesigner1Package.DATA_IN__NAME:
			setName((String) newValue);
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
		case AutoDesigner1Package.DATA_IN__DOUT:
			setD_out((Data_Out) null);
			return;
		case AutoDesigner1Package.DATA_IN__DATA_IN_GUROBI:
			setData_in_gurobi(DATA_IN_GUROBI_EDEFAULT);
			return;
		case AutoDesigner1Package.DATA_IN__LINK:
			setLink((Link) null);
			return;
		case AutoDesigner1Package.DATA_IN__DATA:
			setData((Data) null);
			return;
		case AutoDesigner1Package.DATA_IN__NAME:
			setName(NAME_EDEFAULT);
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
		case AutoDesigner1Package.DATA_IN__DOUT:
			return d_out != null;
		case AutoDesigner1Package.DATA_IN__DATA_IN_GUROBI:
			return DATA_IN_GUROBI_EDEFAULT == null ? data_in_gurobi != null
					: !DATA_IN_GUROBI_EDEFAULT.equals(data_in_gurobi);
		case AutoDesigner1Package.DATA_IN__LINK:
			return link != null;
		case AutoDesigner1Package.DATA_IN__DATA:
			return data != null;
		case AutoDesigner1Package.DATA_IN__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (data_in_gurobi: ");
		result.append(data_in_gurobi);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //Data_InImpl
