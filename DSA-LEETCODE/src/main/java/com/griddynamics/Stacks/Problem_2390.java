package com.griddynamics.Stacks;

import java.util.Stack;

public class Problem_2390 {
    public String removeStars(String s) {
        Stack<Character> myStack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (!myStack.isEmpty() && ch == '*')
                myStack.pop();
            else
                myStack.push(ch);
        }

        StringBuilder result = new StringBuilder();
        while (!myStack.isEmpty())
            result.append(myStack.pop());

        return result.reverse().toString();
    }
}
