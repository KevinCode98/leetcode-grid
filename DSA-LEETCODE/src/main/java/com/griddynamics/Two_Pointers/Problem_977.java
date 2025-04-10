package com.griddynamics.Two_Pointers;

public class Problem_977 {
    public int[] sortedSquares(int[] nums) {
        int left = 0, right = nums.length - 1, ptr = nums.length - 1;
        int[] result = new int[nums.length];

        while (left <= right) {
            if (Math.pow(nums[left], 2) < Math.pow(nums[right], 2))
                result[ptr--] = (int) Math.pow(nums[right--], 2);
            else
                result[ptr--] = (int) Math.pow(nums[left++], 2);
        }

        return result;
    }
}
