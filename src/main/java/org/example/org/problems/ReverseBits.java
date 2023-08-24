package org.example.org.problems;

public class ReverseBits {
    public int reverseBits(int n) {
        int digit = 1 << 31;
        int answer = 0;

        for (int i = 0; i < 32; i++) {
            int bit = n & digit;
            int shift = (31 - i * 2);
            if (shift > 0) {
                bit = bit >>> shift;
            } else {
                bit = bit << (shift * -1);
            }
            answer = answer | bit;
            digit = digit >>> 1;
        }
        return answer;
    }
}
