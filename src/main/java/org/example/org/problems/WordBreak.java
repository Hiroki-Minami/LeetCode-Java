package org.example.org.problems;

import java.util.*;

public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        Map<String, Boolean> memo = new HashMap<>();
        return wordBreakHelper(s, 0, 1, wordDict, memo);
    }

    private boolean wordBreakHelper(String s, int startIndex, int endIndex, List<String> wordDict, Map<String, Boolean> memo) {
        if (endIndex > s.length()) { return false; }

        String sub = s.substring(startIndex, endIndex);
        for (String word: wordDict) {
            String key = String.format("%d,%d,%s", startIndex, endIndex, word);
            if (memo.containsKey(key)) { return false; }
            if (sub.equals(word)) {
                if (endIndex == s.length()) { return true; }
                boolean ret = wordBreakHelper(s, endIndex, endIndex + 1, wordDict, memo);
                if (ret) { return true; }
                else { memo.put(key, false); }
            }
        }
        return wordBreakHelper(s, startIndex, endIndex + 1, wordDict, memo);
    }
}
