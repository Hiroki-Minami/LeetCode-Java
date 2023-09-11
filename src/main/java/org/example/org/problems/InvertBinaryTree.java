package org.example.org.problems;

import org.example.org.util.TreeNode;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) { return null; }
        traverse(root);
        return root;
    }

    public void traverse(TreeNode cur) {
        if (cur == null) { return; }

        TreeNode left = cur.left;
        traverse(left);

        TreeNode right = cur.right;
        traverse(right);

        cur.left = right;
        cur.right = left;
    }
}
