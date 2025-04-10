package com.griddynamics.Prefix_Sum;

public class Problem_724 {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] postfix = new int[n];
        int total = 0;

        // Inserting values in prefix
        for (int i = 0; i < n; i++) {
            total += nums[i];
            prefix[i] = nums[i];
        }

        // Inserting values in postfix
        total = 0;
        for (int i = n - 1; i >= 0; i--) {
            total += nums[i];
            postfix[i] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            if (prefix[i] == postfix[i])
                return i;
        }

        return -1;
    }
}
