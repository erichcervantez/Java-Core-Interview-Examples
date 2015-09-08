package main.java;

import java.util.Arrays;

/**
 * Created by Erich on 9/7/2015.
 */
public class BubbleSort {

    public static void bubbleSort(int[] numbers) {
        boolean flag = false;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                flag = true;
                int temp = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = temp;
            }
        }

        if (flag) {
            bubbleSort(numbers);
        } else {
            System.out.println("Array sorting complete.");
            System.out.println(Arrays.toString(numbers));
        }
    }

    public static void main(String[] args) {
        int[] numbers = {47, 2, 99, 67, 27, 3, 1, 88, 44, 0};
        System.out.println(Arrays.toString(numbers));

        bubbleSort(numbers);
    }
}
