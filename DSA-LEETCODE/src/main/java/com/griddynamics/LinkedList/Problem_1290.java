package com.griddynamics.LinkedList;

public class Problem_1290 {
    public int getDecimalValue(ListNode head) {
        int count = 0;
        ListNode dummy = head;

        while (dummy != null) {
            count++;
            dummy = dummy.next;
        }

        int total = 0;
        dummy = head;

        while (dummy != null) {
            int aux = (int) (Math.pow(2, count - 1)) * dummy.val;
            total += aux;
            count--;
            dummy = dummy.next;
        }

        return total;
    }
}
