package com.griddynamics.Stacks;

import java.util.Stack;

public class Problem_1047 {
    public String removeDuplicates(String s) {
        Stack<Character> myStack = new Stack<>();
        for (char letter : s.toCharArray()) {
            if (myStack.isEmpty())
                myStack.push(letter);
            else {
                if (myStack.peek() != letter)
                    myStack.push(letter);
                else
                    myStack.pop();
            }
        }

        String result = "";
        while (!myStack.isEmpty())
            result = myStack.pop() + result;

        return result;
    }
}
