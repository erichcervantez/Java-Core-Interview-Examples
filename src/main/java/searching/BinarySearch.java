package main.java.searching;

import java.util.Arrays;

/**
 * Created by Erich on 9/22/2015.
 */
public class BinarySearch
{

    public static void main(String[] args)
    {
        int[] numbers = {47, 2, 99, 67, 27, 3, 1, 88, 44, 0};

        //what are we looking for?
        int target = 88;

        //sort array
        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));

        int low = 0;
        int high = numbers.length - 1;
        int middle = (low + high) / 2;

        System.out.println("middle: " + middle);

        while (low <= high)
        {
            if (numbers[middle] < target)
            {
                low = middle + 1;
            } else if (numbers[middle] == target)
            {
                System.out.println("found! " + target);
                break;
            } else
            {
                high = middle - 1;
            }

            //recalc middle
            middle = (low + high) / 2;
        }
    }
}
