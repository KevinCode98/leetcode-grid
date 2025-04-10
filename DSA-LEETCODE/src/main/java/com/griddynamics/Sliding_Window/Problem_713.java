package com.griddynamics.Sliding_Window;

public class Problem_713 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int total = 1, count = 0, left = 0;
        for (int right = 0; right < nums.length; right++) {
            total *= nums[right];
            while (left <= right && total >= k)
                total /= nums[left++];

            count += (right - left) + 1;
        }

        return count;
    }
}
