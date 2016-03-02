package es.kybele.elastic.models.canvas.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

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
import es.kybele.elastic.models.canvas.diagram.part.CanvasVisualIDRegistry;
import es.kybele.elastic.models.canvas.diagram.part.Messages;

/**
 * @generated
 */
public class CanvasNavigatorContentProvider implements ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public CanvasNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate() {
			public void dispose() {
			}

			public boolean handleResourceChanged(final Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceDeleted(Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceMoved(Resource resource, final URI newURI) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}
		});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
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
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
			ArrayList<CanvasNavigatorItem> result = new ArrayList<CanvasNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(selectViewsByType(topViews, CanvasBusinessModelEditPart.MODEL_ID), file,
					false));
			return result.toArray();
		}

		if (parentElement instanceof CanvasNavigatorGroup) {
			CanvasNavigatorGroup group = (CanvasNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof CanvasNavigatorItem) {
			CanvasNavigatorItem navigatorItem = (CanvasNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (CanvasVisualIDRegistry.getVisualID(view)) {

		case CanvasBusinessModelEditPart.VISUAL_ID: {
			LinkedList<CanvasAbstractNavigatorItem> result = new LinkedList<CanvasAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CanvasVisualIDRegistry.getType(CanvasDiagramEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case CanvasDiagramEditPart.VISUAL_ID: {
			LinkedList<CanvasAbstractNavigatorItem> result = new LinkedList<CanvasAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), CanvasVisualIDRegistry
					.getType(CanvasDiagramLeftLeftVerticalRectangleCompartmentDiagramEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CanvasVisualIDRegistry.getType(LeftLeftVerticalCanvasAnnotationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), CanvasVisualIDRegistry
					.getType(CanvasDiagramLeftVerticalUpRectangleCompartmentDiagramEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CanvasVisualIDRegistry.getType(LeftVerticalUpCanvasAnnotationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), CanvasVisualIDRegistry
					.getType(CanvasDiagramLeftVerticalDownRectangleCompartmentDiagramEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CanvasVisualIDRegistry.getType(LeftVerticalDownCanvasAnnotationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), CanvasVisualIDRegistry
					.getType(CanvasDiagramCenterVerticalRectangleCompartmentDiagramEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CanvasVisualIDRegistry.getType(CenterVerticalCanvasAnnotationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), CanvasVisualIDRegistry
					.getType(CanvasDiagramRightVerticalUpRectangleCompartmentDiagramEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CanvasVisualIDRegistry.getType(RightVerticalUpCanvasAnnotationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CanvasVisualIDRegistry.getType(CanvasDiagramRightVerticalDownCompartmentDiagramEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CanvasVisualIDRegistry.getType(RightVerticalDownCanvasAnnotationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), CanvasVisualIDRegistry
					.getType(CanvasDiagramRightRightVerticalRectangleCompartmentDiagramEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CanvasVisualIDRegistry.getType(RightRightVerticalCanvasAnnotationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), CanvasVisualIDRegistry
					.getType(CanvasDiagramLeftHorizontalRectangleCompartmentDiagramEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CanvasVisualIDRegistry.getType(LeftHorizontalCanvasAnnotationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), CanvasVisualIDRegistry
					.getType(CanvasDiagramRightHorizontalRectangleCompartmentDiagramEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CanvasVisualIDRegistry.getType(RightHorizontalCanvasAnnotationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return CanvasBusinessModelEditPart.MODEL_ID.equals(CanvasVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<CanvasNavigatorItem> createNavigatorItems(Collection<View> views, Object parent,
			boolean isLeafs) {
		ArrayList<CanvasNavigatorItem> result = new ArrayList<CanvasNavigatorItem>(views.size());
		for (View nextView : views) {
			result.add(new CanvasNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof CanvasAbstractNavigatorItem) {
			CanvasAbstractNavigatorItem abstractNavigatorItem = (CanvasAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
