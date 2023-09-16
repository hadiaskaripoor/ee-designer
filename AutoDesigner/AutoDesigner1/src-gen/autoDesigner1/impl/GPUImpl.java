/**
 */
package autoDesigner1.impl;

import autoDesigner1.AutoDesigner1Package;
import autoDesigner1.GPU;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GPU</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link autoDesigner1.impl.GPUImpl#getName <em>Name</em>}</li>
 *   <li>{@link autoDesigner1.impl.GPUImpl#getMemory_size_in_GB <em>Memory size in GB</em>}</li>
 *   <li>{@link autoDesigner1.impl.GPUImpl#getCuda_cores <em>Cuda cores</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GPUImpl extends MinimalEObjectImpl.Container implements GPU {
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
	 * The default value of the '{@link #getMemory_size_in_GB() <em>Memory size in GB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory_size_in_GB()
	 * @generated
	 * @ordered
	 */
	protected static final int MEMORY_SIZE_IN_GB_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMemory_size_in_GB() <em>Memory size in GB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory_size_in_GB()
	 * @generated
	 * @ordered
	 */
	protected int memory_size_in_GB = MEMORY_SIZE_IN_GB_EDEFAULT;

	/**
	 * The default value of the '{@link #getCuda_cores() <em>Cuda cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCuda_cores()
	 * @generated
	 * @ordered
	 */
	protected static final int CUDA_CORES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCuda_cores() <em>Cuda cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCuda_cores()
	 * @generated
	 * @ordered
	 */
	protected int cuda_cores = CUDA_CORES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GPUImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AutoDesigner1Package.Literals.GPU;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.GPU__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMemory_size_in_GB() {
		return memory_size_in_GB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemory_size_in_GB(int newMemory_size_in_GB) {
		int oldMemory_size_in_GB = memory_size_in_GB;
		memory_size_in_GB = newMemory_size_in_GB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.GPU__MEMORY_SIZE_IN_GB,
					oldMemory_size_in_GB, memory_size_in_GB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCuda_cores() {
		return cuda_cores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCuda_cores(int newCuda_cores) {
		int oldCuda_cores = cuda_cores;
		cuda_cores = newCuda_cores;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutoDesigner1Package.GPU__CUDA_CORES, oldCuda_cores,
					cuda_cores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AutoDesigner1Package.GPU__NAME:
			return getName();
		case AutoDesigner1Package.GPU__MEMORY_SIZE_IN_GB:
			return getMemory_size_in_GB();
		case AutoDesigner1Package.GPU__CUDA_CORES:
			return getCuda_cores();
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
		case AutoDesigner1Package.GPU__NAME:
			setName((String) newValue);
			return;
		case AutoDesigner1Package.GPU__MEMORY_SIZE_IN_GB:
			setMemory_size_in_GB((Integer) newValue);
			return;
		case AutoDesigner1Package.GPU__CUDA_CORES:
			setCuda_cores((Integer) newValue);
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
		case AutoDesigner1Package.GPU__NAME:
			setName(NAME_EDEFAULT);
			return;
		case AutoDesigner1Package.GPU__MEMORY_SIZE_IN_GB:
			setMemory_size_in_GB(MEMORY_SIZE_IN_GB_EDEFAULT);
			return;
		case AutoDesigner1Package.GPU__CUDA_CORES:
			setCuda_cores(CUDA_CORES_EDEFAULT);
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
		case AutoDesigner1Package.GPU__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case AutoDesigner1Package.GPU__MEMORY_SIZE_IN_GB:
			return memory_size_in_GB != MEMORY_SIZE_IN_GB_EDEFAULT;
		case AutoDesigner1Package.GPU__CUDA_CORES:
			return cuda_cores != CUDA_CORES_EDEFAULT;
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
		result.append(", memory_size_in_GB: ");
		result.append(memory_size_in_GB);
		result.append(", cuda_cores: ");
		result.append(cuda_cores);
		result.append(')');
		return result.toString();
	}

} //GPUImpl
