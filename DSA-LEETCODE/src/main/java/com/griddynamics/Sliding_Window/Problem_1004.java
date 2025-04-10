package com.griddynamics.Sliding_Window;

public class Problem_1004 {
    public int longestOnes(int[] nums, int k) {
        int countZeros = 0, maxLen = 0, left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0)
                countZeros++;

            while (countZeros > k) {
                if (nums[left++] == 0)
                    countZeros--;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
