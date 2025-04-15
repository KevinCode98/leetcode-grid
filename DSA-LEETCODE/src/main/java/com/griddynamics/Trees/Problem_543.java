package com.griddynamics.Trees;

public class Problem_543 {
    int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;

        deep(root);
        return maxDiameter;
    }

    private int deep(TreeNode node) {
        if (node == null)
            return 0;

        int left = deep(node.left);
        int right = deep(node.right);
        maxDiameter = Math.max(maxDiameter, left + right);

        return Math.max(left, right) + 1;
    }
}