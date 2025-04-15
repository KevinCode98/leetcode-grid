package com.griddynamics.Trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem_103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if (root == null)
            return result;

        int level = 1;
        Queue<TreeNode> myQueue = new LinkedList<>();
        myQueue.add(root);

        while (!myQueue.isEmpty()) {
            result.add(new LinkedList<>());
            int size = myQueue.size();

            for (int i = 0; i < size; i++) {
                TreeNode aux = myQueue.poll();

                if (level % 2 == 0)
                    result.getLast().addFirst(aux.val);
                else
                    result.getLast().addLast(aux.val);

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