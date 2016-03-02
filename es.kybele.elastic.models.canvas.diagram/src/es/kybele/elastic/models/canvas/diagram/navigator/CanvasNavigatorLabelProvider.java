package es.kybele.elastic.models.canvas.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import es.kybele.elastic.models.canvas.diagram.edit.parts.CanvasAnnotationContentEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.CanvasAnnotationEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.CanvasBusinessModelEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.CanvasDiagramEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.CenterVerticalCanvasAnnotationContentEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.CenterVerticalCanvasAnnotationEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.LeftHorizontalCanvasAnnotationContentEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.LeftHorizontalCanvasAnnotationEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.LeftLeftVerticalCanvasAnnotationEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.LeftVerticalDownCanvasAnnotationContentEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.LeftVerticalDownCanvasAnnotationEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.LeftVerticalUpCanvasAnnotationContentEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.LeftVerticalUpCanvasAnnotationEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.RightHorizontalCanvasAnnotationContentEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.RightHorizontalCanvasAnnotationEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.RightRightVerticalCanvasAnnotationContentEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.RightRightVerticalCanvasAnnotationEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.RightVerticalDownCanvasAnnotationContentEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.RightVerticalDownCanvasAnnotationEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.RightVerticalUpCanvasAnnotationContentEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.RightVerticalUpCanvasAnnotationEditPart;
import es.kybele.elastic.models.canvas.diagram.part.CanvasDiagramEditorPlugin;
import es.kybele.elastic.models.canvas.diagram.part.CanvasVisualIDRegistry;
import es.kybele.elastic.models.canvas.diagram.providers.CanvasElementTypes;
import es.kybele.elastic.models.canvas.diagram.providers.CanvasParserProvider;

/**
 * @generated
 */
