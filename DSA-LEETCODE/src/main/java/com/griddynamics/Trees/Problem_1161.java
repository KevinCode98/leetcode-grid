package com.griddynamics.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class Problem_1161 {
    public int maxLevelSum(TreeNode root) {
        if (root == null)
            return 0;

        int maxSum = Integer.MIN_VALUE;
        int level = 1, levelMax = 1;
        Queue<TreeNode> myQueue = new LinkedList<>();
        myQueue.add(root);

        while (!myQueue.isEmpty()) {
            int size = myQueue.size();
            int sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode aux = myQueue.poll();
                sum += aux.val;

                if (aux.left != null)
                    myQueue.add(aux.left);

                if (aux.right != null)
                    myQueue.add(aux.right);
            }

            if (maxSum < sum) {
                maxSum = sum;
                levelMax = level;
            }

            level++;
        }

        return levelMax;
    }
}