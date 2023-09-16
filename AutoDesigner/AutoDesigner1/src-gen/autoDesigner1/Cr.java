/**
 */
package autoDesigner1;

import gurobi.GRBVar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link autoDesigner1.Cr#getCr_gurobi <em>Cr gurobi</em>}</li>
 *   <li>{@link autoDesigner1.Cr#getUses_node <em>Uses node</em>}</li>
 *   <li>{@link autoDesigner1.Cr#getSent_by_app <em>Sent by app</em>}</li>
 *   <li>{@link autoDesigner1.Cr#getSent_over_link <em>Sent over link</em>}</li>
 *   <li>{@link autoDesigner1.Cr#getName <em>Name</em>}</li>
 *   <li>{@link autoDesigner1.Cr#getIncludes_d_in <em>Includes din</em>}</li>
 *   <li>{@link autoDesigner1.Cr#getIncludes_d_out <em>Includes dout</em>}</li>
 * </ul>
 *
 * @see autoDesigner1.AutoDesigner1Package#getCr()
 * @model
 * @generated
 */
public interface Cr extends EObject {
	/**
	 * Returns the value of the '<em><b>Cr gurobi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cr gurobi</em>' attribute.
	 * @see #setCr_gurobi(GRBVar)
	 * @see autoDesigner1.AutoDesigner1Package#getCr_Cr_gurobi()
	 * @model dataType="autoDesigner1.GRBRS"
	 * @generated
	 */
	GRBVar getCr_gurobi();

	/**
	 * Sets the value of the '{@link autoDesigner1.Cr#getCr_gurobi <em>Cr gurobi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cr gurobi</em>' attribute.
	 * @see #getCr_gurobi()
	 * @generated
	 */
	void setCr_gurobi(GRBVar value);

	/**
	 * Returns the value of the '<em><b>Uses node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses node</em>' reference.
	 * @see #setUses_node(Node)
	 * @see autoDesigner1.AutoDesigner1Package#getCr_Uses_node()
	 * @model required="true"
	 * @generated
	 */
	Node getUses_node();

	/**
	 * Sets the value of the '{@link autoDesigner1.Cr#getUses_node <em>Uses node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses node</em>' reference.
	 * @see #getUses_node()
	 * @generated
	 */
	void setUses_node(Node value);

	/**
	 * Returns the value of the '<em><b>Sent by app</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sent by app</em>' reference.
	 * @see #setSent_by_app(Application)
	 * @see autoDesigner1.AutoDesigner1Package#getCr_Sent_by_app()
	 * @model required="true"
	 * @generated
	 */
	Application getSent_by_app();

	/**
	 * Sets the value of the '{@link autoDesigner1.Cr#getSent_by_app <em>Sent by app</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sent by app</em>' reference.
	 * @see #getSent_by_app()
	 * @generated
	 */
	void setSent_by_app(Application value);

	/**
	 * Returns the value of the '<em><b>Sent over link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sent over link</em>' reference.
	 * @see #setSent_over_link(Link)
	 * @see autoDesigner1.AutoDesigner1Package#getCr_Sent_over_link()
	 * @model required="true"
	 * @generated
	 */
	Link getSent_over_link();

	/**
	 * Sets the value of the '{@link autoDesigner1.Cr#getSent_over_link <em>Sent over link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sent over link</em>' reference.
	 * @see #getSent_over_link()
	 * @generated
	 */
	void setSent_over_link(Link value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see autoDesigner1.AutoDesigner1Package#getCr_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link autoDesigner1.Cr#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Includes din</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Includes din</em>' reference.
	 * @see #setIncludes_d_in(Data_In)
	 * @see autoDesigner1.AutoDesigner1Package#getCr_Includes_d_in()
	 * @model required="true"
	 * @generated
	 */
	Data_In getIncludes_d_in();

	/**
	 * Sets the value of the '{@link autoDesigner1.Cr#getIncludes_d_in <em>Includes din</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Includes din</em>' reference.
	 * @see #getIncludes_d_in()
	 * @generated
	 */
	void setIncludes_d_in(Data_In value);

	/**
	 * Returns the value of the '<em><b>Includes dout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Includes dout</em>' reference.
	 * @see #setIncludes_d_out(Data_Out)
	 * @see autoDesigner1.AutoDesigner1Package#getCr_Includes_d_out()
	 * @model
	 * @generated
	 */
	Data_Out getIncludes_d_out();

	/**
	 * Sets the value of the '{@link autoDesigner1.Cr#getIncludes_d_out <em>Includes dout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Includes dout</em>' reference.
	 * @see #getIncludes_d_out()
	 * @generated
	 */
	void setIncludes_d_out(Data_Out value);

} // Cr
