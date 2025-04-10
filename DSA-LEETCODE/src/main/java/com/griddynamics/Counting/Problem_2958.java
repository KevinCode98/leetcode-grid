package com.griddynamics.Counting;

import java.util.HashMap;
import java.util.Map;

public class Problem_2958 {
    public int maxSubarrayLength(int[] nums, int k) {
        int maxLen = 0, left = 0;
        Map<Integer, Integer> myMap = new HashMap<>();

        for (int right = 0; right < nums.length; right++) {
            myMap.put(nums[right], myMap.getOrDefault(nums[right], 0) + 1);

            while (myMap.get(nums[right]) > k)
                myMap.put(nums[left], myMap.get(nums[left++]) - 1);

            maxLen = Math.max(maxLen, (right - left) + 1);
        }

        return maxLen;
    }
}
