package es.kybele.elastic.models.canvas.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import es.kybele.elastic.models.canvas.diagram.part.CanvasVisualIDRegistry;

/**
 * @generated
 */
public class CanvasEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (CanvasVisualIDRegistry.getVisualID(view)) {

			case CanvasBusinessModelEditPart.VISUAL_ID:
				return new CanvasBusinessModelEditPart(view);

			case CanvasDiagramEditPart.VISUAL_ID:
				return new CanvasDiagramEditPart(view);

			case LeftLeftVerticalCanvasAnnotationEditPart.VISUAL_ID:
				return new LeftLeftVerticalCanvasAnnotationEditPart(view);

			case CanvasAnnotationContentEditPart.VISUAL_ID:
				return new CanvasAnnotationContentEditPart(view);

			case LeftVerticalUpCanvasAnnotationEditPart.VISUAL_ID:
				return new LeftVerticalUpCanvasAnnotationEditPart(view);

			case LeftVerticalUpCanvasAnnotationContentEditPart.VISUAL_ID:
				return new LeftVerticalUpCanvasAnnotationContentEditPart(view);

			case LeftVerticalDownCanvasAnnotationEditPart.VISUAL_ID:
				return new LeftVerticalDownCanvasAnnotationEditPart(view);

			case LeftVerticalDownCanvasAnnotationContentEditPart.VISUAL_ID:
				return new LeftVerticalDownCanvasAnnotationContentEditPart(view);

			case CenterVerticalCanvasAnnotationEditPart.VISUAL_ID:
				return new CenterVerticalCanvasAnnotationEditPart(view);

			case CenterVerticalCanvasAnnotationContentEditPart.VISUAL_ID:
				return new CenterVerticalCanvasAnnotationContentEditPart(view);

			case RightVerticalUpCanvasAnnotationEditPart.VISUAL_ID:
				return new RightVerticalUpCanvasAnnotationEditPart(view);

			case RightVerticalUpCanvasAnnotationContentEditPart.VISUAL_ID:
				return new RightVerticalUpCanvasAnnotationContentEditPart(view);

			case RightVerticalDownCanvasAnnotationEditPart.VISUAL_ID:
				return new RightVerticalDownCanvasAnnotationEditPart(view);

			case RightVerticalDownCanvasAnnotationContentEditPart.VISUAL_ID:
				return new RightVerticalDownCanvasAnnotationContentEditPart(view);

			case RightRightVerticalCanvasAnnotationEditPart.VISUAL_ID:
				return new RightRightVerticalCanvasAnnotationEditPart(view);

			case RightRightVerticalCanvasAnnotationContentEditPart.VISUAL_ID:
				return new RightRightVerticalCanvasAnnotationContentEditPart(view);

			case LeftHorizontalCanvasAnnotationEditPart.VISUAL_ID:
				return new LeftHorizontalCanvasAnnotationEditPart(view);

			case LeftHorizontalCanvasAnnotationContentEditPart.VISUAL_ID:
				return new LeftHorizontalCanvasAnnotationContentEditPart(view);

			case RightHorizontalCanvasAnnotationEditPart.VISUAL_ID:
				return new RightHorizontalCanvasAnnotationEditPart(view);

			case RightHorizontalCanvasAnnotationContentEditPart.VISUAL_ID:
				return new RightHorizontalCanvasAnnotationContentEditPart(view);

			case CanvasDiagramLeftLeftVerticalRectangleCompartmentDiagramEditPart.VISUAL_ID:
				return new CanvasDiagramLeftLeftVerticalRectangleCompartmentDiagramEditPart(view);

			case CanvasDiagramLeftVerticalUpRectangleCompartmentDiagramEditPart.VISUAL_ID:
				return new CanvasDiagramLeftVerticalUpRectangleCompartmentDiagramEditPart(view);

			case CanvasDiagramLeftVerticalDownRectangleCompartmentDiagramEditPart.VISUAL_ID:
				return new CanvasDiagramLeftVerticalDownRectangleCompartmentDiagramEditPart(view);

			case CanvasDiagramCenterVerticalRectangleCompartmentDiagramEditPart.VISUAL_ID:
				return new CanvasDiagramCenterVerticalRectangleCompartmentDiagramEditPart(view);

			case CanvasDiagramRightVerticalUpRectangleCompartmentDiagramEditPart.VISUAL_ID:
				return new CanvasDiagramRightVerticalUpRectangleCompartmentDiagramEditPart(view);

			case CanvasDiagramRightVerticalDownCompartmentDiagramEditPart.VISUAL_ID:
				return new CanvasDiagramRightVerticalDownCompartmentDiagramEditPart(view);

			case CanvasDiagramRightRightVerticalRectangleCompartmentDiagramEditPart.VISUAL_ID:
				return new CanvasDiagramRightRightVerticalRectangleCompartmentDiagramEditPart(view);

			case CanvasDiagramLeftHorizontalRectangleCompartmentDiagramEditPart.VISUAL_ID:
				return new CanvasDiagramLeftHorizontalRectangleCompartmentDiagramEditPart(view);

			case CanvasDiagramRightHorizontalRectangleCompartmentDiagramEditPart.VISUAL_ID:
				return new CanvasDiagramRightHorizontalRectangleCompartmentDiagramEditPart(view);
			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
