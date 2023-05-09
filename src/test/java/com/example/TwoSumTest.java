package com.example;

import org.junit.Test;

public class TwoSumTest {
    @Test
    public void testTwoSum() {
        TwoSum converter = new TwoSum();
        // Output: [1,2]
        int[] r = converter.twoSum(new int[]{3,2,4}, 6);
        System.out.println(r);
    }
}
