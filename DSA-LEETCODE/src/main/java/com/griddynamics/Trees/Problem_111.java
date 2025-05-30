package com.griddynamics.Trees;

public class Problem_111 {
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;

        int left = minDepth(root.left);
        int right = minDepth(root.right);
        return (left == 0 || right == 0) ? Math.max(left, right) + 1 : Math.min(left, right) + 1;
    }
}