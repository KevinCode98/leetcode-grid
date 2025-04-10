package com.griddynamics.Hashing;

import java.util.HashMap;
import java.util.Map;

public class Problem_1426 {
    public int countElements(int[] arr) {
        Map<Integer, Integer> myMap = new HashMap<>();

        for (int num : arr)
            myMap.put(num, myMap.getOrDefault(num, 0) + 1);

        int count = 0;
        for (int num : myMap.keySet()) {
            int nextVal = num + 1;
            if (myMap.containsKey(nextVal))
                count += myMap.get(num);
        }

        return count;
    }
}
