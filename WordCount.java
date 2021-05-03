package week4;

import java.io.*;
import acm.program.ConsoleProgram;
import acm.util.ErrorException;

/**This program reads a file and reports how many lines, 
 * words, and characters appear in it. 
 * @author Pamela
 *
 */


public class WordCount extends ConsoleProgram {
	//Error exception for opening file 
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
		//Initializer for characters, words and lines 
		int charCount = 0;
		int wordCount = 0;
		int lineCount = 0;
		
		
			BufferedReader rd = openFile("File: ");
				//Counter
				try {
					while(true) {
						String line = rd.readLine();
						if (line == null) break;
						while(line !=null) {
						lineCount++;
						String[] words = line.split(" ");
						wordCount +=words.length;
						for (String word : words) {
							charCount += word.length();
						}
						line = rd.readLine();
						
						//Display characters, words and lines with counter
						System.out.println("chars = " + charCount);
						System.out.println("words = " + wordCount);
						System.out.println("lines = " + lineCount);
					
						
						println("Read Line: [" + line + "]");
					}
					rd.close();
				}
				}catch (IOException ex) {
					throw new ErrorException(ex);
				}
	
	}
	
}
				
					
					
					
			

