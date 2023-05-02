package com.example;

import java.util.Arrays;

public class ThreeSomeClosest {
    public int convert(int[] nums, int target) {
        Arrays.sort(nums);
        Integer result = null;
        Integer diff = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            int start = i + 1;
            int end = nums.length - 1;
            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                if (sum < target) {
                    start++;
                } else {
                    end--;
                }
                if(diff>abs(sum-target))
                {  
                    diff=abs(sum-target);
                    result=sum;
                }
            }
        }
        return result;
    }

    private int abs(int i) {
        return i < 0 ? i * -1 : i;
    }
}
