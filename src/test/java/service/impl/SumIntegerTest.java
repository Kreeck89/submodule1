package service.impl;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

public class SumIntegerTest {

    @Rule
    public TestRule timeout = Timeout.millis(5);

    private static SumInteger sumInteger;
    private static Integer a;
    private static Integer b;

    @BeforeClass
    public static void setUp() throws Exception {
        sumInteger = new SumInteger();
        a = 6;
        b = 4;
    }

    @Test
    public void count() {
        int res = sumInteger.count(a, b);
        assertEquals("Expected result is incorrect in Sum class", 10, res);
    }

    @Test
    public void countNotNull() {
        assertNotNull(sumInteger.count(a, b));
    }

    @Test(expected = NullPointerException.class)
    public void countWithNullValue() {
        sumInteger.count(a, null);
    }
}