package com.griddynamics.Stacks;

import java.util.Stack;

public class Problem_946 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> myStack = new Stack<>();
        int pos = 0, aux = 0;

        while (pos < pushed.length) {
            int val = pushed[aux];
            if (aux < pushed.length) {
                myStack.add(val);
                aux++;
            }

            while (!myStack.isEmpty() && pos < pushed.length && myStack.peek() == popped[pos]) {
                myStack.pop();
                pos++;
            }

            if (!myStack.isEmpty() && aux == pushed.length && myStack.peek() != popped[pos]) return false;
        }

        return true;
    }
}
