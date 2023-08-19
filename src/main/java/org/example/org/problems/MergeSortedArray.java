package org.example.org.problems;

import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m; i < (m + n); i++) {
            nums1[i] = nums2[i - m];
        }
//        Arrays.sort(nums1);
        // buble sort
        int temp = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 1; j < nums1.length - i; j++) {
                if (nums1[j-1] > nums1[j]) {
                    temp = nums1[j];
                    nums1[j] = nums1[j-1];
                    nums1[j-1] = temp;
                }
            }
        }
    }
}
