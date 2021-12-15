package junit;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.TestCase;
public class TestOperation {
	 @Test
	    public void testAdd() {
	        Operation myUnit = new Operation();
	        int result = myUnit.add(2, 3);
	        assertEquals(result, 5);
	    }
	 
	    @Test
	    public void testSubtract() {
	        Operation myUnit = new Operation();
	        int result = myUnit.subtract(6, 4);
	        assertEquals(result, 2);
	    }
	    @Test
	    public void testmul() {
	        Operation myUnit = new Operation();
	        int result = myUnit.mul(5,7);
	        assertEquals(result, 35);
	    }
	 
	    @Test
	    public void testdivInt() {
	        Operation myUnit = new Operation();
	        int result = myUnit.divInt(81,9);
	        assertEquals(result, 9);
	    }
}
