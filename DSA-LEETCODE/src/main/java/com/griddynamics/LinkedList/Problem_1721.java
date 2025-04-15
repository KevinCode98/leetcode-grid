package com.griddynamics.LinkedList;

public class Problem_1721 {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode slow = head;
        for (int i = 1; i < k; i++) {
            slow = slow.next;
        }

        ListNode end = slow.next;
        ListNode fast = head;
        while (end != null) {
            end = end.next;
            fast = fast.next;
        }

        int temp = slow.val;
        slow.val = fast.val;
        fast.val = temp;

        return head;
    }
}
