package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ThreeSomeClosestTest {
    @Test
    public void testThreeSomeClosest() {
        int[] nums = new int[] { -1, 2, 1, -4 };
        int target = 1;
        ThreeSomeClosest converter = new ThreeSomeClosest();
        int result = converter.convert(nums, target);
        assertEquals(2, result);
    }

    @Test
    public void testThreeSomeClosestV2() {
        int[] nums = new int[] { 1, 1, 1, 0 };
        int target = -100;
        ThreeSomeClosest converter = new ThreeSomeClosest();
        int result = converter.convert(nums, target);
        assertEquals(2, result);
    }

    @Test
    public void testThreeSomeClosestV3() {
        int[] nums = new int[] { 2,3,8,9,10 };
        int target = 16;
        ThreeSomeClosest converter = new ThreeSomeClosest();
        int result = converter.convert(nums, target);
        assertEquals(15, result);
    }
}
