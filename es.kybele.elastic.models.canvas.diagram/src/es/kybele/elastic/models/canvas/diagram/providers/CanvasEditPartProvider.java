package es.kybele.elastic.models.canvas.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import es.kybele.elastic.models.canvas.diagram.edit.parts.CanvasBusinessModelEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.CanvasEditPartFactory;
import es.kybele.elastic.models.canvas.diagram.part.CanvasVisualIDRegistry;

/**
 * @generated
 */
public class CanvasEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public CanvasEditPartProvider() {
		super(new CanvasEditPartFactory(), CanvasVisualIDRegistry.TYPED_INSTANCE, CanvasBusinessModelEditPart.MODEL_ID);
	}

}
