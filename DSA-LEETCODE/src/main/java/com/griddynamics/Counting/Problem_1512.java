package com.griddynamics.Counting;

import java.util.HashMap;
import java.util.Map;

public class Problem_1512 {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> myMap = new HashMap<>();

        int total = 0;
        for (int num : nums) {
            total += myMap.getOrDefault(num, 0);
            myMap.put(num, myMap.getOrDefault(num, 0) + 1);
        }

        return total;
    }
}
