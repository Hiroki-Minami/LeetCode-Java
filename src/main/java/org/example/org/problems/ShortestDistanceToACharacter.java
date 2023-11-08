package org.example.org.problems;

public class ShortestDistanceToACharacter {
    public int[] shortestToChar(String s, char c) {
        int[] ret = new int[s.length()];
        int closestC = Integer.MAX_VALUE;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (c == ch) {
                closestC = i;
            }
            ret[i] = closestC != Integer.MAX_VALUE ? i - closestC : Integer.MAX_VALUE;
        }

        closestC = Integer.MAX_VALUE;
        for (int j = s.length() - 1; j >= 0; j--) {
            char ch = s.charAt(j);
            if (c == ch) {
                closestC = j;
            }
            ret[j] = Math.min(ret[j], closestC - j);
        }
        return ret;
    }
}
