package org.example.org.problems;

import org.example.org.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {

    List<Integer> ret = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) { return ret; }
        dfs(root);
        return ret;
    }
    private void dfs(TreeNode node) {
        TreeNode left = node.left;
        if (left != null) {
            dfs(left);
        }
        ret.add(node.val);

        TreeNode right = node.right;
        if (right != null) {
            dfs(right);
        }
    }
}
