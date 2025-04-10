package com.griddynamics.Hashing;

import java.util.HashMap;

public class Problem_1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> myMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (myMap.containsKey(nums[i]))
                return new int[]{myMap.get(nums[i]), i};
            myMap.put(target - nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
