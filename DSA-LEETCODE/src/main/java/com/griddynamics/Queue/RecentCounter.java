package com.griddynamics.Queue;

import java.util.LinkedList;
import java.util.Queue;

// Problem 933
public class RecentCounter {
    Queue<Integer> calls;

    public RecentCounter() {
        this.calls = new LinkedList<>();
    }

    public int ping(int t) {
        while (!calls.isEmpty() && calls.peek() < t - 3000)
            calls.poll();

        calls.add(t);
        return calls.size();

    }
}
