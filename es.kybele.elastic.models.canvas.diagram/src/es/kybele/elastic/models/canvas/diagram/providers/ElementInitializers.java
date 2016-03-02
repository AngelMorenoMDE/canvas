package es.kybele.elastic.models.canvas.diagram.providers;

import es.kybele.elastic.models.canvas.diagram.part.CanvasDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = CanvasDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			CanvasDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
