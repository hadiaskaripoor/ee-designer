/**
 */
package autoDesigner1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GPU</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link autoDesigner1.GPU#getName <em>Name</em>}</li>
 *   <li>{@link autoDesigner1.GPU#getMemory_size_in_GB <em>Memory size in GB</em>}</li>
 *   <li>{@link autoDesigner1.GPU#getCuda_cores <em>Cuda cores</em>}</li>
 * </ul>
 *
 * @see autoDesigner1.AutoDesigner1Package#getGPU()
 * @model
 * @generated
 */
public interface GPU extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see autoDesigner1.AutoDesigner1Package#getGPU_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link autoDesigner1.GPU#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Memory size in GB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory size in GB</em>' attribute.
	 * @see #setMemory_size_in_GB(int)
	 * @see autoDesigner1.AutoDesigner1Package#getGPU_Memory_size_in_GB()
	 * @model
	 * @generated
	 */
	int getMemory_size_in_GB();

	/**
	 * Sets the value of the '{@link autoDesigner1.GPU#getMemory_size_in_GB <em>Memory size in GB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory size in GB</em>' attribute.
	 * @see #getMemory_size_in_GB()
	 * @generated
	 */
	void setMemory_size_in_GB(int value);

	/**
	 * Returns the value of the '<em><b>Cuda cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cuda cores</em>' attribute.
	 * @see #setCuda_cores(int)
	 * @see autoDesigner1.AutoDesigner1Package#getGPU_Cuda_cores()
	 * @model
	 * @generated
	 */
	int getCuda_cores();

	/**
	 * Sets the value of the '{@link autoDesigner1.GPU#getCuda_cores <em>Cuda cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cuda cores</em>' attribute.
	 * @see #getCuda_cores()
	 * @generated
	 */
	void setCuda_cores(int value);

} // GPU
