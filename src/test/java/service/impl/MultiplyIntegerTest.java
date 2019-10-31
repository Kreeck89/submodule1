package service.impl;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

public class MultiplyIntegerTest {

    @Rule
    public TestRule timeout = Timeout.millis(5);

    private static MultiplyInteger multiplyInteger;
    private static Integer a;
    private static Integer b;

    @BeforeClass
    public static void setUp() throws Exception {
        multiplyInteger = new MultiplyInteger();
        a = 6;
        b = 4;
    }

    @Test
    public void count() {
        int res = multiplyInteger.count(a, b);
        assertEquals("Expected result is incorrect in multiple class", 24, res);
    }

    @Test
    public void countNotNull() {
        assertNotNull(multiplyInteger.count(a, b));
    }

    @Test(expected = NullPointerException.class)
    public void countWithNullValue() {
        multiplyInteger.count(a, null);
    }
}