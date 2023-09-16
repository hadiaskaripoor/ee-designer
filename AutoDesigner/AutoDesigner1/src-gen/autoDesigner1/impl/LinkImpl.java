/**
 */
package autoDesigner1.impl;

import autoDesigner1.AutoDesigner1Package;
import autoDesigner1.Data_In;
import autoDesigner1.Data_Out;
import autoDesigner1.Link;
import autoDesigner1.Link_Type;
import autoDesigner1.Node;
import autoDesigner1.Task;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link autoDesigner1.impl.LinkImpl#getName <em>Name</em>}</li>
 *   <li>{@link autoDesigner1.impl.LinkImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link autoDesigner1.impl.LinkImpl#getLs <em>Ls</em>}</li>
 *   <li>{@link autoDesigner1.impl.LinkImpl#getLf <em>Lf</em>}</li>
 *   <li>{@link autoDesigner1.impl.LinkImpl#getD_out <em>Dout</em>}</li>
 *   <li>{@link autoDesigner1.impl.LinkImpl#getD_in <em>Din</em>}</li>
 *   <li>{@link autoDesigner1.impl.LinkImpl#getTask <em>Task</em>}</li>
 *   <li>{@link autoDesigner1.impl.LinkImpl#getLink_type <em>Link type</em>}</li>
 *   <li>{@link autoDesigner1.impl.LinkImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkImpl extends MinimalEObjectImpl.Container implements Link {
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
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final int COST_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected int cost = COST_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLs() <em>Ls</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLs()
	 * @generated
	 * @ordered
	 */
	protected Node ls;

	/**
	 * The cached value of the '{@link #getLf() <em>Lf</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLf()
	 * @generated
	 * @ordered
	 */
	protected Node lf;

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
	 * The cached value of the '{@link #getD_in() <em>Din</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD_in()
	 * @generated
	 * @ordered
	 */
	protected EList<Data_In> d_in;

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
	 * The default value of the '{@link #getLink_type() <em>Link type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink_type()
	 * @generated
	 * @ordered
	 */
	protected static final Link_Type LINK_TYPE_EDEFAULT = Link_Type.CAN_BUS;

	/**
	 * The cached value of the '{@link #getLink_type() <em>Link type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink_type()
	 * @generated
	 * @ordered
	 */
	protected Link_Type link_type = LINK_TYPE_EDEFAULT;

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
	protected LinkImpl() {
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
		return AutoDesigner1Package.Literals.LINK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.LINK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCost() {
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCost(int newCost) {
		int oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.LINK__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getLs() {
		if (ls != null && ls.eIsProxy()) {
			InternalEObject oldLs = (InternalEObject) ls;
			ls = (Node) eResolveProxy(oldLs);
			if (ls != oldLs) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AutoDesigner1Package.LINK__LS, oldLs,
							ls));
			}
		}
		return ls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetLs() {
		return ls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLs(Node newLs) {
		Node oldLs = ls;
		ls = newLs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.LINK__LS, oldLs, ls));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getLf() {
		if (lf != null && lf.eIsProxy()) {
			InternalEObject oldLf = (InternalEObject) lf;
			lf = (Node) eResolveProxy(oldLf);
			if (lf != oldLf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AutoDesigner1Package.LINK__LF, oldLf,
							lf));
			}
		}
		return lf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetLf() {
		return lf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLf(Node newLf) {
		Node oldLf = lf;
		lf = newLf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.LINK__LF, oldLf, lf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data_Out> getD_out() {
		if (d_out == null) {
			d_out = new EObjectResolvingEList<Data_Out>(Data_Out.class, this, AutoDesigner1Package.LINK__DOUT);
		}
		return d_out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data_In> getD_in() {
		if (d_in == null) {
			d_in = new EObjectResolvingEList<Data_In>(Data_In.class, this, AutoDesigner1Package.LINK__DIN);
		}
		return d_in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTask() {
		if (task == null) {
			task = new EObjectResolvingEList<Task>(Task.class, this, AutoDesigner1Package.LINK__TASK);
		}
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link_Type getLink_type() {
		return link_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLink_type(Link_Type newLink_type) {
		Link_Type oldLink_type = link_type;
		link_type = newLink_type == null ? LINK_TYPE_EDEFAULT : newLink_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.LINK__LINK_TYPE, oldLink_type,
					link_type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.LINK__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AutoDesigner1Package.LINK__NAME:
			return getName();
		case AutoDesigner1Package.LINK__COST:
			return getCost();
		case AutoDesigner1Package.LINK__LS:
			if (resolve)
				return getLs();
			return basicGetLs();
		case AutoDesigner1Package.LINK__LF:
			if (resolve)
				return getLf();
			return basicGetLf();
		case AutoDesigner1Package.LINK__DOUT:
			return getD_out();
		case AutoDesigner1Package.LINK__DIN:
			return getD_in();
		case AutoDesigner1Package.LINK__TASK:
			return getTask();
		case AutoDesigner1Package.LINK__LINK_TYPE:
			return getLink_type();
		case AutoDesigner1Package.LINK__ID:
			return getId();
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
		case AutoDesigner1Package.LINK__NAME:
			setName((String) newValue);
			return;
		case AutoDesigner1Package.LINK__COST:
			setCost((Integer) newValue);
			return;
		case AutoDesigner1Package.LINK__LS:
			setLs((Node) newValue);
			return;
		case AutoDesigner1Package.LINK__LF:
			setLf((Node) newValue);
			return;
		case AutoDesigner1Package.LINK__DOUT:
			getD_out().clear();
			getD_out().addAll((Collection<? extends Data_Out>) newValue);
			return;
		case AutoDesigner1Package.LINK__DIN:
			getD_in().clear();
			getD_in().addAll((Collection<? extends Data_In>) newValue);
			return;
		case AutoDesigner1Package.LINK__TASK:
			getTask().clear();
			getTask().addAll((Collection<? extends Task>) newValue);
			return;
		case AutoDesigner1Package.LINK__LINK_TYPE:
			setLink_type((Link_Type) newValue);
			return;
		case AutoDesigner1Package.LINK__ID:
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
		case AutoDesigner1Package.LINK__NAME:
			setName(NAME_EDEFAULT);
			return;
		case AutoDesigner1Package.LINK__COST:
			setCost(COST_EDEFAULT);
			return;
		case AutoDesigner1Package.LINK__LS:
			setLs((Node) null);
			return;
		case AutoDesigner1Package.LINK__LF:
			setLf((Node) null);
			return;
		case AutoDesigner1Package.LINK__DOUT:
			getD_out().clear();
			return;
		case AutoDesigner1Package.LINK__DIN:
			getD_in().clear();
			return;
		case AutoDesigner1Package.LINK__TASK:
			getTask().clear();
			return;
		case AutoDesigner1Package.LINK__LINK_TYPE:
			setLink_type(LINK_TYPE_EDEFAULT);
			return;
		case AutoDesigner1Package.LINK__ID:
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
		case AutoDesigner1Package.LINK__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case AutoDesigner1Package.LINK__COST:
			return cost != COST_EDEFAULT;
		case AutoDesigner1Package.LINK__LS:
			return ls != null;
		case AutoDesigner1Package.LINK__LF:
			return lf != null;
		case AutoDesigner1Package.LINK__DOUT:
			return d_out != null && !d_out.isEmpty();
		case AutoDesigner1Package.LINK__DIN:
			return d_in != null && !d_in.isEmpty();
		case AutoDesigner1Package.LINK__TASK:
			return task != null && !task.isEmpty();
		case AutoDesigner1Package.LINK__LINK_TYPE:
			return link_type != LINK_TYPE_EDEFAULT;
		case AutoDesigner1Package.LINK__ID:
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
		result.append(", cost: ");
		result.append(cost);
		result.append(", link_type: ");
		result.append(link_type);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //LinkImpl
