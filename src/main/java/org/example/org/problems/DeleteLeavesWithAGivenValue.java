package org.example.org.problems;

import org.example.org.util.TreeNode;

public class DeleteLeavesWithAGivenValue {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if (root == null) { return null; }
        return removeLeafNodesHelper(root, target) ? null: root;
    }

    private boolean removeLeafNodesHelper(TreeNode current, int target) {
        if (current == null) { return true; }

        boolean left = removeLeafNodesHelper(current.left, target);
        if (left) { current.left = null; }

        boolean right = removeLeafNodesHelper(current.right, target);
        if (right) { current.right = null; }

        return left && right && current.val == target;
    }
}
