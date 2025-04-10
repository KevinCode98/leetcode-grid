package com.griddynamics.Two_Pointers;

public class Problem_283 {
    public void moveZeroes(int[] nums) {
        int ptr = 0;

        for (int num : nums) {
            if (num != 0)
                nums[ptr++] = num;
        }

        while (ptr < nums.length)
            nums[ptr++] = 0;
    }
}
