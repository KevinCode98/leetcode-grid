package com.griddynamics.Two_Pointers;

public class Problem_557 {
    public String reverseWords(String s) {
        StringBuilder str = new StringBuilder(s);

        int left = 0, right = 0;
        for (int ptr = 0; ptr < s.length(); ptr++) {
            if (s.charAt(ptr) == ' ' || ptr == s.length() - 1) {
                right = (ptr == s.length() - 1) ? ptr : ptr - 1;

                while (left < right) {
                    char temp = s.charAt(left);
                    str.setCharAt(left++, s.charAt(right));
                    str.setCharAt(right--, temp);
                }

                left = ptr + 1;
            }
        }

        return str.toString();
    }
}
