package es.kybele.elastic.models.canvas.diagram.actions;

import java.awt.Color;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.util.StringStatics;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.DiagramColorConstants;
import org.eclipse.gmf.runtime.diagram.ui.internal.properties.Properties;
import org.eclipse.gmf.runtime.diagram.ui.requests.ChangePropertyValueRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.notation.FillStyle;
import org.eclipse.gmf.runtime.notation.LayoutConstraint;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Style;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.datatype.GradientData;
import org.eclipse.gmf.runtime.notation.impl.NodeImpl;
import org.eclipse.gmf.runtime.notation.impl.ShapeImpl;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.graphics.RGB;

import es.kybele.elastic.models.canvas.diagram.edit.parts.CanvasAnnotationEditPart;

public class ExampleStructuredSelectionAction extends Action {
	
	IStructuredSelection _structuredSelection = null;
	EditPart _editPart = null;
	RGB _colorRGB = null;
    public ExampleStructuredSelectionAction(IStructuredSelection structuredSelection, String _colorName, org.eclipse.swt.graphics.Color _color) 
    {     	
    	super("Change Color to "+_colorName);   
    	_colorRGB = _color.getRGB();
    	_structuredSelection = structuredSelection;
    	if(_structuredSelection.getFirstElement() instanceof EditPart)
    	{
    		_editPart = (EditPart) _structuredSelection.getFirstElement();
    	}
    } 

    @Override 
    public void run() { 
        
		if (_editPart instanceof ShapeNodeEditPart)
		{
			ShapeNodeEditPart _annotation = (ShapeNodeEditPart) _editPart;
			
			
			
			NodeImpl _nodeImpl =  (NodeImpl)_annotation.getModel(); 
		
			
			AbstractTransactionalCommand command = new AbstractTransactionalCommand(((IGraphicalEditPart) _editPart).getEditingDomain(), StringStatics.BLANK, null) {
				
				@Override
				protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
						IAdaptable info) throws ExecutionException {

					if (_nodeImpl.getStyle(NotationPackage.eINSTANCE.getFillStyle()) != null)
					{
						((FillStyle) _nodeImpl.getStyle(NotationPackage.eINSTANCE.getFillStyle())).setFillColor(new RGB(_colorRGB.red, _colorRGB.green, _colorRGB.blue).hashCode());
						_annotation.refresh();  
						_annotation.deactivate();
						_annotation.activate();
					}

						else
						{
							FillStyle _fs = NotationFactory.eINSTANCE.createFillStyle();
							_fs.setFillColor(new RGB(_colorRGB.red, _colorRGB.green, _colorRGB.blue).hashCode());
							_nodeImpl.getStyles().add(_fs);
							_annotation.refresh();  
							_annotation.deactivate();
							_annotation.activate();
						}				


			        return CommandResult.newOKCommandResult();

				}
			};

					try 
					{
					command.execute(new NullProgressMonitor(), null);
					} 
					catch (ExecutionException e) 
					{
					}
		}
		
            

    }  
}
