package org.example.org.problems;

import java.util.Arrays;

public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int k = 1;
        while (true) {
            int takes = 0;
            for (int pile: piles) {
                takes += pile % k == 0 ? pile / k: pile / k + 1;
                if (takes > h) {
                    k++;
                    continue;
                }
            }
            if (takes <= h) { break; }
            k++;
        }
        return k;
    }
}
