package com.griddynamics;

public class Problem_26 {
    public int removeDuplicates(int[] nums) {
        int ptr = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[ptr])
                nums[++ptr] = nums[i];
        }

        return ptr + 1;
    }
}
