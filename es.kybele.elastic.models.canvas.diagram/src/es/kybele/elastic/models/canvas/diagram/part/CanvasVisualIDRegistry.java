package es.kybele.elastic.models.canvas.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import es.kybele.elastic.models.canvas.CanvasBusinessModel;
import es.kybele.elastic.models.canvas.CanvasPackage;
import es.kybele.elastic.models.canvas.diagram.edit.parts.CanvasAnnotationContentEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.CanvasAnnotationEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.CanvasBusinessModelEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.CanvasDiagramCenterVerticalRectangleCompartmentDiagramEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.CanvasDiagramEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.CanvasDiagramLeftHorizontalRectangleCompartmentDiagramEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.CanvasDiagramLeftLeftVerticalRectangleCompartmentDiagramEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.CanvasDiagramLeftVerticalDownRectangleCompartmentDiagramEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.CanvasDiagramLeftVerticalUpRectangleCompartmentDiagramEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.CanvasDiagramRightHorizontalRectangleCompartmentDiagramEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.CanvasDiagramRightRightVerticalRectangleCompartmentDiagramEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.CanvasDiagramRightVerticalDownCompartmentDiagramEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.CanvasDiagramRightVerticalUpRectangleCompartmentDiagramEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.CenterVerticalCanvasAnnotationContentEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.CenterVerticalCanvasAnnotationEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.LeftHorizontalCanvasAnnotationContentEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.LeftHorizontalCanvasAnnotationEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.LeftLeftVerticalCanvasAnnotationEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.LeftVerticalDownCanvasAnnotationContentEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.LeftVerticalDownCanvasAnnotationEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.LeftVerticalUpCanvasAnnotationContentEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.LeftVerticalUpCanvasAnnotationEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.RightHorizontalCanvasAnnotationContentEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.RightHorizontalCanvasAnnotationEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.RightRightVerticalCanvasAnnotationContentEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.RightRightVerticalCanvasAnnotationEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.RightVerticalDownCanvasAnnotationContentEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.RightVerticalDownCanvasAnnotationEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.RightVerticalUpCanvasAnnotationContentEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.RightVerticalUpCanvasAnnotationEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class CanvasVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "es.kybele.elastic.models.canvas.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (CanvasBusinessModelEditPart.MODEL_ID.equals(view.getType())) {
				return CanvasBusinessModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return es.kybele.elastic.models.canvas.diagram.part.CanvasVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				CanvasDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (CanvasPackage.eINSTANCE.getCanvasBusinessModel().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((CanvasBusinessModel) domainElement)) {
			return CanvasBusinessModelEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = es.kybele.elastic.models.canvas.diagram.part.CanvasVisualIDRegistry
				.getModelID(containerView);
		if (!CanvasBusinessModelEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (CanvasBusinessModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = es.kybele.elastic.models.canvas.diagram.part.CanvasVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = CanvasBusinessModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case CanvasBusinessModelEditPart.VISUAL_ID:
			if (CanvasPackage.eINSTANCE.getCanvasDiagram().isSuperTypeOf(domainElement.eClass())) {
				return CanvasDiagramEditPart.VISUAL_ID;
			}
			break;
		case CanvasDiagramLeftLeftVerticalRectangleCompartmentDiagramEditPart.VISUAL_ID:
			if (CanvasPackage.eINSTANCE.getCanvasAnnotation().isSuperTypeOf(domainElement.eClass())) {
				return LeftLeftVerticalCanvasAnnotationEditPart.VISUAL_ID;
			}
			break;
		case CanvasDiagramLeftVerticalUpRectangleCompartmentDiagramEditPart.VISUAL_ID:
			if (CanvasPackage.eINSTANCE.getCanvasAnnotation().isSuperTypeOf(domainElement.eClass())) {
				return LeftVerticalUpCanvasAnnotationEditPart.VISUAL_ID;
			}
			break;
		case CanvasDiagramLeftVerticalDownRectangleCompartmentDiagramEditPart.VISUAL_ID:
			if (CanvasPackage.eINSTANCE.getCanvasAnnotation().isSuperTypeOf(domainElement.eClass())) {
				return LeftVerticalDownCanvasAnnotationEditPart.VISUAL_ID;
			}
			break;
		case CanvasDiagramCenterVerticalRectangleCompartmentDiagramEditPart.VISUAL_ID:
			if (CanvasPackage.eINSTANCE.getCanvasAnnotation().isSuperTypeOf(domainElement.eClass())) {
				return CenterVerticalCanvasAnnotationEditPart.VISUAL_ID;
			}
			break;
		case CanvasDiagramRightVerticalUpRectangleCompartmentDiagramEditPart.VISUAL_ID:
			if (CanvasPackage.eINSTANCE.getCanvasAnnotation().isSuperTypeOf(domainElement.eClass())) {
				return RightVerticalUpCanvasAnnotationEditPart.VISUAL_ID;
			}
			break;
		case CanvasDiagramRightVerticalDownCompartmentDiagramEditPart.VISUAL_ID:
			if (CanvasPackage.eINSTANCE.getCanvasAnnotation().isSuperTypeOf(domainElement.eClass())) {
				return RightVerticalDownCanvasAnnotationEditPart.VISUAL_ID;
			}
			break;
		case CanvasDiagramRightRightVerticalRectangleCompartmentDiagramEditPart.VISUAL_ID:
			if (CanvasPackage.eINSTANCE.getCanvasAnnotation().isSuperTypeOf(domainElement.eClass())) {
				return RightRightVerticalCanvasAnnotationEditPart.VISUAL_ID;
			}
			break;
		case CanvasDiagramLeftHorizontalRectangleCompartmentDiagramEditPart.VISUAL_ID:
			if (CanvasPackage.eINSTANCE.getCanvasAnnotation().isSuperTypeOf(domainElement.eClass())) {
				return LeftHorizontalCanvasAnnotationEditPart.VISUAL_ID;
			}
			break;
		case CanvasDiagramRightHorizontalRectangleCompartmentDiagramEditPart.VISUAL_ID:
			if (CanvasPackage.eINSTANCE.getCanvasAnnotation().isSuperTypeOf(domainElement.eClass())) {
				return RightHorizontalCanvasAnnotationEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = es.kybele.elastic.models.canvas.diagram.part.CanvasVisualIDRegistry
				.getModelID(containerView);
		if (!CanvasBusinessModelEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (CanvasBusinessModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = es.kybele.elastic.models.canvas.diagram.part.CanvasVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = CanvasBusinessModelEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case CanvasBusinessModelEditPart.VISUAL_ID:
			if (CanvasDiagramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CanvasDiagramEditPart.VISUAL_ID:
			if (CanvasDiagramLeftLeftVerticalRectangleCompartmentDiagramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CanvasDiagramLeftVerticalUpRectangleCompartmentDiagramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CanvasDiagramLeftVerticalDownRectangleCompartmentDiagramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CanvasDiagramCenterVerticalRectangleCompartmentDiagramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CanvasDiagramRightVerticalUpRectangleCompartmentDiagramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CanvasDiagramRightVerticalDownCompartmentDiagramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CanvasDiagramRightRightVerticalRectangleCompartmentDiagramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CanvasDiagramLeftHorizontalRectangleCompartmentDiagramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CanvasDiagramRightHorizontalRectangleCompartmentDiagramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LeftLeftVerticalCanvasAnnotationEditPart.VISUAL_ID:
			if (CanvasAnnotationContentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LeftVerticalUpCanvasAnnotationEditPart.VISUAL_ID:
			if (LeftVerticalUpCanvasAnnotationContentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LeftVerticalDownCanvasAnnotationEditPart.VISUAL_ID:
			if (LeftVerticalDownCanvasAnnotationContentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CenterVerticalCanvasAnnotationEditPart.VISUAL_ID:
			if (CenterVerticalCanvasAnnotationContentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RightVerticalUpCanvasAnnotationEditPart.VISUAL_ID:
			if (RightVerticalUpCanvasAnnotationContentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RightVerticalDownCanvasAnnotationEditPart.VISUAL_ID:
			if (RightVerticalDownCanvasAnnotationContentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RightRightVerticalCanvasAnnotationEditPart.VISUAL_ID:
			if (RightRightVerticalCanvasAnnotationContentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LeftHorizontalCanvasAnnotationEditPart.VISUAL_ID:
			if (LeftHorizontalCanvasAnnotationContentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RightHorizontalCanvasAnnotationEditPart.VISUAL_ID:
			if (RightHorizontalCanvasAnnotationContentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CanvasDiagramLeftLeftVerticalRectangleCompartmentDiagramEditPart.VISUAL_ID:
			if (LeftLeftVerticalCanvasAnnotationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CanvasDiagramLeftVerticalUpRectangleCompartmentDiagramEditPart.VISUAL_ID:
			if (LeftVerticalUpCanvasAnnotationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CanvasDiagramLeftVerticalDownRectangleCompartmentDiagramEditPart.VISUAL_ID:
			if (LeftVerticalDownCanvasAnnotationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CanvasDiagramCenterVerticalRectangleCompartmentDiagramEditPart.VISUAL_ID:
			if (CenterVerticalCanvasAnnotationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CanvasDiagramRightVerticalUpRectangleCompartmentDiagramEditPart.VISUAL_ID:
			if (RightVerticalUpCanvasAnnotationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CanvasDiagramRightVerticalDownCompartmentDiagramEditPart.VISUAL_ID:
			if (RightVerticalDownCanvasAnnotationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CanvasDiagramRightRightVerticalRectangleCompartmentDiagramEditPart.VISUAL_ID:
			if (RightRightVerticalCanvasAnnotationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CanvasDiagramLeftHorizontalRectangleCompartmentDiagramEditPart.VISUAL_ID:
			if (LeftHorizontalCanvasAnnotationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CanvasDiagramRightHorizontalRectangleCompartmentDiagramEditPart.VISUAL_ID:
			if (RightHorizontalCanvasAnnotationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(CanvasBusinessModel element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case CanvasDiagramLeftLeftVerticalRectangleCompartmentDiagramEditPart.VISUAL_ID:
		case CanvasDiagramLeftVerticalUpRectangleCompartmentDiagramEditPart.VISUAL_ID:
		case CanvasDiagramLeftVerticalDownRectangleCompartmentDiagramEditPart.VISUAL_ID:
		case CanvasDiagramCenterVerticalRectangleCompartmentDiagramEditPart.VISUAL_ID:
		case CanvasDiagramRightVerticalUpRectangleCompartmentDiagramEditPart.VISUAL_ID:
		case CanvasDiagramRightVerticalDownCompartmentDiagramEditPart.VISUAL_ID:
		case CanvasDiagramRightRightVerticalRectangleCompartmentDiagramEditPart.VISUAL_ID:
		case CanvasDiagramLeftHorizontalRectangleCompartmentDiagramEditPart.VISUAL_ID:
		case CanvasDiagramRightHorizontalRectangleCompartmentDiagramEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case CanvasBusinessModelEditPart.VISUAL_ID:
			return false;
		case LeftLeftVerticalCanvasAnnotationEditPart.VISUAL_ID:
		case LeftVerticalUpCanvasAnnotationEditPart.VISUAL_ID:
		case LeftVerticalDownCanvasAnnotationEditPart.VISUAL_ID:
		case CenterVerticalCanvasAnnotationEditPart.VISUAL_ID:
		case RightVerticalUpCanvasAnnotationEditPart.VISUAL_ID:
		case RightVerticalDownCanvasAnnotationEditPart.VISUAL_ID:
		case RightRightVerticalCanvasAnnotationEditPart.VISUAL_ID:
		case LeftHorizontalCanvasAnnotationEditPart.VISUAL_ID:
		case RightHorizontalCanvasAnnotationEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return es.kybele.elastic.models.canvas.diagram.part.CanvasVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return es.kybele.elastic.models.canvas.diagram.part.CanvasVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return es.kybele.elastic.models.canvas.diagram.part.CanvasVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return es.kybele.elastic.models.canvas.diagram.part.CanvasVisualIDRegistry.checkNodeVisualID(containerView,
					domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return es.kybele.elastic.models.canvas.diagram.part.CanvasVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return es.kybele.elastic.models.canvas.diagram.part.CanvasVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