public class CanvasNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		CanvasDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		CanvasDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof CanvasNavigatorItem && !isOwnView(((CanvasNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof CanvasNavigatorGroup) {
			CanvasNavigatorGroup group = (CanvasNavigatorGroup) element;
			return CanvasDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof CanvasNavigatorItem) {
			CanvasNavigatorItem navigatorItem = (CanvasNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (CanvasVisualIDRegistry.getVisualID(view)) {
		case CanvasBusinessModelEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.kybele.es/projects/elastic/models/canvas/0.1?CanvasBusinessModel", //$NON-NLS-1$
					CanvasElementTypes.CanvasBusinessModel_1000);
		case CanvasDiagramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.kybele.es/projects/elastic/models/canvas/0.1?CanvasDiagram", //$NON-NLS-1$
					CanvasElementTypes.CanvasDiagram_2001);
		case LeftLeftVerticalCanvasAnnotationEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/projects/elastic/models/canvas/0.1?CanvasAnnotation", //$NON-NLS-1$
					CanvasElementTypes.CanvasAnnotation_3001);
		case LeftVerticalUpCanvasAnnotationEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/projects/elastic/models/canvas/0.1?CanvasAnnotation", //$NON-NLS-1$
					CanvasElementTypes.CanvasAnnotation_3002);
		case LeftVerticalDownCanvasAnnotationEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/projects/elastic/models/canvas/0.1?CanvasAnnotation", //$NON-NLS-1$
					CanvasElementTypes.CanvasAnnotation_3003);
		case CenterVerticalCanvasAnnotationEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/projects/elastic/models/canvas/0.1?CanvasAnnotation", //$NON-NLS-1$
					CanvasElementTypes.CanvasAnnotation_3004);
		case RightVerticalUpCanvasAnnotationEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/projects/elastic/models/canvas/0.1?CanvasAnnotation", //$NON-NLS-1$
					CanvasElementTypes.CanvasAnnotation_3005);
		case RightVerticalDownCanvasAnnotationEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/projects/elastic/models/canvas/0.1?CanvasAnnotation", //$NON-NLS-1$
					CanvasElementTypes.CanvasAnnotation_3006);
		case RightRightVerticalCanvasAnnotationEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/projects/elastic/models/canvas/0.1?CanvasAnnotation", //$NON-NLS-1$
					CanvasElementTypes.CanvasAnnotation_3007);
		case LeftHorizontalCanvasAnnotationEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/projects/elastic/models/canvas/0.1?CanvasAnnotation", //$NON-NLS-1$
					CanvasElementTypes.CanvasAnnotation_3008);
		case RightHorizontalCanvasAnnotationEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/projects/elastic/models/canvas/0.1?CanvasAnnotation", //$NON-NLS-1$
					CanvasElementTypes.CanvasAnnotation_3009);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = CanvasDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && CanvasElementTypes.isKnownElementType(elementType)) {
			image = CanvasElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof CanvasNavigatorGroup) {
			CanvasNavigatorGroup group = (CanvasNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof CanvasNavigatorItem) {
			CanvasNavigatorItem navigatorItem = (CanvasNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (CanvasVisualIDRegistry.getVisualID(view)) {
		case CanvasBusinessModelEditPart.VISUAL_ID:
			return getCanvasBusinessModel_1000Text(view);
		case CanvasDiagramEditPart.VISUAL_ID:
			return getCanvasDiagram_2001Text(view);
		case LeftLeftVerticalCanvasAnnotationEditPart.VISUAL_ID:
			return getCanvasAnnotation_3001Text(view);
		case LeftVerticalUpCanvasAnnotationEditPart.VISUAL_ID:
			return getCanvasAnnotation_3002Text(view);
		case LeftVerticalDownCanvasAnnotationEditPart.VISUAL_ID:
			return getCanvasAnnotation_3003Text(view);
		case CenterVerticalCanvasAnnotationEditPart.VISUAL_ID:
			return getCanvasAnnotation_3004Text(view);
		case RightVerticalUpCanvasAnnotationEditPart.VISUAL_ID:
			return getCanvasAnnotation_3005Text(view);
		case RightVerticalDownCanvasAnnotationEditPart.VISUAL_ID:
			return getCanvasAnnotation_3006Text(view);
		case RightRightVerticalCanvasAnnotationEditPart.VISUAL_ID:
			return getCanvasAnnotation_3007Text(view);
		case LeftHorizontalCanvasAnnotationEditPart.VISUAL_ID:
			return getCanvasAnnotation_3008Text(view);
		case RightHorizontalCanvasAnnotationEditPart.VISUAL_ID:
			return getCanvasAnnotation_3009Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getCanvasBusinessModel_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCanvasDiagram_2001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCanvasAnnotation_3001Text(View view) {
		IParser parser = CanvasParserProvider.getParser(CanvasElementTypes.CanvasAnnotation_3001,
				view.getElement() != null ? view.getElement() : view,
				CanvasVisualIDRegistry.getType(CanvasAnnotationContentEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CanvasDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCanvasAnnotation_3002Text(View view) {
		IParser parser = CanvasParserProvider.getParser(CanvasElementTypes.CanvasAnnotation_3002,
				view.getElement() != null ? view.getElement() : view,
				CanvasVisualIDRegistry.getType(LeftVerticalUpCanvasAnnotationContentEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CanvasDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCanvasAnnotation_3003Text(View view) {
		IParser parser = CanvasParserProvider.getParser(CanvasElementTypes.CanvasAnnotation_3003,
				view.getElement() != null ? view.getElement() : view,
				CanvasVisualIDRegistry.getType(LeftVerticalDownCanvasAnnotationContentEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CanvasDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCanvasAnnotation_3004Text(View view) {
		IParser parser = CanvasParserProvider.getParser(CanvasElementTypes.CanvasAnnotation_3004,
				view.getElement() != null ? view.getElement() : view,
				CanvasVisualIDRegistry.getType(CenterVerticalCanvasAnnotationContentEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CanvasDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCanvasAnnotation_3005Text(View view) {
		IParser parser = CanvasParserProvider.getParser(CanvasElementTypes.CanvasAnnotation_3005,
				view.getElement() != null ? view.getElement() : view,
				CanvasVisualIDRegistry.getType(RightVerticalUpCanvasAnnotationContentEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CanvasDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCanvasAnnotation_3006Text(View view) {
		IParser parser = CanvasParserProvider.getParser(CanvasElementTypes.CanvasAnnotation_3006,
				view.getElement() != null ? view.getElement() : view,
				CanvasVisualIDRegistry.getType(RightVerticalDownCanvasAnnotationContentEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CanvasDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCanvasAnnotation_3007Text(View view) {
		IParser parser = CanvasParserProvider.getParser(CanvasElementTypes.CanvasAnnotation_3007,
				view.getElement() != null ? view.getElement() : view,
				CanvasVisualIDRegistry.getType(RightRightVerticalCanvasAnnotationContentEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CanvasDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCanvasAnnotation_3008Text(View view) {
		IParser parser = CanvasParserProvider.getParser(CanvasElementTypes.CanvasAnnotation_3008,
				view.getElement() != null ? view.getElement() : view,
				CanvasVisualIDRegistry.getType(LeftHorizontalCanvasAnnotationContentEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CanvasDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCanvasAnnotation_3009Text(View view) {
		IParser parser = CanvasParserProvider.getParser(CanvasElementTypes.CanvasAnnotation_3009,
				view.getElement() != null ? view.getElement() : view,
				CanvasVisualIDRegistry.getType(RightHorizontalCanvasAnnotationContentEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CanvasDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return CanvasBusinessModelEditPart.MODEL_ID.equals(CanvasVisualIDRegistry.getModelID(view));
	}

}
