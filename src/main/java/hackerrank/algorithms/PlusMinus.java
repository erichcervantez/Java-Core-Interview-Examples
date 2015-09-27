package main.java.hackerrank.algorithms;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/plus-minus
 */
public class PlusMinus
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        int pos, neg, zeros;
        pos = neg = zeros = 0;

        for (int i = 0; i < N; i++)
        {
            A[i] = scanner.nextInt();
        }

        for (int x : A)
        {
            if (x < 0)
                neg += 1;
            else if (x > 0)
                pos += 1;
            else if (x == 0)
                zeros += 1;
        }

        System.out.println((float) pos / N);
        System.out.println((float) neg / N);
        System.out.println((float) zeros / N);
    }
}
