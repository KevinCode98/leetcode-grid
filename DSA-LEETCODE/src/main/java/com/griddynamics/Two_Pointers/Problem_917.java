package com.griddynamics.Two_Pointers;

public class Problem_917 {
    public String reverseOnlyLetters(String s) {
        int n = s.length();
        int right = n - 1;
        int left = 0;
        StringBuilder str = new StringBuilder(s);


        while (left < right) {
            if (!Character.isAlphabetic(str.charAt(left)))
                left++;
            else if (!Character.isAlphabetic(str.charAt(right)))
                right--;
            else {
                char temp = s.charAt(left);
                str.setCharAt(left++, s.charAt(right));
                str.setCharAt(right--, temp);
            }
        }

        return str.toString();
    }
}
