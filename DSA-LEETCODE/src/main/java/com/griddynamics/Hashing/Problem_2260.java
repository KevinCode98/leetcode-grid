package com.griddynamics.Hashing;

import java.util.HashSet;
import java.util.Set;

public class Problem_2260 {
    public int minimumCardPickup(int[] cards) {
        Set<Integer> mySet = new HashSet<>();
        int left = 0, minLen = Integer.MAX_VALUE;

        for (int right = 0; right < cards.length; right++) {
            while (mySet.contains(cards[right])) {
                minLen = Math.min(minLen, (right - left) + 1);
                mySet.remove(cards[left++]);
            }
            mySet.add(cards[right]);
        }

        return (minLen == Integer.MAX_VALUE) ? -1 : minLen;
    }
}
