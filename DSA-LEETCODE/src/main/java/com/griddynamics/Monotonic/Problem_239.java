package com.griddynamics.Monotonic;

import java.util.Deque;
import java.util.LinkedList;

public class Problem_239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (k == 1)
            return nums;

        int[] result = new int[nums.length - (k - 1)];
        Deque<Integer> myDeque = new LinkedList<>();
        int ptr = 0;
        for (int pos = 0; pos < nums.length; pos++) {
            while (!myDeque.isEmpty() && nums[myDeque.getLast()] <= nums[pos])
                myDeque.removeLast();

            while (!myDeque.isEmpty() && pos - k >= myDeque.getFirst())
                myDeque.removeFirst();

            myDeque.addLast(pos);
            if (pos >= k - 1)
                result[ptr++] = nums[myDeque.getFirst()];
        }

        return result;
    }
}
