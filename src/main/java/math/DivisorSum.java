package main.java.math;

public class DivisorSum
{
    public static void main(String[] args)
    {
        //find the divisor sum of 6
        //1 + 2 + 3 + 6 = 12

        System.out.println(divisorSum(6));
    }

    public static int divisorSum(int n)
    {
        int counter = 0;
        for (int i = 1; i <= n; i++)
        {
            //if n divides by i "evenly" with no remainder, count it up
            if (n % i == 0)
            {
                counter = counter + i;
            }
        }
        return counter;
    }
}
