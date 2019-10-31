package service.impl;

import org.junit.*;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

public class MinusIntegerTest {

    @Rule
    public TestRule timeout = Timeout.millis(5);

    private static MinusInteger minusInteger;
    private static Integer a;
    private static Integer b;

    @BeforeClass
    public static void setUp() throws Exception {
        minusInteger = new MinusInteger();
        a = 6;
        b = 4;
    }

    @Test
    public void count() {
        int count = minusInteger.count(a, b);
        assertEquals("Expected result is incorrect in minus class", 2, count);
    }

    @Test
    public void countNotNull() {
        assertNotNull(minusInteger.count(a, b));
    }

    @Test(expected = NullPointerException.class)
    public void countWithNullValue() {
        minusInteger.count(a, null);
    }
}