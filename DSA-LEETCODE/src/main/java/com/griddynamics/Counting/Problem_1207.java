package com.griddynamics.Counting;

import java.util.HashSet;
import java.util.Set;

public class Problem_1207 {
    public boolean uniqueOccurrences(int[] arr) {
        int[] counting = new int[2001];
        for (int num : arr)
            counting[1000 + num]++;

        Set<Integer> frequencies = new HashSet<>();
        for (int i = 0; i <= 2000; i++) {
            if (!(counting[i] == 0)) {
                if (frequencies.contains(counting[i]))
                    return false;
                frequencies.add(counting[i]);
            }
        }

        return true;
    }
}
