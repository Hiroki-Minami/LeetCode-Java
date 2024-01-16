package org.example.org.problems;

import java.util.HashSet;
import java.util.Set;

public class BeautifulArrangement {
    private int ret = 0;
    public int countArrangement(int n) {
        Set<Integer> used = new HashSet<>();
        helper(n, used);
        return ret;
    }

    private void helper(int n, Set<Integer> used) {
        if (used.size() == n) {
            ret++;
            return;
        }
        for (int i = 1; i <= n; i++) {
            int size = used.size() + 1;
            if (!used.contains(i) && (i % size == 0 || size % i == 0)) {
                used.add(i);
                helper(n, used);
                used.remove(i);
            }
        }
    }
}
