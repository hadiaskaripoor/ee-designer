/**
 */
package autoDesigner1;

import gurobi.GRBVar;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link autoDesigner1.Node#getName <em>Name</em>}</li>
 *   <li>{@link autoDesigner1.Node#getCost <em>Cost</em>}</li>
 *   <li>{@link autoDesigner1.Node#getN_gurobi <em>Ngurobi</em>}</li>
 *   <li>{@link autoDesigner1.Node#getSource <em>Source</em>}</li>
 *   <li>{@link autoDesigner1.Node#getDestination <em>Destination</em>}</li>
 *   <li>{@link autoDesigner1.Node#getLinks <em>Links</em>}</li>
 *   <li>{@link autoDesigner1.Node#getSender <em>Sender</em>}</li>
 *   <li>{@link autoDesigner1.Node#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link autoDesigner1.Node#getMappings <em>Mappings</em>}</li>
 *   <li>{@link autoDesigner1.Node#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see autoDesigner1.AutoDesigner1Package#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see autoDesigner1.AutoDesigner1Package#getNode_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link autoDesigner1.Node#getName <em>Name</em>}' attribute.
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
	 * @see autoDesigner1.AutoDesigner1Package#getNode_Cost()
	 * @model
	 * @generated
	 */
	int getCost();

	/**
	 * Sets the value of the '{@link autoDesigner1.Node#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(int value);

	/**
	 * Returns the value of the '<em><b>Ngurobi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ngurobi</em>' attribute.
	 * @see #setN_gurobi(GRBVar)
	 * @see autoDesigner1.AutoDesigner1Package#getNode_N_gurobi()
	 * @model dataType="autoDesigner1.GRBRS"
	 * @generated
	 */
	GRBVar getN_gurobi();

	/**
	 * Sets the value of the '{@link autoDesigner1.Node#getN_gurobi <em>Ngurobi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ngurobi</em>' attribute.
	 * @see #getN_gurobi()
	 * @generated
	 */
	void setN_gurobi(GRBVar value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(int)
	 * @see autoDesigner1.AutoDesigner1Package#getNode_Source()
	 * @model
	 * @generated
	 */
	int getSource();

	/**
	 * Sets the value of the '{@link autoDesigner1.Node#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(int value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' attribute.
	 * @see #setDestination(int)
	 * @see autoDesigner1.AutoDesigner1Package#getNode_Destination()
	 * @model
	 * @generated
	 */
	int getDestination();

	/**
	 * Sets the value of the '{@link autoDesigner1.Node#getDestination <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' attribute.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(int value);

	/**
	 * Returns the value of the '<em><b>Links</b></em>' reference list.
	 * The list contents are of type {@link autoDesigner1.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getNode_Links()
	 * @model required="true"
	 * @generated
	 */
	EList<Link> getLinks();

	/**
	 * Returns the value of the '<em><b>Sender</b></em>' reference list.
	 * The list contents are of type {@link autoDesigner1.Application}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender</em>' reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getNode_Sender()
	 * @model required="true"
	 * @generated
	 */
	EList<Application> getSender();

	/**
	 * Returns the value of the '<em><b>Receiver</b></em>' reference list.
	 * The list contents are of type {@link autoDesigner1.Application}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiver</em>' reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getNode_Receiver()
	 * @model required="true"
	 * @generated
	 */
	EList<Application> getReceiver();

	/**
	 * Returns the value of the '<em><b>Mappings</b></em>' reference list.
	 * The list contents are of type {@link autoDesigner1.Mapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappings</em>' reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getNode_Mappings()
	 * @model
	 * @generated
	 */
	EList<Mapping> getMappings();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see autoDesigner1.AutoDesigner1Package#getNode_Id()
	 * @model default="0" id="true" required="true" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link autoDesigner1.Node#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Node
