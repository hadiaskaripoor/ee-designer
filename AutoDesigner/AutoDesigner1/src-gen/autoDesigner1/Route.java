/**
 */
package autoDesigner1;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link autoDesigner1.Route#getName <em>Name</em>}</li>
 *   <li>{@link autoDesigner1.Route#getStartNode <em>Start Node</em>}</li>
 *   <li>{@link autoDesigner1.Route#getEndNode <em>End Node</em>}</li>
 *   <li>{@link autoDesigner1.Route#getData <em>Data</em>}</li>
 *   <li>{@link autoDesigner1.Route#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @see autoDesigner1.AutoDesigner1Package#getRoute()
 * @model
 * @generated
 */
public interface Route extends EObject {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' reference.
	 * @see #setData(Data)
	 * @see autoDesigner1.AutoDesigner1Package#getRoute_Data()
	 * @model
	 * @generated
	 */
	Data getData();

	/**
	 * Sets the value of the '{@link autoDesigner1.Route#getData <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(Data value);

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' reference list.
	 * The list contents are of type {@link autoDesigner1.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getRoute_Tasks()
	 * @model
	 * @generated
	 */
	EList<Task> getTasks();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see autoDesigner1.AutoDesigner1Package#getRoute_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link autoDesigner1.Route#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Start Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Node</em>' reference.
	 * @see #setStartNode(Node)
	 * @see autoDesigner1.AutoDesigner1Package#getRoute_StartNode()
	 * @model required="true"
	 * @generated
	 */
	Node getStartNode();

	/**
	 * Sets the value of the '{@link autoDesigner1.Route#getStartNode <em>Start Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Node</em>' reference.
	 * @see #getStartNode()
	 * @generated
	 */
	void setStartNode(Node value);

	/**
	 * Returns the value of the '<em><b>End Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Node</em>' reference.
	 * @see #setEndNode(Node)
	 * @see autoDesigner1.AutoDesigner1Package#getRoute_EndNode()
	 * @model required="true"
	 * @generated
	 */
	Node getEndNode();

	/**
	 * Sets the value of the '{@link autoDesigner1.Route#getEndNode <em>End Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Node</em>' reference.
	 * @see #getEndNode()
	 * @generated
	 */
	void setEndNode(Node value);

} // Route
