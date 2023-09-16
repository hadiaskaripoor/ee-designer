/**
 */
package autoDesigner1.impl;

import autoDesigner1.AutoDesigner1Package;
import autoDesigner1.GPU;
import autoDesigner1.HPCU;

import autoDesigner1.Memory;
import autoDesigner1.Partition;
import autoDesigner1.Processor;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HPCU</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link autoDesigner1.impl.HPCUImpl#getGpus <em>Gpus</em>}</li>
 *   <li>{@link autoDesigner1.impl.HPCUImpl#getMemories <em>Memories</em>}</li>
 *   <li>{@link autoDesigner1.impl.HPCUImpl#getProcessors <em>Processors</em>}</li>
 *   <li>{@link autoDesigner1.impl.HPCUImpl#getPartitions <em>Partitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HPCUImpl extends NodeImpl implements HPCU {
	/**
	 * The cached value of the '{@link #getGpus() <em>Gpus</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGpus()
	 * @generated
	 * @ordered
	 */
	protected EList<GPU> gpus;
	/**
	 * The cached value of the '{@link #getMemories() <em>Memories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemories()
	 * @generated
	 * @ordered
	 */
	protected EList<Memory> memories;
	/**
	 * The cached value of the '{@link #getProcessors() <em>Processors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessors()
	 * @generated
	 * @ordered
	 */
	protected EList<Processor> processors;

	/**
	 * The cached value of the '{@link #getPartitions() <em>Partitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Partition> partitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HPCUImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AutoDesigner1Package.Literals.HPCU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GPU> getGpus() {
		if (gpus == null) {
			gpus = new EObjectContainmentEList<GPU>(GPU.class, this, AutoDesigner1Package.HPCU__GPUS);
		}
		return gpus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Memory> getMemories() {
		if (memories == null) {
			memories = new EObjectContainmentEList<Memory>(Memory.class, this, AutoDesigner1Package.HPCU__MEMORIES);
		}
		return memories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Processor> getProcessors() {
		if (processors == null) {
			processors = new EObjectContainmentEList<Processor>(Processor.class, this,
					AutoDesigner1Package.HPCU__PROCESSORS);
		}
		return processors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Partition> getPartitions() {
		if (partitions == null) {
			partitions = new EObjectContainmentEList<Partition>(Partition.class, this,
					AutoDesigner1Package.HPCU__PARTITIONS);
		}
		return partitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AutoDesigner1Package.HPCU__GPUS:
			return ((InternalEList<?>) getGpus()).basicRemove(otherEnd, msgs);
		case AutoDesigner1Package.HPCU__MEMORIES:
			return ((InternalEList<?>) getMemories()).basicRemove(otherEnd, msgs);
		case AutoDesigner1Package.HPCU__PROCESSORS:
			return ((InternalEList<?>) getProcessors()).basicRemove(otherEnd, msgs);
		case AutoDesigner1Package.HPCU__PARTITIONS:
			return ((InternalEList<?>) getPartitions()).basicRemove(otherEnd, msgs);
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
		case AutoDesigner1Package.HPCU__GPUS:
			return getGpus();
		case AutoDesigner1Package.HPCU__MEMORIES:
			return getMemories();
		case AutoDesigner1Package.HPCU__PROCESSORS:
			return getProcessors();
		case AutoDesigner1Package.HPCU__PARTITIONS:
			return getPartitions();
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
		case AutoDesigner1Package.HPCU__GPUS:
			getGpus().clear();
			getGpus().addAll((Collection<? extends GPU>) newValue);
			return;
		case AutoDesigner1Package.HPCU__MEMORIES:
			getMemories().clear();
			getMemories().addAll((Collection<? extends Memory>) newValue);
			return;
		case AutoDesigner1Package.HPCU__PROCESSORS:
			getProcessors().clear();
			getProcessors().addAll((Collection<? extends Processor>) newValue);
			return;
		case AutoDesigner1Package.HPCU__PARTITIONS:
			getPartitions().clear();
			getPartitions().addAll((Collection<? extends Partition>) newValue);
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
		case AutoDesigner1Package.HPCU__GPUS:
			getGpus().clear();
			return;
		case AutoDesigner1Package.HPCU__MEMORIES:
			getMemories().clear();
			return;
		case AutoDesigner1Package.HPCU__PROCESSORS:
			getProcessors().clear();
			return;
		case AutoDesigner1Package.HPCU__PARTITIONS:
			getPartitions().clear();
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
		case AutoDesigner1Package.HPCU__GPUS:
			return gpus != null && !gpus.isEmpty();
		case AutoDesigner1Package.HPCU__MEMORIES:
			return memories != null && !memories.isEmpty();
		case AutoDesigner1Package.HPCU__PROCESSORS:
			return processors != null && !processors.isEmpty();
		case AutoDesigner1Package.HPCU__PARTITIONS:
			return partitions != null && !partitions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HPCUImpl
