package Projects.Intergration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class DisplayTest {
    private Display test;
    private int largeCustomerAmount = 1000000;
    @Before
    public void setUp() {
        test = new Display();
    }

    @After
    public void tearDown() {
        test = null;
    }

    @Test
    public void countToHighNumber() {
        int expResult = largeCustomerAmount;
        for (int i = 0; i < largeCustomerAmount; i++) {
           test.nextNumber();
        }
        int result = test.getQueueNumber();
        assertEquals("Can't count to a high number accurately", expResult, result);

    }

}