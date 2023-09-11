package org.example.org.problems;

public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        char[] chs1 = word1.toCharArray();
        char[] chs2 = word2.toCharArray();

        int maxLength = Math.max(word1.length(), word2.length());

        for (int i = 0; i < maxLength; i++) {
            if (i < chs1.length) {
                result.append(chs1[i]);
            }
            if (i < chs2.length) {
                result.append(chs2[i]);
            }
        }
        return result.toString();
    }

}
