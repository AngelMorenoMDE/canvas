/**
 */
package es.kybele.elastic.models.canvas.impl;

import es.kybele.elastic.models.canvas.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CanvasFactoryImpl extends EFactoryImpl implements CanvasFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CanvasFactory init() {
		try {
			CanvasFactory theCanvasFactory = (CanvasFactory)EPackage.Registry.INSTANCE.getEFactory(CanvasPackage.eNS_URI);
			if (theCanvasFactory != null) {
				return theCanvasFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CanvasFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanvasFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CanvasPackage.CANVAS_BUSINESS_MODEL: return createCanvasBusinessModel();
			case CanvasPackage.CANVAS_DIAGRAM: return createCanvasDiagram();
			case CanvasPackage.CANVAS_ANNOTATION: return createCanvasAnnotation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanvasBusinessModel createCanvasBusinessModel() {
		CanvasBusinessModelImpl canvasBusinessModel = new CanvasBusinessModelImpl();
		return canvasBusinessModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanvasDiagram createCanvasDiagram() {
		CanvasDiagramImpl canvasDiagram = new CanvasDiagramImpl();
		return canvasDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanvasAnnotation createCanvasAnnotation() {
		CanvasAnnotationImpl canvasAnnotation = new CanvasAnnotationImpl();
		return canvasAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanvasPackage getCanvasPackage() {
		return (CanvasPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CanvasPackage getPackage() {
		return CanvasPackage.eINSTANCE;
	}

} //CanvasFactoryImpl
