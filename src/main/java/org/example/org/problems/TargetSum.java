package org.example.org.problems;

public class TargetSum {

    int pattern = 0;

    public int findTargetSumWays(int[] nums, int target) {
        findTargetSumWaysHelper(0, 0, target, nums);
        return pattern;
    }

    private void findTargetSumWaysHelper(int soFar, int index, int target, int[] nums) {
        if (index == nums.length) {
            pattern = soFar == target ? pattern + 1: pattern;
            return;
        }
        findTargetSumWaysHelper(soFar + nums[index], index + 1, target, nums);
        findTargetSumWaysHelper(soFar - nums[index], index + 1, target, nums);
    }
}
