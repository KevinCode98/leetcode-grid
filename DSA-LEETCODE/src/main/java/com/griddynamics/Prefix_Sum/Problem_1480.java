package com.griddynamics.Prefix_Sum;

public class Problem_1480 {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            total += nums[i];
            result[i] = total;
        }

        return result;
    }
}
