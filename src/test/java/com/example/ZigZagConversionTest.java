package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ZigZagConversionTest {
    @Test
    public void zigZagConversionTest() {
        var converter = new ZigZagConversion();
        var r = converter.convert("PAYPALISHIRING", 3);
        assertEquals("PAHNAPLSIIGYIR", r);
    }

    @Test
    public void zigZagConversionTest2() {
        var converter = new ZigZagConversion();
        var r = converter.convert("PAYPALISHIRING", 4);
        assertEquals("PINALSIGYAHRPI", r);
    }
    @Test
    public void zigZagConversionTest3() {
        var converter = new ZigZagConversion();
        var r = converter.convert("A", 1);
        assertEquals("A", r);
    }
    @Test
    public void zigZagConversionTest4() {
        var converter = new ZigZagConversion();
        var r = converter.convert("AB", 1);
        assertEquals("AB", r);
    }
    @Test
    public void zigZagConversionTest5() {
        var converter = new ZigZagConversion();
        var r = converter.convert("ABC", 5);
        assertEquals("ABC", r);
    }
    @Test
    public void zigZagConversionTest6() {
        var converter = new ZigZagConversion();
        var r = converter.convert("ABC", 2);
        assertEquals("ACB", r);
    }
}
