package main.java.hackerrank;

import java.util.*;

public class FunnyString
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        String[] S = new String[T];
        String[] R = new String[T];
        for (int i = 0; i < T; i++)
        {
            S[i] = scanner.next();
            R[i] = new StringBuilder(S[i]).reverse().toString();
        }

        boolean isFunny = false;

        for (int x = 0; x < T; x++)
        {
            for (int i = 1; i < S[x].length() - 1; i++)
            {
                if (Math.abs((int) S[x].charAt(i) - (int) S[x].charAt(i - 1)) == Math.abs((int) R[x].charAt(i) - (int) R[x].charAt(i - 1)))
                {
                    isFunny = true;
                }
                else
                {
                    isFunny = false;
                    break;
                }
            }

            System.out.println(isFunny ? "Funny" : "Not Funny");
        }
    }
}
