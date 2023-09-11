package org.example.org.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int maximum = Arrays.stream(nums2).max().getAsInt();
        int[] ret = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] >= maximum) {
                ret[i] = -1;
                continue;
            }
            int index = firstIndexOf(nums2, nums1[i]);
            ret[i] = -1;
            for (int j = index + 1; j < nums2.length; j++) {
                if (nums2[j] > nums1[i]) {
                    ret[i] = nums2[j];
                    break;
                } else if (j == nums2.length - 1) {
                    ret[i] = -1;
                }
            }
        }
        return ret;
    }

    public int firstIndexOf(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
