/**
 */
package autoDesigner1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camera</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link autoDesigner1.Camera#getName <em>Name</em>}</li>
 *   <li>{@link autoDesigner1.Camera#getCammapping <em>Cammapping</em>}</li>
 * </ul>
 *
 * @see autoDesigner1.AutoDesigner1Package#getCamera()
 * @model
 * @generated
 */
public interface Camera extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see autoDesigner1.AutoDesigner1Package#getCamera_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link autoDesigner1.Camera#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Cammapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cammapping</em>' reference.
	 * @see #setCammapping(CamMapping)
	 * @see autoDesigner1.AutoDesigner1Package#getCamera_Cammapping()
	 * @model
	 * @generated
	 */
	CamMapping getCammapping();

	/**
	 * Sets the value of the '{@link autoDesigner1.Camera#getCammapping <em>Cammapping</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cammapping</em>' reference.
	 * @see #getCammapping()
	 * @generated
	 */
	void setCammapping(CamMapping value);

} // Camera
