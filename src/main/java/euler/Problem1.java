package euler;

public class Problem1
{

    public static void main(String[] args)
    {
        System.out.println("Hello world.");
        int sum = sumOfMultiplesOf3Or5(1000);
        System.out.println(sum);

    }

    private static int sumOfMultiplesOf3Or5(int limit)
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
