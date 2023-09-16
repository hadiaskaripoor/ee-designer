/**
 */
package autoDesigner1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link autoDesigner1.Partition#getName <em>Name</em>}</li>
 *   <li>{@link autoDesigner1.Partition#isSafety_critical <em>Safety critical</em>}</li>
 *   <li>{@link autoDesigner1.Partition#getCapacity_GB <em>Capacity GB</em>}</li>
 *   <li>{@link autoDesigner1.Partition#getMemory <em>Memory</em>}</li>
 *   <li>{@link autoDesigner1.Partition#getEthernet <em>Ethernet</em>}</li>
 *   <li>{@link autoDesigner1.Partition#getUsb <em>Usb</em>}</li>
 *   <li>{@link autoDesigner1.Partition#getCache <em>Cache</em>}</li>
 * </ul>
 *
 * @see autoDesigner1.AutoDesigner1Package#getPartition()
 * @model
 * @generated
 */
public interface Partition extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see autoDesigner1.AutoDesigner1Package#getPartition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link autoDesigner1.Partition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Safety critical</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Safety critical</em>' attribute.
	 * @see #setSafety_critical(boolean)
	 * @see autoDesigner1.AutoDesigner1Package#getPartition_Safety_critical()
	 * @model default="false"
	 * @generated
	 */
	boolean isSafety_critical();

	/**
	 * Sets the value of the '{@link autoDesigner1.Partition#isSafety_critical <em>Safety critical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Safety critical</em>' attribute.
	 * @see #isSafety_critical()
	 * @generated
	 */
	void setSafety_critical(boolean value);

	/**
	 * Returns the value of the '<em><b>Capacity GB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity GB</em>' attribute.
	 * @see #setCapacity_GB(int)
	 * @see autoDesigner1.AutoDesigner1Package#getPartition_Capacity_GB()
	 * @model
	 * @generated
	 */
	int getCapacity_GB();

	/**
	 * Sets the value of the '{@link autoDesigner1.Partition#getCapacity_GB <em>Capacity GB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity GB</em>' attribute.
	 * @see #getCapacity_GB()
	 * @generated
	 */
	void setCapacity_GB(int value);

	/**
	 * Returns the value of the '<em><b>Memory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory</em>' reference.
	 * @see #setMemory(Memory)
	 * @see autoDesigner1.AutoDesigner1Package#getPartition_Memory()
	 * @model
	 * @generated
	 */
	Memory getMemory();

	/**
	 * Sets the value of the '{@link autoDesigner1.Partition#getMemory <em>Memory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory</em>' reference.
	 * @see #getMemory()
	 * @generated
	 */
	void setMemory(Memory value);

	/**
	 * Returns the value of the '<em><b>Ethernet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ethernet</em>' reference.
	 * @see #setEthernet(Ethernet)
	 * @see autoDesigner1.AutoDesigner1Package#getPartition_Ethernet()
	 * @model
	 * @generated
	 */
	Ethernet getEthernet();

	/**
	 * Sets the value of the '{@link autoDesigner1.Partition#getEthernet <em>Ethernet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ethernet</em>' reference.
	 * @see #getEthernet()
	 * @generated
	 */
	void setEthernet(Ethernet value);

	/**
	 * Returns the value of the '<em><b>Usb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usb</em>' reference.
	 * @see #setUsb(USB)
	 * @see autoDesigner1.AutoDesigner1Package#getPartition_Usb()
	 * @model
	 * @generated
	 */
	USB getUsb();

	/**
	 * Sets the value of the '{@link autoDesigner1.Partition#getUsb <em>Usb</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usb</em>' reference.
	 * @see #getUsb()
	 * @generated
	 */
	void setUsb(USB value);

	/**
	 * Returns the value of the '<em><b>Cache</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache</em>' reference.
	 * @see #setCache(Cache)
	 * @see autoDesigner1.AutoDesigner1Package#getPartition_Cache()
	 * @model
	 * @generated
	 */
	Cache getCache();

	/**
	 * Sets the value of the '{@link autoDesigner1.Partition#getCache <em>Cache</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache</em>' reference.
	 * @see #getCache()
	 * @generated
	 */
	void setCache(Cache value);

} // Partition
