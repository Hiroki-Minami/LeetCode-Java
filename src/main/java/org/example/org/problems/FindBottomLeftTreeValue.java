package org.example.org.problems;

import org.example.org.util.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class FindBottomLeftTreeValue {

    Map<Integer, Integer> memo = new HashMap<>();
    int maxDepth = 0;
    public int findBottomLeftValue(TreeNode root) {
        dfs(root, 0);
        return memo.get(maxDepth);
    }

    private void dfs(TreeNode current, int depth) {
        if (current == null) { return; }
        maxDepth = Math.max(depth, maxDepth);

        if (!memo.containsKey(depth)) {
            memo.put(depth, current.val);
        }

        dfs(current.left, depth + 1);
        dfs(current.right, depth + 1);
    }
}


