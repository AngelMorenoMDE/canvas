package es.kybele.elastic.models.canvas.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import es.kybele.elastic.models.canvas.diagram.edit.commands.RightHorizontalCanvasAnnotationCreateCommand;
import es.kybele.elastic.models.canvas.diagram.providers.CanvasElementTypes;

/**
 * @generated
 */
public class CanvasDiagramRightHorizontalRectangleCompartmentDiagramItemSemanticEditPolicy
		extends CanvasBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CanvasDiagramRightHorizontalRectangleCompartmentDiagramItemSemanticEditPolicy() {
		super(CanvasElementTypes.CanvasDiagram_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CanvasElementTypes.CanvasAnnotation_3009 == req.getElementType()) {
			return getGEFWrapper(new RightHorizontalCanvasAnnotationCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
