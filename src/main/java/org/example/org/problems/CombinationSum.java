package org.example.org.problems;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> soFar = new ArrayList<>();
        combinationSumHelper(ret, candidates, target, 0, soFar);
        return ret;
    }

    private void combinationSumHelper(List<List<Integer>> ret, int[] candidates, int remain, int lastIndex, List<Integer> soFar) {
        if (remain < 0) { return; }
        if (remain == 0) {
            List<Integer> add = new ArrayList<>();
            add.addAll(soFar);
            ret.add(add);
            return;
        }
        for (int i = lastIndex; i < candidates.length; i++) {
            soFar.add(candidates[i]);
            combinationSumHelper(ret, candidates, remain - candidates[i], i, soFar);
            soFar.remove(soFar.size() - 1);
        }
    }
}
