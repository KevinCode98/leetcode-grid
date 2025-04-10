package com.griddynamics.Counting;

import java.util.HashMap;
import java.util.Map;

public class Problem_930 {
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer, Integer> myMap = new HashMap<>();
        int sum = 0, count = 0;

        for (int num : nums) {
            sum += num;
            if (sum == goal)
                count++;

            count += myMap.getOrDefault(sum - goal, 0);
            myMap.put(sum, myMap.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}