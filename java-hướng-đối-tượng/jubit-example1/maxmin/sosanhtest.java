package maxmin;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class sosanhtest {
	sosanh util = new sosanh();

    @Test
    void test1(){
        assertTrue(util.sosanh(1,1));
    }
    @Test
    void test2(){
        assertTrue(util.sosanh(2,1));
    }
   
}
