/**
 */
package autoDesigner1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Node type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see autoDesigner1.AutoDesigner1Package#getNode_type()
 * @model
 * @generated
 */
public enum Node_type implements Enumerator {
	/**
	 * The '<em><b>ECU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ECU_VALUE
	 * @generated
	 * @ordered
	 */
	ECU(0, "ECU", "ECU"),

	/**
	 * The '<em><b>HPCU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPCU_VALUE
	 * @generated
	 * @ordered
	 */
	HPCU(1, "HPCU", "HPCU"),

	/**
	 * The '<em><b>Network Switch</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NETWORK_SWITCH_VALUE
	 * @generated
	 * @ordered
	 */
	NETWORK_SWITCH(2, "NetworkSwitch", "NetworkSwitch"),

	/**
	 * The '<em><b>Gateway</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GATEWAY_VALUE
	 * @generated
	 * @ordered
	 */
	GATEWAY(3, "Gateway", "Gateway");

	/**
	 * The '<em><b>ECU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ECU
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ECU_VALUE = 0;

	/**
	 * The '<em><b>HPCU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPCU
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HPCU_VALUE = 1;

	/**
	 * The '<em><b>Network Switch</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NETWORK_SWITCH
	 * @model name="NetworkSwitch"
	 * @generated
	 * @ordered
	 */
	public static final int NETWORK_SWITCH_VALUE = 2;

	/**
	 * The '<em><b>Gateway</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GATEWAY
	 * @model name="Gateway"
	 * @generated
	 * @ordered
	 */
	public static final int GATEWAY_VALUE = 3;

	/**
	 * An array of all the '<em><b>Node type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Node_type[] VALUES_ARRAY = new Node_type[] { ECU, HPCU, NETWORK_SWITCH, GATEWAY, };

	/**
	 * A public read-only list of all the '<em><b>Node type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Node_type> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Node type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Node_type get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Node_type result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Node type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Node_type getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Node_type result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Node type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Node_type get(int value) {
		switch (value) {
		case ECU_VALUE:
			return ECU;
		case HPCU_VALUE:
			return HPCU;
		case NETWORK_SWITCH_VALUE:
			return NETWORK_SWITCH;
		case GATEWAY_VALUE:
			return GATEWAY;
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
	private Node_type(int value, String name, String literal) {
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

} //Node_type
