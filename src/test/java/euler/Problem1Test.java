package euler;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem1Test {

	/**
	 * Multiples of 3 and 5
	 * 
	 * Problem 1
	 * 
	 * If we list all the natural numbers below 10 that are multiples of 3 or 5,
	 * we get 3, 5, 6 and 9. The sum of these multiples is 23.
	 * 
	 * Find the sum of all the multiples of 3 or 5 below 1000.
	 * 
	 * Answer: 233168
	 * 
	 */

	@Test
	public void test() {
		int sum = Problem1.sumOfMultiplesOf3Or5(1000);
		assertEquals("sum does not match", 233168, sum);
	}

}
