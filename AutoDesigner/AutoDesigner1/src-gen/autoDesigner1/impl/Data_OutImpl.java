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
 * An implementation of the model object '<em><b>Data Out</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link autoDesigner1.impl.Data_OutImpl#getD_in <em>Din</em>}</li>
 *   <li>{@link autoDesigner1.impl.Data_OutImpl#getData_out_gurobi <em>Data out gurobi</em>}</li>
 *   <li>{@link autoDesigner1.impl.Data_OutImpl#getLink <em>Link</em>}</li>
 *   <li>{@link autoDesigner1.impl.Data_OutImpl#getData <em>Data</em>}</li>
 *   <li>{@link autoDesigner1.impl.Data_OutImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Data_OutImpl extends MinimalEObjectImpl.Container implements Data_Out {
	/**
	 * The cached value of the '{@link #getD_in() <em>Din</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD_in()
	 * @generated
	 * @ordered
	 */
	protected Data_In d_in;

	/**
	 * The default value of the '{@link #getData_out_gurobi() <em>Data out gurobi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData_out_gurobi()
	 * @generated
	 * @ordered
	 */
	protected static final GRBVar DATA_OUT_GUROBI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getData_out_gurobi() <em>Data out gurobi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData_out_gurobi()
	 * @generated
	 * @ordered
	 */
	protected GRBVar data_out_gurobi = DATA_OUT_GUROBI_EDEFAULT;

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
	protected Data_OutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AutoDesigner1Package.Literals.DATA_OUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data_In getD_in() {
		if (d_in != null && d_in.eIsProxy()) {
			InternalEObject oldD_in = (InternalEObject) d_in;
			d_in = (Data_In) eResolveProxy(oldD_in);
			if (d_in != oldD_in) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AutoDesigner1Package.DATA_OUT__DIN,
							oldD_in, d_in));
			}
		}
		return d_in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data_In basicGetD_in() {
		return d_in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setD_in(Data_In newD_in) {
		Data_In oldD_in = d_in;
		d_in = newD_in;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.DATA_OUT__DIN, oldD_in, d_in));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GRBVar getData_out_gurobi() {
		return data_out_gurobi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData_out_gurobi(GRBVar newData_out_gurobi) {
		GRBVar oldData_out_gurobi = data_out_gurobi;
		data_out_gurobi = newData_out_gurobi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.DATA_OUT__DATA_OUT_GUROBI,
					oldData_out_gurobi, data_out_gurobi));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AutoDesigner1Package.DATA_OUT__LINK,
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
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.DATA_OUT__LINK, oldLink, link));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AutoDesigner1Package.DATA_OUT__DATA,
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
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.DATA_OUT__DATA, oldData, data));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.DATA_OUT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AutoDesigner1Package.DATA_OUT__DIN:
			if (resolve)
				return getD_in();
			return basicGetD_in();
		case AutoDesigner1Package.DATA_OUT__DATA_OUT_GUROBI:
			return getData_out_gurobi();
		case AutoDesigner1Package.DATA_OUT__LINK:
			if (resolve)
				return getLink();
			return basicGetLink();
		case AutoDesigner1Package.DATA_OUT__DATA:
			if (resolve)
				return getData();
			return basicGetData();
		case AutoDesigner1Package.DATA_OUT__NAME:
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
		case AutoDesigner1Package.DATA_OUT__DIN:
			setD_in((Data_In) newValue);
			return;
		case AutoDesigner1Package.DATA_OUT__DATA_OUT_GUROBI:
			setData_out_gurobi((GRBVar) newValue);
			return;
		case AutoDesigner1Package.DATA_OUT__LINK:
			setLink((Link) newValue);
			return;
		case AutoDesigner1Package.DATA_OUT__DATA:
			setData((Data) newValue);
			return;
		case AutoDesigner1Package.DATA_OUT__NAME:
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
		case AutoDesigner1Package.DATA_OUT__DIN:
			setD_in((Data_In) null);
			return;
		case AutoDesigner1Package.DATA_OUT__DATA_OUT_GUROBI:
			setData_out_gurobi(DATA_OUT_GUROBI_EDEFAULT);
			return;
		case AutoDesigner1Package.DATA_OUT__LINK:
			setLink((Link) null);
			return;
		case AutoDesigner1Package.DATA_OUT__DATA:
			setData((Data) null);
			return;
		case AutoDesigner1Package.DATA_OUT__NAME:
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
		case AutoDesigner1Package.DATA_OUT__DIN:
			return d_in != null;
		case AutoDesigner1Package.DATA_OUT__DATA_OUT_GUROBI:
			return DATA_OUT_GUROBI_EDEFAULT == null ? data_out_gurobi != null
					: !DATA_OUT_GUROBI_EDEFAULT.equals(data_out_gurobi);
		case AutoDesigner1Package.DATA_OUT__LINK:
			return link != null;
		case AutoDesigner1Package.DATA_OUT__DATA:
			return data != null;
		case AutoDesigner1Package.DATA_OUT__NAME:
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
		result.append(" (data_out_gurobi: ");
		result.append(data_out_gurobi);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //Data_OutImpl
