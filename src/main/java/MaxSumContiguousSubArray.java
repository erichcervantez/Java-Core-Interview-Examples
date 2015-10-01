package main.java;

/**
 * Created by ecervantez on 10/1/2015.
 */
public class MaxSumContiguousSubArray
{
    public static void main(String[] args)
    {
        int[] numbers = {2, 6, 11, 54, -98, 0, 16, 45, -76, 42, 9};
        int max = numbers[0];
        int[] sum = new int[numbers.length];
        sum[0] = numbers[0];

        for (int i = 1; i < numbers.length; i++)
        {
            sum[i] = Math.max(numbers[i], sum[i - 1] + numbers[i]);
            max = Math.max(max, sum[i]);
        }

        System.out.println(max);
    }
}
