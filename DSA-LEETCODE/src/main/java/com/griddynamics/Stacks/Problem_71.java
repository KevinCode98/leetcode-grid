package com.griddynamics.Stacks;

import java.util.Stack;

public class Problem_71 {
    public String simplifyPath(String path) {
        String[] directories = path.split("/");
        StringBuilder result = new StringBuilder();
        Stack<String> myStack = new Stack<>();

        for (String str : directories) {
            if (!str.isBlank() && !str.equals(".")) {
                if (!myStack.isEmpty() && str.equals(".."))
                    myStack.pop();
                else {
                    if (!str.equals(".."))
                        myStack.push(str);
                }
            }
        }

        while (!myStack.isEmpty())
            result.insert(0, "/" + myStack.pop());

        return (result.toString().isEmpty()) ? "/" : result.toString();
    }
}
