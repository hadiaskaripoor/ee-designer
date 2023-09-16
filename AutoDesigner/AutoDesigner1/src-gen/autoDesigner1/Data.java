/**
 */
package autoDesigner1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link autoDesigner1.Data#getName <em>Name</em>}</li>
 *   <li>{@link autoDesigner1.Data#getSentby <em>Sentby</em>}</li>
 *   <li>{@link autoDesigner1.Data#getReceivedby <em>Receivedby</em>}</li>
 *   <li>{@link autoDesigner1.Data#getD_in <em>Din</em>}</li>
 *   <li>{@link autoDesigner1.Data#getD_out <em>Dout</em>}</li>
 *   <li>{@link autoDesigner1.Data#getTask <em>Task</em>}</li>
 *   <li>{@link autoDesigner1.Data#getId <em>Id</em>}</li>
 *   <li>{@link autoDesigner1.Data#getUsercreatedtask <em>Usercreatedtask</em>}</li>
 * </ul>
 *
 * @see autoDesigner1.AutoDesigner1Package#getData()
 * @model
 * @generated
 */
public interface Data extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see autoDesigner1.AutoDesigner1Package#getData_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link autoDesigner1.Data#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Sentby</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sentby</em>' reference.
	 * @see #setSentby(autoDesigner1.Process)
	 * @see autoDesigner1.AutoDesigner1Package#getData_Sentby()
	 * @model required="true"
	 * @generated
	 */
	autoDesigner1.Process getSentby();

	/**
	 * Sets the value of the '{@link autoDesigner1.Data#getSentby <em>Sentby</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sentby</em>' reference.
	 * @see #getSentby()
	 * @generated
	 */
	void setSentby(autoDesigner1.Process value);

	/**
	 * Returns the value of the '<em><b>Receivedby</b></em>' reference list.
	 * The list contents are of type {@link autoDesigner1.Process}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receivedby</em>' reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getData_Receivedby()
	 * @model required="true"
	 * @generated
	 */
	EList<autoDesigner1.Process> getReceivedby();

	/**
	 * Returns the value of the '<em><b>Din</b></em>' reference list.
	 * The list contents are of type {@link autoDesigner1.Data_In}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Din</em>' reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getData_D_in()
	 * @model required="true"
	 * @generated
	 */
	EList<Data_In> getD_in();

	/**
	 * Returns the value of the '<em><b>Dout</b></em>' reference list.
	 * The list contents are of type {@link autoDesigner1.Data_Out}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dout</em>' reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getData_D_out()
	 * @model required="true"
	 * @generated
	 */
	EList<Data_Out> getD_out();

	/**
	 * Returns the value of the '<em><b>Task</b></em>' reference list.
	 * The list contents are of type {@link autoDesigner1.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getData_Task()
	 * @model required="true"
	 * @generated
	 */
	EList<Task> getTask();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see autoDesigner1.AutoDesigner1Package#getData_Id()
	 * @model default="0" id="true" required="true" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link autoDesigner1.Data#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Usercreatedtask</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usercreatedtask</em>' containment reference.
	 * @see #setUsercreatedtask(UserCreatedTask)
	 * @see autoDesigner1.AutoDesigner1Package#getData_Usercreatedtask()
	 * @model containment="true" required="true"
	 * @generated
	 */
	UserCreatedTask getUsercreatedtask();

	/**
	 * Sets the value of the '{@link autoDesigner1.Data#getUsercreatedtask <em>Usercreatedtask</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usercreatedtask</em>' containment reference.
	 * @see #getUsercreatedtask()
	 * @generated
	 */
	void setUsercreatedtask(UserCreatedTask value);

} // Data
