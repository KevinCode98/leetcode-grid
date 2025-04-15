package com.griddynamics.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class Problem_1609 {
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> myQueue = new LinkedList<>();
        int level = 1;
        myQueue.add(root);

        while (!myQueue.isEmpty()) {
            int size = myQueue.size();
            int auxVal = (level % 2 == 0) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            for (int i = 0; i < size; i++) {
                TreeNode aux = myQueue.poll();

                if (level % 2 == 0) {
                    if (aux.val >= auxVal || aux.val % 2 != 0)
                        return false;
                    auxVal = aux.val;
                } else {
                    if (aux.val <= auxVal || aux.val % 2 == 0)
                        return false;
                    auxVal = aux.val;
                }

                if (aux.left != null)
                    myQueue.add(aux.left);

                if (aux.right != null)
                    myQueue.add(aux.right);
            }
            level++;
        }

        return true;
    }
}