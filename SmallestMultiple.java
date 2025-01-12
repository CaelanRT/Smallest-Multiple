package smallestmultiple;

public class SmallestMultiple {
	/**
	 * instance variables for my SmallestMultple class
	 */
	final static int MAX = 20;
	public boolean isDivisible = false;
	
	
	/**
	 * no arg constructor
	 */
	SmallestMultiple () {
		
	}
	
	/**
	 * method isDivisible checks to see if a given number is divisible by all numbers from 11 to 20 inclusive, and then returns a true value if so
	 * @param number takes a number from the driver class
	 * @return returns a boolean value when the number is divisible by all numbers from 11 to 20 inclusive
	 */
	public boolean isDivisible (int number) {
		int divisibleCounter = 0;
		for (int i = 11; i <= MAX; ++i) {
			if (number % i == 0) {
				divisibleCounter += 1;
			}
		}
		
		
		if (divisibleCounter == 10) {
			isDivisible = true;
		}
		
		System.out.println(isDivisible);
		
		return isDivisible;
	}
		
		
	
}
