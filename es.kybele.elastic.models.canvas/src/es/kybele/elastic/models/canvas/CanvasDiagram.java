/**
 */
package es.kybele.elastic.models.canvas;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.kybele.elastic.models.canvas.CanvasDiagram#getInCanvasBusinessModel <em>In Canvas Business Model</em>}</li>
 *   <li>{@link es.kybele.elastic.models.canvas.CanvasDiagram#getHasKeyPartnersAnnotations <em>Has Key Partners Annotations</em>}</li>
 *   <li>{@link es.kybele.elastic.models.canvas.CanvasDiagram#getHasKeyActivitiesAnnotations <em>Has Key Activities Annotations</em>}</li>
 *   <li>{@link es.kybele.elastic.models.canvas.CanvasDiagram#getHasKeyResourcesAnnotations <em>Has Key Resources Annotations</em>}</li>
 *   <li>{@link es.kybele.elastic.models.canvas.CanvasDiagram#getHasValuePropositionsAnnotations <em>Has Value Propositions Annotations</em>}</li>
 *   <li>{@link es.kybele.elastic.models.canvas.CanvasDiagram#getHasCustomerRelationshipsAnnotations <em>Has Customer Relationships Annotations</em>}</li>
 *   <li>{@link es.kybele.elastic.models.canvas.CanvasDiagram#getHasChannelsAnnotations <em>Has Channels Annotations</em>}</li>
 *   <li>{@link es.kybele.elastic.models.canvas.CanvasDiagram#getHasCustomerSegmentsAnnotations <em>Has Customer Segments Annotations</em>}</li>
 *   <li>{@link es.kybele.elastic.models.canvas.CanvasDiagram#getHasCostStructureAnnotations <em>Has Cost Structure Annotations</em>}</li>
 *   <li>{@link es.kybele.elastic.models.canvas.CanvasDiagram#getHasRevenueStreamsAnnotations <em>Has Revenue Streams Annotations</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.kybele.elastic.models.canvas.CanvasPackage#getCanvasDiagram()
 * @model
 * @generated
 */
public interface CanvasDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>In Canvas Business Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.kybele.elastic.models.canvas.CanvasBusinessModel#getCanvasDiagram <em>Canvas Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Canvas Business Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Canvas Business Model</em>' container reference.
	 * @see #setInCanvasBusinessModel(CanvasBusinessModel)
	 * @see es.kybele.elastic.models.canvas.CanvasPackage#getCanvasDiagram_InCanvasBusinessModel()
	 * @see es.kybele.elastic.models.canvas.CanvasBusinessModel#getCanvasDiagram
	 * @model opposite="canvasDiagram" transient="false"
	 * @generated
	 */
	CanvasBusinessModel getInCanvasBusinessModel();

	/**
	 * Sets the value of the '{@link es.kybele.elastic.models.canvas.CanvasDiagram#getInCanvasBusinessModel <em>In Canvas Business Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Canvas Business Model</em>' container reference.
	 * @see #getInCanvasBusinessModel()
	 * @generated
	 */
	void setInCanvasBusinessModel(CanvasBusinessModel value);

	/**
	 * Returns the value of the '<em><b>Has Key Partners Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link es.kybele.elastic.models.canvas.CanvasAnnotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Key Partners Annotations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Key Partners Annotations</em>' containment reference list.
	 * @see es.kybele.elastic.models.canvas.CanvasPackage#getCanvasDiagram_HasKeyPartnersAnnotations()
	 * @model containment="true"
	 * @generated
	 */
	EList<CanvasAnnotation> getHasKeyPartnersAnnotations();

	/**
	 * Returns the value of the '<em><b>Has Key Activities Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link es.kybele.elastic.models.canvas.CanvasAnnotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Key Activities Annotations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Key Activities Annotations</em>' containment reference list.
	 * @see es.kybele.elastic.models.canvas.CanvasPackage#getCanvasDiagram_HasKeyActivitiesAnnotations()
	 * @model containment="true"
	 * @generated
	 */
	EList<CanvasAnnotation> getHasKeyActivitiesAnnotations();

	/**
	 * Returns the value of the '<em><b>Has Key Resources Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link es.kybele.elastic.models.canvas.CanvasAnnotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Key Resources Annotations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Key Resources Annotations</em>' containment reference list.
	 * @see es.kybele.elastic.models.canvas.CanvasPackage#getCanvasDiagram_HasKeyResourcesAnnotations()
	 * @model containment="true"
	 * @generated
	 */
	EList<CanvasAnnotation> getHasKeyResourcesAnnotations();

	/**
	 * Returns the value of the '<em><b>Has Value Propositions Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link es.kybele.elastic.models.canvas.CanvasAnnotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Value Propositions Annotations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Value Propositions Annotations</em>' containment reference list.
	 * @see es.kybele.elastic.models.canvas.CanvasPackage#getCanvasDiagram_HasValuePropositionsAnnotations()
	 * @model containment="true"
	 * @generated
	 */
	EList<CanvasAnnotation> getHasValuePropositionsAnnotations();

	/**
	 * Returns the value of the '<em><b>Has Customer Relationships Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link es.kybele.elastic.models.canvas.CanvasAnnotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Customer Relationships Annotations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Customer Relationships Annotations</em>' containment reference list.
	 * @see es.kybele.elastic.models.canvas.CanvasPackage#getCanvasDiagram_HasCustomerRelationshipsAnnotations()
	 * @model containment="true"
	 * @generated
	 */
	EList<CanvasAnnotation> getHasCustomerRelationshipsAnnotations();

	/**
	 * Returns the value of the '<em><b>Has Channels Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link es.kybele.elastic.models.canvas.CanvasAnnotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Channels Annotations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Channels Annotations</em>' containment reference list.
	 * @see es.kybele.elastic.models.canvas.CanvasPackage#getCanvasDiagram_HasChannelsAnnotations()
	 * @model containment="true"
	 * @generated
	 */
	EList<CanvasAnnotation> getHasChannelsAnnotations();

	/**
	 * Returns the value of the '<em><b>Has Customer Segments Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link es.kybele.elastic.models.canvas.CanvasAnnotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Customer Segments Annotations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Customer Segments Annotations</em>' containment reference list.
	 * @see es.kybele.elastic.models.canvas.CanvasPackage#getCanvasDiagram_HasCustomerSegmentsAnnotations()
	 * @model containment="true"
	 * @generated
	 */
	EList<CanvasAnnotation> getHasCustomerSegmentsAnnotations();

	/**
	 * Returns the value of the '<em><b>Has Cost Structure Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link es.kybele.elastic.models.canvas.CanvasAnnotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Cost Structure Annotations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Cost Structure Annotations</em>' containment reference list.
	 * @see es.kybele.elastic.models.canvas.CanvasPackage#getCanvasDiagram_HasCostStructureAnnotations()
	 * @model containment="true"
	 * @generated
	 */
	EList<CanvasAnnotation> getHasCostStructureAnnotations();

	/**
	 * Returns the value of the '<em><b>Has Revenue Streams Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link es.kybele.elastic.models.canvas.CanvasAnnotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Revenue Streams Annotations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Revenue Streams Annotations</em>' containment reference list.
	 * @see es.kybele.elastic.models.canvas.CanvasPackage#getCanvasDiagram_HasRevenueStreamsAnnotations()
	 * @model containment="true"
	 * @generated
	 */
	EList<CanvasAnnotation> getHasRevenueStreamsAnnotations();

} // CanvasDiagram
