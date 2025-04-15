package com.griddynamics.LinkedList;

public class Problem_24 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode firstNode = head;
        ListNode secondNode = null;
        ListNode ant = null;
        head = head.next;

        while (firstNode != null && firstNode.next != null) {
            secondNode = firstNode.next;
            if (ant != null)
                ant.next = secondNode;

            ListNode nextNode = secondNode.next;
            secondNode.next = firstNode;
            firstNode.next = nextNode;

            ant = firstNode;
            firstNode = nextNode;
        }

        return head;
    }
}
