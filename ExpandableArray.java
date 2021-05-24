package week6;
import acm.program.ConsoleProgram;


/*This class provides methods for working wtih an array that 
 * expands to include any positive index value supplied 
 * by the caller 
 *
 */

public class ExpandableArray extends ConsoleProgram {
	
	
	//private instance variable
	private int [] array; 
	
	
	
	//Constructor
	public ExpandableArray() {
		array = new int [10]; //initial size 
	}

	
	
	/*Sets the element at the given index position to the specified
	 * value. If the interval array is not large enough to 
	 * contain that element, the implementation expands the array 
	 * to make room.
	 * Index must be greater than or equal to zero 
	 */
	public void set (int index, Object value) { //need to change it to Object value 
		if(index > array.length) { //index is out of bounds
			int [] newArray = new int[index + 1]; //create new int array 
			for (int i = 0; i <array.length; i++) {
				newArray[i] = array[i]; //copy old array into new array 
			}
			array = newArray; //array will be garbage collected 
		}
		array[index] = (int) value; //cast int 
		
		
	}
	
	/*Returns the element at the specified index position, 
	 * or null if no such element exists. Note that this method
	 * never throws an out-of-bounds exception; if the index is
	 * outside the bounds of the array, the return value 
	 * is simply null.
	 */
	public Object get(int index) {
		if (index >= array.length) return null;
		return array[index];
		
	}
	
	
	public String toString() {
		String result = "";
		for (int i = 0; i <array.length; i++) {
			result += i + " " + array[i] +  "\n"; //to display array index as well 
		}
		return result;
	}
	
	public void run() {
		ExpandableArray e = new ExpandableArray();
		e.set(0, 2);
		e.set(5, 5);
		e.set(9, 9);
		e.set(40,40);
		System.out.println(e);
		
		
	}
}
