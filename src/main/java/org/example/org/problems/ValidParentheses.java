package org.example.org.problems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ValidParentheses {
    public boolean isValid(String s) {
        List<Character> chars = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                chars.add(c);
            } else {
                int lastIndex = chars.size() - 1;
                if (!chars.isEmpty() &&
                        ((c == ')' && chars.get(lastIndex) == '(') ||
                        (c == '}' && chars.get(lastIndex) == '{') ||
                        (c == ']' && chars.get(lastIndex) == '['))) {
                    chars.remove(lastIndex);
                } else {
                    return false;
                }
            }
        }
        return chars.isEmpty();
    }
}
