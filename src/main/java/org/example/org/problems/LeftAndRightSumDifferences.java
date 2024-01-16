package org.example.org.problems;

public class LeftAndRightSumDifferences {
    public int[] leftRightDifference(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        int[] answer = new  int[nums.length];

        for (int i = 1; i < nums.length; i++) {
            leftSum[i] = nums[i - 1] + leftSum[i - 1];
            rightSum[nums.length - i - 1] = rightSum[nums.length - i] + nums[nums.length - i];
        }

        for (int i = 0; i < nums.length; i++) {
            answer[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return answer;
    }
}
