package es.kybele.elastic.models.canvas.diagram.edit.parts.wizards;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;

import es.kybele.elastic.models.canvas.CanvasAnnotation;
import es.kybele.elastic.models.canvas.diagram.edit.parts.listeners.SetChangesCanvasAnnotation;
import es.kybele.elastic.models.canvas.diagram.edit.parts.utils.CanvasEditPartUtils;

public class CanvasMultiLineEditor {

	protected EditPart _editPart = null;
	
	public CanvasMultiLineEditor(EditPart editPart)
	{
		_editPart = editPart;
	}
	
	public void open()
	{
		Shell parent = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
				.getActivePage().getActiveEditor().getSite().getShell();
		Shell childShell = new Shell(parent, SWT.SYSTEM_MODAL | SWT.CLOSE);
		childShell.setSize(250, 350);
		Point pSize = new Point(childShell.getSize().x, childShell.getSize().y);
		Point pCenter = CanvasEditPartUtils.calculateCenterLocationForShell(parent, pSize);
		childShell.setLocation(pCenter.x, pCenter.y);
		System.out.println(parent.getSize());
		
		
		RowLayout rowLayout = new RowLayout();
		rowLayout.marginLeft = 5;
		rowLayout.marginRight = 5;
		rowLayout.fill = true;
		rowLayout.type = SWT.VERTICAL;
		rowLayout.justify = true;
		childShell.setLayout(rowLayout);
		
		EObject _eobject = ((View) _editPart.getModel()).getElement();
		String contentAnnotation = "";
		if (_eobject instanceof CanvasAnnotation)
		{
			CanvasAnnotation annotation = (CanvasAnnotation) _eobject;
			contentAnnotation = (annotation.getContent()== null) ? "<Introduce\nyour\nAnnotation>" : annotation.getContent();
		}
		
		Label label = new Label(childShell, SWT.BOLD);
		label.setText("Introduzca el texto de la anotación");
		label.setLayoutData(new RowData(220, 20));
		
		Text text = new Text(childShell, SWT.MULTI);
		text.setLayoutData(new RowData(220, 200));
		text.setText(contentAnnotation);
		Button buttonAccept = new Button(childShell, SWT.PUSH);
		buttonAccept.setText("Guardar Anotación");
		buttonAccept.setLayoutData(new RowData(220, 30));
		
		Button buttonCancel = new Button(childShell, SWT.PUSH);
		buttonCancel.setText("Cancelar");
		buttonCancel.setLayoutData(new RowData(220, 30));
		
		
		
		buttonAccept.addSelectionListener(new SetChangesCanvasAnnotation((CanvasAnnotation) _eobject, text, childShell));
		buttonCancel.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				childShell.close();
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				childShell.close();
			}
		});
		childShell.open();
	}
}
