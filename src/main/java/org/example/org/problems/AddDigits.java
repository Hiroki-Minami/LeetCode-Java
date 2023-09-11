package org.example.org.problems;

public class AddDigits {
    public int addDigits(int num) {
        int cur = num;
        while (cur / 10 != 0) {
            int sum = 0;
            while (cur != 0) {
                sum += cur % 10;
                cur = cur / 10;
            }
            cur = sum;
        }
        return cur;
    }
}
