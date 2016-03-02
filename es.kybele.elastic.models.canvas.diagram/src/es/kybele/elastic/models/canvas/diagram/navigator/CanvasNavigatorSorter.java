package es.kybele.elastic.models.canvas.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import es.kybele.elastic.models.canvas.diagram.part.CanvasVisualIDRegistry;

/**
 * @generated
 */
public class CanvasNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7011;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof CanvasNavigatorItem) {
			CanvasNavigatorItem item = (CanvasNavigatorItem) element;
			return CanvasVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
