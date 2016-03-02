package es.kybele.elastic.models.canvas.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.providers.IViewProvider;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateEdgeViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateNodeViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateViewForKindOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateViewOperation;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants;
import org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.DecorationNode;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.FontStyle;
import org.eclipse.gmf.runtime.notation.MeasurementUnit;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.TitleStyle;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.FontData;

import es.kybele.elastic.models.canvas.diagram.edit.parts.CanvasAnnotationContentEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.CanvasAnnotationEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.CanvasBusinessModelEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.CanvasDiagramCenterVerticalRectangleCompartmentDiagramEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.CanvasDiagramEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.CanvasDiagramLeftHorizontalRectangleCompartmentDiagramEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.CanvasDiagramLeftLeftVerticalRectangleCompartmentDiagramEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.CanvasDiagramLeftVerticalDownRectangleCompartmentDiagramEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.CanvasDiagramLeftVerticalUpRectangleCompartmentDiagramEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.CanvasDiagramRightHorizontalRectangleCompartmentDiagramEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.CanvasDiagramRightRightVerticalRectangleCompartmentDiagramEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.CanvasDiagramRightVerticalDownCompartmentDiagramEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.CanvasDiagramRightVerticalUpRectangleCompartmentDiagramEditPart;
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
import es.kybele.elastic.models.canvas.diagram.part.CanvasVisualIDRegistry;

/**
 * @generated
 */
public class CanvasViewProvider extends AbstractProvider implements IViewProvider {

