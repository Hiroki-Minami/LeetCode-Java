package org.example.org.problems;

public class CountingBits {
    public int[] countBits(int n) {
        int[] ret = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            int firstBit = i % 2;
            ret[i] = ret[i / 2];
            ret[i] += firstBit;
        }
        return ret;
    }
}
