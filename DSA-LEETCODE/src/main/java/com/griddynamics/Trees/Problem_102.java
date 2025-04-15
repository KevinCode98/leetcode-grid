package com.griddynamics.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem_102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null)
            return result;

        int level = 0;
        Queue<TreeNode> myQueue = new LinkedList<>();
        myQueue.add(root);

        while (!myQueue.isEmpty()) {
            int size = myQueue.size();
            result.add(new ArrayList<>());

            for (int i = 0; i < size; i++) {
                TreeNode aux = myQueue.poll();
                result.get(level).add(aux.val);

                if (aux.left != null)
                    myQueue.add(aux.left);

                if (aux.right != null)
                    myQueue.add(aux.right);
            }

            level++;
        }

        return result;
    }
}