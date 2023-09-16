/**
 */
package autoDesigner1;

import gurobi.GRBVar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link autoDesigner1.Mapping#getNode <em>Node</em>}</li>
 *   <li>{@link autoDesigner1.Mapping#getName <em>Name</em>}</li>
 *   <li>{@link autoDesigner1.Mapping#getM_gurobi <em>Mgurobi</em>}</li>
 *   <li>{@link autoDesigner1.Mapping#getApp <em>App</em>}</li>
 * </ul>
 *
 * @see autoDesigner1.AutoDesigner1Package#getMapping()
 * @model
 * @generated
 */
public interface Mapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' reference.
	 * @see #setNode(Node)
	 * @see autoDesigner1.AutoDesigner1Package#getMapping_Node()
	 * @model required="true"
	 * @generated
	 */
	Node getNode();

	/**
	 * Sets the value of the '{@link autoDesigner1.Mapping#getNode <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(Node value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see autoDesigner1.AutoDesigner1Package#getMapping_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link autoDesigner1.Mapping#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mgurobi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mgurobi</em>' attribute.
	 * @see #setM_gurobi(GRBVar)
	 * @see autoDesigner1.AutoDesigner1Package#getMapping_M_gurobi()
	 * @model dataType="autoDesigner1.GRBRS"
	 * @generated
	 */
	GRBVar getM_gurobi();

	/**
	 * Sets the value of the '{@link autoDesigner1.Mapping#getM_gurobi <em>Mgurobi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mgurobi</em>' attribute.
	 * @see #getM_gurobi()
	 * @generated
	 */
	void setM_gurobi(GRBVar value);

	/**
	 * Returns the value of the '<em><b>App</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App</em>' reference.
	 * @see #setApp(Application)
	 * @see autoDesigner1.AutoDesigner1Package#getMapping_App()
	 * @model required="true"
	 * @generated
	 */
	Application getApp();

	/**
	 * Sets the value of the '{@link autoDesigner1.Mapping#getApp <em>App</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App</em>' reference.
	 * @see #getApp()
	 * @generated
	 */
	void setApp(Application value);

} // Mapping
