package com.example;

import org.junit.Test;

public class ThreeSumTest {

    @Test
    public void return3SomeV2() {
        int[] nums = new int[] { -1, 0, 1, 2, -1, -4 };
        // Output: [[-1,-1,2],[-1,0,1]]
        ThreeSum converter = new ThreeSum();
        converter.convert(nums);

    }

    @Test
    public void return3SomeV3() {
        int[] nums = new int[] { 1, 0, -1 };
        // Output: [[-1,-1,2],[-1,0,1]]
        ThreeSum converter = new ThreeSum();
        converter.convert(nums);

    }

    @Test
    public void return3SomeV4() {
        int[] nums = new int[] { 1, 1, -2 };
        // Output: [[-1,-1,2],[-1,0,1]]
        ThreeSum converter = new ThreeSum();
        converter.convert(nums);

    }

    @Test
    public void return3SomeV5() {
        int[] nums = new int[] { 1, 1, 1 };
        // Output: [[-1,-1,2],[-1,0,1]]
        ThreeSum converter = new ThreeSum();
        converter.convert(nums);

    }
}
