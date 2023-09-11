package org.example.org.problems;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num: nums) {
            int add = map.getOrDefault(num, 0) + 1;
            map.put(num, add);
        }

        for (Map.Entry entry: map.entrySet()) {
            if (entry.getValue().equals(1)) {
                return (int) entry.getKey();
            }
        }
        return -1;
    }
}
