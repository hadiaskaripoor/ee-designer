/**
 */
package autoDesigner1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HPCU</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link autoDesigner1.HPCU#getGpus <em>Gpus</em>}</li>
 *   <li>{@link autoDesigner1.HPCU#getMemories <em>Memories</em>}</li>
 *   <li>{@link autoDesigner1.HPCU#getProcessors <em>Processors</em>}</li>
 *   <li>{@link autoDesigner1.HPCU#getPartitions <em>Partitions</em>}</li>
 * </ul>
 *
 * @see autoDesigner1.AutoDesigner1Package#getHPCU()
 * @model
 * @generated
 */
public interface HPCU extends Node, ControllNode {

	/**
	 * Returns the value of the '<em><b>Gpus</b></em>' containment reference list.
	 * The list contents are of type {@link autoDesigner1.GPU}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gpus</em>' containment reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getHPCU_Gpus()
	 * @model containment="true"
	 * @generated
	 */
	EList<GPU> getGpus();

	/**
	 * Returns the value of the '<em><b>Memories</b></em>' containment reference list.
	 * The list contents are of type {@link autoDesigner1.Memory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memories</em>' containment reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getHPCU_Memories()
	 * @model containment="true"
	 * @generated
	 */
	EList<Memory> getMemories();

	/**
	 * Returns the value of the '<em><b>Processors</b></em>' containment reference list.
	 * The list contents are of type {@link autoDesigner1.Processor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processors</em>' containment reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getHPCU_Processors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Processor> getProcessors();

	/**
	 * Returns the value of the '<em><b>Partitions</b></em>' containment reference list.
	 * The list contents are of type {@link autoDesigner1.Partition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partitions</em>' containment reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getHPCU_Partitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Partition> getPartitions();
} // HPCU
