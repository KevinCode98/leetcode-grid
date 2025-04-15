package com.griddynamics.Monotonic;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Problem_496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> myStack = new Stack<>();
        Map<Integer, Integer> myMap = new HashMap<>();

        for (int pos = nums2.length - 1; pos >= 0; pos--) {
            int num = nums2[pos];

            while (!myStack.isEmpty() && myStack.peek() < num)
                myStack.pop();

            if (myStack.isEmpty())
                myMap.put(num, -1);
            else
                myMap.put(num, myStack.peek());

            myStack.add(num);
        }

        int[] result = new int[nums1.length];
        for (int pos = 0; pos < nums1.length; pos++)
            result[pos] = myMap.get(nums1[pos]);

        return result;
    }
}
