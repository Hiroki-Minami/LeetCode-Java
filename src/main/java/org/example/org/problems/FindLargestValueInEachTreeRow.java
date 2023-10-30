package org.example.org.problems;

import org.example.org.util.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindLargestValueInEachTreeRow {
    Map<Integer, Integer> map = new HashMap<>();
    int maxDepth = 0;
    public List<Integer> largestValues(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        dfs(root, 0);
        List<Integer> ret = new ArrayList<>();
        for (int i = 0; i <= maxDepth; i++) {
            ret.add(map.get(i));
        }
        return  ret;
    }

    private void dfs(TreeNode current, int depth) {
        if (current == null) {
            return;
        }
        if (map.containsKey(depth)) {
            map.put(depth, Math.max(map.get(depth), current.val));
        } else {
            map.put(depth, current.val);
        }
        maxDepth = Math.max(maxDepth, depth);
        dfs(current.left, depth + 1);
        dfs(current.right, depth + 1);
    }
}
