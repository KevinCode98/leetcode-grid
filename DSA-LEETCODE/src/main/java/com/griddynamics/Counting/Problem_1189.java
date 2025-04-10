package com.griddynamics.Counting;

import java.util.HashMap;
import java.util.Map;

public class Problem_1189 {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> aux = new HashMap<>();
        for (char ch : "balloon".toCharArray())
            aux.put(ch, aux.getOrDefault(ch, 0) + 1);

        Map<Character, Integer> myMap = new HashMap<>();
        for (char ch : text.toCharArray()) {
            if (aux.containsKey(ch))
                myMap.put(ch, myMap.getOrDefault(ch, 0) + 1);
        }

        int result = Integer.MAX_VALUE;
        if (myMap.size() == aux.size()) {
            for (var val : myMap.entrySet())
                result = Math.min(result, val.getValue() / aux.getOrDefault(val.getKey(), 0));
        }

        return (result == Integer.MAX_VALUE) ? 0 : result;
    }
}
