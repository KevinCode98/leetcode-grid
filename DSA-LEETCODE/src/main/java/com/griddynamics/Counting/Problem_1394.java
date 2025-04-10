package com.griddynamics.Counting;

public class Problem_1394 {
    public int findLucky(int[] arr) {
        int[] counting = new int[501];

        for (int num : arr)
            counting[num]++;

        for (int i = 500; i >= 1; i--) {
            if (counting[i] == i)
                return i;
        }

        return -1;
    }
}
