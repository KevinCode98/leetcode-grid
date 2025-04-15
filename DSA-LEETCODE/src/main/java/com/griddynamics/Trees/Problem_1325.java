package com.griddynamics.Trees;

public class Problem_1325 {
    int target;

    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if (root == null)
            return null;

        this.target = target;
        dfs(root.left, root, true);
        dfs(root.right, root, false);

        if (root.val == target && root.left == null && root.right == null)
            return null;

        return root;
    }

    private void dfs(TreeNode node, TreeNode parent, boolean isLeft) {
        if (node == null)
            return;

        dfs(node.left, node, true);
        dfs(node.right, node, false);

        if (node.val == target && node.left == null && node.right == null) {
            if (isLeft)
                parent.left = null;
            else
                parent.right = null;
        }
    }
}
