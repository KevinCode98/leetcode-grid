package com.griddynamics.Queue;

import java.util.LinkedList;
import java.util.Queue;

// Problem 255
public class MyStack {
    Queue<Integer> myQueue;
    Queue<Integer> aux;

    public MyStack() {
        this.myQueue = new LinkedList<>();
        this.aux = new LinkedList<>();
    }

    public void push(int x) {
        while (!myQueue.isEmpty())
            aux.add(myQueue.poll());

        myQueue.add(x);

        while (!aux.isEmpty())
            myQueue.add(aux.poll());
    }

    public int pop() {
        return myQueue.poll();
    }

    public int top() {
        return myQueue.peek();
    }

    public boolean empty() {
        return myQueue.isEmpty();
    }
}
