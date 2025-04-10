package com.griddynamics.Counting;

import java.util.HashMap;
import java.util.Map;

public class Problem_560 {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> myMap = new HashMap<>();
        myMap.put(0, 1);

        int result = 0;
        int sum = 0;

        for (int num : nums) {
            sum += num;
            result += myMap.getOrDefault(sum - k, 0);
            myMap.put(sum, myMap.getOrDefault(sum, 0) + 1);
        }

        return result;
    }
}
