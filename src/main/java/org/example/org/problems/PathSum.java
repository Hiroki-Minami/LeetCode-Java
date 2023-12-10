package org.example.org.problems;

import org.example.org.util.TreeNode;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) { return false; }
        return helper(root, targetSum, 0);
    }

    private boolean helper(TreeNode current, int target, int sum) {
        if (current == null) { return false; }

        if (current.left == null && current.right == null) {
            return target == sum + current.val;
        }

        boolean left = helper(current.left, target, sum + current.val);
        boolean right = helper(current.right, target, sum + current.val);

        return left || right;
    }
}
