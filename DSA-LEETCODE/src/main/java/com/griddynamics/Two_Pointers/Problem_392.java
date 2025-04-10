package com.griddynamics.Two_Pointers;

public class Problem_392 {
    public boolean isSubsequence(String s, String t) {
        if (t.length() < s.length())
            return false;

        if (s.length() == 0 || s.equals(t))
            return true;

        int auxPtr = 0;
        for (char letter : t.toCharArray()) {
            if (letter == s.charAt(auxPtr)) {
                auxPtr++;
                if (auxPtr == s.length())
                    return true;
            }
        }

        return false;
    }
}
