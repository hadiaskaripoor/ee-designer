/**
 */
package autoDesigner1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ECU</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link autoDesigner1.ECU#getMemories <em>Memories</em>}</li>
 *   <li>{@link autoDesigner1.ECU#getProcessors <em>Processors</em>}</li>
 * </ul>
 *
 * @see autoDesigner1.AutoDesigner1Package#getECU()
 * @model
 * @generated
 */
public interface ECU extends Node, ControllNode {

	/**
	 * Returns the value of the '<em><b>Memories</b></em>' containment reference list.
	 * The list contents are of type {@link autoDesigner1.Memory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memories</em>' containment reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getECU_Memories()
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
	 * @see autoDesigner1.AutoDesigner1Package#getECU_Processors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Processor> getProcessors();
} // ECU
