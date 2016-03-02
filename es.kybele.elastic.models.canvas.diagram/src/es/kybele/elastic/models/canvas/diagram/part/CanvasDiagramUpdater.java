package es.kybele.elastic.models.canvas.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import es.kybele.elastic.models.canvas.CanvasAnnotation;
import es.kybele.elastic.models.canvas.CanvasBusinessModel;
import es.kybele.elastic.models.canvas.CanvasDiagram;
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
import es.kybele.elastic.models.canvas.diagram.edit.parts.CenterVerticalCanvasAnnotationEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.LeftHorizontalCanvasAnnotationEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.LeftLeftVerticalCanvasAnnotationEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.LeftVerticalDownCanvasAnnotationEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.LeftVerticalUpCanvasAnnotationEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.RightHorizontalCanvasAnnotationEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.RightRightVerticalCanvasAnnotationEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.RightVerticalDownCanvasAnnotationEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.RightVerticalUpCanvasAnnotationEditPart;

/**
 * @generated
 */
public class CanvasDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<CanvasNodeDescriptor> getSemanticChildren(View view) {
		switch (CanvasVisualIDRegistry.getVisualID(view)) {
		case CanvasBusinessModelEditPart.VISUAL_ID:
			return getCanvasBusinessModel_1000SemanticChildren(view);
		case CanvasDiagramLeftLeftVerticalRectangleCompartmentDiagramEditPart.VISUAL_ID:
			return getCanvasDiagramLeftLeftVerticalRectangleCompartmentDiagram_7001SemanticChildren(view);
		case CanvasDiagramLeftVerticalUpRectangleCompartmentDiagramEditPart.VISUAL_ID:
			return getCanvasDiagramLeftVerticalUpRectangleCompartmentDiagram_7002SemanticChildren(view);
		case CanvasDiagramLeftVerticalDownRectangleCompartmentDiagramEditPart.VISUAL_ID:
			return getCanvasDiagramLeftVerticalDownRectangleCompartmentDiagram_7003SemanticChildren(view);
		case CanvasDiagramCenterVerticalRectangleCompartmentDiagramEditPart.VISUAL_ID:
			return getCanvasDiagramCenterVerticalRectangleCompartmentDiagram_7004SemanticChildren(view);
		case CanvasDiagramRightVerticalUpRectangleCompartmentDiagramEditPart.VISUAL_ID:
			return getCanvasDiagramRightVerticalUpRectangleCompartmentDiagram_7005SemanticChildren(view);
		case CanvasDiagramRightVerticalDownCompartmentDiagramEditPart.VISUAL_ID:
			return getCanvasDiagramRightVerticalDownCompartmentDiagram_7006SemanticChildren(view);
		case CanvasDiagramRightRightVerticalRectangleCompartmentDiagramEditPart.VISUAL_ID:
			return getCanvasDiagramRightRightVerticalRectangleCompartmentDiagram_7007SemanticChildren(view);
		case CanvasDiagramLeftHorizontalRectangleCompartmentDiagramEditPart.VISUAL_ID:
			return getCanvasDiagramLeftHorizontalRectangleCompartmentDiagram_7008SemanticChildren(view);
		case CanvasDiagramRightHorizontalRectangleCompartmentDiagramEditPart.VISUAL_ID:
			return getCanvasDiagramRightHorizontalRectangleCompartmentDiagram_7009SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasNodeDescriptor> getCanvasBusinessModel_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		CanvasBusinessModel modelElement = (CanvasBusinessModel) view.getElement();
		LinkedList<CanvasNodeDescriptor> result = new LinkedList<CanvasNodeDescriptor>();
		{
			CanvasDiagram childElement = modelElement.getCanvasDiagram();
			int visualID = CanvasVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CanvasDiagramEditPart.VISUAL_ID) {
				result.add(new CanvasNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CanvasNodeDescriptor> getCanvasDiagramLeftLeftVerticalRectangleCompartmentDiagram_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CanvasDiagram modelElement = (CanvasDiagram) containerView.getElement();
		LinkedList<CanvasNodeDescriptor> result = new LinkedList<CanvasNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHasKeyPartnersAnnotations().iterator(); it.hasNext();) {
			CanvasAnnotation childElement = (CanvasAnnotation) it.next();
			int visualID = CanvasVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == LeftLeftVerticalCanvasAnnotationEditPart.VISUAL_ID) {
				result.add(new CanvasNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CanvasNodeDescriptor> getCanvasDiagramLeftVerticalUpRectangleCompartmentDiagram_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CanvasDiagram modelElement = (CanvasDiagram) containerView.getElement();
		LinkedList<CanvasNodeDescriptor> result = new LinkedList<CanvasNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHasKeyActivitiesAnnotations().iterator(); it.hasNext();) {
			CanvasAnnotation childElement = (CanvasAnnotation) it.next();
			int visualID = CanvasVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == LeftVerticalUpCanvasAnnotationEditPart.VISUAL_ID) {
				result.add(new CanvasNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CanvasNodeDescriptor> getCanvasDiagramLeftVerticalDownRectangleCompartmentDiagram_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CanvasDiagram modelElement = (CanvasDiagram) containerView.getElement();
		LinkedList<CanvasNodeDescriptor> result = new LinkedList<CanvasNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHasKeyResourcesAnnotations().iterator(); it.hasNext();) {
			CanvasAnnotation childElement = (CanvasAnnotation) it.next();
			int visualID = CanvasVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == LeftVerticalDownCanvasAnnotationEditPart.VISUAL_ID) {
				result.add(new CanvasNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CanvasNodeDescriptor> getCanvasDiagramCenterVerticalRectangleCompartmentDiagram_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CanvasDiagram modelElement = (CanvasDiagram) containerView.getElement();
		LinkedList<CanvasNodeDescriptor> result = new LinkedList<CanvasNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHasValuePropositionsAnnotations().iterator(); it.hasNext();) {
			CanvasAnnotation childElement = (CanvasAnnotation) it.next();
			int visualID = CanvasVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CenterVerticalCanvasAnnotationEditPart.VISUAL_ID) {
				result.add(new CanvasNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CanvasNodeDescriptor> getCanvasDiagramRightVerticalUpRectangleCompartmentDiagram_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CanvasDiagram modelElement = (CanvasDiagram) containerView.getElement();
		LinkedList<CanvasNodeDescriptor> result = new LinkedList<CanvasNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHasCustomerRelationshipsAnnotations().iterator(); it.hasNext();) {
			CanvasAnnotation childElement = (CanvasAnnotation) it.next();
			int visualID = CanvasVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RightVerticalUpCanvasAnnotationEditPart.VISUAL_ID) {
				result.add(new CanvasNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CanvasNodeDescriptor> getCanvasDiagramRightVerticalDownCompartmentDiagram_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CanvasDiagram modelElement = (CanvasDiagram) containerView.getElement();
		LinkedList<CanvasNodeDescriptor> result = new LinkedList<CanvasNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHasChannelsAnnotations().iterator(); it.hasNext();) {
			CanvasAnnotation childElement = (CanvasAnnotation) it.next();
			int visualID = CanvasVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RightVerticalDownCanvasAnnotationEditPart.VISUAL_ID) {
				result.add(new CanvasNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CanvasNodeDescriptor> getCanvasDiagramRightRightVerticalRectangleCompartmentDiagram_7007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CanvasDiagram modelElement = (CanvasDiagram) containerView.getElement();
		LinkedList<CanvasNodeDescriptor> result = new LinkedList<CanvasNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHasCustomerSegmentsAnnotations().iterator(); it.hasNext();) {
			CanvasAnnotation childElement = (CanvasAnnotation) it.next();
			int visualID = CanvasVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RightRightVerticalCanvasAnnotationEditPart.VISUAL_ID) {
				result.add(new CanvasNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CanvasNodeDescriptor> getCanvasDiagramLeftHorizontalRectangleCompartmentDiagram_7008SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CanvasDiagram modelElement = (CanvasDiagram) containerView.getElement();
		LinkedList<CanvasNodeDescriptor> result = new LinkedList<CanvasNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHasCostStructureAnnotations().iterator(); it.hasNext();) {
			CanvasAnnotation childElement = (CanvasAnnotation) it.next();
			int visualID = CanvasVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == LeftHorizontalCanvasAnnotationEditPart.VISUAL_ID) {
				result.add(new CanvasNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CanvasNodeDescriptor> getCanvasDiagramRightHorizontalRectangleCompartmentDiagram_7009SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CanvasDiagram modelElement = (CanvasDiagram) containerView.getElement();
		LinkedList<CanvasNodeDescriptor> result = new LinkedList<CanvasNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHasRevenueStreamsAnnotations().iterator(); it.hasNext();) {
			CanvasAnnotation childElement = (CanvasAnnotation) it.next();
			int visualID = CanvasVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RightHorizontalCanvasAnnotationEditPart.VISUAL_ID) {
				result.add(new CanvasNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getContainedLinks(View view) {
		switch (CanvasVisualIDRegistry.getVisualID(view)) {
		case CanvasBusinessModelEditPart.VISUAL_ID:
			return getCanvasBusinessModel_1000ContainedLinks(view);
		case CanvasDiagramEditPart.VISUAL_ID:
			return getCanvasDiagram_2001ContainedLinks(view);
		case LeftLeftVerticalCanvasAnnotationEditPart.VISUAL_ID:
			return getCanvasAnnotation_3001ContainedLinks(view);
		case LeftVerticalUpCanvasAnnotationEditPart.VISUAL_ID:
			return getCanvasAnnotation_3002ContainedLinks(view);
		case LeftVerticalDownCanvasAnnotationEditPart.VISUAL_ID:
			return getCanvasAnnotation_3003ContainedLinks(view);
		case CenterVerticalCanvasAnnotationEditPart.VISUAL_ID:
			return getCanvasAnnotation_3004ContainedLinks(view);
		case RightVerticalUpCanvasAnnotationEditPart.VISUAL_ID:
			return getCanvasAnnotation_3005ContainedLinks(view);
		case RightVerticalDownCanvasAnnotationEditPart.VISUAL_ID:
			return getCanvasAnnotation_3006ContainedLinks(view);
		case RightRightVerticalCanvasAnnotationEditPart.VISUAL_ID:
			return getCanvasAnnotation_3007ContainedLinks(view);
		case LeftHorizontalCanvasAnnotationEditPart.VISUAL_ID:
			return getCanvasAnnotation_3008ContainedLinks(view);
		case RightHorizontalCanvasAnnotationEditPart.VISUAL_ID:
			return getCanvasAnnotation_3009ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getIncomingLinks(View view) {
		switch (CanvasVisualIDRegistry.getVisualID(view)) {
		case CanvasDiagramEditPart.VISUAL_ID:
			return getCanvasDiagram_2001IncomingLinks(view);
		case LeftLeftVerticalCanvasAnnotationEditPart.VISUAL_ID:
			return getCanvasAnnotation_3001IncomingLinks(view);
		case LeftVerticalUpCanvasAnnotationEditPart.VISUAL_ID:
			return getCanvasAnnotation_3002IncomingLinks(view);
		case LeftVerticalDownCanvasAnnotationEditPart.VISUAL_ID:
			return getCanvasAnnotation_3003IncomingLinks(view);
		case CenterVerticalCanvasAnnotationEditPart.VISUAL_ID:
			return getCanvasAnnotation_3004IncomingLinks(view);
		case RightVerticalUpCanvasAnnotationEditPart.VISUAL_ID:
			return getCanvasAnnotation_3005IncomingLinks(view);
		case RightVerticalDownCanvasAnnotationEditPart.VISUAL_ID:
			return getCanvasAnnotation_3006IncomingLinks(view);
		case RightRightVerticalCanvasAnnotationEditPart.VISUAL_ID:
			return getCanvasAnnotation_3007IncomingLinks(view);
		case LeftHorizontalCanvasAnnotationEditPart.VISUAL_ID:
			return getCanvasAnnotation_3008IncomingLinks(view);
		case RightHorizontalCanvasAnnotationEditPart.VISUAL_ID:
			return getCanvasAnnotation_3009IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getOutgoingLinks(View view) {
		switch (CanvasVisualIDRegistry.getVisualID(view)) {
		case CanvasDiagramEditPart.VISUAL_ID:
			return getCanvasDiagram_2001OutgoingLinks(view);
		case LeftLeftVerticalCanvasAnnotationEditPart.VISUAL_ID:
			return getCanvasAnnotation_3001OutgoingLinks(view);
		case LeftVerticalUpCanvasAnnotationEditPart.VISUAL_ID:
			return getCanvasAnnotation_3002OutgoingLinks(view);
		case LeftVerticalDownCanvasAnnotationEditPart.VISUAL_ID:
			return getCanvasAnnotation_3003OutgoingLinks(view);
		case CenterVerticalCanvasAnnotationEditPart.VISUAL_ID:
			return getCanvasAnnotation_3004OutgoingLinks(view);
		case RightVerticalUpCanvasAnnotationEditPart.VISUAL_ID:
			return getCanvasAnnotation_3005OutgoingLinks(view);
		case RightVerticalDownCanvasAnnotationEditPart.VISUAL_ID:
			return getCanvasAnnotation_3006OutgoingLinks(view);
		case RightRightVerticalCanvasAnnotationEditPart.VISUAL_ID:
			return getCanvasAnnotation_3007OutgoingLinks(view);
		case LeftHorizontalCanvasAnnotationEditPart.VISUAL_ID:
			return getCanvasAnnotation_3008OutgoingLinks(view);
		case RightHorizontalCanvasAnnotationEditPart.VISUAL_ID:
			return getCanvasAnnotation_3009OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getCanvasBusinessModel_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getCanvasDiagram_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getCanvasAnnotation_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getCanvasAnnotation_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getCanvasAnnotation_3003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getCanvasAnnotation_3004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getCanvasAnnotation_3005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getCanvasAnnotation_3006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getCanvasAnnotation_3007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getCanvasAnnotation_3008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getCanvasAnnotation_3009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getCanvasDiagram_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getCanvasAnnotation_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getCanvasAnnotation_3002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getCanvasAnnotation_3003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getCanvasAnnotation_3004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getCanvasAnnotation_3005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getCanvasAnnotation_3006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getCanvasAnnotation_3007IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getCanvasAnnotation_3008IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getCanvasAnnotation_3009IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getCanvasDiagram_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getCanvasAnnotation_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getCanvasAnnotation_3002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getCanvasAnnotation_3003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getCanvasAnnotation_3004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getCanvasAnnotation_3005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getCanvasAnnotation_3006OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getCanvasAnnotation_3007OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getCanvasAnnotation_3008OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getCanvasAnnotation_3009OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<CanvasNodeDescriptor> getSemanticChildren(View view) {
			return CanvasDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<CanvasLinkDescriptor> getContainedLinks(View view) {
			return CanvasDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<CanvasLinkDescriptor> getIncomingLinks(View view) {
			return CanvasDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<CanvasLinkDescriptor> getOutgoingLinks(View view) {
			return CanvasDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
