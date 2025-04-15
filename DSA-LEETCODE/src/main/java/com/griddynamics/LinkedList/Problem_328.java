package com.griddynamics.LinkedList;

public class Problem_328 {
    public ListNode oddEvenList(ListNode head) {
        if (head == null)
            return null;

        ListNode oddPtr = head.next;
        ListNode firstPtr = head;
        ListNode secondPtr = oddPtr;

        while (secondPtr != null && secondPtr.next != null) {
            firstPtr.next = secondPtr.next;
            secondPtr.next = secondPtr.next.next;
            firstPtr = firstPtr.next;
            secondPtr = secondPtr.next;
        }

        firstPtr.next = oddPtr;

        return head;
    }
}
