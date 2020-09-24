import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
public class AppTest {
	
	public void shouldAnswerWithTrue() {
        assertTrue(true);
        System.out.println("This is Test Case 1");
    }

    @Test
    public void testSumMethod() {
        int result;
        result = App.sum(1, 1);

        assertEquals(2, result);
        System.out.println("Test sum 1 + 1 passed!!");
    }

    @Test
    public void testSumMethod1() {
        int result;
        result = App.sum(2, -1);

        assertEquals(1, result);
        System.out.println("Test sum 2 + -1 passed!!");
    }


	/*
    @Test
    public void testSumPositive() {
    	int results;

    	System.out.println("Sum Test case 1");
    	results = App.sum(0, 0);

    	assertEquals(0, results);

    }

    @Test
    public void testcase2() {
    	int results;

    	System.out.println("Sum Test case 2");
    	results = App.sum(1, 2);

    	assertEquals(3, results);
    }
    */

}
