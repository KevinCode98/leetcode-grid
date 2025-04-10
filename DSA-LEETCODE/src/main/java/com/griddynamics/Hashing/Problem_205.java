package com.griddynamics.Hashing;

import java.util.HashMap;
import java.util.Map;

public class Problem_205 {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;

        if (s.equals(t))
            return true;

        Map<Character, Character> myMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sLetter = s.charAt(i);
            char tLetter = t.charAt(i);

            if (myMap.containsKey(sLetter)) {
                if (myMap.get(sLetter) != tLetter)
                    return false;
            } else {
                if (myMap.containsValue(tLetter))
                    return false;
                myMap.put(sLetter, tLetter);
            }
        }
        return true;
    }
}
