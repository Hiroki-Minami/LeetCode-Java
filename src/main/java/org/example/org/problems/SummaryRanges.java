package org.example.org.problems;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if (nums.length == 0) { return list; }
        int smallest = nums[0];
        int cur = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (cur + 1 != nums[i]) {
                if (smallest == cur) {
                    list.add(String.valueOf(smallest));
                } else {
                    list.add(String.format("%d->%d", smallest, cur));
                }
                smallest = nums[i];
            }
            cur = nums[i];
        }

        if (smallest == cur) {
            list.add(String.valueOf(smallest));
        } else {
            list.add(String.format("%d->%d", smallest, cur));
        }

        return list;
    }
}
