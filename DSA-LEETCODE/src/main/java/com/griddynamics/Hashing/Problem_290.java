package com.griddynamics.Hashing;

import java.util.HashMap;
import java.util.Map;

public class Problem_290 {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> myMap = new HashMap<>();
        String[] words = s.split(" ");

        if (pattern.length() != words.length)
            return false;

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);

            if (myMap.containsKey(ch)) {
                if (!myMap.get(ch).equals(words[i]))
                    return false;
            } else {
                if (myMap.containsValue(words[i]))
                    return false;
                myMap.put(ch, words[i]);
            }
        }

        return true;
    }
}
