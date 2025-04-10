package com.griddynamics.Hashing;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Problem_2352 {
    public int equalPairs(int[][] grid) {
        List<String> aux = new LinkedList<>();
        Map<String, Integer> myMap = new HashMap<>();
        int n = grid.length;

        for (int i = 0; i < n; i++)
            aux.add("");

        for (int[] nums : grid) {
            StringBuilder temp = new StringBuilder();
            for (int j = 0; j < n; j++) {
                aux.set(j, aux.get(j) + nums[j] + "-");
                temp.append(nums[j]).append("-");
            }
            myMap.put(temp.toString(), myMap.getOrDefault(temp.toString(), 0) + 1);
        }

        int count = 0;
        for (String number : aux) {
            if (myMap.containsKey(number))
                count += myMap.get(number);
        }

        return count;
    }
}
