package com.griddynamics.Counting;

public class Problem_1748 {
    public int sumOfUnique(int[] nums) {
        int[] counting = new int[101];

        for (int num : nums)
            counting[num]++;

        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (counting[i] == 1)
                sum += i;
        }

        return sum;
    }
}
