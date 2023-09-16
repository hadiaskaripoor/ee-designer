/**
 */
package autoDesigner1;

import gurobi.GRBVar;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link autoDesigner1.Task#getName <em>Name</em>}</li>
 *   <li>{@link autoDesigner1.Task#getFrameLength <em>Frame Length</em>}</li>
 *   <li>{@link autoDesigner1.Task#getPeriod <em>Period</em>}</li>
 *   <li>{@link autoDesigner1.Task#getLink <em>Link</em>}</li>
 *   <li>{@link autoDesigner1.Task#getData <em>Data</em>}</li>
 *   <li>{@link autoDesigner1.Task#getStartingTimeVal <em>Starting Time Val</em>}</li>
 *   <li>{@link autoDesigner1.Task#getStartTime <em>Start Time</em>}</li>
 * </ul>
 *
 * @see autoDesigner1.AutoDesigner1Package#getTask()
 * @model
 * @generated
 */
public interface Task extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see autoDesigner1.AutoDesigner1Package#getTask_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link autoDesigner1.Task#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(GRBVar)
	 * @see autoDesigner1.AutoDesigner1Package#getTask_StartTime()
	 * @model dataType="autoDesigner1.GRBRS"
	 * @generated
	 */
	GRBVar getStartTime();

	/**
	 * Sets the value of the '{@link autoDesigner1.Task#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(GRBVar value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(int)
	 * @see autoDesigner1.AutoDesigner1Package#getTask_Period()
	 * @model
	 * @generated
	 */
	int getPeriod();

	/**
	 * Sets the value of the '{@link autoDesigner1.Task#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(int value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' reference.
	 * @see #setData(Data)
	 * @see autoDesigner1.AutoDesigner1Package#getTask_Data()
	 * @model required="true"
	 * @generated
	 */
	Data getData();

	/**
	 * Sets the value of the '{@link autoDesigner1.Task#getData <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(Data value);

	/**
	 * Returns the value of the '<em><b>Frame Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame Length</em>' attribute.
	 * @see #setFrameLength(double)
	 * @see autoDesigner1.AutoDesigner1Package#getTask_FrameLength()
	 * @model
	 * @generated
	 */
	double getFrameLength();

	/**
	 * Sets the value of the '{@link autoDesigner1.Task#getFrameLength <em>Frame Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame Length</em>' attribute.
	 * @see #getFrameLength()
	 * @generated
	 */
	void setFrameLength(double value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' reference.
	 * @see #setLink(Link)
	 * @see autoDesigner1.AutoDesigner1Package#getTask_Link()
	 * @model
	 * @generated
	 */
	Link getLink();

	/**
	 * Sets the value of the '{@link autoDesigner1.Task#getLink <em>Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' reference.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(Link value);

	/**
	 * Returns the value of the '<em><b>Starting Time Val</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Starting Time Val</em>' attribute.
	 * @see #setStartingTimeVal(double)
	 * @see autoDesigner1.AutoDesigner1Package#getTask_StartingTimeVal()
	 * @model default="0"
	 * @generated
	 */
	double getStartingTimeVal();

	/**
	 * Sets the value of the '{@link autoDesigner1.Task#getStartingTimeVal <em>Starting Time Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Starting Time Val</em>' attribute.
	 * @see #getStartingTimeVal()
	 * @generated
	 */
	void setStartingTimeVal(double value);

} // Task
