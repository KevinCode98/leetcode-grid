package com.griddynamics.Hashing;

import java.util.HashMap;
import java.util.Map;

public class Problem_3 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int maxLen = 0;
        int left = 0;

        for (int right = 0; right < s.length(); ++right) {
            char letter = s.charAt(right);
            map.put(letter, map.getOrDefault(letter, 0) + 1);

            while (map.get(letter) > 1) {
                char letterDelete = s.charAt(left++);
                map.put(letterDelete, map.get(letterDelete) - 1);
            }

            maxLen = Math.max(maxLen, (right - left + 1));
        }

        return maxLen;
    }
}
