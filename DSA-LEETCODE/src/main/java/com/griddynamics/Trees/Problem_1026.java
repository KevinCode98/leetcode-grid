package com.griddynamics.Trees;

public class Problem_1026 {
    int max = 0;

    public int maxAncestorDiff(TreeNode root) {
        if (root == null)
            return 0;

        dfs(root, root.val, root.val);
        return max;
    }

    private void dfs(TreeNode node, int maxValue, int minValue) {
        if (node == null)
            return;

        max = Math.max(max, Math.abs(node.val - maxValue));
        max = Math.max(max, Math.abs(node.val - minValue));

        dfs(node.left, Math.max(node.val, maxValue), Math.min(node.val, minValue));
        dfs(node.right, Math.max(node.val, maxValue), Math.min(node.val, minValue));
    }
}