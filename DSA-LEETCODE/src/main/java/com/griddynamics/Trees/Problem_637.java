package com.griddynamics.Trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem_637 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new LinkedList<>();

        if (root == null)
            return result;

        Queue<TreeNode> myQueue = new LinkedList<>();
        myQueue.add(root);

        while (!myQueue.isEmpty()) {
            double size = myQueue.size();
            double sum = 0.0;
            for (int i = 0; i < size; i++) {
                TreeNode aux = myQueue.poll();
                sum += aux.val;

                if (aux.left != null)
                    myQueue.add(aux.left);

                if (aux.right != null)
                    myQueue.add(aux.right);
            }

            result.add(sum / size);
        }

        return result;
    }
}