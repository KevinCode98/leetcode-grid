package com.griddynamics.Trees;

public class Problem_112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;

        if (targetSum - root.val == 0 && root.left == null && root.right == null)
            return true;
        else
            return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}