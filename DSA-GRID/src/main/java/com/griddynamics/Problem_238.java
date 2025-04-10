package com.griddynamics;

import java.util.Arrays;

public class Problem_238 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] postfix = new int[n];
        int[] result = new int[n];

        Arrays.fill(prefix, 1);
        Arrays.fill(postfix, 1);
        int auxTotal = 1;

        for (int i = 1; i < n; i++) {
            auxTotal *= nums[i - 1];
            prefix[i] = auxTotal;
        }

        auxTotal = 1;
        for (int i = n - 2; i >= 0; i--) {
            auxTotal *= nums[i + 1];
            postfix[i] = auxTotal;
        }

        for (int i = 0; i < n; i++) {
            result[i] = prefix[i] * postfix[i];
        }

        return result;
    }
}
