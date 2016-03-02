package es.kybele.elastic.models.canvas.diagram.edit.parts.listeners;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.draw2d.MouseEvent;
import org.eclipse.draw2d.MouseListener;

import es.kybele.elastic.models.canvas.diagram.edit.parts.wizards.CanvasMultiLineEditor;

public class DoubleClickEditPartMouseListener implements MouseListener {

	protected EditPart _ep = null; 
	protected long _lclk = System.currentTimeMillis();
	protected WrappingLabel _l = null;
	
	
	public DoubleClickEditPartMouseListener(EditPart editPart, WrappingLabel label) {
		
		_ep = editPart;
		_l = label;
	}

	public void mousePressed(MouseEvent me) {
		long actClk = System.currentTimeMillis();

		if ((actClk - _lclk)<1000)
		{						
			new CanvasMultiLineEditor(_ep).open();
		}
		_l.setFocus(false);
		_lclk = actClk;
	}
	
	public void mouseReleased(MouseEvent me) {
		_lclk = System.currentTimeMillis();
		_l.setFocus(false);
	}
	
	public void mouseDoubleClicked(MouseEvent me) {
		_lclk = System.currentTimeMillis();
		_l.setFocus(false);
	}

}
