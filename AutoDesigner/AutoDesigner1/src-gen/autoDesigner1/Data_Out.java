/**
 */
package autoDesigner1;

import gurobi.GRBVar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Out</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link autoDesigner1.Data_Out#getD_in <em>Din</em>}</li>
 *   <li>{@link autoDesigner1.Data_Out#getData_out_gurobi <em>Data out gurobi</em>}</li>
 *   <li>{@link autoDesigner1.Data_Out#getLink <em>Link</em>}</li>
 *   <li>{@link autoDesigner1.Data_Out#getData <em>Data</em>}</li>
 *   <li>{@link autoDesigner1.Data_Out#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see autoDesigner1.AutoDesigner1Package#getData_Out()
 * @model
 * @generated
 */
public interface Data_Out extends EObject {
	/**
	 * Returns the value of the '<em><b>Din</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Din</em>' reference.
	 * @see #setD_in(Data_In)
	 * @see autoDesigner1.AutoDesigner1Package#getData_Out_D_in()
	 * @model required="true"
	 * @generated
	 */
	Data_In getD_in();

	/**
	 * Sets the value of the '{@link autoDesigner1.Data_Out#getD_in <em>Din</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Din</em>' reference.
	 * @see #getD_in()
	 * @generated
	 */
	void setD_in(Data_In value);

	/**
	 * Returns the value of the '<em><b>Data out gurobi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data out gurobi</em>' attribute.
	 * @see #setData_out_gurobi(GRBVar)
	 * @see autoDesigner1.AutoDesigner1Package#getData_Out_Data_out_gurobi()
	 * @model dataType="autoDesigner1.GRBRS"
	 * @generated
	 */
	GRBVar getData_out_gurobi();

	/**
	 * Sets the value of the '{@link autoDesigner1.Data_Out#getData_out_gurobi <em>Data out gurobi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data out gurobi</em>' attribute.
	 * @see #getData_out_gurobi()
	 * @generated
	 */
	void setData_out_gurobi(GRBVar value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' reference.
	 * @see #setLink(Link)
	 * @see autoDesigner1.AutoDesigner1Package#getData_Out_Link()
	 * @model required="true"
	 * @generated
	 */
	Link getLink();

	/**
	 * Sets the value of the '{@link autoDesigner1.Data_Out#getLink <em>Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' reference.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(Link value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' reference.
	 * @see #setData(Data)
	 * @see autoDesigner1.AutoDesigner1Package#getData_Out_Data()
	 * @model required="true"
	 * @generated
	 */
	Data getData();

	/**
	 * Sets the value of the '{@link autoDesigner1.Data_Out#getData <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(Data value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see autoDesigner1.AutoDesigner1Package#getData_Out_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link autoDesigner1.Data_Out#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Data_Out
