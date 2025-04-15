package com.griddynamics.Monotonic;

import java.util.Stack;

// Problem 901
public class StockSpanner {
    Stack<Integer[]> myStack;

    public StockSpanner() {
        this.myStack = new Stack<>();
    }

    public int next(int price) {
        int count = 1;
        while (!myStack.isEmpty() && myStack.peek()[0] <= price)
            count += myStack.pop()[1];

        myStack.add(new Integer[]{price, count});

        return count;
    }
}
