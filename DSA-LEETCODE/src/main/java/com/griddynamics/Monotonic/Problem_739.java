package com.griddynamics.Monotonic;

import java.util.Stack;

public class Problem_739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        Stack<Integer> myStack = new Stack<>();

        for (int pos = n - 1; pos >= 0; pos--) {
            while (!myStack.isEmpty() && temperatures[myStack.peek()] <= temperatures[pos])
                myStack.pop();

            if (myStack.isEmpty())
                result[pos] = 0;
            else
                result[pos] = myStack.peek() - pos;

            myStack.add(pos);
        }

        return result;
    }
}
