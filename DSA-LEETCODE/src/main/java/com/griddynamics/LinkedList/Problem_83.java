package com.griddynamics.LinkedList;

public class Problem_83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode slow = head, fast = head.next;

        while (fast != null) {
            while (fast != null && fast.val == slow.val)
                fast = fast.next;
            slow.next = fast;
            slow = fast;
            if (fast != null)
                fast = fast.next;
        }

        return head;
    }
}
