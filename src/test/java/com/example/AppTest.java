package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void shouldReturn2() {
        RomanToInteger converter = new RomanToInteger();
        int result = converter.convert("II");
        assertEquals(2, result);
    }

    @Test
    public void shouldReturn4() {
        RomanToInteger converter = new RomanToInteger();
        int result = converter.convert("IX");
        assertEquals(9, result);
    }

    @Test
    public void shouldReturn1994() {
        RomanToInteger converter = new RomanToInteger();
        int result = converter.convert("MCMXCIV");
        assertEquals(1994, result);
    }
}
