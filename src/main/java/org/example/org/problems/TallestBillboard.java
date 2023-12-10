package org.example.org.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TallestBillboard {

    private int maxRodLength = 0;
    public int tallestBillboard(int[] rods) {
        List<Integer> list = new ArrayList<>();
        tallestBillboardHelper(rods, 0, 0, list);
        return maxRodLength;
    }

    private void tallestBillboardHelper(int[] rods, int index, int sum, List<Integer> list) {
        if (index == rods.length) { return; }
        // not take
        tallestBillboardHelper(rods, index + 1, sum, list);

        // take
        sum += rods[index];
        list.add(rods[index]);

        if (sum % 2 == 0 && list.size() >= 2 && sum / 2 > maxRodLength && canMakeSameHeightRod(sum / 2, list)) {
            maxRodLength = sum / 2;
        }
        tallestBillboardHelper( rods,index + 1, sum, list);
        list.remove(list.size() - 1);
    }

    private boolean canMakeSameHeightRod(int halfSum, List<Integer> list) {
        return canMakeSameHeightRodHelper(list, 0, 0, halfSum);
    }

    private boolean canMakeSameHeightRodHelper(List<Integer> list, int index, int sum, int target) {
        if (sum == target) { return true; }
        if (sum > target) { return false; }
        if (index == list.size()) { return false; }

        // not take
        boolean notTake = canMakeSameHeightRodHelper(list, index + 1, sum, target);
        if (notTake) { return true; }
        // take
        return canMakeSameHeightRodHelper(list, index + 1, sum + list.get(index), target);
    }
}
