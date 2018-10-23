/**
 * INSTRUCTIONS.
 * 
 * The following exercises are, perhaps, more mathematically inclined than previous
 * problem sets. While they might be challenging, they are certainly doable.
 * 
 * You can (and should!) solve each of them using only the operators, conditional control
 * structures, and iterative control structures we've covered. You are not permitted to use
 * recursive code in your solutions.
 * 
 * Please be mindful of the expected outputs, as your code will be tested against that
 * directly. If you're unsure, please ask for clarification.
 * 
 * This problem set is worth 25 points and is due no later than 11:59pm on October 28, 2018.
 */

public class ProblemSet3_5 {
	
	public static void main(String[] args) {
		ProblemSet3_5 ps = new ProblemSet3_5();
		ps.primes(1, 1000);
		ps.leapYears(5);
		ps.palindromicNumbers(23);
	}
	
	/**
	 * How many prime numbers are there between @start and @end, where @start and @end
	 * are positive integers in the range [1, @Integer.MAX_VALUE]?
	 * 
	 * Print your solution in the following formats: "There is X prime number."
	 *                                               "There are X prime numbers."
	 * 
	 * @param start
	 * @param end
	 */
	
	public void primes(int start, int end) {
		if (start < 0) {
			System.out.println("Please enter a new starting value greater than 1");
		}
		if (end > Integer.MAX_VALUE) {
			System.out.println("Please enter a new ending value less than " + Integer.MAX_VALUE);
		}
		int count = 0;
		for (int i = 0; i <= end; i++) {
			if (isPrime(start + i) && ((start + i) < end)) {
				count++;
			}
		}
		System.out.println("There is " + count + " prime numbers.");
	}
	
	public boolean isPrime(int n) {
		if (n == 1) {
			return false;
		} else if (n % 2 == 0 && n != 2) {
			return false;
		} else if (n % 3 == 0 && n != 3) {
			return false;
		} else if (n % 5 == 0 && n != 5) {
			return false;
		} else if (n % 7 == 0 && n != 7) {
			return false;
		} else if (n % 11 == 0 && n != 11) {
			return false;
		} else if (n % 13 == 0  && n != 13) {
			return false;
		} else if (n % 17 == 0 && n != 17) {
			return false;
		} else if (n % 19 == 0 && n != 19) {
			return false;
		} else if (n % 23 == 0 && n != 23) {
			return false;
		} else if (n % 29 == 0 && n != 29) {
			return false;
		} else if (n % 31 == 0 && n != 31) {
			return false;
		} else if (n % 37 == 0 && n != 37) {
			return false;
		} else if (n % 41 == 0 && n != 41) {
			return false;
		} else if (n % 43 == 0 && n != 43) {
			return false;
		} else if (n % 47 == 0 && n != 47) {
			return false;
		} else {
			return true;
		}
	}
	
	/**
	 * What are the next @count leap years?
	 * 
	 * Print your solution in the following formats: "The next leap year is X."
	 *                                               "The next 2 leap years are X and Y."
	 *                                               "THe next N leap years are A, ..., X, Y, and Z."
	 * 
	 * @param count
	 */
	
	public void leapYears(int count) {
		int newLeapYear = 2020;
		if (count == 1) {
			System.out.println("The next leap year is 2020");
		} else if (count == 2) {
			System.out.println("The next leap year is 2020 and 2024");
		} else {
			System.out.print("The next " + count + " leap years are " + newLeapYear + ", ");
			for (int i = 2; i < count; i++) {
				newLeapYear += 4;
				System.out.print(newLeapYear + ", ");
			}
			newLeapYear += 4;
			System.out.print("and " + newLeapYear + ".\n");
		}
	}
	
	/**
	 * Is @number a palindromic number?
	 * 
	 * Print your solution in the following formats: "X is a palindromic number."
	 *                                               "X is not a palindromic number."
	 *                                               
	 * @param number
	 */
	
	//Something is wrong with this one VV
	public void palindromicNumbers(int number) {
		String num = "" + number;
		for (int i = 0; i < num.length(); i++) {
			if (num.charAt(i) != num.charAt(num.length() - i)) {
				System.out.println(num + " is not a palindromic number.");
			}
		}
	}
	
	/**
	 * What is the @nth Fibonacci number, where @n is a positive integer?
	 * 
	 * Print your solution in the following formats: "The 21st Fibonacci number is X."
	 *                                               "The 22nd Fibonacci number is X."
	 *                                               "The 23rd Fibonacci number is X."
	 *                                               "The 24th Fibonacci number is X."
	 *                                               
	 * @param n
	 */
	
	public void fibonacci(int n) {
		
	}
	
	/**
	 * What is the sum of all multiples of @x and @y less than @limit, where @x, @y, and
	 * @limit are positive integers?
	 * 
	 * Print your solution in the following format: "The sum of all multiples of X and Y less than LIMIT is Z."
	 * 
	 * @param limit
	 */
	
	public void multiples(int x, int y, int limit) {
		
	}
}
