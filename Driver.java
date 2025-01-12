package smallestmultiple;

/**
 * this is my driver class for the program
 */
public class Driver {
	
	/**
	 * method main
	 * @param args no arguments
	 */
	public static void main (String [] args) {
		SmallestMultiple sm = new SmallestMultiple();
		int finalOutput = 0;
		int number = 232792560;
		boolean loopControl = false;
		
		while (loopControl == false) {
			boolean loopTwo = sm.isDivisible(number);
			finalOutput = number;
			++number;
			loopControl = loopTwo;
		}
		
		System.out.println(finalOutput);
		
		}
	}

