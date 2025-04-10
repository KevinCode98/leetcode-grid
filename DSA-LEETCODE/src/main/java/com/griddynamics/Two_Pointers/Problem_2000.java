package com.griddynamics.Two_Pointers;

public class Problem_2000 {
    public String reversePrefix(String word, char ch) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                int left = 0, right = i;

                while (left < right) {
                    char temp = word.charAt(left);
                    str.setCharAt(left++, word.charAt(right));
                    str.setCharAt(right--, temp);
                }

                return str.toString();
            }
        }

        return word;
    }
}
