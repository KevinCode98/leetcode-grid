package com.griddynamics.Trees;

public class Problem_101 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;

        return isEqual(root.left, root.right);
    }

    private boolean isEqual(TreeNode nodeLeft, TreeNode nodeRight) {
        if (nodeLeft == null && nodeRight == null)
            return true;

        if ((nodeLeft == null || nodeRight == null) || nodeLeft.val != nodeRight.val)
            return false;

        return isEqual(nodeLeft.left, nodeRight.right) && isEqual(nodeLeft.right, nodeRight.left);
    }
}