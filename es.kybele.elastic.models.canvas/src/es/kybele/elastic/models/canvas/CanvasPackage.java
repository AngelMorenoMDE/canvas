/**
 */
package es.kybele.elastic.models.canvas;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see es.kybele.elastic.models.canvas.CanvasFactory
 * @model kind="package"
 * @generated
 */
public interface CanvasPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "canvas";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.kybele.es/projects/elastic/models/canvas/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "canvas";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CanvasPackage eINSTANCE = es.kybele.elastic.models.canvas.impl.CanvasPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.kybele.elastic.models.canvas.impl.CanvasBusinessModelImpl <em>Business Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.kybele.elastic.models.canvas.impl.CanvasBusinessModelImpl
	 * @see es.kybele.elastic.models.canvas.impl.CanvasPackageImpl#getCanvasBusinessModel()
	 * @generated
	 */
	int CANVAS_BUSINESS_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Canvas Diagram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_BUSINESS_MODEL__CANVAS_DIAGRAM = 0;

	/**
	 * The number of structural features of the '<em>Business Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_BUSINESS_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Business Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_BUSINESS_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.kybele.elastic.models.canvas.impl.CanvasDiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.kybele.elastic.models.canvas.impl.CanvasDiagramImpl
	 * @see es.kybele.elastic.models.canvas.impl.CanvasPackageImpl#getCanvasDiagram()
	 * @generated
	 */
	int CANVAS_DIAGRAM = 1;

	/**
	 * The feature id for the '<em><b>In Canvas Business Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_DIAGRAM__IN_CANVAS_BUSINESS_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Has Key Partners Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_DIAGRAM__HAS_KEY_PARTNERS_ANNOTATIONS = 1;

	/**
	 * The feature id for the '<em><b>Has Key Activities Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_DIAGRAM__HAS_KEY_ACTIVITIES_ANNOTATIONS = 2;

	/**
	 * The feature id for the '<em><b>Has Key Resources Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_DIAGRAM__HAS_KEY_RESOURCES_ANNOTATIONS = 3;

	/**
	 * The feature id for the '<em><b>Has Value Propositions Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_DIAGRAM__HAS_VALUE_PROPOSITIONS_ANNOTATIONS = 4;

	/**
	 * The feature id for the '<em><b>Has Customer Relationships Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_DIAGRAM__HAS_CUSTOMER_RELATIONSHIPS_ANNOTATIONS = 5;

	/**
	 * The feature id for the '<em><b>Has Channels Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_DIAGRAM__HAS_CHANNELS_ANNOTATIONS = 6;

	/**
	 * The feature id for the '<em><b>Has Customer Segments Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_DIAGRAM__HAS_CUSTOMER_SEGMENTS_ANNOTATIONS = 7;

	/**
	 * The feature id for the '<em><b>Has Cost Structure Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_DIAGRAM__HAS_COST_STRUCTURE_ANNOTATIONS = 8;

	/**
	 * The feature id for the '<em><b>Has Revenue Streams Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_DIAGRAM__HAS_REVENUE_STREAMS_ANNOTATIONS = 9;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_DIAGRAM_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.kybele.elastic.models.canvas.impl.CanvasAnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.kybele.elastic.models.canvas.impl.CanvasAnnotationImpl
	 * @see es.kybele.elastic.models.canvas.impl.CanvasPackageImpl#getCanvasAnnotation()
	 * @generated
	 */
	int CANVAS_ANNOTATION = 2;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_ANNOTATION__CONTENT = 0;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_ANNOTATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_ANNOTATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link es.kybele.elastic.models.canvas.CanvasBusinessModel <em>Business Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Model</em>'.
	 * @see es.kybele.elastic.models.canvas.CanvasBusinessModel
	 * @generated
	 */
	EClass getCanvasBusinessModel();

	/**
	 * Returns the meta object for the containment reference '{@link es.kybele.elastic.models.canvas.CanvasBusinessModel#getCanvasDiagram <em>Canvas Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Canvas Diagram</em>'.
	 * @see es.kybele.elastic.models.canvas.CanvasBusinessModel#getCanvasDiagram()
	 * @see #getCanvasBusinessModel()
	 * @generated
	 */
	EReference getCanvasBusinessModel_CanvasDiagram();

	/**
	 * Returns the meta object for class '{@link es.kybele.elastic.models.canvas.CanvasDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see es.kybele.elastic.models.canvas.CanvasDiagram
	 * @generated
	 */
	EClass getCanvasDiagram();

	/**
	 * Returns the meta object for the container reference '{@link es.kybele.elastic.models.canvas.CanvasDiagram#getInCanvasBusinessModel <em>In Canvas Business Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>In Canvas Business Model</em>'.
	 * @see es.kybele.elastic.models.canvas.CanvasDiagram#getInCanvasBusinessModel()
	 * @see #getCanvasDiagram()
	 * @generated
	 */
	EReference getCanvasDiagram_InCanvasBusinessModel();

	/**
	 * Returns the meta object for the containment reference list '{@link es.kybele.elastic.models.canvas.CanvasDiagram#getHasKeyPartnersAnnotations <em>Has Key Partners Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Key Partners Annotations</em>'.
	 * @see es.kybele.elastic.models.canvas.CanvasDiagram#getHasKeyPartnersAnnotations()
	 * @see #getCanvasDiagram()
	 * @generated
	 */
	EReference getCanvasDiagram_HasKeyPartnersAnnotations();

	/**
	 * Returns the meta object for the containment reference list '{@link es.kybele.elastic.models.canvas.CanvasDiagram#getHasKeyActivitiesAnnotations <em>Has Key Activities Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Key Activities Annotations</em>'.
	 * @see es.kybele.elastic.models.canvas.CanvasDiagram#getHasKeyActivitiesAnnotations()
	 * @see #getCanvasDiagram()
	 * @generated
	 */
	EReference getCanvasDiagram_HasKeyActivitiesAnnotations();

	/**
	 * Returns the meta object for the containment reference list '{@link es.kybele.elastic.models.canvas.CanvasDiagram#getHasKeyResourcesAnnotations <em>Has Key Resources Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Key Resources Annotations</em>'.
	 * @see es.kybele.elastic.models.canvas.CanvasDiagram#getHasKeyResourcesAnnotations()
	 * @see #getCanvasDiagram()
	 * @generated
	 */
	EReference getCanvasDiagram_HasKeyResourcesAnnotations();

	/**
	 * Returns the meta object for the containment reference list '{@link es.kybele.elastic.models.canvas.CanvasDiagram#getHasValuePropositionsAnnotations <em>Has Value Propositions Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Value Propositions Annotations</em>'.
	 * @see es.kybele.elastic.models.canvas.CanvasDiagram#getHasValuePropositionsAnnotations()
	 * @see #getCanvasDiagram()
	 * @generated
	 */
	EReference getCanvasDiagram_HasValuePropositionsAnnotations();

	/**
	 * Returns the meta object for the containment reference list '{@link es.kybele.elastic.models.canvas.CanvasDiagram#getHasCustomerRelationshipsAnnotations <em>Has Customer Relationships Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Customer Relationships Annotations</em>'.
	 * @see es.kybele.elastic.models.canvas.CanvasDiagram#getHasCustomerRelationshipsAnnotations()
	 * @see #getCanvasDiagram()
	 * @generated
	 */
	EReference getCanvasDiagram_HasCustomerRelationshipsAnnotations();

	/**
	 * Returns the meta object for the containment reference list '{@link es.kybele.elastic.models.canvas.CanvasDiagram#getHasChannelsAnnotations <em>Has Channels Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Channels Annotations</em>'.
	 * @see es.kybele.elastic.models.canvas.CanvasDiagram#getHasChannelsAnnotations()
	 * @see #getCanvasDiagram()
	 * @generated
	 */
	EReference getCanvasDiagram_HasChannelsAnnotations();

	/**
	 * Returns the meta object for the containment reference list '{@link es.kybele.elastic.models.canvas.CanvasDiagram#getHasCustomerSegmentsAnnotations <em>Has Customer Segments Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Customer Segments Annotations</em>'.
	 * @see es.kybele.elastic.models.canvas.CanvasDiagram#getHasCustomerSegmentsAnnotations()
	 * @see #getCanvasDiagram()
	 * @generated
	 */
	EReference getCanvasDiagram_HasCustomerSegmentsAnnotations();

	/**
	 * Returns the meta object for the containment reference list '{@link es.kybele.elastic.models.canvas.CanvasDiagram#getHasCostStructureAnnotations <em>Has Cost Structure Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Cost Structure Annotations</em>'.
	 * @see es.kybele.elastic.models.canvas.CanvasDiagram#getHasCostStructureAnnotations()
	 * @see #getCanvasDiagram()
	 * @generated
	 */
	EReference getCanvasDiagram_HasCostStructureAnnotations();

	/**
	 * Returns the meta object for the containment reference list '{@link es.kybele.elastic.models.canvas.CanvasDiagram#getHasRevenueStreamsAnnotations <em>Has Revenue Streams Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Revenue Streams Annotations</em>'.
	 * @see es.kybele.elastic.models.canvas.CanvasDiagram#getHasRevenueStreamsAnnotations()
	 * @see #getCanvasDiagram()
	 * @generated
	 */
	EReference getCanvasDiagram_HasRevenueStreamsAnnotations();

	/**
	 * Returns the meta object for class '{@link es.kybele.elastic.models.canvas.CanvasAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see es.kybele.elastic.models.canvas.CanvasAnnotation
	 * @generated
	 */
	EClass getCanvasAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link es.kybele.elastic.models.canvas.CanvasAnnotation#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see es.kybele.elastic.models.canvas.CanvasAnnotation#getContent()
	 * @see #getCanvasAnnotation()
	 * @generated
	 */
	EAttribute getCanvasAnnotation_Content();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CanvasFactory getCanvasFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link es.kybele.elastic.models.canvas.impl.CanvasBusinessModelImpl <em>Business Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.kybele.elastic.models.canvas.impl.CanvasBusinessModelImpl
		 * @see es.kybele.elastic.models.canvas.impl.CanvasPackageImpl#getCanvasBusinessModel()
		 * @generated
		 */
		EClass CANVAS_BUSINESS_MODEL = eINSTANCE.getCanvasBusinessModel();

		/**
		 * The meta object literal for the '<em><b>Canvas Diagram</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANVAS_BUSINESS_MODEL__CANVAS_DIAGRAM = eINSTANCE.getCanvasBusinessModel_CanvasDiagram();

		/**
		 * The meta object literal for the '{@link es.kybele.elastic.models.canvas.impl.CanvasDiagramImpl <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.kybele.elastic.models.canvas.impl.CanvasDiagramImpl
		 * @see es.kybele.elastic.models.canvas.impl.CanvasPackageImpl#getCanvasDiagram()
		 * @generated
		 */
		EClass CANVAS_DIAGRAM = eINSTANCE.getCanvasDiagram();

		/**
		 * The meta object literal for the '<em><b>In Canvas Business Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANVAS_DIAGRAM__IN_CANVAS_BUSINESS_MODEL = eINSTANCE.getCanvasDiagram_InCanvasBusinessModel();

		/**
		 * The meta object literal for the '<em><b>Has Key Partners Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANVAS_DIAGRAM__HAS_KEY_PARTNERS_ANNOTATIONS = eINSTANCE.getCanvasDiagram_HasKeyPartnersAnnotations();

		/**
		 * The meta object literal for the '<em><b>Has Key Activities Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANVAS_DIAGRAM__HAS_KEY_ACTIVITIES_ANNOTATIONS = eINSTANCE.getCanvasDiagram_HasKeyActivitiesAnnotations();

		/**
		 * The meta object literal for the '<em><b>Has Key Resources Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANVAS_DIAGRAM__HAS_KEY_RESOURCES_ANNOTATIONS = eINSTANCE.getCanvasDiagram_HasKeyResourcesAnnotations();

		/**
		 * The meta object literal for the '<em><b>Has Value Propositions Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANVAS_DIAGRAM__HAS_VALUE_PROPOSITIONS_ANNOTATIONS = eINSTANCE.getCanvasDiagram_HasValuePropositionsAnnotations();

		/**
		 * The meta object literal for the '<em><b>Has Customer Relationships Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANVAS_DIAGRAM__HAS_CUSTOMER_RELATIONSHIPS_ANNOTATIONS = eINSTANCE.getCanvasDiagram_HasCustomerRelationshipsAnnotations();

		/**
		 * The meta object literal for the '<em><b>Has Channels Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANVAS_DIAGRAM__HAS_CHANNELS_ANNOTATIONS = eINSTANCE.getCanvasDiagram_HasChannelsAnnotations();

		/**
		 * The meta object literal for the '<em><b>Has Customer Segments Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANVAS_DIAGRAM__HAS_CUSTOMER_SEGMENTS_ANNOTATIONS = eINSTANCE.getCanvasDiagram_HasCustomerSegmentsAnnotations();

		/**
		 * The meta object literal for the '<em><b>Has Cost Structure Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANVAS_DIAGRAM__HAS_COST_STRUCTURE_ANNOTATIONS = eINSTANCE.getCanvasDiagram_HasCostStructureAnnotations();

		/**
		 * The meta object literal for the '<em><b>Has Revenue Streams Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANVAS_DIAGRAM__HAS_REVENUE_STREAMS_ANNOTATIONS = eINSTANCE.getCanvasDiagram_HasRevenueStreamsAnnotations();

		/**
		 * The meta object literal for the '{@link es.kybele.elastic.models.canvas.impl.CanvasAnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.kybele.elastic.models.canvas.impl.CanvasAnnotationImpl
		 * @see es.kybele.elastic.models.canvas.impl.CanvasPackageImpl#getCanvasAnnotation()
		 * @generated
		 */
		EClass CANVAS_ANNOTATION = eINSTANCE.getCanvasAnnotation();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CANVAS_ANNOTATION__CONTENT = eINSTANCE.getCanvasAnnotation_Content();

	}

} //CanvasPackage
