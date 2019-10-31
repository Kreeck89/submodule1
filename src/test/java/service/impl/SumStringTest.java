package service.impl;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

public class SumStringTest {

    @Rule
    public TestRule timeout = Timeout.millis(5);
    private static SumString sumString;
    private static String a;
    private static String b;

    @BeforeClass
    public static void setUp() throws Exception {
        sumString = new SumString();
        a = "6";
        b = "4";
    }

    @Test
    public void count() {
        String res = sumString.count(a, b);
        assertEquals("Expected result is incorrect in Sum String class", "64", res);
    }

    @Test
    public void countNotNull() {
        assertNotNull(sumString.count(a, b));
    }

    @Test
    public void countWithNullValue() {
        String res = sumString.count(a, null);
        assertEquals("Expected result is incorrect in Sum String class", "6null", res);
    }
}