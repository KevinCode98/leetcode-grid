package com.griddynamics.Prefix_Sum;

public class Problem_1413 {
    public int minStartValue(int[] nums) {
        int total = 0, min = Integer.MAX_VALUE;
        for (int num : nums) {
            total += num;
            min = Math.min(min, total);
        }

        return (min < 0) ? Math.abs(min) + 1 : 1;
    }
}
