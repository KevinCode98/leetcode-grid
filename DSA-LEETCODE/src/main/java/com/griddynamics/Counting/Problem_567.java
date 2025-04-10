package com.griddynamics.Counting;

import java.util.HashMap;
import java.util.Map;

public class Problem_567 {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.isEmpty() || s1.equals(s2))
            return true;

        if (s1.length() > s2.length())
            return false;

        Map<Character, Integer> myMap = new HashMap<>();
        for (char ch : s1.toCharArray())
            myMap.put(ch, myMap.getOrDefault(ch, 0) + 1);

        for (int pos = 0; pos < s2.length(); pos++) {
            if (myMap.containsKey(s2.charAt(pos)) && pos + s1.length() <= s2.length()) {
                Map<Character, Integer> auxMap = new HashMap<>(myMap);
                for (int i = pos; i < pos + s1.length(); i++) {
                    char letter = s2.charAt(i);
                    if (auxMap.containsKey(letter)) {
                        auxMap.put(letter, auxMap.get(letter) - 1);
                        if (auxMap.get(letter) == 0)
                            auxMap.remove(letter);
                    }
                }

                if (auxMap.isEmpty())
                    return true;
            }
        }

        return false;
    }
}
