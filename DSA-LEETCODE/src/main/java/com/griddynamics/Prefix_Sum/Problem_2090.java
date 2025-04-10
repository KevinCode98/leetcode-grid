package com.griddynamics.Prefix_Sum;

import java.util.Arrays;

public class Problem_2090 {
    public int[] getAverages(int[] nums, int k) {
        if (k == 0)
            return nums;

        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);

        if (k > n)
            return result;

        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++)
            prefix[i + 1] = prefix[i] + nums[i];

        int positions = (k * 2) + 1;
        for (int i = k; i < (n - k); i++) {
            int leftBound = i - k, rightBound = i + k;
            long subArraySum = prefix[rightBound + 1] - prefix[leftBound];
            result[i] = (int) (subArraySum / positions);
        }

        return result;
    }
}
