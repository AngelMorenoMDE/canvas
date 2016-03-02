package es.kybele.elastic.models.canvas.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import es.kybele.elastic.models.canvas.diagram.edit.commands.RightVerticalDownCanvasAnnotationCreateCommand;
import es.kybele.elastic.models.canvas.diagram.providers.CanvasElementTypes;

/**
 * @generated
 */
public class CanvasDiagramRightVerticalDownCompartmentDiagramItemSemanticEditPolicy
		extends CanvasBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CanvasDiagramRightVerticalDownCompartmentDiagramItemSemanticEditPolicy() {
		super(CanvasElementTypes.CanvasDiagram_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CanvasElementTypes.CanvasAnnotation_3006 == req.getElementType()) {
			return getGEFWrapper(new RightVerticalDownCanvasAnnotationCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
