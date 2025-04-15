package com.griddynamics.Stacks;

import java.util.Stack;

public class Problem_735 {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> myStack = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            int curr = asteroids[i];
            if (curr > 0) {
                myStack.push(curr);
            } else {
                if (myStack.isEmpty()) {
                    myStack.push(curr);
                } else {
                    while (!myStack.isEmpty()) {
                        int temp = myStack.peek();
                        if (temp < 0) myStack.push(curr);
                        else if (Math.abs(temp) > Math.abs(curr)) {
                            break;
                        } else if (Math.abs(temp) == Math.abs(curr)) {
                            myStack.pop();
                            break;
                        } else {
                            myStack.pop();
                        }
                    }
                }
            }
        }

        int[] array = new int[myStack.size()];

        int pos = 0;

        while (pos < myStack.size()) {
            array[pos] = myStack.elementAt(pos++);
        }

        return array;
    }
}
