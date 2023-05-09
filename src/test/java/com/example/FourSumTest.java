package com.example;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class FourSumTest {
    @Test
    public void testFourSum() {
        // Input: nums = [1,0,-1,0,-2,2], target = 0
        // Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
        int[] nums = new int[] { 1, 0, -1, 0, -2, 2 };
        FourSum converter = new FourSum();
        List<List<Integer>> result = converter.fourSum(nums, 0);
        assertEquals("[[-2, 0, 0, 2], [-2, -1, 1, 2], [-1, 0, 0, 1]]", result.toString());
    }

    @Test
    public void testFourSumV2() {
        // Input: nums = [1,0,-1,0,-2,2], target = 0
        // Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
        int[] nums = new int[] { 1000000000, 1000000000, 1000000000, 1000000000 };
        FourSum converter = new FourSum();
        List<List<Integer>> result = converter.fourSum(nums, -294967296);
        assertEquals("[]", result.toString());
    }

    @Test
    public void testFourSumV3() {
        // Input: nums = [1,0,-1,0,-2,2], target = 0
        // Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
        int[] nums = new int[] { 0 };
        FourSum converter = new FourSum();
        List<List<Integer>> result = converter.fourSum(nums, -294967296);
        assertEquals("[]", result.toString());
    }
    @Test
    public void testFourSumV4() {
        int[] nums = new int[] { -9,4,0,-3,6,3,-3,-9,-7,1,0,-7,-8,7, };
        FourSum converter = new FourSum();
        List<List<Integer>> result = converter.fourSum(nums, -9);
        assertEquals("[[-9, -8, 1, 7], [-9, -7, 1, 6], [-8, -7, 0, 6], [-9, -7, 0, 7], [-9, -3, 0, 3], [-7, -3, -3, 4], [-9, -3, -3, 6], [-7, -3, 0, 1], [-9, -9, 3, 6], [-9, -7, 3, 4], [-7, -7, 1, 4]]", result.toString());
    }
}
