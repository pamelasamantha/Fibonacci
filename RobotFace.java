package week2;

import acm.graphics.*;
import java.awt.*;
import acm.program.*;

/**This program displays a graphical gray robot with yellow eyes 
 * and white mouth using constants HEAD_WIDTH, HEAD_HEIGHT,
 * EYE_RADIUS, MOUTH_WIDTH AND MOUTH_HEIGHT
 * @author Pamela
 */



public class RobotFace extends GraphicsProgram {
	
		/*Measurements of the width and height for the robot's face*/
		private static final int HEAD_WIDTH = 200;
		private static final int HEAD_HEIGHT = 300;
		
		/*Measurement for the robot's circular eyes*/
		private static final int EYE_RADIUS = 50;
		
		/*Measurement of the width and height for the robot's mouth*/
		private static final int MOUTH_WIDTH = 150;
		private static final int MOUTH_HEIGHT = 40;
		
		
		public void run () {
			robotFace();
			leftEye();
			rightEye();
			mouth();
		}
			
			/*Robot's gray face with black outline*/
			private void robotFace() {
			GRect robotFace = new GRect(250, 50, HEAD_WIDTH, HEAD_HEIGHT);
			add(robotFace);
			robotFace.setFilled(true);
			robotFace.setFillColor(Color.GRAY);
			}
			
			
			/*Robot's yellow left eye */
			private void leftEye() {
			GOval leftEye = new GOval(EYE_RADIUS, 50 );
			leftEye.setFilled(true);
			leftEye.setFillColor(Color.YELLOW);
			add(leftEye);
			leftEye.setLocation(275, 100);
			}
			
			/*Robot's yellow right eye */ 
			private void rightEye() {
			GOval rightEye = new GOval(EYE_RADIUS, 50 );
			rightEye.setFilled(true);
			rightEye.setFillColor(Color.YELLOW);
			add(rightEye);
			rightEye.setLocation(375, 100);
			}
			
			/*Robot's white mouth*/
			private void mouth() {
			GRect mouth = new GRect (300, 70, MOUTH_WIDTH, MOUTH_HEIGHT); 
			mouth.setFilled(true);
			mouth.setFillColor(Color.WHITE);
			add(mouth);
			mouth.setLocation(275, 250);
			}
					
	}




			