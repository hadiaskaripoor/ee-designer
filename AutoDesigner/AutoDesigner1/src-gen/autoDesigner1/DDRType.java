/**
 */
package autoDesigner1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>DDR Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see autoDesigner1.AutoDesigner1Package#getDDRType()
 * @model
 * @generated
 */
public enum DDRType implements Enumerator {
	/**
	 * The '<em><b>DDR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DDR_VALUE
	 * @generated
	 * @ordered
	 */
	DDR(0, "DDR", "DDR"),

	/**
	 * The '<em><b>DDR2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DDR2_VALUE
	 * @generated
	 * @ordered
	 */
	DDR2(1, "DDR2", "DDR2"),

	/**
	 * The '<em><b>DDR3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DDR3_VALUE
	 * @generated
	 * @ordered
	 */
	DDR3(2, "DDR3", "DDR3"),

	/**
	 * The '<em><b>DDR4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DDR4_VALUE
	 * @generated
	 * @ordered
	 */
	DDR4(3, "DDR4", "DDR4"),

	/**
	 * The '<em><b>DDR5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DDR5_VALUE
	 * @generated
	 * @ordered
	 */
	DDR5(4, "DDR5", "DDR5");

	/**
	 * The '<em><b>DDR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DDR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DDR_VALUE = 0;

	/**
	 * The '<em><b>DDR2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DDR2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DDR2_VALUE = 1;

	/**
	 * The '<em><b>DDR3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DDR3
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DDR3_VALUE = 2;

	/**
	 * The '<em><b>DDR4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DDR4
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DDR4_VALUE = 3;

	/**
	 * The '<em><b>DDR5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DDR5
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DDR5_VALUE = 4;

	/**
	 * An array of all the '<em><b>DDR Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DDRType[] VALUES_ARRAY = new DDRType[] { DDR, DDR2, DDR3, DDR4, DDR5, };

	/**
	 * A public read-only list of all the '<em><b>DDR Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DDRType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>DDR Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DDRType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DDRType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DDR Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DDRType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DDRType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DDR Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DDRType get(int value) {
		switch (value) {
		case DDR_VALUE:
			return DDR;
		case DDR2_VALUE:
			return DDR2;
		case DDR3_VALUE:
			return DDR3;
		case DDR4_VALUE:
			return DDR4;
		case DDR5_VALUE:
			return DDR5;
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
	private DDRType(int value, String name, String literal) {
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

} //DDRType
