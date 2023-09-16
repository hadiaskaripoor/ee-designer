/**
 */
package autoDesigner1;

import gurobi.GRBVar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link autoDesigner1.Application#getName <em>Name</em>}</li>
 *   <li>{@link autoDesigner1.Application#getCost <em>Cost</em>}</li>
 *   <li>{@link autoDesigner1.Application#getMappings <em>Mappings</em>}</li>
 *   <li>{@link autoDesigner1.Application#getApp_gurobi <em>App gurobi</em>}</li>
 *   <li>{@link autoDesigner1.Application#getSource <em>Source</em>}</li>
 *   <li>{@link autoDesigner1.Application#getDestination <em>Destination</em>}</li>
 *   <li>{@link autoDesigner1.Application#isSafetycritical <em>Safetycritical</em>}</li>
 *   <li>{@link autoDesigner1.Application#getProcess <em>Process</em>}</li>
 *   <li>{@link autoDesigner1.Application#getId <em>Id</em>}</li>
 *   <li>{@link autoDesigner1.Application#getCammapping <em>Cammapping</em>}</li>
 *   <li>{@link autoDesigner1.Application#getLidarmapping <em>Lidarmapping</em>}</li>
 * </ul>
 *
 * @see autoDesigner1.AutoDesigner1Package#getApplication()
 * @model
 * @generated
 */
public interface Application extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see autoDesigner1.AutoDesigner1Package#getApplication_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link autoDesigner1.Application#getName <em>Name</em>}' attribute.
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
	 * @see autoDesigner1.AutoDesigner1Package#getApplication_Cost()
	 * @model
	 * @generated
	 */
	int getCost();

	/**
	 * Sets the value of the '{@link autoDesigner1.Application#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(int value);

	/**
	 * Returns the value of the '<em><b>Mappings</b></em>' reference list.
	 * The list contents are of type {@link autoDesigner1.Mapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappings</em>' reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getApplication_Mappings()
	 * @model required="true"
	 * @generated
	 */
	EList<Mapping> getMappings();

	/**
	 * Returns the value of the '<em><b>App gurobi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App gurobi</em>' attribute.
	 * @see #setApp_gurobi(GRBVar)
	 * @see autoDesigner1.AutoDesigner1Package#getApplication_App_gurobi()
	 * @model dataType="autoDesigner1.GRBRS"
	 * @generated
	 */
	GRBVar getApp_gurobi();

	/**
	 * Sets the value of the '{@link autoDesigner1.Application#getApp_gurobi <em>App gurobi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App gurobi</em>' attribute.
	 * @see #getApp_gurobi()
	 * @generated
	 */
	void setApp_gurobi(GRBVar value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(int)
	 * @see autoDesigner1.AutoDesigner1Package#getApplication_Source()
	 * @model
	 * @generated
	 */
	int getSource();

	/**
	 * Sets the value of the '{@link autoDesigner1.Application#getSource <em>Source</em>}' attribute.
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
	 * @see autoDesigner1.AutoDesigner1Package#getApplication_Destination()
	 * @model
	 * @generated
	 */
	int getDestination();

	/**
	 * Sets the value of the '{@link autoDesigner1.Application#getDestination <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' attribute.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(int value);

	/**
	 * Returns the value of the '<em><b>Safetycritical</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Safetycritical</em>' attribute.
	 * @see #setSafetycritical(boolean)
	 * @see autoDesigner1.AutoDesigner1Package#getApplication_Safetycritical()
	 * @model default="false"
	 * @generated
	 */
	boolean isSafetycritical();

	/**
	 * Sets the value of the '{@link autoDesigner1.Application#isSafetycritical <em>Safetycritical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Safetycritical</em>' attribute.
	 * @see #isSafetycritical()
	 * @generated
	 */
	void setSafetycritical(boolean value);

	/**
	 * Returns the value of the '<em><b>Process</b></em>' containment reference list.
	 * The list contents are of type {@link autoDesigner1.Process}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' containment reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getApplication_Process()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<autoDesigner1.Process> getProcess();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see autoDesigner1.AutoDesigner1Package#getApplication_Id()
	 * @model id="true" required="true" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link autoDesigner1.Application#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Cammapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cammapping</em>' reference.
	 * @see #setCammapping(CamMapping)
	 * @see autoDesigner1.AutoDesigner1Package#getApplication_Cammapping()
	 * @model
	 * @generated
	 */
	CamMapping getCammapping();

	/**
	 * Sets the value of the '{@link autoDesigner1.Application#getCammapping <em>Cammapping</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cammapping</em>' reference.
	 * @see #getCammapping()
	 * @generated
	 */
	void setCammapping(CamMapping value);

	/**
	 * Returns the value of the '<em><b>Lidarmapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lidarmapping</em>' reference.
	 * @see #setLidarmapping(LidarMapping)
	 * @see autoDesigner1.AutoDesigner1Package#getApplication_Lidarmapping()
	 * @model
	 * @generated
	 */
	LidarMapping getLidarmapping();

	/**
	 * Sets the value of the '{@link autoDesigner1.Application#getLidarmapping <em>Lidarmapping</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lidarmapping</em>' reference.
	 * @see #getLidarmapping()
	 * @generated
	 */
	void setLidarmapping(LidarMapping value);

} // Application
