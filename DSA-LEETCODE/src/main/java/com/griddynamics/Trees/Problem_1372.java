package com.griddynamics.Trees;

public class Problem_1372 {
    int maxZigZag = 0;

    public int longestZigZag(TreeNode root) {
        if (root == null)
            return 0;

        dfs(root.left, 1, true);
        dfs(root.right, 1, false);

        return maxZigZag;
    }

    private void dfs(TreeNode node, int current, boolean isLeft) {
        if (node == null)
            return;

        maxZigZag = Math.max(maxZigZag, current);

        if (isLeft) {
            dfs(node.right, current + 1, false);
            dfs(node.left, 1, true);
        } else {
            dfs(node.left, current + 1, true);
            dfs(node.right, 1, false);
        }
    }
}