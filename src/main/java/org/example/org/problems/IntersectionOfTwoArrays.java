package org.example.org.problems;

import java.util.*;
import java.util.stream.Collectors;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> num1Set = Arrays.stream(nums1)
                .boxed()
                .collect(Collectors.toSet());

        Set<Integer> num2Set = Arrays.stream(nums2)
                .boxed()
                .collect(Collectors.toSet());

        List<Integer> retList = new ArrayList<>();
        for (int num: num1Set) {
            if (num2Set.contains(num)) {
                retList.add(num);
            }
        }

        int[] retArray = new int[retList.size()];
        for (int i = 0; i < retList.size(); i++) {
            retArray[i] = retList.get(i);
        }
        return retArray;
    }
}
