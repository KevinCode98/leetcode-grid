package com.griddynamics.Counting;

import java.util.HashSet;
import java.util.Set;

// Daniel challenge
public class Problem_1695 {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        int maxTotal = 0, left = 0, total = 0;

        for (int right = 0; right < nums.length; right++) {
            total += nums[right];
            while (seen.contains(nums[right])) {
                total -= nums[left];
                seen.remove(nums[left++]);
            }

            seen.add(nums[right]);
            maxTotal = Math.max(maxTotal, total);
        }

        return maxTotal;
    }
}