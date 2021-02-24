package org.cl.problem4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];
        int i1 = 0, i2 = 0, m = 0;
        while (m < merged.length / 2 + 2) {
            if (nums1.length == 0) {
                merged = nums2;
                break;
            } else if (nums2.length == 0) {
                merged = nums1;
                break;
            }
            if (nums1[i1] <= nums2[i2]) {
                merged[m] = nums1[i1];
                m++;
                i1++;
            } else {
                merged[m] = nums2[i2];
                m++;
                i2++;
            }
            if (i1 == nums1.length) {
                for (int i = i2; i < nums2.length; i++, m++) {
                    merged[m] = nums2[i];
                }
                break;
            }
            if (i2 == nums2.length) {
                for (int i = i1; i < nums1.length; i++, m++) {
                    merged[m] = nums1[i];
                }
                break;
            }
        }

        if (merged.length % 2 == 0) {
            int median_pos = (merged.length / 2) - 1;
            return (merged[median_pos] + merged[median_pos + 1]) / 2.0;
        } else {
            return merged[(merged.length / 2)];
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1_3 = {};
        int[] nums2_3 = {1};
        System.out.println("solution1: " + solution.findMedianSortedArrays(nums1_3, nums2_3));

        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        System.out.println("solution1: " + solution.findMedianSortedArrays(nums1, nums2));

        int[] nums1_1 = {1, 3, 6, 8};
        int[] nums2_1 = {2, 5, 7};
        System.out.println("solution2: " + solution.findMedianSortedArrays(nums1_1, nums2_1));

        int[] nums1_2 = {1, 3, 6};
        int[] nums2_2 = {2, 5, 7};

        System.out.println("solution3: " + solution.findMedianSortedArrays(nums1_2, nums2_2));


    }
}
