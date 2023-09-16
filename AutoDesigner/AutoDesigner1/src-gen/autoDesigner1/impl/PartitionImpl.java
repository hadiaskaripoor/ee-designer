/**
 */
package autoDesigner1.impl;

import autoDesigner1.AutoDesigner1Package;
import autoDesigner1.Cache;
import autoDesigner1.Ethernet;
import autoDesigner1.Memory;
import autoDesigner1.Partition;
import autoDesigner1.USB;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link autoDesigner1.impl.PartitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link autoDesigner1.impl.PartitionImpl#isSafety_critical <em>Safety critical</em>}</li>
 *   <li>{@link autoDesigner1.impl.PartitionImpl#getCapacity_GB <em>Capacity GB</em>}</li>
 *   <li>{@link autoDesigner1.impl.PartitionImpl#getMemory <em>Memory</em>}</li>
 *   <li>{@link autoDesigner1.impl.PartitionImpl#getEthernet <em>Ethernet</em>}</li>
 *   <li>{@link autoDesigner1.impl.PartitionImpl#getUsb <em>Usb</em>}</li>
 *   <li>{@link autoDesigner1.impl.PartitionImpl#getCache <em>Cache</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartitionImpl extends MinimalEObjectImpl.Container implements Partition {
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
	 * The default value of the '{@link #isSafety_critical() <em>Safety critical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSafety_critical()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SAFETY_CRITICAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSafety_critical() <em>Safety critical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSafety_critical()
	 * @generated
	 * @ordered
	 */
	protected boolean safety_critical = SAFETY_CRITICAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapacity_GB() <em>Capacity GB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity_GB()
	 * @generated
	 * @ordered
	 */
	protected static final int CAPACITY_GB_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCapacity_GB() <em>Capacity GB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity_GB()
	 * @generated
	 * @ordered
	 */
	protected int capacity_GB = CAPACITY_GB_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMemory() <em>Memory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory()
	 * @generated
	 * @ordered
	 */
	protected Memory memory;

	/**
	 * The cached value of the '{@link #getEthernet() <em>Ethernet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEthernet()
	 * @generated
	 * @ordered
	 */
	protected Ethernet ethernet;

	/**
	 * The cached value of the '{@link #getUsb() <em>Usb</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsb()
	 * @generated
	 * @ordered
	 */
	protected USB usb;

	/**
	 * The cached value of the '{@link #getCache() <em>Cache</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCache()
	 * @generated
	 * @ordered
	 */
	protected Cache cache;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AutoDesigner1Package.Literals.PARTITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.PARTITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSafety_critical() {
		return safety_critical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSafety_critical(boolean newSafety_critical) {
		boolean oldSafety_critical = safety_critical;
		safety_critical = newSafety_critical;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.PARTITION__SAFETY_CRITICAL,
					oldSafety_critical, safety_critical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCapacity_GB() {
		return capacity_GB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacity_GB(int newCapacity_GB) {
		int oldCapacity_GB = capacity_GB;
		capacity_GB = newCapacity_GB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.PARTITION__CAPACITY_GB,
					oldCapacity_GB, capacity_GB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Memory getMemory() {
		if (memory != null && memory.eIsProxy()) {
			InternalEObject oldMemory = (InternalEObject) memory;
			memory = (Memory) eResolveProxy(oldMemory);
			if (memory != oldMemory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AutoDesigner1Package.PARTITION__MEMORY,
							oldMemory, memory));
			}
		}
		return memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Memory basicGetMemory() {
		return memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemory(Memory newMemory) {
		Memory oldMemory = memory;
		memory = newMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.PARTITION__MEMORY, oldMemory,
					memory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ethernet getEthernet() {
		if (ethernet != null && ethernet.eIsProxy()) {
			InternalEObject oldEthernet = (InternalEObject) ethernet;
			ethernet = (Ethernet) eResolveProxy(oldEthernet);
			if (ethernet != oldEthernet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AutoDesigner1Package.PARTITION__ETHERNET,
							oldEthernet, ethernet));
			}
		}
		return ethernet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ethernet basicGetEthernet() {
		return ethernet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEthernet(Ethernet newEthernet) {
		Ethernet oldEthernet = ethernet;
		ethernet = newEthernet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.PARTITION__ETHERNET, oldEthernet,
					ethernet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public USB getUsb() {
		if (usb != null && usb.eIsProxy()) {
			InternalEObject oldUsb = (InternalEObject) usb;
			usb = (USB) eResolveProxy(oldUsb);
			if (usb != oldUsb) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AutoDesigner1Package.PARTITION__USB,
							oldUsb, usb));
			}
		}
		return usb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public USB basicGetUsb() {
		return usb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsb(USB newUsb) {
		USB oldUsb = usb;
		usb = newUsb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.PARTITION__USB, oldUsb, usb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cache getCache() {
		if (cache != null && cache.eIsProxy()) {
			InternalEObject oldCache = (InternalEObject) cache;
			cache = (Cache) eResolveProxy(oldCache);
			if (cache != oldCache) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AutoDesigner1Package.PARTITION__CACHE,
							oldCache, cache));
			}
		}
		return cache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cache basicGetCache() {
		return cache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCache(Cache newCache) {
		Cache oldCache = cache;
		cache = newCache;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.PARTITION__CACHE, oldCache,
					cache));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AutoDesigner1Package.PARTITION__NAME:
			return getName();
		case AutoDesigner1Package.PARTITION__SAFETY_CRITICAL:
			return isSafety_critical();
		case AutoDesigner1Package.PARTITION__CAPACITY_GB:
			return getCapacity_GB();
		case AutoDesigner1Package.PARTITION__MEMORY:
			if (resolve)
				return getMemory();
			return basicGetMemory();
		case AutoDesigner1Package.PARTITION__ETHERNET:
			if (resolve)
				return getEthernet();
			return basicGetEthernet();
		case AutoDesigner1Package.PARTITION__USB:
			if (resolve)
				return getUsb();
			return basicGetUsb();
		case AutoDesigner1Package.PARTITION__CACHE:
			if (resolve)
				return getCache();
			return basicGetCache();
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
		case AutoDesigner1Package.PARTITION__NAME:
			setName((String) newValue);
			return;
		case AutoDesigner1Package.PARTITION__SAFETY_CRITICAL:
			setSafety_critical((Boolean) newValue);
			return;
		case AutoDesigner1Package.PARTITION__CAPACITY_GB:
			setCapacity_GB((Integer) newValue);
			return;
		case AutoDesigner1Package.PARTITION__MEMORY:
			setMemory((Memory) newValue);
			return;
		case AutoDesigner1Package.PARTITION__ETHERNET:
			setEthernet((Ethernet) newValue);
			return;
		case AutoDesigner1Package.PARTITION__USB:
			setUsb((USB) newValue);
			return;
		case AutoDesigner1Package.PARTITION__CACHE:
			setCache((Cache) newValue);
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
		case AutoDesigner1Package.PARTITION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case AutoDesigner1Package.PARTITION__SAFETY_CRITICAL:
			setSafety_critical(SAFETY_CRITICAL_EDEFAULT);
			return;
		case AutoDesigner1Package.PARTITION__CAPACITY_GB:
			setCapacity_GB(CAPACITY_GB_EDEFAULT);
			return;
		case AutoDesigner1Package.PARTITION__MEMORY:
			setMemory((Memory) null);
			return;
		case AutoDesigner1Package.PARTITION__ETHERNET:
			setEthernet((Ethernet) null);
			return;
		case AutoDesigner1Package.PARTITION__USB:
			setUsb((USB) null);
			return;
		case AutoDesigner1Package.PARTITION__CACHE:
			setCache((Cache) null);
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
		case AutoDesigner1Package.PARTITION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case AutoDesigner1Package.PARTITION__SAFETY_CRITICAL:
			return safety_critical != SAFETY_CRITICAL_EDEFAULT;
		case AutoDesigner1Package.PARTITION__CAPACITY_GB:
			return capacity_GB != CAPACITY_GB_EDEFAULT;
		case AutoDesigner1Package.PARTITION__MEMORY:
			return memory != null;
		case AutoDesigner1Package.PARTITION__ETHERNET:
			return ethernet != null;
		case AutoDesigner1Package.PARTITION__USB:
			return usb != null;
		case AutoDesigner1Package.PARTITION__CACHE:
			return cache != null;
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
		result.append(", safety_critical: ");
		result.append(safety_critical);
		result.append(", capacity_GB: ");
		result.append(capacity_GB);
		result.append(')');
		return result.toString();
	}

} //PartitionImpl
