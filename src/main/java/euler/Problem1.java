package euler;

public class Problem1
{
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

    public static void main(String[] args)
    {
        System.out.println("Hello world.");
        int sum = sumOfMultiplesOf3Or5(1000);
        System.out.println(sum);

    }

    static int sumOfMultiplesOf3Or5(int limit)
    {
        int sum = 0;
        int sum3 = 0;
        int sum5 = 0;
        for (int i = 0; i < limit; i++)
        {
            if (i % 3 == 0)
            {
                sum3 = sum3 + i;
                continue;
            }
            
            if (i % 5 == 0)
            {
                sum5 = sum5 + i;
                continue;
            }
        }
        sum = sum3 + sum5;
        return sum;
    }
}
