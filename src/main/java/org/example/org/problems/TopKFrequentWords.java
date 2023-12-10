package org.example.org.problems;

import java.util.*;

public class TopKFrequentWords {

    // TODO:
    // map "i": 2, "love": 2, "leetcode": 1
    // map 2: {i, love}, 1: {leetcode}
    // priority queue top
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> frequencies = new HashMap<>();
        Map<Integer, List<String>> reverse = new HashMap<>();
        Set<String> set = new HashSet<>();

        for (String word: words) {
            if (!frequencies.containsKey(word)) {
                frequencies.put(word, 1);
            } else {
                frequencies.put(word, frequencies.get(word) + 1);
            }
        }

        PriorityQueue<Map.Entry<String, Integer>> priorityQueue = new PriorityQueue<>(k, (w1, w2) -> {
            // if result is negative w1 has more priority and vice visa.
            return w1.getValue().equals(w2.getValue()) ? w2.getKey().compareTo(w1.getKey()): w1.getValue() - w2.getValue();
        }
        );

        for (Map.Entry<String, Integer> entry: frequencies.entrySet()) {
            priorityQueue.offer(entry);
            if (priorityQueue.size() > k) {
                Map.Entry<String, Integer> polled = priorityQueue.poll();
                System.out.println(polled.getKey());
            }
        }
        List<String> ret = new ArrayList<>();

        while (!priorityQueue.isEmpty()) {
            ret.add(priorityQueue.poll().getKey());
        }
        Collections.reverse(ret);
        return ret;

//        List<Integer> frequentNumbers = new ArrayList<>(frequencies.values().stream().sorted(Comparator.reverseOrder()).toList());
//        List<String> ret = new ArrayList<>();
//        List<String> tempAdd = new ArrayList<>();
//        while (ret.size() < k) {
//            Integer next = frequentNumbers.remove(0);
//            for (Map.Entry<String, Integer> entry: frequencies.entrySet()) {
//                if (entry.getValue().equals(next)) {
//                    tempAdd.add(entry.getKey());
//                }
//            }
//            for (String add: tempAdd.stream().sorted().toList()) {
//                ret.add(add);
//                frequencies.remove(add);
//                if (ret.size() == k) {
//                    break;
//                }
//            }
//            tempAdd = new ArrayList<>();
//        }
//        return ret;
    }
}