	/**
	 * @generated
	 */
	public final boolean provides(IOperation operation) {
		if (operation instanceof CreateViewForKindOperation) {
			return provides((CreateViewForKindOperation) operation);
		}
		assert operation instanceof CreateViewOperation;
		if (operation instanceof CreateDiagramViewOperation) {
			return provides((CreateDiagramViewOperation) operation);
		} else if (operation instanceof CreateEdgeViewOperation) {
			return provides((CreateEdgeViewOperation) operation);
		} else if (operation instanceof CreateNodeViewOperation) {
			return provides((CreateNodeViewOperation) operation);
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean provides(CreateViewForKindOperation op) {
		/*
		    if (op.getViewKind() == Node.class)
		      return getNodeViewClass(op.getSemanticAdapter(), op.getContainerView(), op.getSemanticHint()) != null;
		    if (op.getViewKind() == Edge.class)
		      return getEdgeViewClass(op.getSemanticAdapter(), op.getContainerView(), op.getSemanticHint()) != null;
		*/
		return true;
	}

	/**
	 * @generated
	 */
	protected boolean provides(CreateDiagramViewOperation op) {
		return CanvasBusinessModelEditPart.MODEL_ID.equals(op.getSemanticHint())
				&& CanvasVisualIDRegistry.getDiagramVisualID(getSemanticElement(op.getSemanticAdapter())) != -1;
	}

	/**
	 * @generated
	 */
	protected boolean provides(CreateNodeViewOperation op) {
		if (op.getContainerView() == null) {
			return false;
		}
		IElementType elementType = getSemanticElementType(op.getSemanticAdapter());
		EObject domainElement = getSemanticElement(op.getSemanticAdapter());
		int visualID;
		if (op.getSemanticHint() == null) {
			// Semantic hint is not specified. Can be a result of call from CanonicalEditPolicy.
			// In this situation there should be NO elementType, visualID will be determined
			// by VisualIDRegistry.getNodeVisualID() for domainElement.
			if (elementType != null || domainElement == null) {
				return false;
			}
			visualID = CanvasVisualIDRegistry.getNodeVisualID(op.getContainerView(), domainElement);
		} else {
			visualID = CanvasVisualIDRegistry.getVisualID(op.getSemanticHint());
			if (elementType != null) {
				if (!CanvasElementTypes.isKnownElementType(elementType) || (!(elementType instanceof IHintedType))) {
					return false; // foreign element type
				}
				String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
				if (!op.getSemanticHint().equals(elementTypeHint)) {
					return false; // if semantic hint is specified it should be the same as in element type
				}
				if (domainElement != null
						&& visualID != CanvasVisualIDRegistry.getNodeVisualID(op.getContainerView(), domainElement)) {
					return false; // visual id for node EClass should match visual id from element type
				}
			} else {
				if (!CanvasBusinessModelEditPart.MODEL_ID
						.equals(CanvasVisualIDRegistry.getModelID(op.getContainerView()))) {
					return false; // foreign diagram
				}
				switch (visualID) {
				case CanvasDiagramEditPart.VISUAL_ID:
				case LeftLeftVerticalCanvasAnnotationEditPart.VISUAL_ID:
				case LeftVerticalUpCanvasAnnotationEditPart.VISUAL_ID:
				case LeftVerticalDownCanvasAnnotationEditPart.VISUAL_ID:
				case CenterVerticalCanvasAnnotationEditPart.VISUAL_ID:
				case RightVerticalUpCanvasAnnotationEditPart.VISUAL_ID:
				case RightVerticalDownCanvasAnnotationEditPart.VISUAL_ID:
				case RightRightVerticalCanvasAnnotationEditPart.VISUAL_ID:
				case LeftHorizontalCanvasAnnotationEditPart.VISUAL_ID:
				case RightHorizontalCanvasAnnotationEditPart.VISUAL_ID:
					if (domainElement == null || visualID != CanvasVisualIDRegistry
							.getNodeVisualID(op.getContainerView(), domainElement)) {
						return false; // visual id in semantic hint should match visual id for domain element
					}
					break;
				default:
					return false;
				}
			}
		}
		return CanvasDiagramEditPart.VISUAL_ID == visualID
				|| LeftLeftVerticalCanvasAnnotationEditPart.VISUAL_ID == visualID
				|| LeftVerticalUpCanvasAnnotationEditPart.VISUAL_ID == visualID
				|| LeftVerticalDownCanvasAnnotationEditPart.VISUAL_ID == visualID
				|| CenterVerticalCanvasAnnotationEditPart.VISUAL_ID == visualID
				|| RightVerticalUpCanvasAnnotationEditPart.VISUAL_ID == visualID
				|| RightVerticalDownCanvasAnnotationEditPart.VISUAL_ID == visualID
				|| RightRightVerticalCanvasAnnotationEditPart.VISUAL_ID == visualID
				|| LeftHorizontalCanvasAnnotationEditPart.VISUAL_ID == visualID
				|| RightHorizontalCanvasAnnotationEditPart.VISUAL_ID == visualID;
	}

	/**
	 * @generated
	 */
	protected boolean provides(CreateEdgeViewOperation op) {
		IElementType elementType = getSemanticElementType(op.getSemanticAdapter());
		if (!CanvasElementTypes.isKnownElementType(elementType) || (!(elementType instanceof IHintedType))) {
			return false; // foreign element type
		}
		String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
		if (elementTypeHint == null
				|| (op.getSemanticHint() != null && !elementTypeHint.equals(op.getSemanticHint()))) {
			return false; // our hint is visual id and must be specified, and it should be the same as in element type
		}
		int visualID = CanvasVisualIDRegistry.getVisualID(elementTypeHint);
		EObject domainElement = getSemanticElement(op.getSemanticAdapter());
		if (domainElement != null && visualID != CanvasVisualIDRegistry.getLinkWithClassVisualID(domainElement)) {
			return false; // visual id for link EClass should match visual id from element type
		}
		return true;
	}

	/**
	 * @generated
	 */
	public Diagram createDiagram(IAdaptable semanticAdapter, String diagramKind, PreferencesHint preferencesHint) {
		Diagram diagram = NotationFactory.eINSTANCE.createDiagram();
		diagram.getStyles().add(NotationFactory.eINSTANCE.createDiagramStyle());
		diagram.setType(CanvasBusinessModelEditPart.MODEL_ID);
		diagram.setElement(getSemanticElement(semanticAdapter));
		diagram.setMeasurementUnit(MeasurementUnit.PIXEL_LITERAL);
		return diagram;
	}

	/**
	 * @generated
	 */
	public Node createNode(IAdaptable semanticAdapter, View containerView, String semanticHint, int index,
			boolean persisted, PreferencesHint preferencesHint) {
		final EObject domainElement = getSemanticElement(semanticAdapter);
		final int visualID;
		if (semanticHint == null) {
			visualID = CanvasVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		} else {
			visualID = CanvasVisualIDRegistry.getVisualID(semanticHint);
		}
		switch (visualID) {
		case CanvasDiagramEditPart.VISUAL_ID:
			return createCanvasDiagram_2001(domainElement, containerView, index, persisted, preferencesHint);
		case LeftLeftVerticalCanvasAnnotationEditPart.VISUAL_ID:
			return createCanvasAnnotation_3001(domainElement, containerView, index, persisted, preferencesHint);
		case LeftVerticalUpCanvasAnnotationEditPart.VISUAL_ID:
			return createCanvasAnnotation_3002(domainElement, containerView, index, persisted, preferencesHint);
		case LeftVerticalDownCanvasAnnotationEditPart.VISUAL_ID:
			return createCanvasAnnotation_3003(domainElement, containerView, index, persisted, preferencesHint);
		case CenterVerticalCanvasAnnotationEditPart.VISUAL_ID:
			return createCanvasAnnotation_3004(domainElement, containerView, index, persisted, preferencesHint);
		case RightVerticalUpCanvasAnnotationEditPart.VISUAL_ID:
			return createCanvasAnnotation_3005(domainElement, containerView, index, persisted, preferencesHint);
		case RightVerticalDownCanvasAnnotationEditPart.VISUAL_ID:
			return createCanvasAnnotation_3006(domainElement, containerView, index, persisted, preferencesHint);
		case RightRightVerticalCanvasAnnotationEditPart.VISUAL_ID:
			return createCanvasAnnotation_3007(domainElement, containerView, index, persisted, preferencesHint);
		case LeftHorizontalCanvasAnnotationEditPart.VISUAL_ID:
			return createCanvasAnnotation_3008(domainElement, containerView, index, persisted, preferencesHint);
		case RightHorizontalCanvasAnnotationEditPart.VISUAL_ID:
			return createCanvasAnnotation_3009(domainElement, containerView, index, persisted, preferencesHint);
		}
		// can't happen, provided #provides(CreateNodeViewOperation) is correct
		return null;
	}

	/**
	 * @generated
	 */
	public Edge createEdge(IAdaptable semanticAdapter, View containerView, String semanticHint, int index,
			boolean persisted, PreferencesHint preferencesHint) {
		IElementType elementType = getSemanticElementType(semanticAdapter);
		String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
		switch (CanvasVisualIDRegistry.getVisualID(elementTypeHint)) {
		}
		// can never happen, provided #provides(CreateEdgeViewOperation) is correct
		return null;
	}

	/**
	 * @generated
	 */
	public Node createCanvasDiagram_2001(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(CanvasVisualIDRegistry.getType(CanvasDiagramEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(prefStore,
				IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		createCompartment(node,
				CanvasVisualIDRegistry
						.getType(CanvasDiagramLeftLeftVerticalRectangleCompartmentDiagramEditPart.VISUAL_ID),
				false, false, false, false);
		createCompartment(node,
				CanvasVisualIDRegistry
						.getType(CanvasDiagramLeftVerticalUpRectangleCompartmentDiagramEditPart.VISUAL_ID),
				false, false, false, false);
		createCompartment(node,
				CanvasVisualIDRegistry
						.getType(CanvasDiagramLeftVerticalDownRectangleCompartmentDiagramEditPart.VISUAL_ID),
				false, false, false, false);
		createCompartment(node,
				CanvasVisualIDRegistry
						.getType(CanvasDiagramCenterVerticalRectangleCompartmentDiagramEditPart.VISUAL_ID),
				false, false, false, false);
		createCompartment(node,
				CanvasVisualIDRegistry
						.getType(CanvasDiagramRightVerticalUpRectangleCompartmentDiagramEditPart.VISUAL_ID),
				false, false, false, false);
		createCompartment(node,
				CanvasVisualIDRegistry.getType(CanvasDiagramRightVerticalDownCompartmentDiagramEditPart.VISUAL_ID),
				false, false, false, false);
		createCompartment(node,
				CanvasVisualIDRegistry
						.getType(CanvasDiagramRightRightVerticalRectangleCompartmentDiagramEditPart.VISUAL_ID),
				false, false, false, false);
		createCompartment(node,
				CanvasVisualIDRegistry
						.getType(CanvasDiagramLeftHorizontalRectangleCompartmentDiagramEditPart.VISUAL_ID),
				false, false, false, false);
		createCompartment(node,
				CanvasVisualIDRegistry
						.getType(CanvasDiagramRightHorizontalRectangleCompartmentDiagramEditPart.VISUAL_ID),
				false, false, false, false);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createCanvasAnnotation_3001(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.getStyles().add(NotationFactory.eINSTANCE.createDescriptionStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(CanvasVisualIDRegistry.getType(LeftLeftVerticalCanvasAnnotationEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		Node label5001 = createLabel(node, CanvasVisualIDRegistry.getType(CanvasAnnotationContentEditPart.VISUAL_ID));
		return node;
	}

	/**
	 * @generated
	 */
	public Node createCanvasAnnotation_3002(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.getStyles().add(NotationFactory.eINSTANCE.createDescriptionStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(CanvasVisualIDRegistry.getType(LeftVerticalUpCanvasAnnotationEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		Node label5002 = createLabel(node,
				CanvasVisualIDRegistry.getType(LeftVerticalUpCanvasAnnotationContentEditPart.VISUAL_ID));
		return node;
	}

	/**
	 * @generated
	 */
	public Node createCanvasAnnotation_3003(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.getStyles().add(NotationFactory.eINSTANCE.createDescriptionStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(CanvasVisualIDRegistry.getType(LeftVerticalDownCanvasAnnotationEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		Node label5003 = createLabel(node,
				CanvasVisualIDRegistry.getType(LeftVerticalDownCanvasAnnotationContentEditPart.VISUAL_ID));
		return node;
	}

	/**
	 * @generated
	 */
	public Node createCanvasAnnotation_3004(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.getStyles().add(NotationFactory.eINSTANCE.createDescriptionStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(CanvasVisualIDRegistry.getType(CenterVerticalCanvasAnnotationEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		Node label5004 = createLabel(node,
				CanvasVisualIDRegistry.getType(CenterVerticalCanvasAnnotationContentEditPart.VISUAL_ID));
		return node;
	}

	/**
	 * @generated
	 */
	public Node createCanvasAnnotation_3005(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.getStyles().add(NotationFactory.eINSTANCE.createDescriptionStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(CanvasVisualIDRegistry.getType(RightVerticalUpCanvasAnnotationEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		Node label5005 = createLabel(node,
				CanvasVisualIDRegistry.getType(RightVerticalUpCanvasAnnotationContentEditPart.VISUAL_ID));
		return node;
	}

	/**
	 * @generated
	 */
	public Node createCanvasAnnotation_3006(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.getStyles().add(NotationFactory.eINSTANCE.createDescriptionStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(CanvasVisualIDRegistry.getType(RightVerticalDownCanvasAnnotationEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		Node label5006 = createLabel(node,
				CanvasVisualIDRegistry.getType(RightVerticalDownCanvasAnnotationContentEditPart.VISUAL_ID));
		return node;
	}

	/**
	 * @generated
	 */
	public Node createCanvasAnnotation_3007(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.getStyles().add(NotationFactory.eINSTANCE.createDescriptionStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(CanvasVisualIDRegistry.getType(RightRightVerticalCanvasAnnotationEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		Node label5007 = createLabel(node,
				CanvasVisualIDRegistry.getType(RightRightVerticalCanvasAnnotationContentEditPart.VISUAL_ID));
		return node;
	}

	/**
	 * @generated
	 */
	public Node createCanvasAnnotation_3008(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.getStyles().add(NotationFactory.eINSTANCE.createDescriptionStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(CanvasVisualIDRegistry.getType(LeftHorizontalCanvasAnnotationEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		Node label5008 = createLabel(node,
				CanvasVisualIDRegistry.getType(LeftHorizontalCanvasAnnotationContentEditPart.VISUAL_ID));
		return node;
	}

	/**
	 * @generated
	 */
	public Node createCanvasAnnotation_3009(EObject domainElement, View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.getStyles().add(NotationFactory.eINSTANCE.createDescriptionStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(CanvasVisualIDRegistry.getType(RightHorizontalCanvasAnnotationEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint.getPreferenceStore();
		FontStyle nodeFontStyle = (FontStyle) node.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore, IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter.getColor(prefStore,
					IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB).intValue());
		}
		Node label5009 = createLabel(node,
				CanvasVisualIDRegistry.getType(RightHorizontalCanvasAnnotationContentEditPart.VISUAL_ID));
		return node;
	}

	/**
	 * @generated
	 */
	private void stampShortcut(View containerView, Node target) {
		if (!CanvasBusinessModelEditPart.MODEL_ID.equals(CanvasVisualIDRegistry.getModelID(containerView))) {
			EAnnotation shortcutAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
			shortcutAnnotation.setSource("Shortcut"); //$NON-NLS-1$
			shortcutAnnotation.getDetails().put("modelID", CanvasBusinessModelEditPart.MODEL_ID); //$NON-NLS-1$
			target.getEAnnotations().add(shortcutAnnotation);
		}
	}

	/**
	 * @generated
	 */
	private Node createLabel(View owner, String hint) {
		DecorationNode rv = NotationFactory.eINSTANCE.createDecorationNode();
		rv.setType(hint);
		ViewUtil.insertChildView(owner, rv, ViewUtil.APPEND, true);
		return rv;
	}

	/**
	 * @generated
	 */
	private Node createCompartment(View owner, String hint, boolean canCollapse, boolean hasTitle, boolean canSort,
			boolean canFilter) {
		//SemanticListCompartment rv = NotationFactory.eINSTANCE.createSemanticListCompartment();
		//rv.setShowTitle(showTitle);
		//rv.setCollapsed(isCollapsed);
		Node rv;
		if (canCollapse) {
			rv = NotationFactory.eINSTANCE.createBasicCompartment();
		} else {
			rv = NotationFactory.eINSTANCE.createDecorationNode();
		}
		if (hasTitle) {
			TitleStyle ts = NotationFactory.eINSTANCE.createTitleStyle();
			ts.setShowTitle(true);
			rv.getStyles().add(ts);
		}
		if (canSort) {
			rv.getStyles().add(NotationFactory.eINSTANCE.createSortingStyle());
		}
		if (canFilter) {
			rv.getStyles().add(NotationFactory.eINSTANCE.createFilteringStyle());
		}
		rv.setType(hint);
		ViewUtil.insertChildView(owner, rv, ViewUtil.APPEND, true);
		return rv;
	}

	/**
	 * @generated
	 */
	private EObject getSemanticElement(IAdaptable semanticAdapter) {
		if (semanticAdapter == null) {
			return null;
		}
		EObject eObject = (EObject) semanticAdapter.getAdapter(EObject.class);
		if (eObject != null) {
			return EMFCoreUtil.resolve(TransactionUtil.getEditingDomain(eObject), eObject);
		}
		return null;
	}

	/**
	 * @generated
	 */
	private IElementType getSemanticElementType(IAdaptable semanticAdapter) {
		if (semanticAdapter == null) {
			return null;
		}
		return (IElementType) semanticAdapter.getAdapter(IElementType.class);
	}
}
