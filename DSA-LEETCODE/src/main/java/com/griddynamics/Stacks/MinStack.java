package com.griddynamics.Stacks;

import java.util.Stack;

// Problem 155
public class MinStack {
    Stack<Integer[]> myStack;
    int min;

    public MinStack() {
        myStack = new Stack<>();
        min = Integer.MAX_VALUE;
    }

    public void push(int val) {
        if (myStack.isEmpty())
            min = Integer.MAX_VALUE;

        myStack.push(new Integer[]{val, min});
        min = Math.min(min, val);
    }

    public void pop() {
        if (min == myStack.peek()[0])
            min = myStack.peek()[1];

        myStack.pop();
    }

    public int top() {
        return myStack.peek()[0];
    }

    public int getMin() {
        return min;
    }
}
