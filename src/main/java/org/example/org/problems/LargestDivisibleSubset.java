//package org.example.org.problems;
//
//import java.util.*;
//
//public class LargestDivisibleSubset {
//    class LengthAndLargest {
//        public int length;
//        public int largest;
//        public List<Integer> list = new ArrayList<>();
//    }
//    public List<Integer> largestDivisibleSubset(int[] nums) {
//        int[] sortedNums = Arrays.stream(nums).sorted().toArray();
//        int[] dp = new int[sortedNums.length];
//        int max = 1;
//        dp[0] = 1;
//
//        for (int i = 1; i < sortedNums.length; i++) {
//            for (int j = i - 1; j >= 0; j--) {
//                if (sortedNums[i] % sortedNums[j] == 0) {
//                    dp[i] = Math.max(dp[i], dp[j] + 1);
//                    max = Math.max(max, dp[i]);
//                }
//            }
//        }
//        return max;
//    }
//}
