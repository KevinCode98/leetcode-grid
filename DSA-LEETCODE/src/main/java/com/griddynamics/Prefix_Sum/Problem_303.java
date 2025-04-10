package com.griddynamics.Prefix_Sum;

public class Problem_303 {
    private int[] prefix;
    private int n;

    public Problem_303(int[] nums) {
        this.n = nums.length;
        this.prefix = new int[n];

        int total = 0;
        for (int i = 0; i < n; i++) {
            total += nums[i];
            prefix[i] = total;
        }
    }

    public int sumRange(int left, int right) {
        if (left == 0)
            return prefix[right];
        return prefix[right] - prefix[left - 1];
    }
}
