/**
 */
package autoDesigner1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cam Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link autoDesigner1.CamMapping#getCamera <em>Camera</em>}</li>
 *   <li>{@link autoDesigner1.CamMapping#getApplication <em>Application</em>}</li>
 * </ul>
 *
 * @see autoDesigner1.AutoDesigner1Package#getCamMapping()
 * @model
 * @generated
 */
public interface CamMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Camera</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Camera</em>' reference.
	 * @see #setCamera(Camera)
	 * @see autoDesigner1.AutoDesigner1Package#getCamMapping_Camera()
	 * @model
	 * @generated
	 */
	Camera getCamera();

	/**
	 * Sets the value of the '{@link autoDesigner1.CamMapping#getCamera <em>Camera</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Camera</em>' reference.
	 * @see #getCamera()
	 * @generated
	 */
	void setCamera(Camera value);

	/**
	 * Returns the value of the '<em><b>Application</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' reference.
	 * @see #setApplication(Application)
	 * @see autoDesigner1.AutoDesigner1Package#getCamMapping_Application()
	 * @model
	 * @generated
	 */
	Application getApplication();

	/**
	 * Sets the value of the '{@link autoDesigner1.CamMapping#getApplication <em>Application</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' reference.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(Application value);

} // CamMapping
