package com.griddynamics.Sliding_Window;

public class Problem_643 {
    public double findMaxAverage(int[] nums, int k) {
        double total = 0.0;

        for (int i = 0; i < k; i++)
            total += nums[i];

        double max = total / k;
        for (int ptr = k; ptr < nums.length; ptr++) {
            total += (nums[ptr] - nums[ptr - k]);
            max = Math.max(max, (total / k));
        }

        return max;
    }
}
