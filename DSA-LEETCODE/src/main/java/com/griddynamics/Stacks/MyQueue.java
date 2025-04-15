package com.griddynamics.Stacks;

import java.util.Stack;

// Problem 232
public class MyQueue {
    Stack<Integer> firstStack;
    Stack<Integer> secondStack;

    public MyQueue() {
        firstStack = new Stack<>();
        secondStack = new Stack<>();
    }

    public void push(int x) {
        while (!firstStack.isEmpty())
            secondStack.add(firstStack.pop());

        secondStack.add(x);

        while (!secondStack.isEmpty())
            firstStack.add(secondStack.pop());
    }

    public int pop() {
        return firstStack.pop();
    }

    public int peek() {
        return firstStack.peek();
    }

    public boolean empty() {
        return firstStack.isEmpty();
    }
}
