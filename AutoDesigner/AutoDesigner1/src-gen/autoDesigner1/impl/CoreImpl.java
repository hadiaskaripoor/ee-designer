/**
 */
package autoDesigner1.impl;

import autoDesigner1.Asil_Level;
import autoDesigner1.AutoDesigner1Package;
import autoDesigner1.Core;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Core</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link autoDesigner1.impl.CoreImpl#getName <em>Name</em>}</li>
 *   <li>{@link autoDesigner1.impl.CoreImpl#getClock_frequency_ghz <em>Clock frequency ghz</em>}</li>
 *   <li>{@link autoDesigner1.impl.CoreImpl#isAsil_d <em>Asil d</em>}</li>
 *   <li>{@link autoDesigner1.impl.CoreImpl#getAsil <em>Asil</em>}</li>
 *   <li>{@link autoDesigner1.impl.CoreImpl#isTurbo_boost <em>Turbo boost</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoreImpl extends MinimalEObjectImpl.Container implements Core {
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
	 * The default value of the '{@link #getClock_frequency_ghz() <em>Clock frequency ghz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClock_frequency_ghz()
	 * @generated
	 * @ordered
	 */
	protected static final float CLOCK_FREQUENCY_GHZ_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getClock_frequency_ghz() <em>Clock frequency ghz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClock_frequency_ghz()
	 * @generated
	 * @ordered
	 */
	protected float clock_frequency_ghz = CLOCK_FREQUENCY_GHZ_EDEFAULT;

	/**
	 * The default value of the '{@link #isAsil_d() <em>Asil d</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAsil_d()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ASIL_D_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAsil_d() <em>Asil d</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAsil_d()
	 * @generated
	 * @ordered
	 */
	protected boolean asil_d = ASIL_D_EDEFAULT;

	/**
	 * The default value of the '{@link #getAsil() <em>Asil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsil()
	 * @generated
	 * @ordered
	 */
	protected static final Asil_Level ASIL_EDEFAULT = Asil_Level.QM;

	/**
	 * The cached value of the '{@link #getAsil() <em>Asil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsil()
	 * @generated
	 * @ordered
	 */
	protected Asil_Level asil = ASIL_EDEFAULT;

	/**
	 * The default value of the '{@link #isTurbo_boost() <em>Turbo boost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTurbo_boost()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TURBO_BOOST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTurbo_boost() <em>Turbo boost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTurbo_boost()
	 * @generated
	 * @ordered
	 */
	protected boolean turbo_boost = TURBO_BOOST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AutoDesigner1Package.Literals.CORE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.CORE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getClock_frequency_ghz() {
		return clock_frequency_ghz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClock_frequency_ghz(float newClock_frequency_ghz) {
		float oldClock_frequency_ghz = clock_frequency_ghz;
		clock_frequency_ghz = newClock_frequency_ghz;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.CORE__CLOCK_FREQUENCY_GHZ,
					oldClock_frequency_ghz, clock_frequency_ghz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAsil_d() {
		return asil_d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsil_d(boolean newAsil_d) {
		boolean oldAsil_d = asil_d;
		asil_d = newAsil_d;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.CORE__ASIL_D, oldAsil_d,
					asil_d));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asil_Level getAsil() {
		return asil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsil(Asil_Level newAsil) {
		Asil_Level oldAsil = asil;
		asil = newAsil == null ? ASIL_EDEFAULT : newAsil;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.CORE__ASIL, oldAsil, asil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTurbo_boost() {
		return turbo_boost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTurbo_boost(boolean newTurbo_boost) {
		boolean oldTurbo_boost = turbo_boost;
		turbo_boost = newTurbo_boost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.CORE__TURBO_BOOST,
					oldTurbo_boost, turbo_boost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AutoDesigner1Package.CORE__NAME:
			return getName();
		case AutoDesigner1Package.CORE__CLOCK_FREQUENCY_GHZ:
			return getClock_frequency_ghz();
		case AutoDesigner1Package.CORE__ASIL_D:
			return isAsil_d();
		case AutoDesigner1Package.CORE__ASIL:
			return getAsil();
		case AutoDesigner1Package.CORE__TURBO_BOOST:
			return isTurbo_boost();
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
		case AutoDesigner1Package.CORE__NAME:
			setName((String) newValue);
			return;
		case AutoDesigner1Package.CORE__CLOCK_FREQUENCY_GHZ:
			setClock_frequency_ghz((Float) newValue);
			return;
		case AutoDesigner1Package.CORE__ASIL_D:
			setAsil_d((Boolean) newValue);
			return;
		case AutoDesigner1Package.CORE__ASIL:
			setAsil((Asil_Level) newValue);
			return;
		case AutoDesigner1Package.CORE__TURBO_BOOST:
			setTurbo_boost((Boolean) newValue);
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
		case AutoDesigner1Package.CORE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case AutoDesigner1Package.CORE__CLOCK_FREQUENCY_GHZ:
			setClock_frequency_ghz(CLOCK_FREQUENCY_GHZ_EDEFAULT);
			return;
		case AutoDesigner1Package.CORE__ASIL_D:
			setAsil_d(ASIL_D_EDEFAULT);
			return;
		case AutoDesigner1Package.CORE__ASIL:
			setAsil(ASIL_EDEFAULT);
			return;
		case AutoDesigner1Package.CORE__TURBO_BOOST:
			setTurbo_boost(TURBO_BOOST_EDEFAULT);
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
		case AutoDesigner1Package.CORE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case AutoDesigner1Package.CORE__CLOCK_FREQUENCY_GHZ:
			return clock_frequency_ghz != CLOCK_FREQUENCY_GHZ_EDEFAULT;
		case AutoDesigner1Package.CORE__ASIL_D:
			return asil_d != ASIL_D_EDEFAULT;
		case AutoDesigner1Package.CORE__ASIL:
			return asil != ASIL_EDEFAULT;
		case AutoDesigner1Package.CORE__TURBO_BOOST:
			return turbo_boost != TURBO_BOOST_EDEFAULT;
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
		result.append(", clock_frequency_ghz: ");
		result.append(clock_frequency_ghz);
		result.append(", asil_d: ");
		result.append(asil_d);
		result.append(", Asil: ");
		result.append(asil);
		result.append(", turbo_boost: ");
		result.append(turbo_boost);
		result.append(')');
		return result.toString();
	}

} //CoreImpl
