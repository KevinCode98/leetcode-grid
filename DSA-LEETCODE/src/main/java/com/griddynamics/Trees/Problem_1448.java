package com.griddynamics.Trees;

public class Problem_1448 {
    int count = 0;

    public int goodNodes(TreeNode root) {
        dfs(root, Integer.MIN_VALUE);

        return count;
    }

    private void dfs(TreeNode root, int max) {
        if (root == null)
            return;

        if (root.val >= max) {
            max = root.val;
            count++;
        }

        dfs(root.left, max);
        dfs(root.right, max);
    }
}