package com.griddynamics.Stacks;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class Problem_2434 {
    public String robotWithString(String s) {
        int[] last = new int[26];
        Arrays.fill(last, -1);
        int auxValue = 97; // Valor de 'a' en ASCII

        for (int i = 0; i < s.length(); i++)
            last[(int) s.charAt(i) - auxValue] = i;

        Stack<Character> myStack = new Stack<>();
        LinkedList<Character> ans = new LinkedList<>();
        int curr = 0;

        for (int i = 0; i < 26; i++) {
            char myChar = (char) (i + auxValue);
            while (!myStack.isEmpty() && myChar >= myStack.peek())
                ans.add(myStack.pop());

            for (int aux = curr; aux < last[i] + 1; aux++) {
                if (s.charAt(aux) == myChar)
                    ans.add(s.charAt(aux));
                else
                    myStack.add(s.charAt(aux));
            }
            curr = Math.max(curr, last[i] + 1);
        }

        while (!myStack.isEmpty())
            ans.add(myStack.pop());

        StringBuilder result = new StringBuilder();
        for (char element : ans)
            result.append(element).append("");

        return result.toString().trim();
    }
}
