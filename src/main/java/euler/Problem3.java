package euler;

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

public class Problem3 {

	public static void main(String[] args) {

		// find the closest square root of input
		long input_number = 600851475143L;
		int mpf = get_largest_prime_factor_of_input(input_number);

		System.out.println(mpf);
	}

	static int get_largest_prime_factor_of_input(long input_number) {
		int sqrt_of_input_number = get_closest_sqrt(input_number);
		// System.out.println(sqrt_of_input_number);

		// find all primes less than square root of input
		boolean[] primes = get_primes_less_than_input(sqrt_of_input_number);

		// get the largest prime factor of input
		int mpf = get_largest_prime_factor(input_number, primes);
		return mpf;
	}

	private static int get_largest_prime_factor(long input_number, boolean[] primes) {
		int mpf = 0;
		for (int i = 2; i < primes.length; i++) {
			if (primes[i] == true) {
				if (input_number % i == 0) {
					if (mpf < i)
						mpf = i;
					else
						i--;
					input_number = input_number / i;
				}

			}
		}
		return mpf;
	}

	private static int get_closest_sqrt(long input_number) {
		long x;
		for (x = 1; x * x <= input_number; x++) {

			if (x * x >= input_number)
				break;

			else
				continue;
		}
		return (int) x;
	}

	private static boolean[] get_primes_less_than_input(int limit) {

		// initialize the array
		boolean[] primes = new boolean[limit];

		for (int i = 0; i < limit; i++) {
			primes[i] = true;
		}

		// sieve of eratosthenes algorithm
		for (int i = 2; i < limit; i++) {

			// skip numbers already marked as composite
			if (primes[i] == false)
				continue;

			// mark the multiples as composite
			for (int j = 2; i * j < limit; j++) {

				if (i * j > limit) {
					break;

				} else
					primes[i * j] = false;

			}
			// System.out.println(i);
		}

		// all the primes are marked in the array.
		// return the array.
		return primes;
	}
}
