package org.example;

import org.example.org.problems.MaximumSubarray;
import org.example.org.problems.MoveZeroes;
import org.example.org.problems.TopKFrequentWords;
import org.example.org.problems.WordBreak;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        WordBreak wordBreak = new WordBreak();
        List<String> list = new ArrayList<>();
        list.add("leet");
        list.add("code");
        wordBreak.wordBreak("leetcode", list);
    }
}