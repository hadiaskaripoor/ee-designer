/**
 */
package autoDesigner1.impl;

import autoDesigner1.AutoDesigner1Package;
import autoDesigner1.DDRType;
import autoDesigner1.Memory;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Memory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link autoDesigner1.impl.MemoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link autoDesigner1.impl.MemoryImpl#getDDR_Type <em>DDR Type</em>}</li>
 *   <li>{@link autoDesigner1.impl.MemoryImpl#getMemory_size_gb <em>Memory size gb</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemoryImpl extends MinimalEObjectImpl.Container implements Memory {
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
	 * The default value of the '{@link #getDDR_Type() <em>DDR Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDDR_Type()
	 * @generated
	 * @ordered
	 */
	protected static final DDRType DDR_TYPE_EDEFAULT = DDRType.DDR;

	/**
	 * The cached value of the '{@link #getDDR_Type() <em>DDR Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDDR_Type()
	 * @generated
	 * @ordered
	 */
	protected DDRType ddR_Type = DDR_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemory_size_gb() <em>Memory size gb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory_size_gb()
	 * @generated
	 * @ordered
	 */
	protected static final int MEMORY_SIZE_GB_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMemory_size_gb() <em>Memory size gb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory_size_gb()
	 * @generated
	 * @ordered
	 */
	protected int memory_size_gb = MEMORY_SIZE_GB_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AutoDesigner1Package.Literals.MEMORY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.MEMORY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DDRType getDDR_Type() {
		return ddR_Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDDR_Type(DDRType newDDR_Type) {
		DDRType oldDDR_Type = ddR_Type;
		ddR_Type = newDDR_Type == null ? DDR_TYPE_EDEFAULT : newDDR_Type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.MEMORY__DDR_TYPE, oldDDR_Type,
					ddR_Type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMemory_size_gb() {
		return memory_size_gb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemory_size_gb(int newMemory_size_gb) {
		int oldMemory_size_gb = memory_size_gb;
		memory_size_gb = newMemory_size_gb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.MEMORY__MEMORY_SIZE_GB,
					oldMemory_size_gb, memory_size_gb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AutoDesigner1Package.MEMORY__NAME:
			return getName();
		case AutoDesigner1Package.MEMORY__DDR_TYPE:
			return getDDR_Type();
		case AutoDesigner1Package.MEMORY__MEMORY_SIZE_GB:
			return getMemory_size_gb();
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
		case AutoDesigner1Package.MEMORY__NAME:
			setName((String) newValue);
			return;
		case AutoDesigner1Package.MEMORY__DDR_TYPE:
			setDDR_Type((DDRType) newValue);
			return;
		case AutoDesigner1Package.MEMORY__MEMORY_SIZE_GB:
			setMemory_size_gb((Integer) newValue);
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
		case AutoDesigner1Package.MEMORY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case AutoDesigner1Package.MEMORY__DDR_TYPE:
			setDDR_Type(DDR_TYPE_EDEFAULT);
			return;
		case AutoDesigner1Package.MEMORY__MEMORY_SIZE_GB:
			setMemory_size_gb(MEMORY_SIZE_GB_EDEFAULT);
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
		case AutoDesigner1Package.MEMORY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case AutoDesigner1Package.MEMORY__DDR_TYPE:
			return ddR_Type != DDR_TYPE_EDEFAULT;
		case AutoDesigner1Package.MEMORY__MEMORY_SIZE_GB:
			return memory_size_gb != MEMORY_SIZE_GB_EDEFAULT;
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
		result.append(", DDR_Type: ");
		result.append(ddR_Type);
		result.append(", memory_size_gb: ");
		result.append(memory_size_gb);
		result.append(')');
		return result.toString();
	}

} //MemoryImpl
