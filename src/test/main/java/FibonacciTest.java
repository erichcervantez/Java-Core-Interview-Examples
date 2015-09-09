package test.main.java;

import main.java.Fibonacci;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.List;

/**
 * Fibonacci Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Sep 8, 2015</pre>
 */
public class FibonacciTest
{

    @Before
    public void before() throws Exception
    {
    }

    @After
    public void after() throws Exception
    {
    }

    /**
     * Method: main(String[] args)
     */
    @Test
    public void testMain() throws Exception
    {
//TODO: Test goes here... 
    }


    /**
     * Method: fib(int n)
     */
    @Test
    public void testFib() throws Exception
    {

        List<Integer> fibNums = Fibonacci.getFibonacciSequence();

        /*
        try {
           Method method = Fibonacci.getClass().getMethod("fib", int.class);
           method.setAccessible(true);
           method.invoke(<Object>, <Parameters>);
        } catch(NoSuchMethodException e) {
        } catch(IllegalAccessException e) {
        } catch(InvocationTargetException e) {
        }
        */
    }

} 
