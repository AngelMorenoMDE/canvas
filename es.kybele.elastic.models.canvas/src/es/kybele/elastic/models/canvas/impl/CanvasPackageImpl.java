/**
 */
package es.kybele.elastic.models.canvas.impl;

import es.kybele.elastic.models.canvas.CanvasAnnotation;
import es.kybele.elastic.models.canvas.CanvasBusinessModel;
import es.kybele.elastic.models.canvas.CanvasDiagram;
import es.kybele.elastic.models.canvas.CanvasFactory;
import es.kybele.elastic.models.canvas.CanvasPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CanvasPackageImpl extends EPackageImpl implements CanvasPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass canvasBusinessModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass canvasDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass canvasAnnotationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see es.kybele.elastic.models.canvas.CanvasPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CanvasPackageImpl() {
		super(eNS_URI, CanvasFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CanvasPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CanvasPackage init() {
		if (isInited) return (CanvasPackage)EPackage.Registry.INSTANCE.getEPackage(CanvasPackage.eNS_URI);

		// Obtain or create and register package
		CanvasPackageImpl theCanvasPackage = (CanvasPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CanvasPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CanvasPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theCanvasPackage.createPackageContents();

		// Initialize created meta-data
		theCanvasPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCanvasPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CanvasPackage.eNS_URI, theCanvasPackage);
		return theCanvasPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCanvasBusinessModel() {
		return canvasBusinessModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCanvasBusinessModel_CanvasDiagram() {
		return (EReference)canvasBusinessModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCanvasDiagram() {
		return canvasDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCanvasDiagram_InCanvasBusinessModel() {
		return (EReference)canvasDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCanvasDiagram_HasKeyPartnersAnnotations() {
		return (EReference)canvasDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCanvasDiagram_HasKeyActivitiesAnnotations() {
		return (EReference)canvasDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCanvasDiagram_HasKeyResourcesAnnotations() {
		return (EReference)canvasDiagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCanvasDiagram_HasValuePropositionsAnnotations() {
		return (EReference)canvasDiagramEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCanvasDiagram_HasCustomerRelationshipsAnnotations() {
		return (EReference)canvasDiagramEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCanvasDiagram_HasChannelsAnnotations() {
		return (EReference)canvasDiagramEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCanvasDiagram_HasCustomerSegmentsAnnotations() {
		return (EReference)canvasDiagramEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCanvasDiagram_HasCostStructureAnnotations() {
		return (EReference)canvasDiagramEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCanvasDiagram_HasRevenueStreamsAnnotations() {
		return (EReference)canvasDiagramEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCanvasAnnotation() {
		return canvasAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCanvasAnnotation_Content() {
		return (EAttribute)canvasAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanvasFactory getCanvasFactory() {
		return (CanvasFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		canvasBusinessModelEClass = createEClass(CANVAS_BUSINESS_MODEL);
		createEReference(canvasBusinessModelEClass, CANVAS_BUSINESS_MODEL__CANVAS_DIAGRAM);

		canvasDiagramEClass = createEClass(CANVAS_DIAGRAM);
		createEReference(canvasDiagramEClass, CANVAS_DIAGRAM__IN_CANVAS_BUSINESS_MODEL);
		createEReference(canvasDiagramEClass, CANVAS_DIAGRAM__HAS_KEY_PARTNERS_ANNOTATIONS);
		createEReference(canvasDiagramEClass, CANVAS_DIAGRAM__HAS_KEY_ACTIVITIES_ANNOTATIONS);
		createEReference(canvasDiagramEClass, CANVAS_DIAGRAM__HAS_KEY_RESOURCES_ANNOTATIONS);
		createEReference(canvasDiagramEClass, CANVAS_DIAGRAM__HAS_VALUE_PROPOSITIONS_ANNOTATIONS);
		createEReference(canvasDiagramEClass, CANVAS_DIAGRAM__HAS_CUSTOMER_RELATIONSHIPS_ANNOTATIONS);
		createEReference(canvasDiagramEClass, CANVAS_DIAGRAM__HAS_CHANNELS_ANNOTATIONS);
		createEReference(canvasDiagramEClass, CANVAS_DIAGRAM__HAS_CUSTOMER_SEGMENTS_ANNOTATIONS);
		createEReference(canvasDiagramEClass, CANVAS_DIAGRAM__HAS_COST_STRUCTURE_ANNOTATIONS);
		createEReference(canvasDiagramEClass, CANVAS_DIAGRAM__HAS_REVENUE_STREAMS_ANNOTATIONS);

		canvasAnnotationEClass = createEClass(CANVAS_ANNOTATION);
		createEAttribute(canvasAnnotationEClass, CANVAS_ANNOTATION__CONTENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(canvasBusinessModelEClass, CanvasBusinessModel.class, "CanvasBusinessModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCanvasBusinessModel_CanvasDiagram(), this.getCanvasDiagram(), this.getCanvasDiagram_InCanvasBusinessModel(), "canvasDiagram", null, 0, 1, CanvasBusinessModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(canvasDiagramEClass, CanvasDiagram.class, "CanvasDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCanvasDiagram_InCanvasBusinessModel(), this.getCanvasBusinessModel(), this.getCanvasBusinessModel_CanvasDiagram(), "inCanvasBusinessModel", null, 0, 1, CanvasDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCanvasDiagram_HasKeyPartnersAnnotations(), this.getCanvasAnnotation(), null, "hasKeyPartnersAnnotations", null, 0, -1, CanvasDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCanvasDiagram_HasKeyActivitiesAnnotations(), this.getCanvasAnnotation(), null, "hasKeyActivitiesAnnotations", null, 0, -1, CanvasDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCanvasDiagram_HasKeyResourcesAnnotations(), this.getCanvasAnnotation(), null, "hasKeyResourcesAnnotations", null, 0, -1, CanvasDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCanvasDiagram_HasValuePropositionsAnnotations(), this.getCanvasAnnotation(), null, "hasValuePropositionsAnnotations", null, 0, -1, CanvasDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCanvasDiagram_HasCustomerRelationshipsAnnotations(), this.getCanvasAnnotation(), null, "hasCustomerRelationshipsAnnotations", null, 0, -1, CanvasDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCanvasDiagram_HasChannelsAnnotations(), this.getCanvasAnnotation(), null, "hasChannelsAnnotations", null, 0, -1, CanvasDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCanvasDiagram_HasCustomerSegmentsAnnotations(), this.getCanvasAnnotation(), null, "hasCustomerSegmentsAnnotations", null, 0, -1, CanvasDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCanvasDiagram_HasCostStructureAnnotations(), this.getCanvasAnnotation(), null, "hasCostStructureAnnotations", null, 0, -1, CanvasDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCanvasDiagram_HasRevenueStreamsAnnotations(), this.getCanvasAnnotation(), null, "hasRevenueStreamsAnnotations", null, 0, -1, CanvasDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(canvasAnnotationEClass, CanvasAnnotation.class, "CanvasAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCanvasAnnotation_Content(), ecorePackage.getEString(), "content", null, 0, 1, CanvasAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CanvasPackageImpl
