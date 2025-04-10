package com.griddynamics.Prefix_Sum;

public class Problem_1732 {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int sum = 0;

        for (int i : gain) {
            sum += i;
            max = Math.max(max, sum);
        }

        return max;
    }
}
