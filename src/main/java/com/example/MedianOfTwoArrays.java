package com.example;

public class MedianOfTwoArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = 0, n2 = 0;
        Integer prev = null, curr = null;
        int length = (nums1.length + nums2.length) / 2 + 1;
        for (int i = 0; i < length; i++) {
            prev = curr;
            if (n1 == nums1.length) {
                curr = nums2[n2];
                n2++;
                continue;
            }
            if (n2 == nums2.length) {
                curr = nums1[n1];
                n1++;
                continue;
            }
            if (nums1[n1] < nums2[n2]) {
                curr = nums1[n1];
                n1++;
            } else {
                curr = nums2[n2];
                n2++;
            }
        }
        boolean uneven = (nums1.length + nums2.length) % 2 == 1;
        if (uneven) {
            return curr;
        } else {
            return ((prev + curr) / 2);
        }
    }

    // public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    //     int n1 = 0, n2 = 0;
    //     int length = (nums1.length + nums2.length);
    //     int[] newArr = new int[length];

    //     for (int i = 0; i < length; i++) {
    //         if (n1 == nums1.length) {
    //             newArr[i] = nums2[n2];
    //             n2++;
    //             continue;
    //         }
    //         if (n2 == nums2.length) {
    //             newArr[i] = nums1[n1];
    //             n1++;
    //             continue;
    //         }
    //         if (nums1[n1] < nums2[n2]) {
    //             newArr[i] = nums1[n1];
    //             n1++;
    //         } else {
    //             newArr[i] = nums2[n2];
    //             n2++;
    //         }
    //     }
    //     boolean uneven = (length % 2) == 1;
    //     if(uneven) {
    //         return newArr[length/2];
    //     } else {
    //         return ((double)(newArr[length/2 -1] + newArr[length/2]))/2;
    //     }
    // }
}
