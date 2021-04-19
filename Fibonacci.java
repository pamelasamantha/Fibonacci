package week2;

import acm.program.*;

/**The program displays the Fibonacci sequence up to 
 * where every subsequent term is the sum of the preceding 
 * two terms up until the 
 * MAX_TERM_VALUE = 10,000
 * @author Pamela
 */


public class Fibonacci extends ConsoleProgram {
	
	private static final int MAX_TERM_VALUE = 10000;
	

	
	public void run() {
		int firstFib = 0;
		int secondFib = 1;
	
	
	
	while (firstFib < MAX_TERM_VALUE) {
		System.out.println(firstFib); 
		int sum = firstFib + secondFib;
		firstFib = secondFib; 
		secondFib = sum; 
		
	}
	
		
		
	}
	

}





