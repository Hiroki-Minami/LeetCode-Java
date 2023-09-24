package org.example.org.problems;

import org.example.org.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class UnivaluedBinaryTree {
    public boolean isUnivalTree(TreeNode root) {
        if (root == null) { return false; }

        int value = root.val;
        List<TreeNode> queue = new ArrayList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode cur = queue.remove(queue.size() - 1);
            if (value != cur.val) {
                return false;
            }
            if (cur.left != null) {
                queue.add(cur.left);
            }
            if (cur.right != null) {
                queue.add(cur.right);
            }
        }
        return true;
    }
}
