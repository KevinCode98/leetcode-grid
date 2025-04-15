package com.griddynamics.LinkedList;

public class Problem_2130 {
    public int pairSum(ListNode head) {
        // Find the middle of the list
        ListNode mid = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            mid = mid.next;
            fast = fast.next.next;
        }

        // Reverse the middle of the list
        ListNode prev = mid;
        ListNode curr = mid.next;
        while (curr != null) {
            ListNode aux = curr.next;
            curr.next = prev;
            prev = curr;
            curr = aux;
        }

        // Find the maximum sum
        int max = Integer.MIN_VALUE;
        while (head != mid) {
            max = Math.max(max, head.val + prev.val);
            head = head.next;
            prev = prev.next;
        }

        return max;
    }
}
