package main.java.hackerrank.java.data_structures;

import java.util.*;

public class Java1DArray
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
        {
            array[i] = scanner.nextInt();
        }

        int counter = 0;
        for (int leftIndex = 0; leftIndex < n; leftIndex++)
        {
            for (int rightIndex = 0; rightIndex < n; rightIndex++)
            {
                int total = 0;
                for (int x = leftIndex; x <= rightIndex; x++)
                {
                    total += array[x];
                }

                if (total < 0)
                {
                    //System.out.println("[" + leftIndex + ":" + rightIndex + "]");
                    counter++;
                }
            }
        }

        System.out.println(counter);
    }
}
