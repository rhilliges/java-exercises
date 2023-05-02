package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSome {

    public List<List<Integer>> convert(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int start = i + 1;
            int end = nums.length - 1;
            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                if (sum == 0) {
                    result.add(List.of(nums[i], nums[start], nums[end]));
                    start++;
                } else if (sum < 0) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        return new ArrayList<>(result);
    }
}
