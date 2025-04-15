package com.griddynamics.LinkedList;

public class Problem_203 {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null)
            return null;

        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode dummy = head;
        ListNode slow = head;
        while (dummy != null) {
            if (dummy.val == val) {
                slow.next = dummy.next;
                dummy = slow;
            }
            slow = dummy;
            dummy = dummy.next;
        }

        return head;
    }
}
