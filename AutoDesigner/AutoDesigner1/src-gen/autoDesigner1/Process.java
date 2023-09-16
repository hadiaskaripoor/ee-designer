/**
 */
package autoDesigner1;

import gurobi.GRBVar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link autoDesigner1.Process#getApplication <em>Application</em>}</li>
 *   <li>{@link autoDesigner1.Process#getName <em>Name</em>}</li>
 *   <li>{@link autoDesigner1.Process#getWcet <em>Wcet</em>}</li>
 *   <li>{@link autoDesigner1.Process#getPeriod <em>Period</em>}</li>
 *   <li>{@link autoDesigner1.Process#getStartingTime <em>Starting Time</em>}</li>
 *   <li>{@link autoDesigner1.Process#getRecieveData <em>Recieve Data</em>}</li>
 *   <li>{@link autoDesigner1.Process#getSendData <em>Send Data</em>}</li>
 *   <li>{@link autoDesigner1.Process#getStartingTimeVal <em>Starting Time Val</em>}</li>
 *   <li>{@link autoDesigner1.Process#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see autoDesigner1.AutoDesigner1Package#getProcess()
 * @model
 * @generated
 */
public interface Process extends EObject {
	/**
	 * Returns the value of the '<em><b>Application</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' reference.
	 * @see #setApplication(Application)
	 * @see autoDesigner1.AutoDesigner1Package#getProcess_Application()
	 * @model required="true"
	 * @generated
	 */
	Application getApplication();

	/**
	 * Sets the value of the '{@link autoDesigner1.Process#getApplication <em>Application</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' reference.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(Application value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see autoDesigner1.AutoDesigner1Package#getProcess_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link autoDesigner1.Process#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Wcet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wcet</em>' attribute.
	 * @see #setWcet(double)
	 * @see autoDesigner1.AutoDesigner1Package#getProcess_Wcet()
	 * @model
	 * @generated
	 */
	double getWcet();

	/**
	 * Sets the value of the '{@link autoDesigner1.Process#getWcet <em>Wcet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wcet</em>' attribute.
	 * @see #getWcet()
	 * @generated
	 */
	void setWcet(double value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(int)
	 * @see autoDesigner1.AutoDesigner1Package#getProcess_Period()
	 * @model
	 * @generated
	 */
	int getPeriod();

	/**
	 * Sets the value of the '{@link autoDesigner1.Process#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(int value);

	/**
	 * Returns the value of the '<em><b>Starting Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Starting Time</em>' attribute.
	 * @see #setStartingTime(GRBVar)
	 * @see autoDesigner1.AutoDesigner1Package#getProcess_StartingTime()
	 * @model dataType="autoDesigner1.GRBRS"
	 * @generated
	 */
	GRBVar getStartingTime();

	/**
	 * Sets the value of the '{@link autoDesigner1.Process#getStartingTime <em>Starting Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Starting Time</em>' attribute.
	 * @see #getStartingTime()
	 * @generated
	 */
	void setStartingTime(GRBVar value);

	/**
	 * Returns the value of the '<em><b>Recieve Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recieve Data</em>' reference.
	 * @see #setRecieveData(Data)
	 * @see autoDesigner1.AutoDesigner1Package#getProcess_RecieveData()
	 * @model required="true"
	 * @generated
	 */
	Data getRecieveData();

	/**
	 * Sets the value of the '{@link autoDesigner1.Process#getRecieveData <em>Recieve Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recieve Data</em>' reference.
	 * @see #getRecieveData()
	 * @generated
	 */
	void setRecieveData(Data value);

	/**
	 * Returns the value of the '<em><b>Send Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send Data</em>' reference.
	 * @see #setSendData(Data)
	 * @see autoDesigner1.AutoDesigner1Package#getProcess_SendData()
	 * @model required="true"
	 * @generated
	 */
	Data getSendData();

	/**
	 * Sets the value of the '{@link autoDesigner1.Process#getSendData <em>Send Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send Data</em>' reference.
	 * @see #getSendData()
	 * @generated
	 */
	void setSendData(Data value);

	/**
	 * Returns the value of the '<em><b>Starting Time Val</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Starting Time Val</em>' attribute.
	 * @see #setStartingTimeVal(double)
	 * @see autoDesigner1.AutoDesigner1Package#getProcess_StartingTimeVal()
	 * @model default="0"
	 * @generated
	 */
	double getStartingTimeVal();

	/**
	 * Sets the value of the '{@link autoDesigner1.Process#getStartingTimeVal <em>Starting Time Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Starting Time Val</em>' attribute.
	 * @see #getStartingTimeVal()
	 * @generated
	 */
	void setStartingTimeVal(double value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see autoDesigner1.AutoDesigner1Package#getProcess_Id()
	 * @model default="0" id="true" required="true" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link autoDesigner1.Process#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Process
