package com.griddynamics.Monotonic;

import java.util.Stack;

public class Problem_1944 {
    public int[] canSeePersonsCount(int[] heights) {
        int[] result = new int[heights.length];
        Stack<Integer> myStack = new Stack<>();

        for (int pos = heights.length - 1; pos >= 0; pos--) {
            int count = 1;
            while (!myStack.isEmpty() && myStack.peek() < heights[pos]) {
                count++;
                myStack.pop();
            }

            if (myStack.isEmpty())
                result[pos] = --count;
            else
                result[pos] = count;

            myStack.push(heights[pos]);
        }

        return result;
    }
}
