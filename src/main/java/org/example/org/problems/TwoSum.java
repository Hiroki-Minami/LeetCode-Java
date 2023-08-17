package org.example.org.problems;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] ret = { -1, -1 };
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer needed = target - nums[i];

            if (map.containsKey(needed))  {
                ret[0] = map.get(needed);
                ret[1] = i;
            } else {
                map.put(nums[i], i);
            }
        }
        return ret;
    }
}
