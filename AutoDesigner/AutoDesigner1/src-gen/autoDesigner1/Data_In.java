/**
 */
package autoDesigner1;

import gurobi.GRBVar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data In</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link autoDesigner1.Data_In#getD_out <em>Dout</em>}</li>
 *   <li>{@link autoDesigner1.Data_In#getData_in_gurobi <em>Data in gurobi</em>}</li>
 *   <li>{@link autoDesigner1.Data_In#getLink <em>Link</em>}</li>
 *   <li>{@link autoDesigner1.Data_In#getData <em>Data</em>}</li>
 *   <li>{@link autoDesigner1.Data_In#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see autoDesigner1.AutoDesigner1Package#getData_In()
 * @model
 * @generated
 */
public interface Data_In extends EObject {
	/**
	 * Returns the value of the '<em><b>Dout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dout</em>' reference.
	 * @see #setD_out(Data_Out)
	 * @see autoDesigner1.AutoDesigner1Package#getData_In_D_out()
	 * @model required="true"
	 * @generated
	 */
	Data_Out getD_out();

	/**
	 * Sets the value of the '{@link autoDesigner1.Data_In#getD_out <em>Dout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dout</em>' reference.
	 * @see #getD_out()
	 * @generated
	 */
	void setD_out(Data_Out value);

	/**
	 * Returns the value of the '<em><b>Data in gurobi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data in gurobi</em>' attribute.
	 * @see #setData_in_gurobi(GRBVar)
	 * @see autoDesigner1.AutoDesigner1Package#getData_In_Data_in_gurobi()
	 * @model dataType="autoDesigner1.GRBRS"
	 * @generated
	 */
	GRBVar getData_in_gurobi();

	/**
	 * Sets the value of the '{@link autoDesigner1.Data_In#getData_in_gurobi <em>Data in gurobi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data in gurobi</em>' attribute.
	 * @see #getData_in_gurobi()
	 * @generated
	 */
	void setData_in_gurobi(GRBVar value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' reference.
	 * @see #setLink(Link)
	 * @see autoDesigner1.AutoDesigner1Package#getData_In_Link()
	 * @model required="true"
	 * @generated
	 */
	Link getLink();

	/**
	 * Sets the value of the '{@link autoDesigner1.Data_In#getLink <em>Link</em>}' reference.
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
	 * @see autoDesigner1.AutoDesigner1Package#getData_In_Data()
	 * @model required="true"
	 * @generated
	 */
	Data getData();

	/**
	 * Sets the value of the '{@link autoDesigner1.Data_In#getData <em>Data</em>}' reference.
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
	 * @see autoDesigner1.AutoDesigner1Package#getData_In_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link autoDesigner1.Data_In#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Data_In
