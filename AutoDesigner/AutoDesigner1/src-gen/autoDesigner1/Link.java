/**
 */
package autoDesigner1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link autoDesigner1.Link#getName <em>Name</em>}</li>
 *   <li>{@link autoDesigner1.Link#getCost <em>Cost</em>}</li>
 *   <li>{@link autoDesigner1.Link#getLs <em>Ls</em>}</li>
 *   <li>{@link autoDesigner1.Link#getLf <em>Lf</em>}</li>
 *   <li>{@link autoDesigner1.Link#getD_out <em>Dout</em>}</li>
 *   <li>{@link autoDesigner1.Link#getD_in <em>Din</em>}</li>
 *   <li>{@link autoDesigner1.Link#getTask <em>Task</em>}</li>
 *   <li>{@link autoDesigner1.Link#getLink_type <em>Link type</em>}</li>
 *   <li>{@link autoDesigner1.Link#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see autoDesigner1.AutoDesigner1Package#getLink()
 * @model
 * @generated
 */
public interface Link extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see autoDesigner1.AutoDesigner1Package#getLink_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link autoDesigner1.Link#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(int)
	 * @see autoDesigner1.AutoDesigner1Package#getLink_Cost()
	 * @model
	 * @generated
	 */
	int getCost();

	/**
	 * Sets the value of the '{@link autoDesigner1.Link#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(int value);

	/**
	 * Returns the value of the '<em><b>Ls</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ls</em>' reference.
	 * @see #setLs(Node)
	 * @see autoDesigner1.AutoDesigner1Package#getLink_Ls()
	 * @model required="true"
	 * @generated
	 */
	Node getLs();

	/**
	 * Sets the value of the '{@link autoDesigner1.Link#getLs <em>Ls</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ls</em>' reference.
	 * @see #getLs()
	 * @generated
	 */
	void setLs(Node value);

	/**
	 * Returns the value of the '<em><b>Lf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lf</em>' reference.
	 * @see #setLf(Node)
	 * @see autoDesigner1.AutoDesigner1Package#getLink_Lf()
	 * @model required="true"
	 * @generated
	 */
	Node getLf();

	/**
	 * Sets the value of the '{@link autoDesigner1.Link#getLf <em>Lf</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lf</em>' reference.
	 * @see #getLf()
	 * @generated
	 */
	void setLf(Node value);

	/**
	 * Returns the value of the '<em><b>Dout</b></em>' reference list.
	 * The list contents are of type {@link autoDesigner1.Data_Out}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dout</em>' reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getLink_D_out()
	 * @model required="true"
	 * @generated
	 */
	EList<Data_Out> getD_out();

	/**
	 * Returns the value of the '<em><b>Din</b></em>' reference list.
	 * The list contents are of type {@link autoDesigner1.Data_In}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Din</em>' reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getLink_D_in()
	 * @model required="true"
	 * @generated
	 */
	EList<Data_In> getD_in();

	/**
	 * Returns the value of the '<em><b>Task</b></em>' reference list.
	 * The list contents are of type {@link autoDesigner1.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getLink_Task()
	 * @model required="true"
	 * @generated
	 */
	EList<Task> getTask();

	/**
	 * Returns the value of the '<em><b>Link type</b></em>' attribute.
	 * The literals are from the enumeration {@link autoDesigner1.Link_Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link type</em>' attribute.
	 * @see autoDesigner1.Link_Type
	 * @see #setLink_type(Link_Type)
	 * @see autoDesigner1.AutoDesigner1Package#getLink_Link_type()
	 * @model dataType="autoDesigner1.Link_Type"
	 * @generated
	 */
	Link_Type getLink_type();

	/**
	 * Sets the value of the '{@link autoDesigner1.Link#getLink_type <em>Link type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link type</em>' attribute.
	 * @see autoDesigner1.Link_Type
	 * @see #getLink_type()
	 * @generated
	 */
	void setLink_type(Link_Type value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see autoDesigner1.AutoDesigner1Package#getLink_Id()
	 * @model default="0" id="true" required="true" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link autoDesigner1.Link#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Link
