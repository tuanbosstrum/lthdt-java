package junit1;

import junit.framework.TestCase;

public class JavaTest extends TestCase {
    protected int value1;
    protected int value2;
 
    /**
     * Khởi tạo các giá trị
     */
    protected void setUp() {
        value1 = 5;
        value2 = 2;
    }
 
    /**
     * test Add method
     */
    public void testAdd() {
        double result = value1 * value2;
        assertTrue(result == 10);
    }
}