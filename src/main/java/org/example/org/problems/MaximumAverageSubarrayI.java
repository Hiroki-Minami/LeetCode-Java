package org.example.org.problems;

public class MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double maxAverage = (double)sum / (double)k;
        for (int j = k; j < nums.length; j++) {
            sum -= nums[j-k];
            sum += nums[j];
            maxAverage = Math.max(maxAverage, (double)sum / (double)k);
        }
        return maxAverage;
    }
}
