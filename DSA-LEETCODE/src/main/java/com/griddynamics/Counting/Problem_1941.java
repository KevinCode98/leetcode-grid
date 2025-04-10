package com.griddynamics.Counting;

import java.util.HashMap;
import java.util.Map;

public class Problem_1941 {
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> myMap = new HashMap<>();

        for (char ch : s.toCharArray())
            myMap.put(ch, myMap.getOrDefault(ch, 0) + 1);

        int valCount = myMap.get(s.charAt(0));
        for (int val : myMap.values()) {
            if (valCount != val) return false;
        }

        return true;
    }
}
