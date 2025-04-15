package com.griddynamics.Trees;

public class Problem_236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)
            return null;

        TreeNode nodeLeft = lowestCommonAncestor(root.left, p, q);
        TreeNode nodeRight = lowestCommonAncestor(root.right, p, q);

        if (nodeLeft != null && nodeRight != null)
            return root;

        if (p == root || q == root)
            return root;

        if (nodeLeft == null)
            return nodeRight;

        return nodeLeft;
    }
}