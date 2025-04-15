package com.griddynamics.Trees;

import java.util.LinkedList;
import java.util.List;

public class Problem_113 {
    List<List<Integer>> result = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if (root == null)
            return new LinkedList<>();

        dfs(root, targetSum, new LinkedList<>());
        return result;
    }

    private void dfs(TreeNode node, int targetSum, List<Integer> auxList) {
        if (node == null)
            return;

        auxList.add(node.val);
        if (targetSum - node.val == 0 && node.left == null && node.right == null)
            result.add(new LinkedList<>(auxList));

        dfs(node.left, targetSum - node.val, auxList);
        dfs(node.right, targetSum - node.val, auxList);
        auxList.removeLast();
    }
}
