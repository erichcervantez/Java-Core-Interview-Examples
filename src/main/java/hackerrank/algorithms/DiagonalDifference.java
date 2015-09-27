package main.java.hackerrank.algorithms;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/diagonal-difference
 */
public class DiagonalDifference
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] matrix = new int[N][N];
        int leftDiag = 0;
        int rightDiag = 0;

        for (int a = 0; a < N; a++)
        {
            for (int b = 0; b < N; b++)
            {
                matrix[a][b] = scanner.nextInt();

                if (a == b)
                {
                    leftDiag += matrix[a][b];
                }

                if (a + b == N - 1)
                {
                    rightDiag += matrix[a][b];
                }
            }
        }

        int absDiff = Math.abs(leftDiag - rightDiag);

        System.out.println(absDiff);
    }
}
