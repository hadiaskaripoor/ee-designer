/**
 */
package autoDesigner1;

import gurobi.GRBVar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LIn</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link autoDesigner1.L_In#getL_in_gurobi <em>Lin gurobi</em>}</li>
 *   <li>{@link autoDesigner1.L_In#getL_out <em>Lout</em>}</li>
 * </ul>
 *
 * @see autoDesigner1.AutoDesigner1Package#getL_In()
 * @model
 * @generated
 */
public interface L_In extends EObject {
	/**
	 * Returns the value of the '<em><b>Lin gurobi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lin gurobi</em>' attribute.
	 * @see #setL_in_gurobi(GRBVar)
	 * @see autoDesigner1.AutoDesigner1Package#getL_In_L_in_gurobi()
	 * @model dataType="autoDesigner1.GRBRS"
	 * @generated
	 */
	GRBVar getL_in_gurobi();

	/**
	 * Sets the value of the '{@link autoDesigner1.L_In#getL_in_gurobi <em>Lin gurobi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lin gurobi</em>' attribute.
	 * @see #getL_in_gurobi()
	 * @generated
	 */
	void setL_in_gurobi(GRBVar value);

	/**
	 * Returns the value of the '<em><b>Lout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lout</em>' reference.
	 * @see #setL_out(L_Out)
	 * @see autoDesigner1.AutoDesigner1Package#getL_In_L_out()
	 * @model required="true"
	 * @generated
	 */
	L_Out getL_out();

	/**
	 * Sets the value of the '{@link autoDesigner1.L_In#getL_out <em>Lout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lout</em>' reference.
	 * @see #getL_out()
	 * @generated
	 */
	void setL_out(L_Out value);

} // L_In
