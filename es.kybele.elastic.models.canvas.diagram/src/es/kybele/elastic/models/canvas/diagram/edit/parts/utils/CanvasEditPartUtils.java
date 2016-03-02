package es.kybele.elastic.models.canvas.diagram.edit.parts.utils;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class CanvasEditPartUtils 
{

	/**
	 * This function get the centered location of a window (ex. a Shell) from the size
	 * of the display passed as argument
	 * @param display The display instance of the application
	 * @param sizeWindow The size of the window than want to center
	 * @return Point The centered location (as Point) of a Window Size passed as argument
	 */
	public static Point calculateCenterLocationForShell(Shell shell, Point sizeWindow)
	{
		// Create a new point
		Point calculatedPoint = new Point(0, 0);
		
		// Calculate the middle of the display
		int middleHorizontalDisplay = shell.getBounds().width / 2;
		int middleVerticalDisplay = shell.getBounds().height / 2;
		
		// Calculate the centered position by the size of the display and the window to center
		calculatedPoint.x = middleHorizontalDisplay - (sizeWindow.x/2);
		calculatedPoint.y = middleVerticalDisplay - (sizeWindow.y/2);
		
		// Return the centered point
		return calculatedPoint;
	}
	
	public static Color createSWTColor(int r, int g, int b)
	{
		return new Color(Display.getCurrent(), r, g, b);
	}
}
