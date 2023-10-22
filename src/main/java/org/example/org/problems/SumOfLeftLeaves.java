package org.example.org.problems;
import org.example.org.util.TreeNode;
public class SumOfLeftLeaves {

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) { return 0; }
        return helper(root.left, root.right, false, 0);
    }

    private int helper(TreeNode left, TreeNode right, boolean isLeft, int val) {
        if (left == null && right == null) {
            return isLeft ? val: 0;
        }
        int leftRet = 0;
        int rightRet = 0;
        if (left != null) {
            leftRet = helper(left.left, left.right, true, left.val);
        }
        if (right != null) {
            rightRet = helper(right.left, right.right, false, right.val);
        }
        return leftRet + rightRet;
    }
}
