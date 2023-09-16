/**
 */
package autoDesigner1.impl;

import autoDesigner1.AutoDesigner1Package;
import autoDesigner1.Data;
import autoDesigner1.Optimization_Goal;
import autoDesigner1.Settings;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link autoDesigner1.impl.SettingsImpl#getName <em>Name</em>}</li>
 *   <li>{@link autoDesigner1.impl.SettingsImpl#getOptimizationGoal <em>Optimization Goal</em>}</li>
 *   <li>{@link autoDesigner1.impl.SettingsImpl#isLOR <em>LOR</em>}</li>
 *   <li>{@link autoDesigner1.impl.SettingsImpl#getLORValue <em>LOR Value</em>}</li>
 *   <li>{@link autoDesigner1.impl.SettingsImpl#isCostOptimization <em>Cost Optimization</em>}</li>
 *   <li>{@link autoDesigner1.impl.SettingsImpl#isShowMappings <em>Show Mappings</em>}</li>
 *   <li>{@link autoDesigner1.impl.SettingsImpl#getData <em>Data</em>}</li>
 *   <li>{@link autoDesigner1.impl.SettingsImpl#getRedundantRoutes <em>Redundant Routes</em>}</li>
 *   <li>{@link autoDesigner1.impl.SettingsImpl#getHomogeneousRedundantRoutes <em>Homogeneous Redundant Routes</em>}</li>
 *   <li>{@link autoDesigner1.impl.SettingsImpl#isUseOptimizationGoals <em>Use Optimization Goals</em>}</li>
 *   <li>{@link autoDesigner1.impl.SettingsImpl#getLORPropPosition <em>LOR Prop Position</em>}</li>
 *   <li>{@link autoDesigner1.impl.SettingsImpl#getOptPropPosition <em>Opt Prop Position</em>}</li>
 *   <li>{@link autoDesigner1.impl.SettingsImpl#isResourceUsage <em>Resource Usage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SettingsImpl extends MinimalEObjectImpl.Container implements Settings {
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
	 * The default value of the '{@link #getOptimizationGoal() <em>Optimization Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptimizationGoal()
	 * @generated
	 * @ordered
	 */
	protected static final Optimization_Goal OPTIMIZATION_GOAL_EDEFAULT = Optimization_Goal.END_TO_END_LATENCY;

	/**
	 * The cached value of the '{@link #getOptimizationGoal() <em>Optimization Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptimizationGoal()
	 * @generated
	 * @ordered
	 */
	protected Optimization_Goal optimizationGoal = OPTIMIZATION_GOAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isLOR() <em>LOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLOR()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOR_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isLOR() <em>LOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLOR()
	 * @generated
	 * @ordered
	 */
	protected boolean lor = LOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getLORValue() <em>LOR Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLORValue()
	 * @generated
	 * @ordered
	 */
	protected static final int LOR_VALUE_EDEFAULT = 3;

	/**
	 * The cached value of the '{@link #getLORValue() <em>LOR Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLORValue()
	 * @generated
	 * @ordered
	 */
	protected int lorValue = LOR_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isCostOptimization() <em>Cost Optimization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCostOptimization()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COST_OPTIMIZATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCostOptimization() <em>Cost Optimization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCostOptimization()
	 * @generated
	 * @ordered
	 */
	protected boolean costOptimization = COST_OPTIMIZATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isShowMappings() <em>Show Mappings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowMappings()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_MAPPINGS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isShowMappings() <em>Show Mappings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowMappings()
	 * @generated
	 * @ordered
	 */
	protected boolean showMappings = SHOW_MAPPINGS_EDEFAULT;

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
	 * The default value of the '{@link #getRedundantRoutes() <em>Redundant Routes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedundantRoutes()
	 * @generated
	 * @ordered
	 */
	protected static final int REDUNDANT_ROUTES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRedundantRoutes() <em>Redundant Routes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedundantRoutes()
	 * @generated
	 * @ordered
	 */
	protected int redundantRoutes = REDUNDANT_ROUTES_EDEFAULT;

	/**
	 * The default value of the '{@link #getHomogeneousRedundantRoutes() <em>Homogeneous Redundant Routes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomogeneousRedundantRoutes()
	 * @generated
	 * @ordered
	 */
	protected static final int HOMOGENEOUS_REDUNDANT_ROUTES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHomogeneousRedundantRoutes() <em>Homogeneous Redundant Routes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomogeneousRedundantRoutes()
	 * @generated
	 * @ordered
	 */
	protected int homogeneousRedundantRoutes = HOMOGENEOUS_REDUNDANT_ROUTES_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseOptimizationGoals() <em>Use Optimization Goals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseOptimizationGoals()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_OPTIMIZATION_GOALS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUseOptimizationGoals() <em>Use Optimization Goals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseOptimizationGoals()
	 * @generated
	 * @ordered
	 */
	protected boolean useOptimizationGoals = USE_OPTIMIZATION_GOALS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLORPropPosition() <em>LOR Prop Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLORPropPosition()
	 * @generated
	 * @ordered
	 */
	protected static final int LOR_PROP_POSITION_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getLORPropPosition() <em>LOR Prop Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLORPropPosition()
	 * @generated
	 * @ordered
	 */
	protected int lorPropPosition = LOR_PROP_POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOptPropPosition() <em>Opt Prop Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptPropPosition()
	 * @generated
	 * @ordered
	 */
	protected static final int OPT_PROP_POSITION_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getOptPropPosition() <em>Opt Prop Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptPropPosition()
	 * @generated
	 * @ordered
	 */
	protected int optPropPosition = OPT_PROP_POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #isResourceUsage() <em>Resource Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResourceUsage()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESOURCE_USAGE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isResourceUsage() <em>Resource Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResourceUsage()
	 * @generated
	 * @ordered
	 */
	protected boolean resourceUsage = RESOURCE_USAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AutoDesigner1Package.Literals.SETTINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRedundantRoutes() {
		return redundantRoutes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedundantRoutes(int newRedundantRoutes) {
		int oldRedundantRoutes = redundantRoutes;
		redundantRoutes = newRedundantRoutes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.SETTINGS__REDUNDANT_ROUTES,
					oldRedundantRoutes, redundantRoutes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHomogeneousRedundantRoutes() {
		return homogeneousRedundantRoutes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHomogeneousRedundantRoutes(int newHomogeneousRedundantRoutes) {
		int oldHomogeneousRedundantRoutes = homogeneousRedundantRoutes;
		homogeneousRedundantRoutes = newHomogeneousRedundantRoutes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AutoDesigner1Package.SETTINGS__HOMOGENEOUS_REDUNDANT_ROUTES, oldHomogeneousRedundantRoutes,
					homogeneousRedundantRoutes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseOptimizationGoals() {
		return useOptimizationGoals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseOptimizationGoals(boolean newUseOptimizationGoals) {
		boolean oldUseOptimizationGoals = useOptimizationGoals;
		useOptimizationGoals = newUseOptimizationGoals;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.SETTINGS__USE_OPTIMIZATION_GOALS,
					oldUseOptimizationGoals, useOptimizationGoals));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLORPropPosition() {
		return lorPropPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLORPropPosition(int newLORPropPosition) {
		int oldLORPropPosition = lorPropPosition;
		lorPropPosition = newLORPropPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.SETTINGS__LOR_PROP_POSITION,
					oldLORPropPosition, lorPropPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOptPropPosition() {
		return optPropPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptPropPosition(int newOptPropPosition) {
		int oldOptPropPosition = optPropPosition;
		optPropPosition = newOptPropPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.SETTINGS__OPT_PROP_POSITION,
					oldOptPropPosition, optPropPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isResourceUsage() {
		return resourceUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceUsage(boolean newResourceUsage) {
		boolean oldResourceUsage = resourceUsage;
		resourceUsage = newResourceUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.SETTINGS__RESOURCE_USAGE,
					oldResourceUsage, resourceUsage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Optimization_Goal getOptimizationGoal() {
		return optimizationGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptimizationGoal(Optimization_Goal newOptimizationGoal) {
		Optimization_Goal oldOptimizationGoal = optimizationGoal;
		optimizationGoal = newOptimizationGoal == null ? OPTIMIZATION_GOAL_EDEFAULT : newOptimizationGoal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.SETTINGS__OPTIMIZATION_GOAL,
					oldOptimizationGoal, optimizationGoal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowMappings() {
		return showMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowMappings(boolean newShowMappings) {
		boolean oldShowMappings = showMappings;
		showMappings = newShowMappings;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.SETTINGS__SHOW_MAPPINGS,
					oldShowMappings, showMappings));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.SETTINGS__NAME, oldName, name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AutoDesigner1Package.SETTINGS__DATA,
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
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.SETTINGS__DATA, oldData, data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCostOptimization() {
		return costOptimization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCostOptimization(boolean newCostOptimization) {
		boolean oldCostOptimization = costOptimization;
		costOptimization = newCostOptimization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.SETTINGS__COST_OPTIMIZATION,
					oldCostOptimization, costOptimization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLOR() {
		return lor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLOR(boolean newLOR) {
		boolean oldLOR = lor;
		lor = newLOR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.SETTINGS__LOR, oldLOR, lor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLORValue() {
		return lorValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLORValue(int newLORValue) {
		int oldLORValue = lorValue;
		lorValue = newLORValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.SETTINGS__LOR_VALUE, oldLORValue,
					lorValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AutoDesigner1Package.SETTINGS__NAME:
			return getName();
		case AutoDesigner1Package.SETTINGS__OPTIMIZATION_GOAL:
			return getOptimizationGoal();
		case AutoDesigner1Package.SETTINGS__LOR:
			return isLOR();
		case AutoDesigner1Package.SETTINGS__LOR_VALUE:
			return getLORValue();
		case AutoDesigner1Package.SETTINGS__COST_OPTIMIZATION:
			return isCostOptimization();
		case AutoDesigner1Package.SETTINGS__SHOW_MAPPINGS:
			return isShowMappings();
		case AutoDesigner1Package.SETTINGS__DATA:
			if (resolve)
				return getData();
			return basicGetData();
		case AutoDesigner1Package.SETTINGS__REDUNDANT_ROUTES:
			return getRedundantRoutes();
		case AutoDesigner1Package.SETTINGS__HOMOGENEOUS_REDUNDANT_ROUTES:
			return getHomogeneousRedundantRoutes();
		case AutoDesigner1Package.SETTINGS__USE_OPTIMIZATION_GOALS:
			return isUseOptimizationGoals();
		case AutoDesigner1Package.SETTINGS__LOR_PROP_POSITION:
			return getLORPropPosition();
		case AutoDesigner1Package.SETTINGS__OPT_PROP_POSITION:
			return getOptPropPosition();
		case AutoDesigner1Package.SETTINGS__RESOURCE_USAGE:
			return isResourceUsage();
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
		case AutoDesigner1Package.SETTINGS__NAME:
			setName((String) newValue);
			return;
		case AutoDesigner1Package.SETTINGS__OPTIMIZATION_GOAL:
			setOptimizationGoal((Optimization_Goal) newValue);
			return;
		case AutoDesigner1Package.SETTINGS__LOR:
			setLOR((Boolean) newValue);
			return;
		case AutoDesigner1Package.SETTINGS__LOR_VALUE:
			setLORValue((Integer) newValue);
			return;
		case AutoDesigner1Package.SETTINGS__COST_OPTIMIZATION:
			setCostOptimization((Boolean) newValue);
			return;
		case AutoDesigner1Package.SETTINGS__SHOW_MAPPINGS:
			setShowMappings((Boolean) newValue);
			return;
		case AutoDesigner1Package.SETTINGS__DATA:
			setData((Data) newValue);
			return;
		case AutoDesigner1Package.SETTINGS__REDUNDANT_ROUTES:
			setRedundantRoutes((Integer) newValue);
			return;
		case AutoDesigner1Package.SETTINGS__HOMOGENEOUS_REDUNDANT_ROUTES:
			setHomogeneousRedundantRoutes((Integer) newValue);
			return;
		case AutoDesigner1Package.SETTINGS__USE_OPTIMIZATION_GOALS:
			setUseOptimizationGoals((Boolean) newValue);
			return;
		case AutoDesigner1Package.SETTINGS__LOR_PROP_POSITION:
			setLORPropPosition((Integer) newValue);
			return;
		case AutoDesigner1Package.SETTINGS__OPT_PROP_POSITION:
			setOptPropPosition((Integer) newValue);
			return;
		case AutoDesigner1Package.SETTINGS__RESOURCE_USAGE:
			setResourceUsage((Boolean) newValue);
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
		case AutoDesigner1Package.SETTINGS__NAME:
			setName(NAME_EDEFAULT);
			return;
		case AutoDesigner1Package.SETTINGS__OPTIMIZATION_GOAL:
			setOptimizationGoal(OPTIMIZATION_GOAL_EDEFAULT);
			return;
		case AutoDesigner1Package.SETTINGS__LOR:
			setLOR(LOR_EDEFAULT);
			return;
		case AutoDesigner1Package.SETTINGS__LOR_VALUE:
			setLORValue(LOR_VALUE_EDEFAULT);
			return;
		case AutoDesigner1Package.SETTINGS__COST_OPTIMIZATION:
			setCostOptimization(COST_OPTIMIZATION_EDEFAULT);
			return;
		case AutoDesigner1Package.SETTINGS__SHOW_MAPPINGS:
			setShowMappings(SHOW_MAPPINGS_EDEFAULT);
			return;
		case AutoDesigner1Package.SETTINGS__DATA:
			setData((Data) null);
			return;
		case AutoDesigner1Package.SETTINGS__REDUNDANT_ROUTES:
			setRedundantRoutes(REDUNDANT_ROUTES_EDEFAULT);
			return;
		case AutoDesigner1Package.SETTINGS__HOMOGENEOUS_REDUNDANT_ROUTES:
			setHomogeneousRedundantRoutes(HOMOGENEOUS_REDUNDANT_ROUTES_EDEFAULT);
			return;
		case AutoDesigner1Package.SETTINGS__USE_OPTIMIZATION_GOALS:
			setUseOptimizationGoals(USE_OPTIMIZATION_GOALS_EDEFAULT);
			return;
		case AutoDesigner1Package.SETTINGS__LOR_PROP_POSITION:
			setLORPropPosition(LOR_PROP_POSITION_EDEFAULT);
			return;
		case AutoDesigner1Package.SETTINGS__OPT_PROP_POSITION:
			setOptPropPosition(OPT_PROP_POSITION_EDEFAULT);
			return;
		case AutoDesigner1Package.SETTINGS__RESOURCE_USAGE:
			setResourceUsage(RESOURCE_USAGE_EDEFAULT);
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
		case AutoDesigner1Package.SETTINGS__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case AutoDesigner1Package.SETTINGS__OPTIMIZATION_GOAL:
			return optimizationGoal != OPTIMIZATION_GOAL_EDEFAULT;
		case AutoDesigner1Package.SETTINGS__LOR:
			return lor != LOR_EDEFAULT;
		case AutoDesigner1Package.SETTINGS__LOR_VALUE:
			return lorValue != LOR_VALUE_EDEFAULT;
		case AutoDesigner1Package.SETTINGS__COST_OPTIMIZATION:
			return costOptimization != COST_OPTIMIZATION_EDEFAULT;
		case AutoDesigner1Package.SETTINGS__SHOW_MAPPINGS:
			return showMappings != SHOW_MAPPINGS_EDEFAULT;
		case AutoDesigner1Package.SETTINGS__DATA:
			return data != null;
		case AutoDesigner1Package.SETTINGS__REDUNDANT_ROUTES:
			return redundantRoutes != REDUNDANT_ROUTES_EDEFAULT;
		case AutoDesigner1Package.SETTINGS__HOMOGENEOUS_REDUNDANT_ROUTES:
			return homogeneousRedundantRoutes != HOMOGENEOUS_REDUNDANT_ROUTES_EDEFAULT;
		case AutoDesigner1Package.SETTINGS__USE_OPTIMIZATION_GOALS:
			return useOptimizationGoals != USE_OPTIMIZATION_GOALS_EDEFAULT;
		case AutoDesigner1Package.SETTINGS__LOR_PROP_POSITION:
			return lorPropPosition != LOR_PROP_POSITION_EDEFAULT;
		case AutoDesigner1Package.SETTINGS__OPT_PROP_POSITION:
			return optPropPosition != OPT_PROP_POSITION_EDEFAULT;
		case AutoDesigner1Package.SETTINGS__RESOURCE_USAGE:
			return resourceUsage != RESOURCE_USAGE_EDEFAULT;
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
		result.append(", optimizationGoal: ");
		result.append(optimizationGoal);
		result.append(", LOR: ");
		result.append(lor);
		result.append(", LORValue: ");
		result.append(lorValue);
		result.append(", costOptimization: ");
		result.append(costOptimization);
		result.append(", showMappings: ");
		result.append(showMappings);
		result.append(", redundantRoutes: ");
		result.append(redundantRoutes);
		result.append(", homogeneousRedundantRoutes: ");
		result.append(homogeneousRedundantRoutes);
		result.append(", useOptimizationGoals: ");
		result.append(useOptimizationGoals);
		result.append(", LORPropPosition: ");
		result.append(lorPropPosition);
		result.append(", OptPropPosition: ");
		result.append(optPropPosition);
		result.append(", resourceUsage: ");
		result.append(resourceUsage);
		result.append(')');
		return result.toString();
	}

} //SettingsImpl
