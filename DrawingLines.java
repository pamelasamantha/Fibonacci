package week2;

import java.awt.event.MouseEvent;
import acm.program.*;
import acm.graphics.*;
import acm.program.GraphicsProgram;

/**This program displays a starting point for a line
 * following the mouse start and end location 
 * @author Pamela
 */

public class DrawingLines extends GraphicsProgram {
	
	public void init() {
		addMouseListeners();
	}
	
	/*Starts the line when mouse is pressed*/
	public void mousePressed(MouseEvent point) {
		movingLine = new GLine(point.getX(), point.getY(), point.getX(), point.getY());
		add(movingLine);
	}
	
	/*Drags the line following the mouse location*/
	public void mouseDragged(MouseEvent point) {
		movingLine.setEndPoint(point.getX(), point.getY());
	}
	
	//Private instance variable for moving line 
	private GLine movingLine;

}
