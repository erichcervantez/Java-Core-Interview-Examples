package test.main.java;

import main.java.Singleton;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * main.java.Singleton Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Sep 7, 2015</pre>
 */
public class SingletonTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: getInstance()
     */
    @Test
    public void testGetInstance() throws Exception {
        //errors out because Singleton constructor is protected
        //Singleton singleton = new Singleton();

        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);

        Assert.assertNotNull("Singleton must not be null", singleton);
    }


} 
