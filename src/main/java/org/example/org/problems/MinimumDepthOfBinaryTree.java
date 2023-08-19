package org.example.org.problems;

import org.example.org.util.TreeNode;

public class MinimumDepthOfBinaryTree {

    private int depth = Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        if (root == null) { return 0; }
        dfs(root, 1);
        return depth;
    }

    public void dfs(TreeNode node, int currentDepth) {
        if (node.left == null && node.right == null) {
            depth = Math.min(depth, currentDepth);
            return;
        }
        if (node.left != null) {
            dfs(node.left, currentDepth + 1);
        }
        if (node.right != null) {
            dfs(node.right, currentDepth + 1);
        }
    }
}
