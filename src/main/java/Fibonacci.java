package main.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Erich on 9/8/2015.
 */
public class Fibonacci {
    public static void main(String[] args) {
        getFibonacciSequence();
    }

    public static List<Integer> getFibonacciSequence() {
        List<Integer> fibNumbers = new ArrayList<>();
        Integer fibNum = 0;

        for (int i = 0; i < 10; i++) {
            fibNum = fib(i);
            fibNumbers.add(fibNum);
        }

        System.out.println(fibNumbers);

        return fibNumbers;
    }

    /**
     * Why use recursion?
     * Because we need to not just calculate (n-1) + (n-2).
     * We want the FIBONACCI value of "n", not the value of "n".
     * So get the fibonacci value by using fib(n-1) + fib(n-2)
     */
    private static int fib(int n) {
        if (n <= 1)
            return n;

        return fib(n - 1) + fib(n - 2);
    }
}
