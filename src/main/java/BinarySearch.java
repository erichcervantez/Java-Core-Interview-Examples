package main.java;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] numbers = {47, 2, 99, 67, 27, 3, 1, 88, 44, 0, 22, 16, 82, 56, 42, 6};
        int target = 22;
        int lowIndex = 0;
        int highIndex = numbers.length - 1;
        int middle = (lowIndex + highIndex) / 2;

        //sort array (cheat)
        Arrays.sort(numbers);

        System.out.println("Sorted array is now: " + Arrays.toString(numbers));

        //begin loop
        while (lowIndex <= highIndex) {
            //is our middle value less than the target value?
            if (numbers[middle] < target) {
                //move lowIndex up to middle position
                lowIndex = middle + 1;
            } else if (numbers[middle] == target) {
                System.out.println("Found!  Location is: " + middle);
                break;
            } else {
                //move highIndex down to middle position
                highIndex = middle - 1;
            }

            //reset middle position
            middle = (lowIndex + highIndex) / 2;
        }
    }
}
