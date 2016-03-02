package es.kybele.elastic.models.canvas.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import es.kybele.elastic.models.canvas.diagram.edit.commands.LeftVerticalUpCanvasAnnotationCreateCommand;
import es.kybele.elastic.models.canvas.diagram.providers.CanvasElementTypes;

/**
 * @generated
 */
public class CanvasDiagramLeftVerticalUpRectangleCompartmentDiagramItemSemanticEditPolicy
		extends CanvasBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CanvasDiagramLeftVerticalUpRectangleCompartmentDiagramItemSemanticEditPolicy() {
		super(CanvasElementTypes.CanvasDiagram_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CanvasElementTypes.CanvasAnnotation_3002 == req.getElementType()) {
			return getGEFWrapper(new LeftVerticalUpCanvasAnnotationCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
