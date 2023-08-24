package org.example.org.problems;

import org.example.org.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {

    private List<Integer> ret = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) { return ret; }
        dfs(root);
        return ret;
    }

    public void dfs(TreeNode node) {
        if (node == null) { return; }
        ret.add(node.val);
        dfs(node.left);
        dfs(node.right);
    }
}
