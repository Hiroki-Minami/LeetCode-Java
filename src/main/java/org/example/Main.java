package org.example;

import org.example.org.problems.MaximumSubarray;
import org.example.org.problems.TopKFrequentWords;

import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        String[] words = {"i","love","leetcode","i","love","coding"};
        int k = 1;
        TopKFrequentWords topKFrequentWords = new TopKFrequentWords();
        List<String> ret = topKFrequentWords.topKFrequent(words, k);
        for (String a: ret) {
            System.out.println(a);
        }
    }
}