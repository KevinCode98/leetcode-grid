package com.griddynamics.Hashing;

import java.util.HashSet;
import java.util.Set;

public class Problem_217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num))
                return true;
            set.add(num);
        }
        return false;
    }
}
