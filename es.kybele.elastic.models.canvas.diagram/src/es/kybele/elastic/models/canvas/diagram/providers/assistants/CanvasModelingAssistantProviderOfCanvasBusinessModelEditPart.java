package es.kybele.elastic.models.canvas.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import es.kybele.elastic.models.canvas.diagram.providers.CanvasElementTypes;
import es.kybele.elastic.models.canvas.diagram.providers.CanvasModelingAssistantProvider;

/**
 * @generated
 */
public class CanvasModelingAssistantProviderOfCanvasBusinessModelEditPart extends CanvasModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(CanvasElementTypes.CanvasDiagram_2001);
		return types;
	}

}
