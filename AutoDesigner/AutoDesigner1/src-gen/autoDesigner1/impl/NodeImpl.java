/**
 */
package autoDesigner1.impl;

import autoDesigner1.Application;
import autoDesigner1.AutoDesigner1Package;
import autoDesigner1.Link;
import autoDesigner1.Mapping;
import autoDesigner1.Node;
import gurobi.GRBVar;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link autoDesigner1.impl.NodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link autoDesigner1.impl.NodeImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link autoDesigner1.impl.NodeImpl#getN_gurobi <em>Ngurobi</em>}</li>
 *   <li>{@link autoDesigner1.impl.NodeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link autoDesigner1.impl.NodeImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link autoDesigner1.impl.NodeImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link autoDesigner1.impl.NodeImpl#getSender <em>Sender</em>}</li>
 *   <li>{@link autoDesigner1.impl.NodeImpl#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link autoDesigner1.impl.NodeImpl#getMappings <em>Mappings</em>}</li>
 *   <li>{@link autoDesigner1.impl.NodeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends MinimalEObjectImpl.Container implements Node {
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
	 * The default value of the '{@link #getN_gurobi() <em>Ngurobi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getN_gurobi()
	 * @generated
	 * @ordered
	 */
	protected static final GRBVar NGUROBI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getN_gurobi() <em>Ngurobi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getN_gurobi()
	 * @generated
	 * @ordered
	 */
	protected GRBVar n_gurobi = NGUROBI_EDEFAULT;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final int SOURCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected int source = SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestination() <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected static final int DESTINATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected int destination = DESTINATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> links;

	/**
	 * The cached value of the '{@link #getSender() <em>Sender</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSender()
	 * @generated
	 * @ordered
	 */
	protected EList<Application> sender;

	/**
	 * The cached value of the '{@link #getReceiver() <em>Receiver</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiver()
	 * @generated
	 * @ordered
	 */
	protected EList<Application> receiver;

	/**
	 * The cached value of the '{@link #getMappings() <em>Mappings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<Mapping> mappings;

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
	protected NodeImpl() {
		super();
		//Amir changed
		this.id = (EcoreUtil.generateUUID());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AutoDesigner1Package.Literals.NODE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.NODE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.NODE__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GRBVar getN_gurobi() {
		return n_gurobi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setN_gurobi(GRBVar newN_gurobi) {
		GRBVar oldN_gurobi = n_gurobi;
		n_gurobi = newN_gurobi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.NODE__NGUROBI, oldN_gurobi,
					n_gurobi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(int newSource) {
		int oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.NODE__SOURCE, oldSource,
					source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestination(int newDestination) {
		int oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.NODE__DESTINATION,
					oldDestination, destination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectResolvingEList<Link>(Link.class, this, AutoDesigner1Package.NODE__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Application> getSender() {
		if (sender == null) {
			sender = new EObjectResolvingEList<Application>(Application.class, this, AutoDesigner1Package.NODE__SENDER);
		}
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Application> getReceiver() {
		if (receiver == null) {
			receiver = new EObjectResolvingEList<Application>(Application.class, this,
					AutoDesigner1Package.NODE__RECEIVER);
		}
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mapping> getMappings() {
		if (mappings == null) {
			mappings = new EObjectResolvingEList<Mapping>(Mapping.class, this, AutoDesigner1Package.NODE__MAPPINGS);
		}
		return mappings;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.NODE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AutoDesigner1Package.NODE__NAME:
			return getName();
		case AutoDesigner1Package.NODE__COST:
			return getCost();
		case AutoDesigner1Package.NODE__NGUROBI:
			return getN_gurobi();
		case AutoDesigner1Package.NODE__SOURCE:
			return getSource();
		case AutoDesigner1Package.NODE__DESTINATION:
			return getDestination();
		case AutoDesigner1Package.NODE__LINKS:
			return getLinks();
		case AutoDesigner1Package.NODE__SENDER:
			return getSender();
		case AutoDesigner1Package.NODE__RECEIVER:
			return getReceiver();
		case AutoDesigner1Package.NODE__MAPPINGS:
			return getMappings();
		case AutoDesigner1Package.NODE__ID:
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
		case AutoDesigner1Package.NODE__NAME:
			setName((String) newValue);
			return;
		case AutoDesigner1Package.NODE__COST:
			setCost((Integer) newValue);
			return;
		case AutoDesigner1Package.NODE__NGUROBI:
			setN_gurobi((GRBVar) newValue);
			return;
		case AutoDesigner1Package.NODE__SOURCE:
			setSource((Integer) newValue);
			return;
		case AutoDesigner1Package.NODE__DESTINATION:
			setDestination((Integer) newValue);
			return;
		case AutoDesigner1Package.NODE__LINKS:
			getLinks().clear();
			getLinks().addAll((Collection<? extends Link>) newValue);
			return;
		case AutoDesigner1Package.NODE__SENDER:
			getSender().clear();
			getSender().addAll((Collection<? extends Application>) newValue);
			return;
		case AutoDesigner1Package.NODE__RECEIVER:
			getReceiver().clear();
			getReceiver().addAll((Collection<? extends Application>) newValue);
			return;
		case AutoDesigner1Package.NODE__MAPPINGS:
			getMappings().clear();
			getMappings().addAll((Collection<? extends Mapping>) newValue);
			return;
		case AutoDesigner1Package.NODE__ID:
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
		case AutoDesigner1Package.NODE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case AutoDesigner1Package.NODE__COST:
			setCost(COST_EDEFAULT);
			return;
		case AutoDesigner1Package.NODE__NGUROBI:
			setN_gurobi(NGUROBI_EDEFAULT);
			return;
		case AutoDesigner1Package.NODE__SOURCE:
			setSource(SOURCE_EDEFAULT);
			return;
		case AutoDesigner1Package.NODE__DESTINATION:
			setDestination(DESTINATION_EDEFAULT);
			return;
		case AutoDesigner1Package.NODE__LINKS:
			getLinks().clear();
			return;
		case AutoDesigner1Package.NODE__SENDER:
			getSender().clear();
			return;
		case AutoDesigner1Package.NODE__RECEIVER:
			getReceiver().clear();
			return;
		case AutoDesigner1Package.NODE__MAPPINGS:
			getMappings().clear();
			return;
		case AutoDesigner1Package.NODE__ID:
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
		case AutoDesigner1Package.NODE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case AutoDesigner1Package.NODE__COST:
			return cost != COST_EDEFAULT;
		case AutoDesigner1Package.NODE__NGUROBI:
			return NGUROBI_EDEFAULT == null ? n_gurobi != null : !NGUROBI_EDEFAULT.equals(n_gurobi);
		case AutoDesigner1Package.NODE__SOURCE:
			return source != SOURCE_EDEFAULT;
		case AutoDesigner1Package.NODE__DESTINATION:
			return destination != DESTINATION_EDEFAULT;
		case AutoDesigner1Package.NODE__LINKS:
			return links != null && !links.isEmpty();
		case AutoDesigner1Package.NODE__SENDER:
			return sender != null && !sender.isEmpty();
		case AutoDesigner1Package.NODE__RECEIVER:
			return receiver != null && !receiver.isEmpty();
		case AutoDesigner1Package.NODE__MAPPINGS:
			return mappings != null && !mappings.isEmpty();
		case AutoDesigner1Package.NODE__ID:
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
		result.append(", n_gurobi: ");
		result.append(n_gurobi);
		result.append(", source: ");
		result.append(source);
		result.append(", destination: ");
		result.append(destination);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
