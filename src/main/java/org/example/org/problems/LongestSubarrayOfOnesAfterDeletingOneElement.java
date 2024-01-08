package org.example.org.problems;

public class LongestSubarrayOfOnesAfterDeletingOneElement {
    public int longestSubarray(int[] nums) {
        int prevOnes = 0;
        int curOnes = 0;
        int max = 0;

        for (int num: nums) {
            if (num == 0) {
                prevOnes = curOnes;
                curOnes = 0;
            } else {
                curOnes++;
                max = Math.max(max, prevOnes + curOnes);
            }
        }
        return max == nums.length ? max - 1: max;
    }
}
