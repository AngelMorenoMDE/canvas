package es.kybele.elastic.models.canvas.diagram.edit.parts.listeners;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import es.kybele.elastic.models.canvas.CanvasAnnotation;

public class SetChangesCanvasAnnotation implements SelectionListener {

	protected CanvasAnnotation _canvasAnnotation = null;
	protected Shell _parentShell = null;
	protected Text _textContent = null;
	
	public SetChangesCanvasAnnotation(CanvasAnnotation canvasAnnotation, Text textContent, Shell parentShell) 
	{
		_canvasAnnotation = canvasAnnotation;
		_parentShell = parentShell;
		_textContent = textContent;
		
	}
	
	@Override
	public void widgetSelected(SelectionEvent e) {
		// TODO Auto-generated method stub
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(_canvasAnnotation);
		domain.getCommandStack().execute(new RecordingCommand(domain)
		{
		    @Override
		    protected void doExecute() 
		    {
		    	_canvasAnnotation.setContent(_textContent.getText());
		    	_parentShell.close();
		    }
		});
	}

	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
		// TODO Auto-generated method stub

	}

}
