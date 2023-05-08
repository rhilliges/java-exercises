package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MedianOfTwoArraysTest {
    @Test
    public void medianOfTwoArraysTest() {
        // Input: nums1 = [1,3], nums2 = [2]
        // Output: 2.00000
        // Explanation: merged array = [1,2,3] and median is 2.
        int[] nums1 = new int[] { 1, 3 }, nums2 = new int[] { 2 };
        MedianOfTwoArrays converter = new MedianOfTwoArrays();

        double median = converter.findMedianSortedArrays(nums1, nums2);

        assertEquals(2, median, 0);
    }

    @Test
    public void medianOfTwoArraysTestV2() {
        int[] nums1 = new int[] { 1, 2 }, nums2 = new int[] { 3, 4 };
        MedianOfTwoArrays converter = new MedianOfTwoArrays();

        double median = converter.findMedianSortedArrays(nums1, nums2);

        assertEquals(2.5, median, .5);
    }
}
