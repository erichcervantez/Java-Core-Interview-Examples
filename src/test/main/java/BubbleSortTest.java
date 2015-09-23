package test.main.java;

import main.java.sorting.BubbleSort;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * BubbleSort Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Sep 7, 2015</pre>
 */
public class BubbleSortTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: main(String[] args)
     */
    @Test
    public void testMain() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: bubbleSort(int[] numbers)
     */
    @Test
    public void testBubbleSort() throws Exception {

        int[] unsortedArray = {47, 2, 99, 67, 27, 3, 1, 88, 44, 0};
        BubbleSort.bubbleSort(unsortedArray);

        int[] sortedArray = {0, 1, 2, 3, 27, 44, 47, 67, 88, 99};
        Assert.assertArrayEquals("Arrays should match and be sorted", sortedArray, unsortedArray);
    }


} 
