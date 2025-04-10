package com.griddynamics.Counting;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Problem_451 {
    public String frequencySort(String s) {
        Map<Character, Integer> myMap = new HashMap<>();

        for (char c : s.toCharArray())
            myMap.put(c, myMap.getOrDefault(c, 0) + 1);

        PriorityQueue<Map.Entry<Character, Integer>> myQueue =
                new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        myQueue.addAll(myMap.entrySet());
        StringBuilder str = new StringBuilder();
        while (!myQueue.isEmpty()) {
            var aux = myQueue.poll();
            String auxStr = "" + aux.getKey();
            str.append(auxStr.repeat(aux.getValue()));
        }

        return str.toString();
    }
}