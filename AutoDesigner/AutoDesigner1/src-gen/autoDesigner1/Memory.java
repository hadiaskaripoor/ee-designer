/**
 */
package autoDesigner1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link autoDesigner1.Memory#getName <em>Name</em>}</li>
 *   <li>{@link autoDesigner1.Memory#getDDR_Type <em>DDR Type</em>}</li>
 *   <li>{@link autoDesigner1.Memory#getMemory_size_gb <em>Memory size gb</em>}</li>
 * </ul>
 *
 * @see autoDesigner1.AutoDesigner1Package#getMemory()
 * @model
 * @generated
 */
public interface Memory extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see autoDesigner1.AutoDesigner1Package#getMemory_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link autoDesigner1.Memory#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>DDR Type</b></em>' attribute.
	 * The literals are from the enumeration {@link autoDesigner1.DDRType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DDR Type</em>' attribute.
	 * @see autoDesigner1.DDRType
	 * @see #setDDR_Type(DDRType)
	 * @see autoDesigner1.AutoDesigner1Package#getMemory_DDR_Type()
	 * @model
	 * @generated
	 */
	DDRType getDDR_Type();

	/**
	 * Sets the value of the '{@link autoDesigner1.Memory#getDDR_Type <em>DDR Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DDR Type</em>' attribute.
	 * @see autoDesigner1.DDRType
	 * @see #getDDR_Type()
	 * @generated
	 */
	void setDDR_Type(DDRType value);

	/**
	 * Returns the value of the '<em><b>Memory size gb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory size gb</em>' attribute.
	 * @see #setMemory_size_gb(int)
	 * @see autoDesigner1.AutoDesigner1Package#getMemory_Memory_size_gb()
	 * @model
	 * @generated
	 */
	int getMemory_size_gb();

	/**
	 * Sets the value of the '{@link autoDesigner1.Memory#getMemory_size_gb <em>Memory size gb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory size gb</em>' attribute.
	 * @see #getMemory_size_gb()
	 * @generated
	 */
	void setMemory_size_gb(int value);

} // Memory
