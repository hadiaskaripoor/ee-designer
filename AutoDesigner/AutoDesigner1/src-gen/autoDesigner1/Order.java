/**
 */
package autoDesigner1;

import gurobi.GRBVar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link autoDesigner1.Order#getOrder_gurobi <em>Order gurobi</em>}</li>
 *   <li>{@link autoDesigner1.Order#getName <em>Name</em>}</li>
 *   <li>{@link autoDesigner1.Order#getHas_dataout <em>Has dataout</em>}</li>
 *   <li>{@link autoDesigner1.Order#getHas_datain <em>Has datain</em>}</li>
 * </ul>
 *
 * @see autoDesigner1.AutoDesigner1Package#getOrder()
 * @model
 * @generated
 */
public interface Order extends EObject {
	/**
	 * Returns the value of the '<em><b>Order gurobi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order gurobi</em>' attribute.
	 * @see #setOrder_gurobi(GRBVar)
	 * @see autoDesigner1.AutoDesigner1Package#getOrder_Order_gurobi()
	 * @model dataType="autoDesigner1.GRBRS"
	 * @generated
	 */
	GRBVar getOrder_gurobi();

	/**
	 * Sets the value of the '{@link autoDesigner1.Order#getOrder_gurobi <em>Order gurobi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order gurobi</em>' attribute.
	 * @see #getOrder_gurobi()
	 * @generated
	 */
	void setOrder_gurobi(GRBVar value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see autoDesigner1.AutoDesigner1Package#getOrder_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link autoDesigner1.Order#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Has dataout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has dataout</em>' reference.
	 * @see #setHas_dataout(Data_Out)
	 * @see autoDesigner1.AutoDesigner1Package#getOrder_Has_dataout()
	 * @model required="true"
	 * @generated
	 */
	Data_Out getHas_dataout();

	/**
	 * Sets the value of the '{@link autoDesigner1.Order#getHas_dataout <em>Has dataout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has dataout</em>' reference.
	 * @see #getHas_dataout()
	 * @generated
	 */
	void setHas_dataout(Data_Out value);

	/**
	 * Returns the value of the '<em><b>Has datain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has datain</em>' reference.
	 * @see #setHas_datain(Data_In)
	 * @see autoDesigner1.AutoDesigner1Package#getOrder_Has_datain()
	 * @model required="true"
	 * @generated
	 */
	Data_In getHas_datain();

	/**
	 * Sets the value of the '{@link autoDesigner1.Order#getHas_datain <em>Has datain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has datain</em>' reference.
	 * @see #getHas_datain()
	 * @generated
	 */
	void setHas_datain(Data_In value);

} // Order
