/**
 */
package autoDesigner1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Core</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link autoDesigner1.Core#getName <em>Name</em>}</li>
 *   <li>{@link autoDesigner1.Core#getClock_frequency_ghz <em>Clock frequency ghz</em>}</li>
 *   <li>{@link autoDesigner1.Core#isAsil_d <em>Asil d</em>}</li>
 *   <li>{@link autoDesigner1.Core#getAsil <em>Asil</em>}</li>
 *   <li>{@link autoDesigner1.Core#isTurbo_boost <em>Turbo boost</em>}</li>
 * </ul>
 *
 * @see autoDesigner1.AutoDesigner1Package#getCore()
 * @model
 * @generated
 */
public interface Core extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see autoDesigner1.AutoDesigner1Package#getCore_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link autoDesigner1.Core#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Clock frequency ghz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock frequency ghz</em>' attribute.
	 * @see #setClock_frequency_ghz(float)
	 * @see autoDesigner1.AutoDesigner1Package#getCore_Clock_frequency_ghz()
	 * @model
	 * @generated
	 */
	float getClock_frequency_ghz();

	/**
	 * Sets the value of the '{@link autoDesigner1.Core#getClock_frequency_ghz <em>Clock frequency ghz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock frequency ghz</em>' attribute.
	 * @see #getClock_frequency_ghz()
	 * @generated
	 */
	void setClock_frequency_ghz(float value);

	/**
	 * Returns the value of the '<em><b>Asil d</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asil d</em>' attribute.
	 * @see #setAsil_d(boolean)
	 * @see autoDesigner1.AutoDesigner1Package#getCore_Asil_d()
	 * @model default="false"
	 * @generated
	 */
	boolean isAsil_d();

	/**
	 * Sets the value of the '{@link autoDesigner1.Core#isAsil_d <em>Asil d</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asil d</em>' attribute.
	 * @see #isAsil_d()
	 * @generated
	 */
	void setAsil_d(boolean value);

	/**
	 * Returns the value of the '<em><b>Asil</b></em>' attribute.
	 * The literals are from the enumeration {@link autoDesigner1.Asil_Level}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asil</em>' attribute.
	 * @see autoDesigner1.Asil_Level
	 * @see #setAsil(Asil_Level)
	 * @see autoDesigner1.AutoDesigner1Package#getCore_Asil()
	 * @model dataType="autoDesigner1.Asil_Level"
	 * @generated
	 */
	Asil_Level getAsil();

	/**
	 * Sets the value of the '{@link autoDesigner1.Core#getAsil <em>Asil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asil</em>' attribute.
	 * @see autoDesigner1.Asil_Level
	 * @see #getAsil()
	 * @generated
	 */
	void setAsil(Asil_Level value);

	/**
	 * Returns the value of the '<em><b>Turbo boost</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Turbo boost</em>' attribute.
	 * @see #setTurbo_boost(boolean)
	 * @see autoDesigner1.AutoDesigner1Package#getCore_Turbo_boost()
	 * @model default="false"
	 * @generated
	 */
	boolean isTurbo_boost();

	/**
	 * Sets the value of the '{@link autoDesigner1.Core#isTurbo_boost <em>Turbo boost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Turbo boost</em>' attribute.
	 * @see #isTurbo_boost()
	 * @generated
	 */
	void setTurbo_boost(boolean value);

} // Core
