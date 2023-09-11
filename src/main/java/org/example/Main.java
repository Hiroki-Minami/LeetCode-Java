package org.example;

import org.example.org.problems.MaximumSubarray;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        int[] arguments = {-2,1,-3,4,-1,2,1,-5,4};
        MaximumSubarray problem = new MaximumSubarray();
        problem.maxSubArray(arguments);
    }
}