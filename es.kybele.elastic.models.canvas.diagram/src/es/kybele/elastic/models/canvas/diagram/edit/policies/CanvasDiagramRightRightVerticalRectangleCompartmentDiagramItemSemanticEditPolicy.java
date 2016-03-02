package es.kybele.elastic.models.canvas.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import es.kybele.elastic.models.canvas.diagram.edit.commands.RightRightVerticalCanvasAnnotationCreateCommand;
import es.kybele.elastic.models.canvas.diagram.providers.CanvasElementTypes;

/**
 * @generated
 */
public class CanvasDiagramRightRightVerticalRectangleCompartmentDiagramItemSemanticEditPolicy
		extends CanvasBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CanvasDiagramRightRightVerticalRectangleCompartmentDiagramItemSemanticEditPolicy() {
		super(CanvasElementTypes.CanvasDiagram_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CanvasElementTypes.CanvasAnnotation_3007 == req.getElementType()) {
			return getGEFWrapper(new RightRightVerticalCanvasAnnotationCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
