package com.griddynamics.LinkedList;

public class Problem_2095 {
    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null || head == null)
            return null;

        ListNode fast = head;
        ListNode middle = head;
        ListNode ant = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            ant = middle;
            middle = middle.next;
        }

        ant.next = ant.next.next;
        return head;
    }
}
