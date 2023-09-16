/**
 */
package autoDesigner1.impl;

import autoDesigner1.Application;
import autoDesigner1.AutoDesigner1Package;
import autoDesigner1.CamMapping;
import autoDesigner1.LidarMapping;
import autoDesigner1.Mapping;
import gurobi.GRBVar;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link autoDesigner1.impl.ApplicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link autoDesigner1.impl.ApplicationImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link autoDesigner1.impl.ApplicationImpl#getMappings <em>Mappings</em>}</li>
 *   <li>{@link autoDesigner1.impl.ApplicationImpl#getApp_gurobi <em>App gurobi</em>}</li>
 *   <li>{@link autoDesigner1.impl.ApplicationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link autoDesigner1.impl.ApplicationImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link autoDesigner1.impl.ApplicationImpl#isSafetycritical <em>Safetycritical</em>}</li>
 *   <li>{@link autoDesigner1.impl.ApplicationImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link autoDesigner1.impl.ApplicationImpl#getId <em>Id</em>}</li>
 *   <li>{@link autoDesigner1.impl.ApplicationImpl#getCammapping <em>Cammapping</em>}</li>
 *   <li>{@link autoDesigner1.impl.ApplicationImpl#getLidarmapping <em>Lidarmapping</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationImpl extends MinimalEObjectImpl.Container implements Application {
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
	 * The cached value of the '{@link #getMappings() <em>Mappings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<Mapping> mappings;

	/**
	 * The default value of the '{@link #getApp_gurobi() <em>App gurobi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApp_gurobi()
	 * @generated
	 * @ordered
	 */
	protected static final GRBVar APP_GUROBI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApp_gurobi() <em>App gurobi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApp_gurobi()
	 * @generated
	 * @ordered
	 */
	protected GRBVar app_gurobi = APP_GUROBI_EDEFAULT;

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
	 * The default value of the '{@link #isSafetycritical() <em>Safetycritical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSafetycritical()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SAFETYCRITICAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSafetycritical() <em>Safetycritical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSafetycritical()
	 * @generated
	 * @ordered
	 */
	protected boolean safetycritical = SAFETYCRITICAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProcess() <em>Process</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcess()
	 * @generated
	 * @ordered
	 */
	protected EList<autoDesigner1.Process> process;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

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
	 * The cached value of the '{@link #getCammapping() <em>Cammapping</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCammapping()
	 * @generated
	 * @ordered
	 */
	protected CamMapping cammapping;

	/**
	 * The cached value of the '{@link #getLidarmapping() <em>Lidarmapping</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLidarmapping()
	 * @generated
	 * @ordered
	 */
	protected LidarMapping lidarmapping;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected ApplicationImpl() {
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
		return AutoDesigner1Package.Literals.APPLICATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.APPLICATION__NAME, oldName,
					name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.APPLICATION__COST, oldCost,
					cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mapping> getMappings() {
		if (mappings == null) {
			mappings = new EObjectResolvingEList<Mapping>(Mapping.class, this,
					AutoDesigner1Package.APPLICATION__MAPPINGS);
		}
		return mappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GRBVar getApp_gurobi() {
		return app_gurobi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApp_gurobi(GRBVar newApp_gurobi) {
		GRBVar oldApp_gurobi = app_gurobi;
		app_gurobi = newApp_gurobi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.APPLICATION__APP_GUROBI,
					oldApp_gurobi, app_gurobi));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.APPLICATION__SOURCE, oldSource,
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
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.APPLICATION__DESTINATION,
					oldDestination, destination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSafetycritical() {
		return safetycritical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSafetycritical(boolean newSafetycritical) {
		boolean oldSafetycritical = safetycritical;
		safetycritical = newSafetycritical;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.APPLICATION__SAFETYCRITICAL,
					oldSafetycritical, safetycritical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<autoDesigner1.Process> getProcess() {
		if (process == null) {
			process = new EObjectContainmentEList<autoDesigner1.Process>(autoDesigner1.Process.class, this,
					AutoDesigner1Package.APPLICATION__PROCESS);
		}
		return process;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.APPLICATION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CamMapping getCammapping() {
		if (cammapping != null && cammapping.eIsProxy()) {
			InternalEObject oldCammapping = (InternalEObject) cammapping;
			cammapping = (CamMapping) eResolveProxy(oldCammapping);
			if (cammapping != oldCammapping) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AutoDesigner1Package.APPLICATION__CAMMAPPING, oldCammapping, cammapping));
			}
		}
		return cammapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CamMapping basicGetCammapping() {
		return cammapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCammapping(CamMapping newCammapping) {
		CamMapping oldCammapping = cammapping;
		cammapping = newCammapping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.APPLICATION__CAMMAPPING,
					oldCammapping, cammapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LidarMapping getLidarmapping() {
		if (lidarmapping != null && lidarmapping.eIsProxy()) {
			InternalEObject oldLidarmapping = (InternalEObject) lidarmapping;
			lidarmapping = (LidarMapping) eResolveProxy(oldLidarmapping);
			if (lidarmapping != oldLidarmapping) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AutoDesigner1Package.APPLICATION__LIDARMAPPING, oldLidarmapping, lidarmapping));
			}
		}
		return lidarmapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LidarMapping basicGetLidarmapping() {
		return lidarmapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLidarmapping(LidarMapping newLidarmapping) {
		LidarMapping oldLidarmapping = lidarmapping;
		lidarmapping = newLidarmapping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.APPLICATION__LIDARMAPPING,
					oldLidarmapping, lidarmapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AutoDesigner1Package.APPLICATION__PROCESS:
			return ((InternalEList<?>) getProcess()).basicRemove(otherEnd, msgs);
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
		case AutoDesigner1Package.APPLICATION__NAME:
			return getName();
		case AutoDesigner1Package.APPLICATION__COST:
			return getCost();
		case AutoDesigner1Package.APPLICATION__MAPPINGS:
			return getMappings();
		case AutoDesigner1Package.APPLICATION__APP_GUROBI:
			return getApp_gurobi();
		case AutoDesigner1Package.APPLICATION__SOURCE:
			return getSource();
		case AutoDesigner1Package.APPLICATION__DESTINATION:
			return getDestination();
		case AutoDesigner1Package.APPLICATION__SAFETYCRITICAL:
			return isSafetycritical();
		case AutoDesigner1Package.APPLICATION__PROCESS:
			return getProcess();
		case AutoDesigner1Package.APPLICATION__ID:
			return getId();
		case AutoDesigner1Package.APPLICATION__CAMMAPPING:
			if (resolve)
				return getCammapping();
			return basicGetCammapping();
		case AutoDesigner1Package.APPLICATION__LIDARMAPPING:
			if (resolve)
				return getLidarmapping();
			return basicGetLidarmapping();
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
		case AutoDesigner1Package.APPLICATION__NAME:
			setName((String) newValue);
			return;
		case AutoDesigner1Package.APPLICATION__COST:
			setCost((Integer) newValue);
			return;
		case AutoDesigner1Package.APPLICATION__MAPPINGS:
			getMappings().clear();
			getMappings().addAll((Collection<? extends Mapping>) newValue);
			return;
		case AutoDesigner1Package.APPLICATION__APP_GUROBI:
			setApp_gurobi((GRBVar) newValue);
			return;
		case AutoDesigner1Package.APPLICATION__SOURCE:
			setSource((Integer) newValue);
			return;
		case AutoDesigner1Package.APPLICATION__DESTINATION:
			setDestination((Integer) newValue);
			return;
		case AutoDesigner1Package.APPLICATION__SAFETYCRITICAL:
			setSafetycritical((Boolean) newValue);
			return;
		case AutoDesigner1Package.APPLICATION__PROCESS:
			getProcess().clear();
			getProcess().addAll((Collection<? extends autoDesigner1.Process>) newValue);
			return;
		case AutoDesigner1Package.APPLICATION__ID:
			setId((String) newValue);
			return;
		case AutoDesigner1Package.APPLICATION__CAMMAPPING:
			setCammapping((CamMapping) newValue);
			return;
		case AutoDesigner1Package.APPLICATION__LIDARMAPPING:
			setLidarmapping((LidarMapping) newValue);
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
		case AutoDesigner1Package.APPLICATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case AutoDesigner1Package.APPLICATION__COST:
			setCost(COST_EDEFAULT);
			return;
		case AutoDesigner1Package.APPLICATION__MAPPINGS:
			getMappings().clear();
			return;
		case AutoDesigner1Package.APPLICATION__APP_GUROBI:
			setApp_gurobi(APP_GUROBI_EDEFAULT);
			return;
		case AutoDesigner1Package.APPLICATION__SOURCE:
			setSource(SOURCE_EDEFAULT);
			return;
		case AutoDesigner1Package.APPLICATION__DESTINATION:
			setDestination(DESTINATION_EDEFAULT);
			return;
		case AutoDesigner1Package.APPLICATION__SAFETYCRITICAL:
			setSafetycritical(SAFETYCRITICAL_EDEFAULT);
			return;
		case AutoDesigner1Package.APPLICATION__PROCESS:
			getProcess().clear();
			return;
		case AutoDesigner1Package.APPLICATION__ID:
			setId(ID_EDEFAULT);
			return;
		case AutoDesigner1Package.APPLICATION__CAMMAPPING:
			setCammapping((CamMapping) null);
			return;
		case AutoDesigner1Package.APPLICATION__LIDARMAPPING:
			setLidarmapping((LidarMapping) null);
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
		case AutoDesigner1Package.APPLICATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case AutoDesigner1Package.APPLICATION__COST:
			return cost != COST_EDEFAULT;
		case AutoDesigner1Package.APPLICATION__MAPPINGS:
			return mappings != null && !mappings.isEmpty();
		case AutoDesigner1Package.APPLICATION__APP_GUROBI:
			return APP_GUROBI_EDEFAULT == null ? app_gurobi != null : !APP_GUROBI_EDEFAULT.equals(app_gurobi);
		case AutoDesigner1Package.APPLICATION__SOURCE:
			return source != SOURCE_EDEFAULT;
		case AutoDesigner1Package.APPLICATION__DESTINATION:
			return destination != DESTINATION_EDEFAULT;
		case AutoDesigner1Package.APPLICATION__SAFETYCRITICAL:
			return safetycritical != SAFETYCRITICAL_EDEFAULT;
		case AutoDesigner1Package.APPLICATION__PROCESS:
			return process != null && !process.isEmpty();
		case AutoDesigner1Package.APPLICATION__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case AutoDesigner1Package.APPLICATION__CAMMAPPING:
			return cammapping != null;
		case AutoDesigner1Package.APPLICATION__LIDARMAPPING:
			return lidarmapping != null;
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
		result.append(", app_gurobi: ");
		result.append(app_gurobi);
		result.append(", source: ");
		result.append(source);
		result.append(", destination: ");
		result.append(destination);
		result.append(", safetycritical: ");
		result.append(safetycritical);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ApplicationImpl
