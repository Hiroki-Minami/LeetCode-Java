package org.example.org.problems;

import org.example.org.util.TreeNode;

public class MaximumDepthOfBinaryTree {
    int depth = 1;
    public int maxDepth(TreeNode root) {
        if (root == null) { return 0; }
        dfs(root, depth);
        return depth;
    }

    public void dfs(TreeNode node, int currentDepth) {
        if (node == null) {
            depth = Math.max(depth, currentDepth - 1);
            return;
        }
        dfs(node.left, currentDepth + 1);
        dfs(node.right, currentDepth + 1);
    }
}
