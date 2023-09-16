/**
 */
package autoDesigner1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Input2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link autoDesigner1.UserInput2#getRedundantRoutes <em>Redundant Routes</em>}</li>
 *   <li>{@link autoDesigner1.UserInput2#getOptimizationGoal <em>Optimization Goal</em>}</li>
 * </ul>
 *
 * @see autoDesigner1.AutoDesigner1Package#getUserInput2()
 * @model
 * @generated
 */
public interface UserInput2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Redundant Routes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redundant Routes</em>' attribute.
	 * @see #setRedundantRoutes(int)
	 * @see autoDesigner1.AutoDesigner1Package#getUserInput2_RedundantRoutes()
	 * @model
	 * @generated
	 */
	int getRedundantRoutes();

	/**
	 * Sets the value of the '{@link autoDesigner1.UserInput2#getRedundantRoutes <em>Redundant Routes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redundant Routes</em>' attribute.
	 * @see #getRedundantRoutes()
	 * @generated
	 */
	void setRedundantRoutes(int value);

	/**
	 * Returns the value of the '<em><b>Optimization Goal</b></em>' attribute.
	 * The literals are from the enumeration {@link autoDesigner1.Optimization_Goal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optimization Goal</em>' attribute.
	 * @see autoDesigner1.Optimization_Goal
	 * @see #setOptimizationGoal(Optimization_Goal)
	 * @see autoDesigner1.AutoDesigner1Package#getUserInput2_OptimizationGoal()
	 * @model
	 * @generated
	 */
	Optimization_Goal getOptimizationGoal();

	/**
	 * Sets the value of the '{@link autoDesigner1.UserInput2#getOptimizationGoal <em>Optimization Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optimization Goal</em>' attribute.
	 * @see autoDesigner1.Optimization_Goal
	 * @see #getOptimizationGoal()
	 * @generated
	 */
	void setOptimizationGoal(Optimization_Goal value);

} // UserInput2
