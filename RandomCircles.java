package week2;

import java.awt.Color;

/**This program displays 10 circles on the screen 
 * with each having a random size, color and location
 * @author Pamela
 */

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;
import acm.util.*;

public class RandomCircles extends GraphicsProgram {
	
	
	//Total circles for the program is set to 10 
	private static final int RCIRCLES = 10;
	//minimum radius for circle
	private static final int MIN_RADIUS = 5;
	//maximum radius for circle
	private static final int MAX_RADIUS = 50;
	//instance variables for Random Generator
	private RandomGenerator rgen = RandomGenerator.getInstance();
	

	
	public void run() {
		

			for (int i = 0; i <RCIRCLES; i++) {
				
				double r = rgen.nextDouble(MIN_RADIUS, MAX_RADIUS);
				double y = rgen.nextDouble(0, 400);  
				double x = rgen.nextDouble(0, 400);    
				
					
			GOval newCircles = new GOval (x, y, 2 * r, 2* r);
			newCircles.setColor(rgen.nextColor());
			newCircles.setFilled(true);
			add(newCircles);
		}
		
	}

}
