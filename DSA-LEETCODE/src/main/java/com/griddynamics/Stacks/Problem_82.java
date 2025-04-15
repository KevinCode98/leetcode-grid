package com.griddynamics.Stacks;

import java.util.Stack;

public class Problem_82 {
    public String makeGood(String s) {
        Stack<Character> myStack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (myStack.isEmpty())
                myStack.push(ch);
            else {
                if (Character.isUpperCase(ch) && Character.isLowerCase(myStack.peek())
                        && Character.toLowerCase(ch) == myStack.peek())
                    myStack.pop();
                else if (Character.isLowerCase(ch) && Character.isUpperCase(myStack.peek())
                        && Character.toUpperCase(ch) == myStack.peek())
                    myStack.pop();
                else
                    myStack.push(ch);
            }
        }

        String myString = "";
        while (!myStack.isEmpty())
            myString = myStack.pop() + myString;

        return myString;
    }
}
