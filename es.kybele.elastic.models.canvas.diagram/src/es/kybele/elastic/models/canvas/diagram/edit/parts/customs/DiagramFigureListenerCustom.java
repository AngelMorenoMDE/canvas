package es.kybele.elastic.models.canvas.diagram.edit.parts.customs;

import org.eclipse.draw2d.FigureListener;
import org.eclipse.draw2d.IFigure;


import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.impl.NodeImpl;
import org.eclipse.swt.graphics.RGB;

import es.kybele.elastic.models.canvas.diagram.edit.parts.CanvasBusinessModelEditPart;
import es.kybele.elastic.models.canvas.diagram.edit.parts.CanvasDiagramEditPart;

public class DiagramFigureListenerCustom implements FigureListener {

	CanvasBusinessModelEditPart _diagram = null;

	public DiagramFigureListenerCustom(CanvasBusinessModelEditPart diagram)
	{
		_diagram = diagram;
	}
	
	@Override
	public void figureMoved(IFigure source) 
	{
				if (_diagram.getChildren().size() > 0)
				{
					Object _child = (Object) _diagram.getChildren().get(0);
					if (_child instanceof CanvasDiagramEditPart)
					{
						CanvasDiagramEditPart _childEditPart = (CanvasDiagramEditPart) _child;
						NodeImpl _nodeImpl =  (NodeImpl)_childEditPart.getModel();
						new ENotificationImpl((InternalEObject) _nodeImpl.getElement(), ENotificationImpl.SET, NotationPackage.eINSTANCE.getSize_Width(), -1, _diagram.getFigure().getBounds().width);
						new ENotificationImpl((InternalEObject) _nodeImpl.getElement(), ENotificationImpl.SET, NotationPackage.eINSTANCE.getSize_Height(), -1, _diagram.getFigure().getBounds().height);
						Rectangle _parent = _diagram.getFigure().getBounds();
						float relation = 0.9f;
						_parent.height = (int) (_parent.height * relation);
						_parent.width = (int) (_parent.width * 0.95);						
						_parent.x = _parent.x +20;
						_parent.y = _parent.x +20;
						_diagram.setLayoutConstraint(_childEditPart, _childEditPart.getFigure(), _parent);
					}
					
				}

			
		
	}

}
