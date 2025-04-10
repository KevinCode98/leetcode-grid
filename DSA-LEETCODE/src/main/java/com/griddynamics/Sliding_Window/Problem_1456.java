package com.griddynamics.Sliding_Window;

public class Problem_1456 {
    public int maxVowels(String s, int k) {
        int max = 0, count = 0, left = 0;

        for (int right = 0; right < s.length(); right++) {
            if (isVowel(s.charAt(right)))
                count++;

            if (right >= k) {
                if (isVowel(s.charAt(left)))
                    count--;
                left++;
            }

            max = Math.max(max, count);
        }
        return max;
    }

    private static boolean isVowel(char ch) {
        char aux = Character.toLowerCase(ch);
        return (aux == 'a' || aux == 'e' || aux == 'i' || aux == 'o' || aux == 'u');
    }
}
