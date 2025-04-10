package com.griddynamics.Counting;

public class Problem_3005 {
    public int maxFrequencyElements(int[] nums) {
        int max = 0;
        int[] counting = new int[101];

        for (int num : nums) {
            counting[num]++;
            max = Math.max(max, counting[num]);
        }

        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (counting[i] == max)
                sum += max;
        }

        return sum;
    }
}
