package junit3;

import org.junit.Assert;
import org.junit.Test;

public class MathUtilTest {
	@Test
    public void divide_SixDividedByTwo_ReturnThree() {
        final int expected = 3;
 
        final int actual = MathUtil.divide(6, 2);
 
        Assert.assertEquals(expected, actual);
    }
 
    @Test
    public void divide_OneDividedByTwo_ReturnZero() {
        final int expected = 0;
 
        final int actual = MathUtil.divide(1, 2);
 
        Assert.assertEquals(expected, actual);
    }
 
    @Test(expected = IllegalArgumentException.class)
    public void divide_OneDividedByZero_ThrowsIllegalArgumentException() {
        MathUtil.divide(1, 0);
    }
 
    @Test
    public void add_SixAddedByTwo_ReturnEight() {
    	//phương thức add_SixAddedByTwo_ReturnEight() có điều gì đó sai//
        final int expected = 4;
 
        final int actual = MathUtil.add(6, 2);
        Assert.assertEquals(expected, actual);
    }
}
