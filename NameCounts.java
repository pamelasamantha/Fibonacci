package week4;

import acm.program.ConsoleProgram;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

/**This program displays how many times a name
 * is entered by the user 
 * @author Pamela
 */

public class NameCounts extends ConsoleProgram {
	
	
	
	public void run() {
		
		Map<String, Integer> nameCount = new HashMap<>();
		Scanner scanner =  new Scanner(System.in);
		
		//Gets names until user enters blank line  
		while(true) {
			System.out.print("Enter a name: ");	
			String name = scanner.nextLine();
			if (" ".equals(name)) {
				break;
			}
			//Counter for names 
			if (nameCount.containsKey(name)) {
				int count = nameCount.get(name);
				nameCount.put(name, count + 1); 
			} else {
				nameCount.put(name, 1); 
			}
		}
			//Displays each unique name with the counter number 
			for(Map.Entry<String, Integer> nc: nameCount.entrySet()) {
				System.out.println("Entry [ " + nc.getKey()+ " ] has count" + nc.getValue() );
			}
	}
	
}

		
	
	
	
	
	

	

	
	
	