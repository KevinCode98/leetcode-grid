package com.griddynamics.Hashing;

import java.util.HashMap;
import java.util.Map;

public class Problem_771 {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character, Integer> counting = new HashMap<>();

        for (char ch : stones.toCharArray())
            counting.put(ch, counting.getOrDefault(ch, 0) + 1);

        int total = 0;
        for (char ch : jewels.toCharArray())
            total += counting.getOrDefault(ch, 0);

        return total;
    }
}
