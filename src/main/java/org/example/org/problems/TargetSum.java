package org.example.org.problems;

import java.util.HashMap;
import java.util.Map;

public class TargetSum {

    Map<String, Integer> memo = new HashMap<>();
    public int findTargetSumWays(int[] nums, int target) {
        return findTargetSumWaysHelper(0, 0, target, nums);
    }

    private int findTargetSumWaysHelper(int soFar, int index, int target, int[] nums) {
        String key = String.format("%d:%d", index, soFar);
        if (memo.containsKey(key)) { return memo.get(key); }
        if (index == nums.length) {
            return soFar == target ? 1: 0;
        }
        int plus = findTargetSumWaysHelper(soFar + nums[index], index + 1, target, nums);
        int minus = findTargetSumWaysHelper(soFar - nums[index], index + 1, target, nums);
        memo.put(key, plus + minus);
        return plus + minus;
    }
}
