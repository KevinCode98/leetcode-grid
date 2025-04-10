package com.griddynamics.Prefix_Sum;

public class Problem_2270 {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;
        long[] prefix = new long[n];

        long total = 0;
        for (int i = 0; i < n; i++) {
            total += nums[i];
            prefix[i] = total;
        }

        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            long valAct = prefix[i];
            long prefixVal = total - prefix[i];
            if (valAct >= prefixVal)
                count++;
        }

        return count;
    }
}
