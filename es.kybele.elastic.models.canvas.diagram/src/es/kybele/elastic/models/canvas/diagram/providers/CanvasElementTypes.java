package es.kybele.elastic.models.canvas.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import es.kybele.elastic.models.canvas.CanvasPackage;
import es.kybele.elastic.models.canvas.diagram.edit.parts.CanvasAnnotationEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.CanvasBusinessModelEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.CanvasDiagramEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.CenterVerticalCanvasAnnotationEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.LeftHorizontalCanvasAnnotationEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.LeftLeftVerticalCanvasAnnotationEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.LeftVerticalDownCanvasAnnotationEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.LeftVerticalUpCanvasAnnotationEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.RightHorizontalCanvasAnnotationEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.RightRightVerticalCanvasAnnotationEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.RightVerticalDownCanvasAnnotationEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.RightVerticalUpCanvasAnnotationEditPart;
import es.kybele.elastic.models.canvas.diagram.part.CanvasDiagramEditorPlugin;

/**
 * @generated
 */
public class CanvasElementTypes {

	/**
	 * @generated
	 */
	private CanvasElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			CanvasDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType CanvasBusinessModel_1000 = getElementType(
			"es.kybele.elastic.models.canvas.diagram.CanvasBusinessModel_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CanvasDiagram_2001 = getElementType(
			"es.kybele.elastic.models.canvas.diagram.CanvasDiagram_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CanvasAnnotation_3001 = getElementType(
			"es.kybele.elastic.models.canvas.diagram.CanvasAnnotation_3001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CanvasAnnotation_3002 = getElementType(
			"es.kybele.elastic.models.canvas.diagram.CanvasAnnotation_3002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CanvasAnnotation_3003 = getElementType(
			"es.kybele.elastic.models.canvas.diagram.CanvasAnnotation_3003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CanvasAnnotation_3004 = getElementType(
			"es.kybele.elastic.models.canvas.diagram.CanvasAnnotation_3004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CanvasAnnotation_3005 = getElementType(
			"es.kybele.elastic.models.canvas.diagram.CanvasAnnotation_3005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CanvasAnnotation_3006 = getElementType(
			"es.kybele.elastic.models.canvas.diagram.CanvasAnnotation_3006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CanvasAnnotation_3007 = getElementType(
			"es.kybele.elastic.models.canvas.diagram.CanvasAnnotation_3007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CanvasAnnotation_3008 = getElementType(
			"es.kybele.elastic.models.canvas.diagram.CanvasAnnotation_3008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CanvasAnnotation_3009 = getElementType(
			"es.kybele.elastic.models.canvas.diagram.CanvasAnnotation_3009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(CanvasBusinessModel_1000, CanvasPackage.eINSTANCE.getCanvasBusinessModel());

			elements.put(CanvasDiagram_2001, CanvasPackage.eINSTANCE.getCanvasDiagram());

			elements.put(CanvasAnnotation_3001, CanvasPackage.eINSTANCE.getCanvasAnnotation());

			elements.put(CanvasAnnotation_3002, CanvasPackage.eINSTANCE.getCanvasAnnotation());

			elements.put(CanvasAnnotation_3003, CanvasPackage.eINSTANCE.getCanvasAnnotation());

			elements.put(CanvasAnnotation_3004, CanvasPackage.eINSTANCE.getCanvasAnnotation());

			elements.put(CanvasAnnotation_3005, CanvasPackage.eINSTANCE.getCanvasAnnotation());

			elements.put(CanvasAnnotation_3006, CanvasPackage.eINSTANCE.getCanvasAnnotation());

			elements.put(CanvasAnnotation_3007, CanvasPackage.eINSTANCE.getCanvasAnnotation());

			elements.put(CanvasAnnotation_3008, CanvasPackage.eINSTANCE.getCanvasAnnotation());

			elements.put(CanvasAnnotation_3009, CanvasPackage.eINSTANCE.getCanvasAnnotation());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(CanvasBusinessModel_1000);
			KNOWN_ELEMENT_TYPES.add(CanvasDiagram_2001);
			KNOWN_ELEMENT_TYPES.add(CanvasAnnotation_3001);
			KNOWN_ELEMENT_TYPES.add(CanvasAnnotation_3002);
			KNOWN_ELEMENT_TYPES.add(CanvasAnnotation_3003);
			KNOWN_ELEMENT_TYPES.add(CanvasAnnotation_3004);
			KNOWN_ELEMENT_TYPES.add(CanvasAnnotation_3005);
			KNOWN_ELEMENT_TYPES.add(CanvasAnnotation_3006);
			KNOWN_ELEMENT_TYPES.add(CanvasAnnotation_3007);
			KNOWN_ELEMENT_TYPES.add(CanvasAnnotation_3008);
			KNOWN_ELEMENT_TYPES.add(CanvasAnnotation_3009);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case CanvasBusinessModelEditPart.VISUAL_ID:
			return CanvasBusinessModel_1000;
		case CanvasDiagramEditPart.VISUAL_ID:
			return CanvasDiagram_2001;
		case LeftLeftVerticalCanvasAnnotationEditPart.VISUAL_ID:
			return CanvasAnnotation_3001;
		case LeftVerticalUpCanvasAnnotationEditPart.VISUAL_ID:
			return CanvasAnnotation_3002;
		case LeftVerticalDownCanvasAnnotationEditPart.VISUAL_ID:
			return CanvasAnnotation_3003;
		case CenterVerticalCanvasAnnotationEditPart.VISUAL_ID:
			return CanvasAnnotation_3004;
		case RightVerticalUpCanvasAnnotationEditPart.VISUAL_ID:
			return CanvasAnnotation_3005;
		case RightVerticalDownCanvasAnnotationEditPart.VISUAL_ID:
			return CanvasAnnotation_3006;
		case RightRightVerticalCanvasAnnotationEditPart.VISUAL_ID:
			return CanvasAnnotation_3007;
		case LeftHorizontalCanvasAnnotationEditPart.VISUAL_ID:
			return CanvasAnnotation_3008;
		case RightHorizontalCanvasAnnotationEditPart.VISUAL_ID:
			return CanvasAnnotation_3009;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return es.kybele.elastic.models.canvas.diagram.providers.CanvasElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return es.kybele.elastic.models.canvas.diagram.providers.CanvasElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return es.kybele.elastic.models.canvas.diagram.providers.CanvasElementTypes.getElement(elementTypeAdapter);
		}
	};

}
