package com.griddynamics.Hashing;

import java.util.HashMap;
import java.util.Map;

public class Problem_2342 {
    public int maximumSum(int[] nums) {
        Map<Integer, Integer> myMap = new HashMap<>();
        int max = -1;

        for (int num : nums) {
            int sumDigits = getSumDigit(num);
            if (myMap.containsKey(sumDigits)) {
                max = Math.max(max, num + myMap.get(sumDigits));
                myMap.put(sumDigits, Math.max(num, myMap.get(sumDigits)));
            }
            myMap.putIfAbsent(sumDigits, num);
        }

        return max;
    }

    private int getSumDigit(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
}
