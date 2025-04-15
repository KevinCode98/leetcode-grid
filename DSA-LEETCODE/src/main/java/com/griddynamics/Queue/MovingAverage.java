package com.griddynamics.Queue;

import java.util.LinkedList;
import java.util.Queue;

// Problem 346
public class MovingAverage {
    private double total;
    private Queue<Integer> myQueue;
    private int size;

    public MovingAverage(int size) {
        this.total = 0;
        this.myQueue = new LinkedList<>();
        this.size = size;
    }

    public double next(int val) {
        this.myQueue.add(val);
        this.total += val;

        while (myQueue.size() > this.size)
            this.total -= myQueue.poll();

        return total / myQueue.size();
    }
}
