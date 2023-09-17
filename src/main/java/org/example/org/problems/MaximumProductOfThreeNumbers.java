package org.example.org.problems;

import java.util.Arrays;
import java.util.Comparator;

public class MaximumProductOfThreeNumbers {
    public int maximumProduct(int[] nums) {
        if (nums.length == 3) {
            return Arrays.stream(nums).reduce(1, (x, y) -> x * y);
        }

        Integer[] integerArray = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            integerArray[i] = nums[i];
        }
        Arrays.sort(integerArray, Comparator.reverseOrder());

        int maximum = Arrays.stream(Arrays.copyOfRange(integerArray, 0, 3)).reduce(1, (x, y) -> x * y);
        maximum = Math.max(maximum, integerArray[0] * Arrays.stream(Arrays.copyOfRange(integerArray, integerArray.length - 2, integerArray.length)).reduce(1, (x, y) -> x * y));

        return maximum;
    }
}
