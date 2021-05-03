package week4;

import java.util.ArrayList;

/**This program displays a list of all the names that were
 * entered by the user both once and multiple times. 
 * @author Pamela
 * 
 */

import acm.program.ConsoleProgram;

public class UniqueNames extends ConsoleProgram {
	
	public void run() {
		//Gets names until user enters a blank line
		ArrayList<String>nameList = new ArrayList<String>();
		while(true) {  
			String line = readLine("Enter name: ");  
			if (line.equals(" ")) break; 
				if (!nameList.contains(line)) { //Duplicate names are not added to the list 
				nameList.add(line); 
			}
		} 
		//Displays all the unique names, one per line 
		for (int i =0; i < nameList.size(); i++) {  
			println("Unique name list contains: "); 
			println (nameList.get(i));
			}
		
	
		}
	
		
	}

	
	

