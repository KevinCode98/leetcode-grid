package com.griddynamics.Trees;

public class Problem_226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;

        invertTree(root.left);
        invertTree(root.right);

        TreeNode aux = root.left;
        root.left = root.right;
        root.right = aux;

        return root;
    }
}