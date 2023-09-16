/**
 */
package autoDesigner1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link autoDesigner1.Processor#getName <em>Name</em>}</li>
 *   <li>{@link autoDesigner1.Processor#isTurbo_boost <em>Turbo boost</em>}</li>
 *   <li>{@link autoDesigner1.Processor#getCores <em>Cores</em>}</li>
 * </ul>
 *
 * @see autoDesigner1.AutoDesigner1Package#getProcessor()
 * @model
 * @generated
 */
public interface Processor extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see autoDesigner1.AutoDesigner1Package#getProcessor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link autoDesigner1.Processor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Turbo boost</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Turbo boost</em>' attribute.
	 * @see #setTurbo_boost(boolean)
	 * @see autoDesigner1.AutoDesigner1Package#getProcessor_Turbo_boost()
	 * @model default="false"
	 * @generated
	 */
	boolean isTurbo_boost();

	/**
	 * Sets the value of the '{@link autoDesigner1.Processor#isTurbo_boost <em>Turbo boost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Turbo boost</em>' attribute.
	 * @see #isTurbo_boost()
	 * @generated
	 */
	void setTurbo_boost(boolean value);

	/**
	 * Returns the value of the '<em><b>Cores</b></em>' containment reference list.
	 * The list contents are of type {@link autoDesigner1.Core}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cores</em>' containment reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getProcessor_Cores()
	 * @model containment="true"
	 * @generated
	 */
	EList<Core> getCores();

} // Processor
