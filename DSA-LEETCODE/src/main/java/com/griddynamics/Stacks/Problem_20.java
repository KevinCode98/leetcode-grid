package com.griddynamics.Stacks;

import java.util.Stack;

public class Problem_20 {
    public boolean isValid(String s) {
        Stack<Character> myStack = new Stack<>();

        for (char ch : s.toCharArray()) {
            switch (ch) {
                case '(':
                case '{':
                case '[':
                    myStack.add(ch);
                    break;
                case ')':
                    if (myStack.isEmpty() || myStack.peek() != '(')
                        return false;
                    myStack.pop();
                    break;
                case '}':
                    if (myStack.isEmpty() || myStack.peek() != '{')
                        return false;
                    myStack.pop();
                    break;
                case ']':
                    if (myStack.isEmpty() || myStack.peek() != '[')
                        return false;
                    myStack.pop();
                    break;
            }
        }

        return myStack.isEmpty();
    }
}
