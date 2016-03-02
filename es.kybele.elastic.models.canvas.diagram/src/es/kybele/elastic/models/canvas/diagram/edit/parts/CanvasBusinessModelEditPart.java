package es.kybele.elastic.models.canvas.diagram.edit.parts;

import org.eclipse.draw2d.FigureListener;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutAnimator;
import org.eclipse.draw2d.TreeSearch;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemsAwareFreeFormLayer;
import org.eclipse.gmf.runtime.diagram.ui.layout.FreeFormLayoutEx;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;

import es.kybele.elastic.models.canvas.diagram.edit.parts.customs.DiagramFigureListenerCustom;
import es.kybele.elastic.models.canvas.diagram.edit.policies.CanvasBusinessModelCanonicalEditPolicy;
import es.kybele.elastic.models.canvas.diagram.edit.policies.CanvasBusinessModelItemSemanticEditPolicy;
import es.kybele.elastic.models.canvas.diagram.part.CanvasVisualIDRegistry;

/**
 * @generated
 */
public class CanvasBusinessModelEditPart extends DiagramEditPart {

	/**
	 * @generated
	 */
	public final static String MODEL_ID = "Canvas"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 1000;

	/**
	 * @generated
	 */
	public CanvasBusinessModelEditPart(View view) {
		super(view);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#createFigure()
	 */
	/**
	 * @generated
	 */
	protected IFigure createFigure() {

		IFigure _figure = super.createFigure();
		if (_figure instanceof BorderItemsAwareFreeFormLayer) {
			BorderItemsAwareFreeFormLayer _figureDiagram = (BorderItemsAwareFreeFormLayer) _figure;
			_figureDiagram.addFigureListener(new DiagramFigureListenerCustom(this));
		}
		return _figure;
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new CanvasBusinessModelItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new CanvasBusinessModelCanonicalEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(CanvasVisualIDRegistry.TYPED_INSTANCE));
	}

}
