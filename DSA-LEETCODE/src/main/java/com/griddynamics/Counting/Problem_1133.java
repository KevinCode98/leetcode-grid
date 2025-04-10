package com.griddynamics.Counting;

import java.util.HashMap;
import java.util.Map;

public class Problem_1133 {
    public int largestUniqueNumber(int[] nums) {
        Map<Integer, Integer> myMap = new HashMap<>();
        int result = -1;

        for (int num : nums)
            myMap.put(num, myMap.getOrDefault(num, 0) + 1);

        for (var aux : myMap.entrySet()) {
            if (aux.getValue() == 0)
                result = Math.max(result, aux.getKey());
        }

        return result;
    }
}
