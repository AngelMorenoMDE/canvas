package es.kybele.elastic.models.canvas.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import es.kybele.elastic.models.canvas.diagram.edit.commands.CanvasAnnotationCreateCommand;
import es.kybele.elastic.models.canvas.diagram.edit.commands.LeftLeftVerticalCanvasAnnotationCreateCommand;
import es.kybele.elastic.models.canvas.diagram.providers.CanvasElementTypes;

/**
 * @generated
 */
public class CanvasDiagramLeftLeftVerticalRectangleCompartmentDiagramItemSemanticEditPolicy
		extends CanvasBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CanvasDiagramLeftLeftVerticalRectangleCompartmentDiagramItemSemanticEditPolicy() {
		super(CanvasElementTypes.CanvasDiagram_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CanvasElementTypes.CanvasAnnotation_3001 == req.getElementType()) {
			return getGEFWrapper(new LeftLeftVerticalCanvasAnnotationCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
