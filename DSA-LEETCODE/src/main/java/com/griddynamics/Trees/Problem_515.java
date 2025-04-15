package com.griddynamics.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem_515 {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null)
            return result;

        Queue<TreeNode> myQueue = new LinkedList<>();
        myQueue.add(root);

        while (!myQueue.isEmpty()) {
            int size = myQueue.size();
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < size; i++) {
                TreeNode aux = myQueue.poll();

                max = Math.max(max, aux.val);

                if (aux.left != null)
                    myQueue.add(aux.left);

                if (aux.right != null)
                    myQueue.add(aux.right);
            }

            result.add(max);
        }

        return result;
    }
}