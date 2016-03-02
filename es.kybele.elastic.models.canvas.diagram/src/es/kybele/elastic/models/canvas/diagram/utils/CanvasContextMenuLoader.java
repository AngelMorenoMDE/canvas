package es.kybele.elastic.models.canvas.diagram.utils;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

import java.util.HashMap;
import java.util.Hashtable;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.PlatformUI;

import es.kybele.elastic.models.canvas.diagram.actions.ExampleStructuredSelectionAction;
import es.kybele.elastic.models.canvas.diagram.edit.parts.utils.CanvasEditPartUtils;

public class CanvasContextMenuLoader {

	Hashtable<String, MenuManager> _menuManagers = null;
	
	IMenuManager _menu = null;
	ISelection _selection = null;
	IStructuredSelection _structuredSelection = null;
	public CanvasContextMenuLoader(IMenuManager menu)
	{
		
		_selection = PlatformUI.getWorkbench()
								.getActiveWorkbenchWindow()
								.getSelectionService()
								.getSelection();
		
		_structuredSelection = (_selection instanceof IStructuredSelection) 
										? (IStructuredSelection) _selection
										: null; 
										
		_menuManagers = new Hashtable<String, MenuManager>();
	}
	
	private IStructuredSelection getSelection()
	{
		return _structuredSelection;
	}
	
	private IMenuManager getMenu()
	{
		return _menu;
	}
	
	private void createMenuManager(String keySearch, MenuManager menu)
	{
		_menuManagers.put(keySearch, menu);
	}
	private void createMenuManagers()
	{
		createMenuManager("edit",new MenuManager("Establecer Color de Fondo")); 
	}
	

	
	private void createExampleAction()
	{ 
		HashMap<String, Color> colors = new HashMap<String, Color>();
		
		
		colors.put("Light Grey", CanvasEditPartUtils.createSWTColor(217,228,217));
		colors.put("Light Red", CanvasEditPartUtils.createSWTColor(246,170,170));
		colors.put("Light Orange", CanvasEditPartUtils.createSWTColor(253,190,122));
		colors.put("Light Yellow", CanvasEditPartUtils.createSWTColor(244,246,200));
		colors.put("Light Purple", CanvasEditPartUtils.createSWTColor(213,213,247));
		colors.put("Light Pink", CanvasEditPartUtils.createSWTColor(246,206,245));
		colors.put("Light Blue", CanvasEditPartUtils.createSWTColor(148,223,246));
		colors.put("Light Green", CanvasEditPartUtils.createSWTColor(169,245,169));
		
		for(String _key: colors.keySet())
		{
			_menuManagers.get("edit").add(new ExampleStructuredSelectionAction(_structuredSelection, _key, colors.get(_key)));	
		}
		
		
	}
	
	public void load()
	{
		createMenuManagers();		
		createExampleAction();
		for(MenuManager _menuItem : _menuManagers.values())
		{
			_menu.appendToGroup("rootTools",_menuItem);
		}
	}
}
