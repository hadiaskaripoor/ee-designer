/**
 */
package autoDesigner1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Optimization Goal</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see autoDesigner1.AutoDesigner1Package#getOptimization_Goal()
 * @model
 * @generated
 */
public enum Optimization_Goal implements Enumerator {
	/**
	 * The '<em><b>End To End Latency</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #END_TO_END_LATENCY_VALUE
	 * @generated
	 * @ordered
	 */
	END_TO_END_LATENCY(0, "endToEndLatency", "endToEndLatency"),
	/**
	 * The '<em><b>Responsetime</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #RESPONSETIME_VALUE
	 * @generated
	 * @ordered
	 */
	RESPONSETIME(1, "responsetime", "responsetime"),
	/**
	 * Amir changed 
	 * The '<em><b>Multi Objective</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTI_OBJECTIVE_VALUE
	 * @generated NOT 
	 * @ordered
	 */
	MULTI_OBJECTIVE(2, "multiObjective(End to End Latency and Response time)",
			"multiObjective(End to End Latency and Response time)");

	/**
	 * The '<em><b>End To End Latency</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #END_TO_END_LATENCY
	 * @model name="endToEndLatency"
	 * @generated
	 * @ordered
	 */
	public static final int END_TO_END_LATENCY_VALUE = 0;

	/**
	 * The '<em><b>Responsetime</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESPONSETIME
	 * @model name="responsetime"
	 * @generated
	 * @ordered
	 */
	public static final int RESPONSETIME_VALUE = 1;

	/**
	 * The '<em><b>Multi Objective</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTI_OBJECTIVE
	 * @model name="multiObjective"
	 * @generated
	 * @ordered
	 */
	public static final int MULTI_OBJECTIVE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Optimization Goal</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Optimization_Goal[] VALUES_ARRAY = new Optimization_Goal[] { END_TO_END_LATENCY, RESPONSETIME,
			MULTI_OBJECTIVE, };

	/**
	 * A public read-only list of all the '<em><b>Optimization Goal</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Optimization_Goal> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Optimization Goal</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Optimization_Goal get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Optimization_Goal result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Optimization Goal</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Optimization_Goal getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Optimization_Goal result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Optimization Goal</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Optimization_Goal get(int value) {
		switch (value) {
		case END_TO_END_LATENCY_VALUE:
			return END_TO_END_LATENCY;
		case RESPONSETIME_VALUE:
			return RESPONSETIME;
		case MULTI_OBJECTIVE_VALUE:
			return MULTI_OBJECTIVE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Optimization_Goal(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //Optimization_Goal
