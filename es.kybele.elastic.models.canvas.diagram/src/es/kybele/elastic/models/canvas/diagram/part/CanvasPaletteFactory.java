package es.kybele.elastic.models.canvas.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import es.kybele.elastic.models.canvas.diagram.providers.CanvasElementTypes;

/**
 * @generated
 */
public class CanvasPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createCanvas1Group());
	}

	/**
	 * Creates "canvas" palette tool group
	 * @generated
	 */
	private PaletteContainer createCanvas1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(Messages.Canvas1Group_title);
		paletteContainer.setId("createCanvas1Group"); //$NON-NLS-1$
		paletteContainer.add(createCanvasDiagram1CreationTool());
		paletteContainer.add(createCanvasAnnotation2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCanvasDiagram1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CanvasDiagram1CreationTool_title,
				Messages.CanvasDiagram1CreationTool_desc,
				Collections.singletonList(CanvasElementTypes.CanvasDiagram_2001));
		entry.setId("createCanvasDiagram1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CanvasElementTypes.getImageDescriptor(CanvasElementTypes.CanvasDiagram_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCanvasAnnotation2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(9);
		types.add(CanvasElementTypes.CanvasAnnotation_3001);
		types.add(CanvasElementTypes.CanvasAnnotation_3002);
		types.add(CanvasElementTypes.CanvasAnnotation_3003);
		types.add(CanvasElementTypes.CanvasAnnotation_3004);
		types.add(CanvasElementTypes.CanvasAnnotation_3005);
		types.add(CanvasElementTypes.CanvasAnnotation_3006);
		types.add(CanvasElementTypes.CanvasAnnotation_3007);
		types.add(CanvasElementTypes.CanvasAnnotation_3008);
		types.add(CanvasElementTypes.CanvasAnnotation_3009);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CanvasAnnotation2CreationTool_title,
				Messages.CanvasAnnotation2CreationTool_desc, types);
		entry.setId("createCanvasAnnotation2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CanvasElementTypes.getImageDescriptor(CanvasElementTypes.CanvasAnnotation_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
