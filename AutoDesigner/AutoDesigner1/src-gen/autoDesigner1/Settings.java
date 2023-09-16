/**
 */
package autoDesigner1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link autoDesigner1.Settings#getName <em>Name</em>}</li>
 *   <li>{@link autoDesigner1.Settings#getOptimizationGoal <em>Optimization Goal</em>}</li>
 *   <li>{@link autoDesigner1.Settings#isLOR <em>LOR</em>}</li>
 *   <li>{@link autoDesigner1.Settings#getLORValue <em>LOR Value</em>}</li>
 *   <li>{@link autoDesigner1.Settings#isCostOptimization <em>Cost Optimization</em>}</li>
 *   <li>{@link autoDesigner1.Settings#isShowMappings <em>Show Mappings</em>}</li>
 *   <li>{@link autoDesigner1.Settings#getData <em>Data</em>}</li>
 *   <li>{@link autoDesigner1.Settings#getRedundantRoutes <em>Redundant Routes</em>}</li>
 *   <li>{@link autoDesigner1.Settings#getHomogeneousRedundantRoutes <em>Homogeneous Redundant Routes</em>}</li>
 *   <li>{@link autoDesigner1.Settings#isUseOptimizationGoals <em>Use Optimization Goals</em>}</li>
 *   <li>{@link autoDesigner1.Settings#getLORPropPosition <em>LOR Prop Position</em>}</li>
 *   <li>{@link autoDesigner1.Settings#getOptPropPosition <em>Opt Prop Position</em>}</li>
 *   <li>{@link autoDesigner1.Settings#isResourceUsage <em>Resource Usage</em>}</li>
 * </ul>
 *
 * @see autoDesigner1.AutoDesigner1Package#getSettings()
 * @model
 * @generated
 */
public interface Settings extends EObject {
	/**
	 * Returns the value of the '<em><b>Redundant Routes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redundant Routes</em>' attribute.
	 * @see #setRedundantRoutes(int)
	 * @see autoDesigner1.AutoDesigner1Package#getSettings_RedundantRoutes()
	 * @model
	 * @generated
	 */
	int getRedundantRoutes();

	/**
	 * Sets the value of the '{@link autoDesigner1.Settings#getRedundantRoutes <em>Redundant Routes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redundant Routes</em>' attribute.
	 * @see #getRedundantRoutes()
	 * @generated
	 */
	void setRedundantRoutes(int value);

	/**
	 * Returns the value of the '<em><b>Homogeneous Redundant Routes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Homogeneous Redundant Routes</em>' attribute.
	 * @see #setHomogeneousRedundantRoutes(int)
	 * @see autoDesigner1.AutoDesigner1Package#getSettings_HomogeneousRedundantRoutes()
	 * @model
	 * @generated
	 */
	int getHomogeneousRedundantRoutes();

	/**
	 * Sets the value of the '{@link autoDesigner1.Settings#getHomogeneousRedundantRoutes <em>Homogeneous Redundant Routes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Homogeneous Redundant Routes</em>' attribute.
	 * @see #getHomogeneousRedundantRoutes()
	 * @generated
	 */
	void setHomogeneousRedundantRoutes(int value);

	/**
	 * Returns the value of the '<em><b>Use Optimization Goals</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Optimization Goals</em>' attribute.
	 * @see #setUseOptimizationGoals(boolean)
	 * @see autoDesigner1.AutoDesigner1Package#getSettings_UseOptimizationGoals()
	 * @model default="true"
	 * @generated
	 */
	boolean isUseOptimizationGoals();

	/**
	 * Sets the value of the '{@link autoDesigner1.Settings#isUseOptimizationGoals <em>Use Optimization Goals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Optimization Goals</em>' attribute.
	 * @see #isUseOptimizationGoals()
	 * @generated
	 */
	void setUseOptimizationGoals(boolean value);

	/**
	 * Returns the value of the '<em><b>LOR Prop Position</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LOR Prop Position</em>' attribute.
	 * @see #setLORPropPosition(int)
	 * @see autoDesigner1.AutoDesigner1Package#getSettings_LORPropPosition()
	 * @model default="-1"
	 * @generated
	 */
	int getLORPropPosition();

	/**
	 * Sets the value of the '{@link autoDesigner1.Settings#getLORPropPosition <em>LOR Prop Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LOR Prop Position</em>' attribute.
	 * @see #getLORPropPosition()
	 * @generated
	 */
	void setLORPropPosition(int value);

	/**
	 * Returns the value of the '<em><b>Opt Prop Position</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opt Prop Position</em>' attribute.
	 * @see #setOptPropPosition(int)
	 * @see autoDesigner1.AutoDesigner1Package#getSettings_OptPropPosition()
	 * @model default="-1"
	 * @generated
	 */
	int getOptPropPosition();

	/**
	 * Sets the value of the '{@link autoDesigner1.Settings#getOptPropPosition <em>Opt Prop Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opt Prop Position</em>' attribute.
	 * @see #getOptPropPosition()
	 * @generated
	 */
	void setOptPropPosition(int value);

	/**
	 * Returns the value of the '<em><b>Resource Usage</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Usage</em>' attribute.
	 * @see #setResourceUsage(boolean)
	 * @see autoDesigner1.AutoDesigner1Package#getSettings_ResourceUsage()
	 * @model default="true"
	 * @generated
	 */
	boolean isResourceUsage();

	/**
	 * Sets the value of the '{@link autoDesigner1.Settings#isResourceUsage <em>Resource Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Usage</em>' attribute.
	 * @see #isResourceUsage()
	 * @generated
	 */
	void setResourceUsage(boolean value);

	/**
	 * Returns the value of the '<em><b>Optimization Goal</b></em>' attribute.
	 * The literals are from the enumeration {@link autoDesigner1.Optimization_Goal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optimization Goal</em>' attribute.
	 * @see autoDesigner1.Optimization_Goal
	 * @see #setOptimizationGoal(Optimization_Goal)
	 * @see autoDesigner1.AutoDesigner1Package#getSettings_OptimizationGoal()
	 * @model
	 * @generated
	 */
	Optimization_Goal getOptimizationGoal();

	/**
	 * Sets the value of the '{@link autoDesigner1.Settings#getOptimizationGoal <em>Optimization Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optimization Goal</em>' attribute.
	 * @see autoDesigner1.Optimization_Goal
	 * @see #getOptimizationGoal()
	 * @generated
	 */
	void setOptimizationGoal(Optimization_Goal value);

	/**
	 * Returns the value of the '<em><b>Show Mappings</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Mappings</em>' attribute.
	 * @see #setShowMappings(boolean)
	 * @see autoDesigner1.AutoDesigner1Package#getSettings_ShowMappings()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isShowMappings();

	/**
	 * Sets the value of the '{@link autoDesigner1.Settings#isShowMappings <em>Show Mappings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Mappings</em>' attribute.
	 * @see #isShowMappings()
	 * @generated
	 */
	void setShowMappings(boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see autoDesigner1.AutoDesigner1Package#getSettings_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link autoDesigner1.Settings#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' reference.
	 * @see #setData(Data)
	 * @see autoDesigner1.AutoDesigner1Package#getSettings_Data()
	 * @model
	 * @generated
	 */
	Data getData();

	/**
	 * Sets the value of the '{@link autoDesigner1.Settings#getData <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(Data value);

	/**
	 * Returns the value of the '<em><b>Cost Optimization</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Optimization</em>' attribute.
	 * @see #setCostOptimization(boolean)
	 * @see autoDesigner1.AutoDesigner1Package#getSettings_CostOptimization()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isCostOptimization();

	/**
	 * Sets the value of the '{@link autoDesigner1.Settings#isCostOptimization <em>Cost Optimization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Optimization</em>' attribute.
	 * @see #isCostOptimization()
	 * @generated
	 */
	void setCostOptimization(boolean value);

	/**
	 * Returns the value of the '<em><b>LOR</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LOR</em>' attribute.
	 * @see #setLOR(boolean)
	 * @see autoDesigner1.AutoDesigner1Package#getSettings_LOR()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isLOR();

	/**
	 * Sets the value of the '{@link autoDesigner1.Settings#isLOR <em>LOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LOR</em>' attribute.
	 * @see #isLOR()
	 * @generated
	 */
	void setLOR(boolean value);

	/**
	 * Returns the value of the '<em><b>LOR Value</b></em>' attribute.
	 * The default value is <code>"3"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LOR Value</em>' attribute.
	 * @see #setLORValue(int)
	 * @see autoDesigner1.AutoDesigner1Package#getSettings_LORValue()
	 * @model default="3"
	 * @generated
	 */
	int getLORValue();

	/**
	 * Sets the value of the '{@link autoDesigner1.Settings#getLORValue <em>LOR Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LOR Value</em>' attribute.
	 * @see #getLORValue()
	 * @generated
	 */
	void setLORValue(int value);

} // Settings
