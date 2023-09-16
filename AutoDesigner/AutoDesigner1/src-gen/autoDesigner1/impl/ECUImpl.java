/**
 */
package autoDesigner1.impl;

import autoDesigner1.AutoDesigner1Package;
import autoDesigner1.ECU;

import autoDesigner1.Memory;
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
 * An implementation of the model object '<em><b>ECU</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link autoDesigner1.impl.ECUImpl#getMemories <em>Memories</em>}</li>
 *   <li>{@link autoDesigner1.impl.ECUImpl#getProcessors <em>Processors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ECUImpl extends NodeImpl implements ECU {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ECUImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AutoDesigner1Package.Literals.ECU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Memory> getMemories() {
		if (memories == null) {
			memories = new EObjectContainmentEList<Memory>(Memory.class, this, AutoDesigner1Package.ECU__MEMORIES);
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
					AutoDesigner1Package.ECU__PROCESSORS);
		}
		return processors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AutoDesigner1Package.ECU__MEMORIES:
			return ((InternalEList<?>) getMemories()).basicRemove(otherEnd, msgs);
		case AutoDesigner1Package.ECU__PROCESSORS:
			return ((InternalEList<?>) getProcessors()).basicRemove(otherEnd, msgs);
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
		case AutoDesigner1Package.ECU__MEMORIES:
			return getMemories();
		case AutoDesigner1Package.ECU__PROCESSORS:
			return getProcessors();
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
		case AutoDesigner1Package.ECU__MEMORIES:
			getMemories().clear();
			getMemories().addAll((Collection<? extends Memory>) newValue);
			return;
		case AutoDesigner1Package.ECU__PROCESSORS:
			getProcessors().clear();
			getProcessors().addAll((Collection<? extends Processor>) newValue);
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
		case AutoDesigner1Package.ECU__MEMORIES:
			getMemories().clear();
			return;
		case AutoDesigner1Package.ECU__PROCESSORS:
			getProcessors().clear();
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
		case AutoDesigner1Package.ECU__MEMORIES:
			return memories != null && !memories.isEmpty();
		case AutoDesigner1Package.ECU__PROCESSORS:
			return processors != null && !processors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ECUImpl
