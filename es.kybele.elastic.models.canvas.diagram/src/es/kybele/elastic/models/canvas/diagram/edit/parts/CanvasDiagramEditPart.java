package es.kybele.elastic.models.canvas.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FigureListener;
import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableShapeEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

import es.kybele.elastic.models.canvas.diagram.edit.policies.CanvasDiagramItemSemanticEditPolicy;
import es.kybele.elastic.models.canvas.diagram.edit.policies.custom.CompartmentCreationEditPolicy;
import es.kybele.elastic.models.canvas.diagram.part.CanvasVisualIDRegistry;
import es.kybele.elastic.models.canvas.diagram.providers.CanvasElementTypes;

/**
 * @generated
 */
public class CanvasDiagramEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2001;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public CanvasDiagramEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new CanvasDiagramItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		XYLayoutEditPolicy lep = new XYLayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = super.createChildEditPolicy(child);
				if (result == null) {
					return new ResizableShapeEditPolicy();
				}
				return result;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new CanvasDiagramFigureDescriptor();
	}

	/**
	 * @generated
	 */
	public CanvasDiagramFigureDescriptor getPrimaryShape() {
		return (CanvasDiagramFigureDescriptor) primaryShape;
	}

	/**
	 * @generated
	 */
	protected void handleNotificationEvent(Notification notification) {
		Object feature = notification.getFeature();
		if (NotationPackage.eINSTANCE.getSize_Width().equals(feature)
				|| NotationPackage.eINSTANCE.getSize_Height().equals(feature)
				|| NotationPackage.eINSTANCE.getLocation_X().equals(feature)
				|| NotationPackage.eINSTANCE.getLocation_Y().equals(feature)) {
			refreshBounds();
		} else if (NotationPackage.eINSTANCE.getView_SourceEdges().equals(feature))
			refreshSourceConnections();
		else if (NotationPackage.eINSTANCE.getView_TargetEdges().equals(feature))
			refreshTargetConnections();
		else if (NotationPackage.eINSTANCE.getFillStyle_Gradient().equals(feature)
				|| NotationPackage.eINSTANCE.getFillStyle_FillColor().equals(feature)) {
			refreshBackgroundColor();
		} else if (NotationPackage.eINSTANCE.getFillStyle_Transparency().equals(feature)) {
			refreshTransparency();
		} else {
			super.handleNotificationEvent(notification);
		}
	}
	
	/**
	 * @generated
	 */
	protected void refreshBounds() 
	{
		super.refreshBounds();
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof CanvasDiagramLeftLeftVerticalRectangleCompartmentDiagramEditPart) {
			IFigure pane = getPrimaryShape().getFigureCompartmentLeftLeftVerticalRectangleCanvasDiagram();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((CanvasDiagramLeftLeftVerticalRectangleCompartmentDiagramEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof CanvasDiagramLeftVerticalUpRectangleCompartmentDiagramEditPart) {
			IFigure pane = getPrimaryShape().getFigureCompartmentLeftVerticalUpRectangleCanvasDiagram();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((CanvasDiagramLeftVerticalUpRectangleCompartmentDiagramEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof CanvasDiagramLeftVerticalDownRectangleCompartmentDiagramEditPart) {
			IFigure pane = getPrimaryShape().getFigureCompartmentLeftVerticalDownRectangleCanvasDiagram();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((CanvasDiagramLeftVerticalDownRectangleCompartmentDiagramEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof CanvasDiagramCenterVerticalRectangleCompartmentDiagramEditPart) {
			IFigure pane = getPrimaryShape().getFigureCompartmentCenterVerticalRectangleCanvasDiagram();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((CanvasDiagramCenterVerticalRectangleCompartmentDiagramEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof CanvasDiagramRightVerticalUpRectangleCompartmentDiagramEditPart) {
			IFigure pane = getPrimaryShape().getFigureCompartmentRightVerticalUpRectangleCanvasDiagram();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((CanvasDiagramRightVerticalUpRectangleCompartmentDiagramEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof CanvasDiagramRightVerticalDownCompartmentDiagramEditPart) {
			IFigure pane = getPrimaryShape().getFigureCompartmentRightVerticalDownRectangleCanvasDiagram();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((CanvasDiagramRightVerticalDownCompartmentDiagramEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof CanvasDiagramRightRightVerticalRectangleCompartmentDiagramEditPart) {
			IFigure pane = getPrimaryShape().getFigureCompartmentRightRightVerticalRectangleCanvasDiagram();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((CanvasDiagramRightRightVerticalRectangleCompartmentDiagramEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof CanvasDiagramLeftHorizontalRectangleCompartmentDiagramEditPart) {
			IFigure pane = getPrimaryShape().getFigureCompartmentLeftHorizontalBaseDownRectangleCanvasDiagram();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((CanvasDiagramLeftHorizontalRectangleCompartmentDiagramEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof CanvasDiagramRightHorizontalRectangleCompartmentDiagramEditPart) {
			IFigure pane = getPrimaryShape().getFigureCompartmentRightHorizontalBaseDownRectangleCanvasDiagram();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((CanvasDiagramRightHorizontalRectangleCompartmentDiagramEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof CanvasDiagramLeftLeftVerticalRectangleCompartmentDiagramEditPart) {
			IFigure pane = getPrimaryShape().getFigureCompartmentLeftLeftVerticalRectangleCanvasDiagram();
			pane.remove(((CanvasDiagramLeftLeftVerticalRectangleCompartmentDiagramEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof CanvasDiagramLeftVerticalUpRectangleCompartmentDiagramEditPart) {
			IFigure pane = getPrimaryShape().getFigureCompartmentLeftVerticalUpRectangleCanvasDiagram();
			pane.remove(((CanvasDiagramLeftVerticalUpRectangleCompartmentDiagramEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof CanvasDiagramLeftVerticalDownRectangleCompartmentDiagramEditPart) {
			IFigure pane = getPrimaryShape().getFigureCompartmentLeftVerticalDownRectangleCanvasDiagram();
			pane.remove(((CanvasDiagramLeftVerticalDownRectangleCompartmentDiagramEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof CanvasDiagramCenterVerticalRectangleCompartmentDiagramEditPart) {
			IFigure pane = getPrimaryShape().getFigureCompartmentCenterVerticalRectangleCanvasDiagram();
			pane.remove(((CanvasDiagramCenterVerticalRectangleCompartmentDiagramEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof CanvasDiagramRightVerticalUpRectangleCompartmentDiagramEditPart) {
			IFigure pane = getPrimaryShape().getFigureCompartmentRightVerticalUpRectangleCanvasDiagram();
			pane.remove(((CanvasDiagramRightVerticalUpRectangleCompartmentDiagramEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof CanvasDiagramRightVerticalDownCompartmentDiagramEditPart) {
			IFigure pane = getPrimaryShape().getFigureCompartmentRightVerticalDownRectangleCanvasDiagram();
			pane.remove(((CanvasDiagramRightVerticalDownCompartmentDiagramEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof CanvasDiagramRightRightVerticalRectangleCompartmentDiagramEditPart) {
			IFigure pane = getPrimaryShape().getFigureCompartmentRightRightVerticalRectangleCanvasDiagram();
			pane.remove(
					((CanvasDiagramRightRightVerticalRectangleCompartmentDiagramEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof CanvasDiagramLeftHorizontalRectangleCompartmentDiagramEditPart) {
			IFigure pane = getPrimaryShape().getFigureCompartmentLeftHorizontalBaseDownRectangleCanvasDiagram();
			pane.remove(((CanvasDiagramLeftHorizontalRectangleCompartmentDiagramEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof CanvasDiagramRightHorizontalRectangleCompartmentDiagramEditPart) {
			IFigure pane = getPrimaryShape().getFigureCompartmentRightHorizontalBaseDownRectangleCanvasDiagram();
			pane.remove(((CanvasDiagramRightHorizontalRectangleCompartmentDiagramEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof CanvasDiagramLeftLeftVerticalRectangleCompartmentDiagramEditPart) {
			return getPrimaryShape().getFigureCompartmentLeftLeftVerticalRectangleCanvasDiagram();
		}
		if (editPart instanceof CanvasDiagramLeftVerticalUpRectangleCompartmentDiagramEditPart) {
			return getPrimaryShape().getFigureCompartmentLeftVerticalUpRectangleCanvasDiagram();
		}
		if (editPart instanceof CanvasDiagramLeftVerticalDownRectangleCompartmentDiagramEditPart) {
			return getPrimaryShape().getFigureCompartmentLeftVerticalDownRectangleCanvasDiagram();
		}
		if (editPart instanceof CanvasDiagramCenterVerticalRectangleCompartmentDiagramEditPart) {
			return getPrimaryShape().getFigureCompartmentCenterVerticalRectangleCanvasDiagram();
		}
		if (editPart instanceof CanvasDiagramRightVerticalUpRectangleCompartmentDiagramEditPart) {
			return getPrimaryShape().getFigureCompartmentRightVerticalUpRectangleCanvasDiagram();
		}
		if (editPart instanceof CanvasDiagramRightVerticalDownCompartmentDiagramEditPart) {
			return getPrimaryShape().getFigureCompartmentRightVerticalDownRectangleCanvasDiagram();
		}
		if (editPart instanceof CanvasDiagramRightRightVerticalRectangleCompartmentDiagramEditPart) {
			return getPrimaryShape().getFigureCompartmentRightRightVerticalRectangleCanvasDiagram();
		}
		if (editPart instanceof CanvasDiagramLeftHorizontalRectangleCompartmentDiagramEditPart) {
			return getPrimaryShape().getFigureCompartmentLeftHorizontalBaseDownRectangleCanvasDiagram();
		}
		if (editPart instanceof CanvasDiagramRightHorizontalRectangleCompartmentDiagramEditPart) {
			return getPrimaryShape().getFigureCompartmentRightHorizontalBaseDownRectangleCanvasDiagram();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.addFigureListener(new FigureListener() {

			@Override
			public void figureMoved(IFigure source) {
				// TODO Auto-generated method stub

				if (getFigure().getChildren().get(0) instanceof CanvasDiagramFigureDescriptor) {
					CanvasDiagramFigureDescriptor fd = (CanvasDiagramFigureDescriptor) getFigure().getChildren().get(0);

					Dimension _size = source.getSize();
					_size.width = _size.width;
					fd.setSize(_size);

					RectangleFigure _up = (RectangleFigure) fd.getChildren().get(0);

					_up.setSize(getMapMode().DPtoLP(fd.getSize().width), getMapMode().DPtoLP((int) (fd.getSize().height * 0.7)));

					fd.add(_up, 0);

					int _width = _up.getSize().width / 5;
					RectangleFigure _upLeftLeft = (RectangleFigure) _up.getChildren().get(0);
					Point _upLeftLeftLocation = _up.getLocation();
					Dimension _upLeftLeftDimension = new Dimension(getMapMode().DPtoLP(_width),getMapMode().DPtoLP((int) (fd.getSize().height * 0.7)));
					_upLeftLeft.setBounds(new Rectangle(_upLeftLeftLocation, _upLeftLeftDimension));
					_up.add(_upLeftLeft, 0);
					RectangleFigure _upLeftLeftCompartment = (RectangleFigure) _upLeftLeft.getChildren().get(1);
					Point _upLeftLeftCompartmentLocation = _upLeftLeftCompartment.getLocation();
					_upLeftLeftCompartmentLocation.y = _upLeftLeft.getLocation().y + 30;
					Dimension _upLeftLeftCompartmentDimension = new Dimension(getMapMode().DPtoLP(_width),getMapMode().DPtoLP((int) (_upLeftLeft.getSize().height) - 30));

					_upLeftLeftCompartment.setBounds(new Rectangle(_upLeftLeftCompartmentLocation, _upLeftLeftCompartmentDimension));

					_upLeftLeft.add(_upLeftLeftCompartment, 1);
					RectangleFigure _upLeft = (RectangleFigure) _up.getChildren().get(1);
					Point _upLeftLocation = _up.getLocation();
					_upLeftLocation.x = _upLeftLocation.x + _width - 2;
					Dimension _upLeftDimension = new Dimension(getMapMode().DPtoLP(_width + 4),	getMapMode().DPtoLP((int) (fd.getSize().height * 0.7)));
					_upLeft.setBounds(new Rectangle(_upLeftLocation, _upLeftDimension));
					_up.add(_upLeft, 1);
					RectangleFigure _upLeftUP = (RectangleFigure) _upLeft.getChildren().get(0);
					Point _upLeftUPLocation = _upLeft.getLocation();
					Dimension _upLeftUPDimension = new Dimension(getMapMode().DPtoLP(_width + 4),getMapMode().DPtoLP((int) (_upLeft.getSize().height * 0.5)));
					_upLeftUP.setBounds(new Rectangle(_upLeftUPLocation, _upLeftUPDimension));
					_upLeft.add(_upLeftUP, 0);

					RectangleFigure _upLeftUPCompartment = (RectangleFigure) _upLeftUP.getChildren().get(1);
					Point _upLeftUPCompartmentLocation = _upLeftUPCompartment.getLocation();
					_upLeftUPCompartmentLocation.y = _upLeftUP.getLocation().y + 30;
					Dimension _upLeftUPCompartmentDimension = new Dimension(getMapMode().DPtoLP(_width),getMapMode().DPtoLP((int) (_upLeftUP.getSize().height) - 30));

					_upLeftUPCompartment.setBounds(new Rectangle(_upLeftUPCompartmentLocation, _upLeftUPCompartmentDimension));

					_upLeftUP.add(_upLeftUPCompartment, 1);

					RectangleFigure _upLeftDOWN = (RectangleFigure) _upLeft.getChildren().get(1);

					Point _upLeftDOWNLocation = _upLeftUP.getBounds().getBottomLeft();
					_upLeftDOWNLocation.y -= 1;
					_upLeftDOWNLocation.x += 1;
					Dimension _upLeftDOWNDimension = new Dimension(getMapMode().DPtoLP(_width + 4),
							getMapMode().DPtoLP((int) (_upLeft.getSize().height * 0.5) + 2));

					_upLeftDOWN.setBounds(new Rectangle(_upLeftDOWNLocation, _upLeftDOWNDimension));

					_upLeft.add(_upLeftDOWN, 1);

					RectangleFigure _upLeftDOWNCompartment = (RectangleFigure) _upLeftDOWN.getChildren().get(1);

					Point _upLeftDOWNCompartmentLocation = _upLeftDOWNCompartment.getLocation();

					_upLeftDOWNCompartmentLocation.y = _upLeftDOWN.getLocation().y + 30;

					Dimension _upLeftDOWNCompartmentDimension = new Dimension(getMapMode().DPtoLP(_width),
							getMapMode().DPtoLP((int) (_upLeftDOWN.getSize().height) - 30));

					_upLeftDOWNCompartment
							.setBounds(new Rectangle(_upLeftDOWNCompartmentLocation, _upLeftDOWNCompartmentDimension));

					_upLeftDOWN.add(_upLeftDOWNCompartment, 1);

					RectangleFigure _upCenter = (RectangleFigure) _up.getChildren().get(2);
					Point _upCenterLocation = _upLeft.getLocation();
					_upCenterLocation.x = _upCenterLocation.x + _width - 1;
					Dimension _upCenterDimension = new Dimension(getMapMode().DPtoLP(_width + 4),
							getMapMode().DPtoLP((int) (fd.getSize().height * 0.7)));
					_upCenter.setBounds(new Rectangle(_upCenterLocation, _upCenterDimension));

					_up.add(_upCenter, 2);

					RectangleFigure _upCenterCompartment = (RectangleFigure) _upCenter.getChildren().get(1);

					Point _upCenterCompartmentLocation = _upCenterCompartment.getLocation();

					_upCenterCompartmentLocation.y = _upCenter.getLocation().y + 30;

					Dimension _upCenterCompartmentDimension = new Dimension(getMapMode().DPtoLP(_width),
							getMapMode().DPtoLP((int) (_upCenter.getSize().height) - 30));

					_upCenterCompartment
							.setBounds(new Rectangle(_upCenterCompartmentLocation, _upCenterCompartmentDimension));

					_upCenter.add(_upCenterCompartment, 1);

					RectangleFigure _upRight = (RectangleFigure) _up.getChildren().get(3);
					Point _upRightLocation = _upCenter.getLocation();
					_upRightLocation.x = _upRightLocation.x + _width - 1;
					Dimension _upRightDimension = new Dimension(getMapMode().DPtoLP(_width + 4),
							getMapMode().DPtoLP((int) (fd.getSize().height * 0.7)));
					_upRight.setBounds(new Rectangle(_upRightLocation, _upRightDimension));
					_upRight.setBackgroundColor(ColorConstants.white);
					_up.add(_upRight, 3);

					RectangleFigure _upRightUP = (RectangleFigure) _upRight.getChildren().get(0);
					Point _upRightUPLocation = _upRight.getLocation();
					Dimension _upRightUPDimension = new Dimension(getMapMode().DPtoLP(_width + 4),
							getMapMode().DPtoLP((int) (_upRight.getSize().height * 0.5)));
					_upRightUP.setBounds(new Rectangle(_upRightUPLocation, _upRightUPDimension));

					_upRight.add(_upRightUP, 0);


					RectangleFigure _upRightUPCompartment = (RectangleFigure) _upRightUP.getChildren().get(1);

					Point _upRightUPCompartmentLocation = _upRightUPCompartment.getLocation();

					_upRightUPCompartmentLocation.y = _upRightUP.getLocation().y + 30;

					Dimension _upRightUPCompartmentDimension = new Dimension(getMapMode().DPtoLP(_width),
							getMapMode().DPtoLP((int) (_upRightUP.getSize().height) - 30));

					_upRightUPCompartment
							.setBounds(new Rectangle(_upRightUPCompartmentLocation, _upRightUPCompartmentDimension));

					_upRightUP.add(_upRightUPCompartment, 1);


					RectangleFigure _upRightDOWN = (RectangleFigure) _upRight.getChildren().get(1);
					Point _upRightDOWNLocation = _upRightUP.getBounds().getBottomLeft();
					_upRightDOWNLocation.y -= 1;
					_upRightDOWNLocation.x += 1;
					Dimension _upRightDOWNDimension = new Dimension(getMapMode().DPtoLP(_width + 4),
							getMapMode().DPtoLP((int) (_upRight.getSize().height * 0.5) + 2));
					_upRightDOWN.setBounds(new Rectangle(_upRightDOWNLocation, _upRightDOWNDimension));

					_upRight.add(_upRightDOWN, 1);

					RectangleFigure _upRightDOWNCompartment = (RectangleFigure) _upRightDOWN.getChildren().get(1);

					Point _upRightDOWNCompartmentLocation = _upRightDOWNCompartment.getLocation();

					_upRightDOWNCompartmentLocation.y = _upRightDOWN.getLocation().y + 30;

					Dimension _upRightDOWNCompartmentDimension = new Dimension(getMapMode().DPtoLP(_width),
							getMapMode().DPtoLP((int) (_upRightDOWN.getSize().height) - 30));

					_upRightDOWNCompartment.setBounds(
							new Rectangle(_upRightDOWNCompartmentLocation, _upRightDOWNCompartmentDimension));

					_upRightDOWN.add(_upRightDOWNCompartment, 1);
					RectangleFigure _upRightRight = (RectangleFigure) _up.getChildren().get(4);
					Point _upRightRightLocation = _upRight.getLocation();
					_upRightRightLocation.x = _upRightRightLocation.x + _width - 1;
					Dimension _upRightRightDimension = new Dimension(getMapMode().DPtoLP(_width + 7),
							getMapMode().DPtoLP((int) (fd.getSize().height * 0.7)));
					_upRightRight.setBounds(new Rectangle(_upRightRightLocation, _upRightRightDimension));

					_up.add(_upRightRight, 4);
					RectangleFigure _upRightRightCompartment = (RectangleFigure) _upRightRight.getChildren().get(1);

					Point _upRightRightCompartmentLocation = _upRightRightCompartment.getLocation();

					_upRightRightCompartmentLocation.y = _upRightRight.getLocation().y + 30;

					Dimension _upRightRightCompartmentDimension = new Dimension(getMapMode().DPtoLP(_width + 4),
							getMapMode().DPtoLP((int) (_upRightRight.getSize().height) - 30));

					_upRightRightCompartment.setBounds(
							new Rectangle(_upRightRightCompartmentLocation, _upRightRightCompartmentDimension));

					_upRightRight.add(_upRightRightCompartment, 1);

					RectangleFigure _down = (RectangleFigure) fd.getChildren().get(1);

					Point _downLocation = new Point(_up.getLocation().x,
							_up.getLocation().y + _up.getSize().height - 2);

					_down.setLocation(_downLocation);
					_down.setSize(getMapMode().DPtoLP(fd.getSize().width),
							getMapMode().DPtoLP((int) (fd.getSize().height * 0.3) + 2));

					fd.add(_down, 1);

					_width = (int) _down.getSize().width / 2;

					RectangleFigure _downLeft = (RectangleFigure) _down.getChildren().get(0);

					_downLeft.setLocation(new Point(_down.getLocation().x, _down.getLocation().y));

					_downLeft.setSize(getMapMode().DPtoLP(_width), getMapMode().DPtoLP((int) (_down.getSize().height)));

					_down.add(_downLeft, 0);

					RectangleFigure _downLeftCompartment = (RectangleFigure) _downLeft.getChildren().get(1);

					_downLeftCompartment
							.setLocation(new Point(_downLeft.getLocation().x, _downLeft.getLocation().y + 30));

					_downLeftCompartment.setSize(getMapMode().DPtoLP(_width),
							getMapMode().DPtoLP((int) (_downLeft.getSize().height - 30) + 2));

					_downLeft.add(_downLeftCompartment, 1);
					RectangleFigure _downRight = (RectangleFigure) _down.getChildren().get(1);

					_downRight.setLocation(new Point(_down.getLocation().x + _width - 2, _down.getLocation().y));

					_downRight.setSize(getMapMode().DPtoLP(_width + 2),
							getMapMode().DPtoLP((int) (_down.getSize().height)));

					_down.add(_downRight, 1);
					RectangleFigure _downRightCompartment = (RectangleFigure) _downRight.getChildren().get(1);

					_downRightCompartment
							.setLocation(new Point(_downRight.getLocation().x, _downLeft.getLocation().y + 30));

					_downRightCompartment.setSize(getMapMode().DPtoLP(_width),
							getMapMode().DPtoLP((int) (_downRight.getSize().height - 30) + 2));

					_downRightCompartment.setLineWidth(0);
					_downRight.add(_downRightCompartment, 1);

				}
			}
		});

		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			nodeShape.setLayoutManager(new FreeformLayout() {

				public Object getConstraint(IFigure figure) {
					Object result = constraints.get(figure);
					if (result == null) {
						result = new Rectangle(0, 0, -1, -1);
					}
					return result;
				}
			});
		}
		return nodeShape; 
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public class CanvasDiagramFigureDescriptor extends RectangleFigure {

		/**
		 * @generated
		 */
		private RectangleFigure fFigureCompartmentLeftLeftVerticalRectangleCanvasDiagram;

		/**
		 * @generated
		 */
		private RectangleFigure fFigureCompartmentLeftVerticalUpRectangleCanvasDiagram;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureCompartmentLeftVerticalDownRectangleCanvasDiagram;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureCompartmentCenterVerticalRectangleCanvasDiagram;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureCompartmentRightVerticalUpRectangleCanvasDiagram;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureCompartmentRightVerticalDownRectangleCanvasDiagram;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureCompartmentRightRightVerticalRectangleCanvasDiagram;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureCompartmentLeftHorizontalBaseDownRectangleCanvasDiagram;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureCompartmentRightHorizontalBaseDownRectangleCanvasDiagram;

		/**
		 * @generated
		 */
		public CanvasDiagramFigureDescriptor() {
			this.setLayoutManager(new XYLayout());
			this.setMaximumSize(new Dimension(getMapMode().DPtoLP(800), getMapMode().DPtoLP(600)));
			this.setMinimumSize(new Dimension(getMapMode().DPtoLP(800), getMapMode().DPtoLP(600)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure baseTopCanvasDiagram0 = new RectangleFigure();

			baseTopCanvasDiagram0.setLineWidth(2);
			baseTopCanvasDiagram0.setForegroundColor(ColorConstants.black);
			baseTopCanvasDiagram0.setBackgroundColor(ColorConstants.white);
			baseTopCanvasDiagram0.setMinimumSize(new Dimension(getMapMode().DPtoLP(800), getMapMode().DPtoLP(420)));

			this.add(baseTopCanvasDiagram0, new Rectangle(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(800), getMapMode().DPtoLP(420)));
			baseTopCanvasDiagram0.setLayoutManager(new XYLayout());

			RectangleFigure leftLeftVerticalRectangleCanvasDiagram1 = new RectangleFigure();

			leftLeftVerticalRectangleCanvasDiagram1.setLineWidth(2);

			baseTopCanvasDiagram0.add(leftLeftVerticalRectangleCanvasDiagram1, new Rectangle(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(160), getMapMode().DPtoLP(420)));
			leftLeftVerticalRectangleCanvasDiagram1.setLayoutManager(new XYLayout());

			WrappingLabel keyPartnersLeftLeftVerticalRectangleCanvasDiagram2 = new WrappingLabel();

			keyPartnersLeftLeftVerticalRectangleCanvasDiagram2.setText("Key Partners");

			keyPartnersLeftLeftVerticalRectangleCanvasDiagram2
					.setFont(KEYPARTNERSLEFTLEFTVERTICALRECTANGLECANVASDIAGRAM2_FONT);

			leftLeftVerticalRectangleCanvasDiagram1.add(keyPartnersLeftLeftVerticalRectangleCanvasDiagram2,
					new Rectangle(getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(160),
							getMapMode().DPtoLP(30)));

			fFigureCompartmentLeftLeftVerticalRectangleCanvasDiagram = new RectangleFigure();

			fFigureCompartmentLeftLeftVerticalRectangleCanvasDiagram.setOutline(false);
			fFigureCompartmentLeftLeftVerticalRectangleCanvasDiagram.setFill(false);
			fFigureCompartmentLeftLeftVerticalRectangleCanvasDiagram.setOpaque(false);
			fFigureCompartmentLeftLeftVerticalRectangleCanvasDiagram.setBackgroundColor(ColorConstants.white);

			leftLeftVerticalRectangleCanvasDiagram1.add(fFigureCompartmentLeftLeftVerticalRectangleCanvasDiagram,
					new Rectangle(getMapMode().DPtoLP(0), getMapMode().DPtoLP(30), getMapMode().DPtoLP(160),
							getMapMode().DPtoLP(390)));
			fFigureCompartmentLeftLeftVerticalRectangleCanvasDiagram.setLayoutManager(new StackLayout());

			RectangleFigure leftVerticalRectangleCanvasDiagram1 = new RectangleFigure();

			leftVerticalRectangleCanvasDiagram1.setLineWidth(2);

			baseTopCanvasDiagram0.add(leftVerticalRectangleCanvasDiagram1, new Rectangle(getMapMode().DPtoLP(159),
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(160), getMapMode().DPtoLP(420)));
			leftVerticalRectangleCanvasDiagram1.setLayoutManager(new XYLayout());

			RectangleFigure leftVerticalUpRectangleCanvasDiagram2 = new RectangleFigure();

			leftVerticalUpRectangleCanvasDiagram2.setLineWidth(2);

			leftVerticalRectangleCanvasDiagram1.add(leftVerticalUpRectangleCanvasDiagram2,
					new Rectangle(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0), getMapMode().DPtoLP(160),
							getMapMode().DPtoLP(210)));
			leftVerticalUpRectangleCanvasDiagram2.setLayoutManager(new XYLayout());

			WrappingLabel keyActivitiesLabelLeftVerticalUpRectangleCanvasDiagram3 = new WrappingLabel();

			keyActivitiesLabelLeftVerticalUpRectangleCanvasDiagram3.setText("Key Activities");

			keyActivitiesLabelLeftVerticalUpRectangleCanvasDiagram3
					.setFont(KEYACTIVITIESLABELLEFTVERTICALUPRECTANGLECANVASDIAGRAM3_FONT);

			leftVerticalUpRectangleCanvasDiagram2.add(keyActivitiesLabelLeftVerticalUpRectangleCanvasDiagram3,
					new Rectangle(getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(160),
							getMapMode().DPtoLP(50)));

			fFigureCompartmentLeftVerticalUpRectangleCanvasDiagram = new RectangleFigure();

			fFigureCompartmentLeftVerticalUpRectangleCanvasDiagram.setOutline(false);
			fFigureCompartmentLeftVerticalUpRectangleCanvasDiagram.setFill(false);
			fFigureCompartmentLeftVerticalUpRectangleCanvasDiagram.setOpaque(false);
			fFigureCompartmentLeftVerticalUpRectangleCanvasDiagram.setBackgroundColor(ColorConstants.white);

			leftVerticalUpRectangleCanvasDiagram2.add(fFigureCompartmentLeftVerticalUpRectangleCanvasDiagram,
					new Rectangle(getMapMode().DPtoLP(0), getMapMode().DPtoLP(30), getMapMode().DPtoLP(160),
							getMapMode().DPtoLP(180)));
			fFigureCompartmentLeftVerticalUpRectangleCanvasDiagram.setLayoutManager(new StackLayout());

			RectangleFigure leftVerticalDownRectangleCanvasDiagram2 = new RectangleFigure();

			leftVerticalRectangleCanvasDiagram1.add(leftVerticalDownRectangleCanvasDiagram2,
					new Rectangle(getMapMode().DPtoLP(0), getMapMode().DPtoLP(209), getMapMode().DPtoLP(160),
							getMapMode().DPtoLP(211)));
			leftVerticalDownRectangleCanvasDiagram2.setLayoutManager(new XYLayout());

			WrappingLabel keyResourcesLabelLeftVerticalDownRectangleCanvasDiagram3 = new WrappingLabel();

			keyResourcesLabelLeftVerticalDownRectangleCanvasDiagram3.setText("Key Resources");

			keyResourcesLabelLeftVerticalDownRectangleCanvasDiagram3
					.setFont(KEYRESOURCESLABELLEFTVERTICALDOWNRECTANGLECANVASDIAGRAM3_FONT);

			leftVerticalDownRectangleCanvasDiagram2.add(keyResourcesLabelLeftVerticalDownRectangleCanvasDiagram3,
					new Rectangle(getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(160),
							getMapMode().DPtoLP(30)));

			fFigureCompartmentLeftVerticalDownRectangleCanvasDiagram = new RectangleFigure();

			fFigureCompartmentLeftVerticalDownRectangleCanvasDiagram.setOutline(false);
			fFigureCompartmentLeftVerticalDownRectangleCanvasDiagram.setFill(false);
			fFigureCompartmentLeftVerticalDownRectangleCanvasDiagram.setOpaque(false);
			fFigureCompartmentLeftVerticalDownRectangleCanvasDiagram.setBackgroundColor(ColorConstants.white);

			leftVerticalDownRectangleCanvasDiagram2.add(fFigureCompartmentLeftVerticalDownRectangleCanvasDiagram,
					new Rectangle(getMapMode().DPtoLP(0), getMapMode().DPtoLP(30), getMapMode().DPtoLP(160),
							getMapMode().DPtoLP(180)));
			fFigureCompartmentLeftVerticalDownRectangleCanvasDiagram.setLayoutManager(new StackLayout());

			RectangleFigure centerVerticalRectangleCanvasDiagram1 = new RectangleFigure();

			centerVerticalRectangleCanvasDiagram1.setLineWidth(2);

			baseTopCanvasDiagram0.add(centerVerticalRectangleCanvasDiagram1, new Rectangle(getMapMode().DPtoLP(318),
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(160), getMapMode().DPtoLP(420)));
			centerVerticalRectangleCanvasDiagram1.setLayoutManager(new XYLayout());

			WrappingLabel valuePropositionsCenterVerticalRectangleCanvasDiagram2 = new WrappingLabel();

			valuePropositionsCenterVerticalRectangleCanvasDiagram2.setText("Value Propositions");

			valuePropositionsCenterVerticalRectangleCanvasDiagram2
					.setFont(VALUEPROPOSITIONSCENTERVERTICALRECTANGLECANVASDIAGRAM2_FONT);

			centerVerticalRectangleCanvasDiagram1.add(valuePropositionsCenterVerticalRectangleCanvasDiagram2,
					new Rectangle(getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(160),
							getMapMode().DPtoLP(50)));

			fFigureCompartmentCenterVerticalRectangleCanvasDiagram = new RectangleFigure();

			fFigureCompartmentCenterVerticalRectangleCanvasDiagram.setOutline(false);
			fFigureCompartmentCenterVerticalRectangleCanvasDiagram.setFill(false);
			fFigureCompartmentCenterVerticalRectangleCanvasDiagram.setOpaque(false);
			fFigureCompartmentCenterVerticalRectangleCanvasDiagram.setBackgroundColor(ColorConstants.white);

			centerVerticalRectangleCanvasDiagram1.add(fFigureCompartmentCenterVerticalRectangleCanvasDiagram,
					new Rectangle(getMapMode().DPtoLP(0), getMapMode().DPtoLP(30), getMapMode().DPtoLP(160),
							getMapMode().DPtoLP(390)));
			fFigureCompartmentCenterVerticalRectangleCanvasDiagram.setLayoutManager(new StackLayout());

			RectangleFigure rightVerticalRectangleCanvasDiagram1 = new RectangleFigure();

			rightVerticalRectangleCanvasDiagram1.setLineWidth(2);

			baseTopCanvasDiagram0.add(rightVerticalRectangleCanvasDiagram1, new Rectangle(getMapMode().DPtoLP(477),
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(160), getMapMode().DPtoLP(420)));
			rightVerticalRectangleCanvasDiagram1.setLayoutManager(new XYLayout());

			RectangleFigure rightVerticalUpRectangleCanvasDiagram2 = new RectangleFigure();

			rightVerticalUpRectangleCanvasDiagram2.setLineWidth(2);

			rightVerticalRectangleCanvasDiagram1.add(rightVerticalUpRectangleCanvasDiagram2,
					new Rectangle(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0), getMapMode().DPtoLP(160),
							getMapMode().DPtoLP(210)));
			rightVerticalUpRectangleCanvasDiagram2.setLayoutManager(new XYLayout());

			WrappingLabel customerRelationshipsLabelRightVerticalUpRectangleCanvasDiagram3 = new WrappingLabel();

			customerRelationshipsLabelRightVerticalUpRectangleCanvasDiagram3.setText("Customer Relationships");

			customerRelationshipsLabelRightVerticalUpRectangleCanvasDiagram3
					.setFont(CUSTOMERRELATIONSHIPSLABELRIGHTVERTICALUPRECTANGLECANVASDIAGRAM3_FONT);

			rightVerticalUpRectangleCanvasDiagram2.add(customerRelationshipsLabelRightVerticalUpRectangleCanvasDiagram3,
					new Rectangle(getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(160),
							getMapMode().DPtoLP(50)));

			fFigureCompartmentRightVerticalUpRectangleCanvasDiagram = new RectangleFigure();

			fFigureCompartmentRightVerticalUpRectangleCanvasDiagram.setOutline(false);
			fFigureCompartmentRightVerticalUpRectangleCanvasDiagram.setFill(false);
			fFigureCompartmentRightVerticalUpRectangleCanvasDiagram.setOpaque(false);
			fFigureCompartmentRightVerticalUpRectangleCanvasDiagram.setBackgroundColor(ColorConstants.white);

			rightVerticalUpRectangleCanvasDiagram2.add(fFigureCompartmentRightVerticalUpRectangleCanvasDiagram,
					new Rectangle(getMapMode().DPtoLP(0), getMapMode().DPtoLP(30), getMapMode().DPtoLP(160),
							getMapMode().DPtoLP(180)));
			fFigureCompartmentRightVerticalUpRectangleCanvasDiagram.setLayoutManager(new StackLayout());

			RectangleFigure rightVerticalDownRectangleCanvasDiagram2 = new RectangleFigure();

			rightVerticalRectangleCanvasDiagram1.add(rightVerticalDownRectangleCanvasDiagram2,
					new Rectangle(getMapMode().DPtoLP(0), getMapMode().DPtoLP(209), getMapMode().DPtoLP(160),
							getMapMode().DPtoLP(211)));
			rightVerticalDownRectangleCanvasDiagram2.setLayoutManager(new XYLayout());

			WrappingLabel channelsLabelRightVerticalDownRectangleCanvasDiagram3 = new WrappingLabel();

			channelsLabelRightVerticalDownRectangleCanvasDiagram3.setText("Channels");

			channelsLabelRightVerticalDownRectangleCanvasDiagram3
					.setFont(CHANNELSLABELRIGHTVERTICALDOWNRECTANGLECANVASDIAGRAM3_FONT);

			rightVerticalDownRectangleCanvasDiagram2.add(channelsLabelRightVerticalDownRectangleCanvasDiagram3,
					new Rectangle(getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(160),
							getMapMode().DPtoLP(30)));

			fFigureCompartmentRightVerticalDownRectangleCanvasDiagram = new RectangleFigure();

			fFigureCompartmentRightVerticalDownRectangleCanvasDiagram.setOutline(false);
			fFigureCompartmentRightVerticalDownRectangleCanvasDiagram.setFill(false);
			fFigureCompartmentRightVerticalDownRectangleCanvasDiagram.setOpaque(false);
			fFigureCompartmentRightVerticalDownRectangleCanvasDiagram.setBackgroundColor(ColorConstants.white);

			rightVerticalDownRectangleCanvasDiagram2.add(fFigureCompartmentRightVerticalDownRectangleCanvasDiagram,
					new Rectangle(getMapMode().DPtoLP(0), getMapMode().DPtoLP(30), getMapMode().DPtoLP(160),
							getMapMode().DPtoLP(180)));
			fFigureCompartmentRightVerticalDownRectangleCanvasDiagram.setLayoutManager(new StackLayout());

			RectangleFigure rightRightVerticalRectangleCanvasDiagram1 = new RectangleFigure();

			rightRightVerticalRectangleCanvasDiagram1.setLineWidth(2);

			baseTopCanvasDiagram0.add(rightRightVerticalRectangleCanvasDiagram1, new Rectangle(getMapMode().DPtoLP(636),
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(163), getMapMode().DPtoLP(420)));
			rightRightVerticalRectangleCanvasDiagram1.setLayoutManager(new XYLayout());

			WrappingLabel customerSegmentsRightRightVerticalRectangleCanvasDiagram2 = new WrappingLabel();

			customerSegmentsRightRightVerticalRectangleCanvasDiagram2.setText("Customer Segments");

			customerSegmentsRightRightVerticalRectangleCanvasDiagram2
					.setFont(CUSTOMERSEGMENTSRIGHTRIGHTVERTICALRECTANGLECANVASDIAGRAM2_FONT);

			rightRightVerticalRectangleCanvasDiagram1.add(customerSegmentsRightRightVerticalRectangleCanvasDiagram2,
					new Rectangle(getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(160),
							getMapMode().DPtoLP(50)));

			fFigureCompartmentRightRightVerticalRectangleCanvasDiagram = new RectangleFigure();

			fFigureCompartmentRightRightVerticalRectangleCanvasDiagram.setOutline(false);
			fFigureCompartmentRightRightVerticalRectangleCanvasDiagram.setFill(false);
			fFigureCompartmentRightRightVerticalRectangleCanvasDiagram.setOpaque(false);
			fFigureCompartmentRightRightVerticalRectangleCanvasDiagram.setBackgroundColor(ColorConstants.white);

			rightRightVerticalRectangleCanvasDiagram1.add(fFigureCompartmentRightRightVerticalRectangleCanvasDiagram,
					new Rectangle(getMapMode().DPtoLP(0), getMapMode().DPtoLP(30), getMapMode().DPtoLP(160),
							getMapMode().DPtoLP(390)));
			fFigureCompartmentRightRightVerticalRectangleCanvasDiagram.setLayoutManager(new StackLayout());

			RectangleFigure baseDownCanvasDiagram0 = new RectangleFigure();

			baseDownCanvasDiagram0.setLineWidth(2);
			baseDownCanvasDiagram0.setForegroundColor(ColorConstants.black);
			baseDownCanvasDiagram0.setBackgroundColor(ColorConstants.white);
			baseDownCanvasDiagram0.setMinimumSize(new Dimension(getMapMode().DPtoLP(800), getMapMode().DPtoLP(180)));

			this.add(baseDownCanvasDiagram0, new Rectangle(getMapMode().DPtoLP(0), getMapMode().DPtoLP(419),
					getMapMode().DPtoLP(800), getMapMode().DPtoLP(180)));
			baseDownCanvasDiagram0.setLayoutManager(new XYLayout());

			RectangleFigure leftHorizontalBaseDownRectangleBaseDiagram1 = new RectangleFigure();

			leftHorizontalBaseDownRectangleBaseDiagram1.setLineWidth(2);
			leftHorizontalBaseDownRectangleBaseDiagram1.setForegroundColor(ColorConstants.black);
			leftHorizontalBaseDownRectangleBaseDiagram1.setBackgroundColor(ColorConstants.white);
			leftHorizontalBaseDownRectangleBaseDiagram1
					.setMinimumSize(new Dimension(getMapMode().DPtoLP(400), getMapMode().DPtoLP(180)));

			baseDownCanvasDiagram0.add(leftHorizontalBaseDownRectangleBaseDiagram1,
					new Rectangle(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0), getMapMode().DPtoLP(400),
							getMapMode().DPtoLP(180)));
			leftHorizontalBaseDownRectangleBaseDiagram1.setLayoutManager(new XYLayout());

			WrappingLabel costStructureLeftHorizontalBaseDownRectangleBaseDiagram2 = new WrappingLabel();

			costStructureLeftHorizontalBaseDownRectangleBaseDiagram2.setText("Cost Structure");

			costStructureLeftHorizontalBaseDownRectangleBaseDiagram2
					.setFont(COSTSTRUCTURELEFTHORIZONTALBASEDOWNRECTANGLEBASEDIAGRAM2_FONT);

			leftHorizontalBaseDownRectangleBaseDiagram1.add(costStructureLeftHorizontalBaseDownRectangleBaseDiagram2,
					new Rectangle(getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(160),
							getMapMode().DPtoLP(30)));

			fFigureCompartmentLeftHorizontalBaseDownRectangleCanvasDiagram = new RectangleFigure();

			fFigureCompartmentLeftHorizontalBaseDownRectangleCanvasDiagram.setOutline(false);
			fFigureCompartmentLeftHorizontalBaseDownRectangleCanvasDiagram.setFill(false);
			fFigureCompartmentLeftHorizontalBaseDownRectangleCanvasDiagram.setOpaque(false);
			fFigureCompartmentLeftHorizontalBaseDownRectangleCanvasDiagram.setBackgroundColor(ColorConstants.white);

			leftHorizontalBaseDownRectangleBaseDiagram1.add(
					fFigureCompartmentLeftHorizontalBaseDownRectangleCanvasDiagram,
					new Rectangle(getMapMode().DPtoLP(0), getMapMode().DPtoLP(30), getMapMode().DPtoLP(400),
							getMapMode().DPtoLP(150)));
			fFigureCompartmentLeftHorizontalBaseDownRectangleCanvasDiagram.setLayoutManager(new StackLayout());

			RectangleFigure rightHorizontalBaseDownRectangleBaseDiagram1 = new RectangleFigure();

			rightHorizontalBaseDownRectangleBaseDiagram1.setLineWidth(2);
			rightHorizontalBaseDownRectangleBaseDiagram1.setForegroundColor(ColorConstants.black);
			rightHorizontalBaseDownRectangleBaseDiagram1.setBackgroundColor(ColorConstants.white);
			rightHorizontalBaseDownRectangleBaseDiagram1
					.setMinimumSize(new Dimension(getMapMode().DPtoLP(400), getMapMode().DPtoLP(180)));

			baseDownCanvasDiagram0.add(rightHorizontalBaseDownRectangleBaseDiagram1,
					new Rectangle(getMapMode().DPtoLP(400), getMapMode().DPtoLP(0), getMapMode().DPtoLP(400),
							getMapMode().DPtoLP(180)));
			rightHorizontalBaseDownRectangleBaseDiagram1.setLayoutManager(new XYLayout());

			WrappingLabel revenueStreamsLeftHorizontalBaseDownRectangleBaseDiagram2 = new WrappingLabel();

			revenueStreamsLeftHorizontalBaseDownRectangleBaseDiagram2.setText("Revenue Streams");

			revenueStreamsLeftHorizontalBaseDownRectangleBaseDiagram2
					.setFont(REVENUESTREAMSLEFTHORIZONTALBASEDOWNRECTANGLEBASEDIAGRAM2_FONT);

			rightHorizontalBaseDownRectangleBaseDiagram1.add(revenueStreamsLeftHorizontalBaseDownRectangleBaseDiagram2,
					new Rectangle(getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(160),
							getMapMode().DPtoLP(30)));

			fFigureCompartmentRightHorizontalBaseDownRectangleCanvasDiagram = new RectangleFigure();

			fFigureCompartmentRightHorizontalBaseDownRectangleCanvasDiagram.setOutline(false);
			fFigureCompartmentRightHorizontalBaseDownRectangleCanvasDiagram.setFill(false);
			fFigureCompartmentRightHorizontalBaseDownRectangleCanvasDiagram.setOpaque(false);
			fFigureCompartmentRightHorizontalBaseDownRectangleCanvasDiagram.setBackgroundColor(ColorConstants.white);

			rightHorizontalBaseDownRectangleBaseDiagram1.add(
					fFigureCompartmentRightHorizontalBaseDownRectangleCanvasDiagram,
					new Rectangle(getMapMode().DPtoLP(0), getMapMode().DPtoLP(30), getMapMode().DPtoLP(400),
							getMapMode().DPtoLP(150)));
			fFigureCompartmentRightHorizontalBaseDownRectangleCanvasDiagram.setLayoutManager(new StackLayout());

		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureCompartmentLeftLeftVerticalRectangleCanvasDiagram() {
			return fFigureCompartmentLeftLeftVerticalRectangleCanvasDiagram;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureCompartmentLeftVerticalUpRectangleCanvasDiagram() {
			return fFigureCompartmentLeftVerticalUpRectangleCanvasDiagram;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureCompartmentLeftVerticalDownRectangleCanvasDiagram() {
			return fFigureCompartmentLeftVerticalDownRectangleCanvasDiagram;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureCompartmentCenterVerticalRectangleCanvasDiagram() {
			return fFigureCompartmentCenterVerticalRectangleCanvasDiagram;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureCompartmentRightVerticalUpRectangleCanvasDiagram() {
			return fFigureCompartmentRightVerticalUpRectangleCanvasDiagram;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureCompartmentRightVerticalDownRectangleCanvasDiagram() {
			return fFigureCompartmentRightVerticalDownRectangleCanvasDiagram;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureCompartmentRightRightVerticalRectangleCanvasDiagram() {
			return fFigureCompartmentRightRightVerticalRectangleCanvasDiagram;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureCompartmentLeftHorizontalBaseDownRectangleCanvasDiagram() {
			return fFigureCompartmentLeftHorizontalBaseDownRectangleCanvasDiagram;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureCompartmentRightHorizontalBaseDownRectangleCanvasDiagram() {
			return fFigureCompartmentRightHorizontalBaseDownRectangleCanvasDiagram;
		}

	}

	/**
	 * @generated
	 */
	static final Font KEYPARTNERSLEFTLEFTVERTICALRECTANGLECANVASDIAGRAM2_FONT = new Font(Display.getCurrent(),
			"Times New Roman", 12, SWT.ITALIC);

	/**
	 * @generated
	 */
	static final Font KEYACTIVITIESLABELLEFTVERTICALUPRECTANGLECANVASDIAGRAM3_FONT = new Font(Display.getCurrent(),
			"Times New Roman", 12, SWT.ITALIC);

	/**
	 * @generated
	 */
	static final Font KEYRESOURCESLABELLEFTVERTICALDOWNRECTANGLECANVASDIAGRAM3_FONT = new Font(Display.getCurrent(),
			"Times New Roman", 12, SWT.ITALIC);

	/**
	 * @generated
	 */
	static final Font VALUEPROPOSITIONSCENTERVERTICALRECTANGLECANVASDIAGRAM2_FONT = new Font(Display.getCurrent(),
			"Times New Roman", 12, SWT.ITALIC);

	/**
	 * @generated
	 */
	static final Font CUSTOMERRELATIONSHIPSLABELRIGHTVERTICALUPRECTANGLECANVASDIAGRAM3_FONT = new Font(
			Display.getCurrent(), "Times New Roman", 12, SWT.ITALIC);

	/**
	 * @generated
	 */
	static final Font CHANNELSLABELRIGHTVERTICALDOWNRECTANGLECANVASDIAGRAM3_FONT = new Font(Display.getCurrent(),
			"Times New Roman", 12, SWT.ITALIC);

	/**
	 * @generated
	 */
	static final Font CUSTOMERSEGMENTSRIGHTRIGHTVERTICALRECTANGLECANVASDIAGRAM2_FONT = new Font(Display.getCurrent(),
			"Times New Roman", 12, SWT.ITALIC);

	/**
	 * @generated
	 */
	static final Font COSTSTRUCTURELEFTHORIZONTALBASEDOWNRECTANGLEBASEDIAGRAM2_FONT = new Font(Display.getCurrent(),
			"Times New Roman", 12, SWT.ITALIC);

	/**
	 * @generated
	 */
	static final Font REVENUESTREAMSLEFTHORIZONTALBASEDOWNRECTANGLEBASEDIAGRAM2_FONT = new Font(Display.getCurrent(),
			"Times New Roman", 12, SWT.ITALIC);

}
