package com.griddynamics.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem_199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (root == null)
            return result;

        Queue<TreeNode> myQueue = new LinkedList<>();
        myQueue.add(root);

        while (!myQueue.isEmpty()) {
            int size = myQueue.size();
            int lastElement = myQueue.peek().val;

            for (int i = 0; i < size; i++) {
                TreeNode aux = myQueue.poll();
                lastElement = aux.val;

                if (aux.left != null)
                    myQueue.add(aux.left);

                if (aux.right != null)
                    myQueue.add(aux.right);
            }

            result.add(lastElement);
        }

        return result;
    }
}
