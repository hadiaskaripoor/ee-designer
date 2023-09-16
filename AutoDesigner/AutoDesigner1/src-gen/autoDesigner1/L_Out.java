/**
 */
package autoDesigner1;

import gurobi.GRBVar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LOut</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link autoDesigner1.L_Out#getL_out_gurobi <em>Lout gurobi</em>}</li>
 *   <li>{@link autoDesigner1.L_Out#getL_in <em>Lin</em>}</li>
 * </ul>
 *
 * @see autoDesigner1.AutoDesigner1Package#getL_Out()
 * @model
 * @generated
 */
public interface L_Out extends EObject {
	/**
	 * Returns the value of the '<em><b>Lout gurobi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lout gurobi</em>' attribute.
	 * @see #setL_out_gurobi(GRBVar)
	 * @see autoDesigner1.AutoDesigner1Package#getL_Out_L_out_gurobi()
	 * @model dataType="autoDesigner1.GRBRS"
	 * @generated
	 */
	GRBVar getL_out_gurobi();

	/**
	 * Sets the value of the '{@link autoDesigner1.L_Out#getL_out_gurobi <em>Lout gurobi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lout gurobi</em>' attribute.
	 * @see #getL_out_gurobi()
	 * @generated
	 */
	void setL_out_gurobi(GRBVar value);

	/**
	 * Returns the value of the '<em><b>Lin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lin</em>' reference.
	 * @see #setL_in(L_In)
	 * @see autoDesigner1.AutoDesigner1Package#getL_Out_L_in()
	 * @model required="true"
	 * @generated
	 */
	L_In getL_in();

	/**
	 * Sets the value of the '{@link autoDesigner1.L_Out#getL_in <em>Lin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lin</em>' reference.
	 * @see #getL_in()
	 * @generated
	 */
	void setL_in(L_In value);

} // L_Out
