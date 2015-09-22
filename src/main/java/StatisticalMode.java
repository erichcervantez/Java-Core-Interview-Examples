package main.java;

import java.util.*;

public class StatisticalMode {

    //generate a list of 100 integers containing duplicates
    public static void main(String[] args) {
        int[] numbers = new int[100];
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            numbers[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(numbers));
    }

    //find the most common integer found in the list
    private static void findStatisticalMode(int[] numbers) {

        Map<Integer, Integer> counter = new TreeMap<>();


        for (int i = 0; i < numbers.length; i++) {

        }

    }
}
