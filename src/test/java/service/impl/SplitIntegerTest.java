package service.impl;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

public class SplitIntegerTest {

    @Rule
    public TestRule timeout = Timeout.millis(5);

    private static SplitInteger splitInteger;
    private static Integer a;
    private static Integer b;

    @BeforeClass
    public static void setUp() throws Exception {
        splitInteger = new SplitInteger();
        a = 6;
        b = 4;
    }

    @Test
    public void count() {
        int res = splitInteger.count(a, b);
        assertEquals("Expected result is incorrect in Split class", 1, res);
    }

    @Test
    public void countNotNull() {
        assertNotNull(splitInteger.count(a, b));
    }

    @Test(expected = NullPointerException.class)
    public void countWithNullValue() {
        splitInteger.count(a, null);
    }

    @Test(expected = ArithmeticException.class)
    public void countSplitOnZeroValue() {
        splitInteger.count(a, 0);
    }
}