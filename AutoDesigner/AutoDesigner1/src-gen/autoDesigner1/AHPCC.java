/**
 */
package autoDesigner1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AHPCC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link autoDesigner1.AHPCC#getNodes <em>Nodes</em>}</li>
 *   <li>{@link autoDesigner1.AHPCC#getData <em>Data</em>}</li>
 *   <li>{@link autoDesigner1.AHPCC#getLinks <em>Links</em>}</li>
 *   <li>{@link autoDesigner1.AHPCC#getApplications <em>Applications</em>}</li>
 *   <li>{@link autoDesigner1.AHPCC#getMappings_appNode <em>Mappings app Node</em>}</li>
 * </ul>
 *
 * @see autoDesigner1.AutoDesigner1Package#getAHPCC()
 * @model
 * @generated
 */
public interface AHPCC extends EObject {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link autoDesigner1.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getAHPCC_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link autoDesigner1.Data}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getAHPCC_Data()
	 * @model containment="true"
	 * @generated
	 */
	EList<Data> getData();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link autoDesigner1.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getAHPCC_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLinks();

	/**
	 * Returns the value of the '<em><b>Applications</b></em>' containment reference list.
	 * The list contents are of type {@link autoDesigner1.Application}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applications</em>' containment reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getAHPCC_Applications()
	 * @model containment="true"
	 * @generated
	 */
	EList<Application> getApplications();

	/**
	 * Returns the value of the '<em><b>Mappings app Node</b></em>' containment reference list.
	 * The list contents are of type {@link autoDesigner1.Mapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappings app Node</em>' containment reference list.
	 * @see autoDesigner1.AutoDesigner1Package#getAHPCC_Mappings_appNode()
	 * @model containment="true"
	 * @generated
	 */
	EList<Mapping> getMappings_appNode();

} // AHPCC
