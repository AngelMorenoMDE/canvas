package es.kybele.elastic.models.canvas.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import es.kybele.elastic.models.canvas.CanvasPackage;
import es.kybele.elastic.models.canvas.diagram.edit.parts.CanvasAnnotationContentEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.CenterVerticalCanvasAnnotationContentEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.LeftHorizontalCanvasAnnotationContentEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.LeftVerticalDownCanvasAnnotationContentEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.LeftVerticalUpCanvasAnnotationContentEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.RightHorizontalCanvasAnnotationContentEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.RightRightVerticalCanvasAnnotationContentEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.RightVerticalDownCanvasAnnotationContentEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.RightVerticalUpCanvasAnnotationContentEditPart;
import es.kybele.elastic.models.canvas.diagram.parsers.MessageFormatParser;
import es.kybele.elastic.models.canvas.diagram.part.CanvasVisualIDRegistry;

/**
 * @generated
 */
public class CanvasParserProvider extends AbstractProvider implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser canvasAnnotationContent_5001Parser;

	/**
	 * @generated
	 */
	private IParser getCanvasAnnotationContent_5001Parser() {
		if (canvasAnnotationContent_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { CanvasPackage.eINSTANCE.getCanvasAnnotation_Content() };
			MessageFormatParser parser = new MessageFormatParser(features);
			canvasAnnotationContent_5001Parser = parser;
		}
		return canvasAnnotationContent_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser canvasAnnotationContent_5002Parser;

	/**
	 * @generated
	 */
	private IParser getCanvasAnnotationContent_5002Parser() {
		if (canvasAnnotationContent_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { CanvasPackage.eINSTANCE.getCanvasAnnotation_Content() };
			MessageFormatParser parser = new MessageFormatParser(features);
			canvasAnnotationContent_5002Parser = parser;
		}
		return canvasAnnotationContent_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser canvasAnnotationContent_5003Parser;

	/**
	 * @generated
	 */
	private IParser getCanvasAnnotationContent_5003Parser() {
		if (canvasAnnotationContent_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { CanvasPackage.eINSTANCE.getCanvasAnnotation_Content() };
			MessageFormatParser parser = new MessageFormatParser(features);
			canvasAnnotationContent_5003Parser = parser;
		}
		return canvasAnnotationContent_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser canvasAnnotationContent_5004Parser;

	/**
	 * @generated
	 */
	private IParser getCanvasAnnotationContent_5004Parser() {
		if (canvasAnnotationContent_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { CanvasPackage.eINSTANCE.getCanvasAnnotation_Content() };
			MessageFormatParser parser = new MessageFormatParser(features);
			canvasAnnotationContent_5004Parser = parser;
		}
		return canvasAnnotationContent_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser canvasAnnotationContent_5005Parser;

	/**
	 * @generated
	 */
	private IParser getCanvasAnnotationContent_5005Parser() {
		if (canvasAnnotationContent_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { CanvasPackage.eINSTANCE.getCanvasAnnotation_Content() };
			MessageFormatParser parser = new MessageFormatParser(features);
			canvasAnnotationContent_5005Parser = parser;
		}
		return canvasAnnotationContent_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser canvasAnnotationContent_5006Parser;

	/**
	 * @generated
	 */
	private IParser getCanvasAnnotationContent_5006Parser() {
		if (canvasAnnotationContent_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { CanvasPackage.eINSTANCE.getCanvasAnnotation_Content() };
			MessageFormatParser parser = new MessageFormatParser(features);
			canvasAnnotationContent_5006Parser = parser;
		}
		return canvasAnnotationContent_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser canvasAnnotationContent_5007Parser;

	/**
	 * @generated
	 */
	private IParser getCanvasAnnotationContent_5007Parser() {
		if (canvasAnnotationContent_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { CanvasPackage.eINSTANCE.getCanvasAnnotation_Content() };
			MessageFormatParser parser = new MessageFormatParser(features);
			canvasAnnotationContent_5007Parser = parser;
		}
		return canvasAnnotationContent_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser canvasAnnotationContent_5008Parser;

	/**
	 * @generated
	 */
	private IParser getCanvasAnnotationContent_5008Parser() {
		if (canvasAnnotationContent_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { CanvasPackage.eINSTANCE.getCanvasAnnotation_Content() };
			MessageFormatParser parser = new MessageFormatParser(features);
			canvasAnnotationContent_5008Parser = parser;
		}
		return canvasAnnotationContent_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser canvasAnnotationContent_5009Parser;

	/**
	 * @generated
	 */
	private IParser getCanvasAnnotationContent_5009Parser() {
		if (canvasAnnotationContent_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { CanvasPackage.eINSTANCE.getCanvasAnnotation_Content() };
			MessageFormatParser parser = new MessageFormatParser(features);
			canvasAnnotationContent_5009Parser = parser;
		}
		return canvasAnnotationContent_5009Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case CanvasAnnotationContentEditPart.VISUAL_ID:
			return getCanvasAnnotationContent_5001Parser();
		case LeftVerticalUpCanvasAnnotationContentEditPart.VISUAL_ID:
			return getCanvasAnnotationContent_5002Parser();
		case LeftVerticalDownCanvasAnnotationContentEditPart.VISUAL_ID:
			return getCanvasAnnotationContent_5003Parser();
		case CenterVerticalCanvasAnnotationContentEditPart.VISUAL_ID:
			return getCanvasAnnotationContent_5004Parser();
		case RightVerticalUpCanvasAnnotationContentEditPart.VISUAL_ID:
			return getCanvasAnnotationContent_5005Parser();
		case RightVerticalDownCanvasAnnotationContentEditPart.VISUAL_ID:
			return getCanvasAnnotationContent_5006Parser();
		case RightRightVerticalCanvasAnnotationContentEditPart.VISUAL_ID:
			return getCanvasAnnotationContent_5007Parser();
		case LeftHorizontalCanvasAnnotationContentEditPart.VISUAL_ID:
			return getCanvasAnnotationContent_5008Parser();
		case RightHorizontalCanvasAnnotationContentEditPart.VISUAL_ID:
			return getCanvasAnnotationContent_5009Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(CanvasVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(CanvasVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (CanvasElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
