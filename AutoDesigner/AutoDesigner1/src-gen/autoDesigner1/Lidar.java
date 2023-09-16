/**
 */
package autoDesigner1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lidar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link autoDesigner1.Lidar#getName <em>Name</em>}</li>
 *   <li>{@link autoDesigner1.Lidar#getLidarmapping <em>Lidarmapping</em>}</li>
 * </ul>
 *
 * @see autoDesigner1.AutoDesigner1Package#getLidar()
 * @model
 * @generated
 */
public interface Lidar extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see autoDesigner1.AutoDesigner1Package#getLidar_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link autoDesigner1.Lidar#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Lidarmapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lidarmapping</em>' reference.
	 * @see #setLidarmapping(LidarMapping)
	 * @see autoDesigner1.AutoDesigner1Package#getLidar_Lidarmapping()
	 * @model
	 * @generated
	 */
	LidarMapping getLidarmapping();

	/**
	 * Sets the value of the '{@link autoDesigner1.Lidar#getLidarmapping <em>Lidarmapping</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lidarmapping</em>' reference.
	 * @see #getLidarmapping()
	 * @generated
	 */
	void setLidarmapping(LidarMapping value);

} // Lidar
