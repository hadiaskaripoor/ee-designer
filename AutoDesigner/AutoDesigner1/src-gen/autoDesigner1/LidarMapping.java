/**
 */
package autoDesigner1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lidar Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link autoDesigner1.LidarMapping#getLidar <em>Lidar</em>}</li>
 *   <li>{@link autoDesigner1.LidarMapping#getApplication <em>Application</em>}</li>
 * </ul>
 *
 * @see autoDesigner1.AutoDesigner1Package#getLidarMapping()
 * @model
 * @generated
 */
public interface LidarMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Lidar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lidar</em>' reference.
	 * @see #setLidar(Lidar)
	 * @see autoDesigner1.AutoDesigner1Package#getLidarMapping_Lidar()
	 * @model
	 * @generated
	 */
	Lidar getLidar();

	/**
	 * Sets the value of the '{@link autoDesigner1.LidarMapping#getLidar <em>Lidar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lidar</em>' reference.
	 * @see #getLidar()
	 * @generated
	 */
	void setLidar(Lidar value);

	/**
	 * Returns the value of the '<em><b>Application</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' reference.
	 * @see #setApplication(Application)
	 * @see autoDesigner1.AutoDesigner1Package#getLidarMapping_Application()
	 * @model
	 * @generated
	 */
	Application getApplication();

	/**
	 * Sets the value of the '{@link autoDesigner1.LidarMapping#getApplication <em>Application</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' reference.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(Application value);

} // LidarMapping
