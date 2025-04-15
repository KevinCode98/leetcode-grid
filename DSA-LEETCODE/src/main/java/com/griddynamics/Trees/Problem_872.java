package com.griddynamics.Trees;

import java.util.ArrayList;
import java.util.List;

public class Problem_872 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> listRoot1 = getLeafs(root1, new ArrayList<>());
        List<Integer> listRoot2 = getLeafs(root2, new ArrayList<>());

        if (listRoot1.size() != listRoot2.size())
            return false;

        return listRoot1.equals(listRoot2);
    }

    private List<Integer> getLeafs(TreeNode node, List<Integer> aux) {
        if (node == null)
            return aux;

        getLeafs(node.left, aux);
        getLeafs(node.right, aux);

        if (node.left == null && node.right == null)
            aux.add(node.val);

        return aux;
    }
}