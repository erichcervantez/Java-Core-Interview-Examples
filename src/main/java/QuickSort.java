package main.java;

import java.util.Arrays;

/**
 * Created by ecervantez on 9/21/2015.
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] numbers = {47, 2, 99, 67, 27, 3, 1, 88, 44, 0};
        quickSort(numbers, 0, numbers.length - 1);
    }

    private static void quickSort(int[] numbers, int startIndex, int endIndex) {
        int left = startIndex;
        int right = endIndex;
        int pivot = numbers[left];

        System.out.println("Numbers: " + Arrays.toString(numbers));

        while (left <= right) {
            //find a number greater than the pivot on the left side
            while (numbers[left] < pivot)
                left++;

            //find a number smaller than the pivot on the right side
            while (numbers[right] > pivot)
                right--;

            System.out.println("Before swap - left: " + numbers[left] + ", right: " + numbers[right]);

            if (left <= right) {
                int temp = numbers[left];
                numbers[left] = numbers[right];
                numbers[right] = temp;

                System.out.println("After swap - left: " + numbers[left] + ", right: " + numbers[right]);

                left++;
                right--;
            }
        }

        //quicksort left partition
        if (startIndex < right)
            quickSort(numbers, startIndex, right);

        //quicksort right partition
        if (left < endIndex)
            quickSort(numbers, left, endIndex);

        System.out.println("Numbers: " + Arrays.toString(numbers));
    }

}
