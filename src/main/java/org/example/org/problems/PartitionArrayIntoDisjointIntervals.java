package org.example.org.problems;

public class PartitionArrayIntoDisjointIntervals {
    public int partitionDisjoint(int[] nums) {
        int maxLeft = nums[0];
        int maxTemp = nums[0];
        int partition = 1;

        for (int i = 1; i < nums.length; i++) {
            if (maxLeft > nums[i]) {
                partition = i + 1;
                maxLeft = maxTemp;
            } else if (maxLeft < nums[i]) {
                maxTemp = Math.max(maxTemp, nums[i]);
            }
        }
        return partition;
    }
}
