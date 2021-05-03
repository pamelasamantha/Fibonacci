package week4;

import acm.program.GraphicsProgram;
import acm.graphics.GImage;
/**This program reverses the picture 
 * in the horizontal dimension.
 * @author Pamela
 */

public class ImageProcessing extends GraphicsProgram {


public void run () {
	//Reads the image to position it in the canvas horizontally
	GImage image = new GImage("images.JPEG");
	GImage flipHorizontalImage = createFlipHorizontalImage(image);
	
	flipHorizontalImage.scale(1.0);
	
	add(flipHorizontalImage, 200, 50);

		
	}

    //Uses arrays to flip the image horizontally 
	private GImage createFlipHorizontalImage(GImage image) {
		int [][] array = image.getPixelArray();
		int height = array.length;
		int [][] newarray = new int[height][];
		for (int x = 0; x < height; x++) {
			int width = array[x].length;
			newarray[x] = new int [width];
			for (int y = 0; y < width; y++) {
				int pixel = array[x][y];
				newarray[x][width-y-1] = pixel; 
			}
		}
		
		
		GImage newimage = new GImage(newarray);
		return newimage;
		
		
	}

}
	

