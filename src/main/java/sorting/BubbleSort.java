package main.java.sorting;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Erich on 9/7/2015.
 */
public class BubbleSort
{
    public static void main(String[] args)
    {
        //initialize random set of numbers
        int[] numbers = {47, 2, 99, 67, 27, 3, 1, 88, 44, 0};
        System.out.println(Arrays.toString(numbers));

        Random random = new Random(100);
        int number = random.nextInt();
        System.out.println("Random number: " + number);

        bubbleSort(numbers);
    }


    public static void bubbleSort(int[] numbers)
    {
        boolean flag = false;
        for (int i = 0; i < numbers.length - 1; i++)
        {

            //compare two numbers.  If unordered, swap
            if (numbers[i] > numbers[i + 1])
            {
                flag = true;
                int temp = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = temp;
            }
        }

        //if flag is never set to true, sorting is done
        if (flag)
        {
            bubbleSort(numbers);
        } else
        {
            System.out.println("Array sorting complete.");
            System.out.println(Arrays.toString(numbers));
        }
    }
}
