package test.main.java;

import main.java.DuplicateNumber;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.ArrayList;
import java.util.List;

/**
 * DuplicateNumber Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Sep 7, 2015</pre>
 */
public class DuplicateNumberTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: findDuplicateNumber1(List<Integer> numbers)
     */
    @Test
    public void testFindDuplicateNumber1() throws Exception {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            numbers.add(i);
        }

        //now add duplicate number
        numbers.add(27);

        DuplicateNumber dup = new DuplicateNumber();
        int dupnum = dup.findDuplicateNumber1(numbers);

        Assert.assertEquals("Duplicate number must match 27", 27, dupnum);
    }

    /**
     * Method: main(String[] args)
     */
    @Test
    public void testMain() throws Exception {

    }


} 
