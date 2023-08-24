package org.example.org.problems;

public class NumberOfOneBits {
    public int hammingWeight(int n) {
        int target = 1 << 31;
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & target) != 0) {
                count++;
            }
            target = target >>> 1;
        }
        return count;
    }
}
