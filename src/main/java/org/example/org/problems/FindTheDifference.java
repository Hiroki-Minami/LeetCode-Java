package org.example.org.problems;

import java.util.HashMap;
import java.util.Map;

public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            setMap(s.charAt(i), sMap);
            setMap(t.charAt(i), tMap);
        }
        setMap(t.charAt(t.length() - 1), tMap);

        for (Map.Entry<Character, Integer> entry: tMap.entrySet()) {
            if (!sMap.containsKey(entry.getKey()) || sMap.get(entry.getKey()) < entry.getValue()) {
                return entry.getKey();
            }
        }
        return 'a';
    }

    private void setMap(char ch, Map<Character, Integer> map) {
        int previous = map.getOrDefault(ch, 0);
        map.put(ch, previous + 1);
    }
}
