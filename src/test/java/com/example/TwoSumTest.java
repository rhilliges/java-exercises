package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TwoSumTest {
    @Test
    public void testTwoSum() {
        TwoSum converter = new TwoSum();
        int[] r = converter.twoSum(new int[]{3,2,4}, 6);
        assertEquals("[]", r.toString());
    }
}
