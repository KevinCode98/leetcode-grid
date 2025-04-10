package com.griddynamics;

import java.util.HashMap;
import java.util.Map;

public class Problem_3 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> myMap = new HashMap<>();
        int left = 0, longest = 0;
        for (int right = 0; right < s.length(); right++) {
            char letter = s.charAt(right);

            myMap.put(letter, myMap.getOrDefault(letter, 0) + 1);
            while (myMap.get(letter) > 1) {
                char letterToDelete = s.charAt(left++);
                myMap.put(letterToDelete, myMap.get(letter) - 1);
            }

            longest = Math.max(longest, (right - left) + 1);
        }

        return longest;
    }
}
