package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> result = new HashSet<>();
        if (nums.length < 4) {
            return Collections.emptyList();
        }
        Arrays.sort(nums);
        find(nums, 0, 1, 2, 3, target, result);
        return new ArrayList<>(result);
    }

    private void find(int[] nums, int a, int b, int c, int d, long target, Set<List<Integer>> result) {
        long sum = nums[a];
        if (sum > target && nums[b] > -1) {
            return;
        }
        sum += nums[b];
        if (sum > target && nums[c] > -1) {
            return;
        }
        sum += nums[c];
        if (sum > target && nums[d] > -1) {
            return;
        }
        sum += nums[d];
        if (sum == target) {
            result.add(List.of(nums[a], nums[b], nums[c], nums[d]));
        }
        if (sum > target) {
            return;
        }
        if (d < nums.length - 1) {
            find(nums, a, b, c, ++d, target, result);
        }
        if (c < d - 1) {
            find(nums, a, b, ++c, d, target, result);
        }
        if (b < c - 1) {
            find(nums, a, ++b, c, d, target, result);
        }
        if (a < b - 1) {
            find(nums, ++a, b, c, d, target, result);
        }
    }
}

// package com.example;

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.HashSet;
// import java.util.List;
// import java.util.Set;

// public class FourSum {
// public List<List<Integer>> fourSum(int[] nums, int target) {
// Set<List<Integer>> result = new HashSet<>();

// Arrays.sort(nums);

// for (int i = 0; i < nums.length; i++) {
// for (int j = i + 1; j < nums.length; j++) {
// int k = j + 1;
// int l = nums.length - 1;
// while (k < l) {
// long sum = nums[i];
// sum += nums[j];
// sum += nums[k];
// sum += nums[l];
// if (sum == target) {
// result.add(List.of(nums[i], nums[j], nums[k], nums[l]));
// k++;
// l--;
// } else if (sum < target) {
// k++;
// } else {
// l--;
// }
// }
// }
// }
// return new ArrayList(result);
// }
// }
