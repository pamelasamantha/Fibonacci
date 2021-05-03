package week4;
import java.util.*;
import java.io.*;

import acm.program.ConsoleProgram;

public class Histograms extends ConsoleProgram {
	
	
	private BufferedReader openFile(String prompt) {
		BufferedReader rd = null;
		while(rd == null) {
			try {
				String filename = readLine(prompt);
				rd = new BufferedReader(new FileReader(filename));
			} catch (IOException ex) {
				println("That file doesn't exist");
			}
		}
		return rd;
	}
	
	
	
	public void run() {
		
		drawHistogram();
		getScores();
		finalHistogram();
		
			BufferedReader rd = openFile("File: ");
	
	}

	private void finalHistogram() {
		
		
	}



	private void drawHistogram() {
		for (int range = 0; range <= 10; range++) {
		String label;
		switch (range) {
			 case 0: label = "00-09"; break;
			 case 10: label = " 100"; break;
			 default: label = (10 * range) + "-" + (10 * range + 9);
			 break;
			 }
			 String[] Stars = {" 1-10 |", "11- 20 | ", "21- 30 | ", "31- 40 | ", "41- 50 | ",
				        "51- 60 | ", "61- 70 | ", "71- 80 | ", "81- 90 | ", "91-100 | "};
			 }
	} 

	

	private String getScores() {
			 String stars = "";
			 for (int i = 0; i < 10; i++) {
				 System.out.println(stars[i]);
			 }
	}
	
}

		
		
  

