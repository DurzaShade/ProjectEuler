package euler;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem3Test {

	/**
	 * Largest prime factor
	 * 
	 * Problem 3
	 * 
	 * The prime factors of 13195 are 5, 7, 13 and 29.
	 * 
	 * What is the largest prime factor of the number 600851475143 ?
	 * 
	 * Answer: 6857
	 * 
	 * @author neonx_000
	 *
	 */

	@Test
	public void test() {
		// find the closest square root of input
		long input_number = 600851475143L;
		int mpf = Problem3.get_largest_prime_factor_of_input(input_number);

		assertEquals("expected value does not match", 6857, mpf);
	}
}
