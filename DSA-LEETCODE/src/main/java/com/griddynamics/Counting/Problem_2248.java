package com.griddynamics.Counting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem_2248 {
    public List<Integer> intersection(int[][] nums) {
        Map<Integer, Integer> myMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                myMap.put(nums[i][j], myMap.getOrDefault(nums[i][j], 0) + 1);
            }
        }

        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : myMap.entrySet()) {
            if (entry.getValue() == nums.length)
                result.add(entry.getKey());
        }

        return result;
    }
}
