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
		ps.primes(1,100);
		ps.leapYears(3);
		ps.palindromicNumbers(232);
		ps.fibonacci(3);
		ps.multiples(2,4,10);
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
		for (int i = start; i <= end; i++) {
			if (isPrime(i)) {
				count++;
			}
		}
		System.out.println("There is " + count + " prime numbers.");
	}
	
	public boolean isPrime(int n) {
		boolean verdict = (n > 1) ? true : false;
		for (int i = 2; i <= Math.pow(n, 0.5); i++) {
			if (n % i == 0) {
				verdict = false;
			} 
		}
		if (verdict ) {
			return true;
		} else {
			return false;
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
		if (count <= 0) {
			System.out.println("I don't know how to compute the next " + count + " leap years...");
		} else {
			int newLeapYear = 2020;
			if (count == 1) {
				System.out.println("The next leap year is 2020.");
			} else if (count == 2) {
				System.out.println("The next leap year is 2020 and 2024.");
			} else {
				System.out.print("The next " + count + " leap years are " + newLeapYear + ", ");
				for (int i = 2; i < count; i++) {
					newLeapYear += 4;
					if (newLeapYear % 100 == 0 || newLeapYear % 400 == 0) {
						newLeapYear += 4;
					}
					System.out.print(newLeapYear + ", ");
				}
				newLeapYear += 4;
				System.out.print("and " + newLeapYear + ".\n");
			}
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
	
	public void palindromicNumbers(int number) {
		int temp = number;
		int a = 0;
		int x = 0;
		while (number > 0) {
			x = number % 10;
			a = a * 10 + x;
			number = number / 10;
		}
		if (temp == a) {
			System.out.println(temp + " is a palindromic number.");
		} else {
			System.out.println(temp + " is not a palindromic number.");
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
		if (n < 0) {
			System.out.println("Please enter a positive integer.");
		} else {
			long a = 1;
			long b = 1;
			long sum = 1;
			for (int i = 2; i < n; i++) {
				sum = a + b;
				a = b;
				b = sum;
			}
			if ((n % 10) == 1) {
				System.out.println("The " + n + "st Fibonacci number is " + sum + ".");
			} else if ((n % 10) == 2) {
				System.out.println("The " + n + "nd Fibonacci number is " + sum + ".");
			} else if ((n % 10) == 3) {
				System.out.println("The " + n + "rd Fibonacci number is " + sum + ".");
			} else {
				System.out.println("The " + n + "th Fibonacci number is " + sum + ".");
			}
		}
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
		long sum = 0;
		if (x < 0 || y < 0 || limit < 0) {
			System.out.println("Please enter all positive integers");
		} else {
			for (int i = 1; i < limit; i++) {
				if (i % x == 0 || i % y == 0) {
					sum += i;
				}
			}
			System.out.println("The sum of all multiples of " + x + " and " + y + " less than " + limit + " is " + sum + ".");
		}
	}
}
