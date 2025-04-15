package com.griddynamics.Trees;

public class Problem_437 {
    long target;
    int count = 0;

    public int pathSum(TreeNode root, int targetSum) {
        if (root == null)
            return 0;
        this.target = targetSum;
        dfs(root);
        return count;
    }

    private void dfs(TreeNode node) {
        if (node == null)
            return;

        dfs(node.left);
        dfs(node.right);

        helper(node, target);
    }

    private void helper(TreeNode node, long current) {
        if (node == null)
            return;

        if (current - node.val == 0)
            count++;

        helper(node.left, current - node.val);
        helper(node.right, current - node.val);
    }
}