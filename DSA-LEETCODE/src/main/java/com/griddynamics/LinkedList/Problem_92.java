package com.griddynamics.LinkedList;

public class Problem_92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (right == left)
            return head;

        ListNode auxLeft = head;
        ListNode auxRight = head;
        ListNode ant = null;

        for (int i = 1; i < right; i++) {
            if (i < left) {
                ant = auxLeft;
                auxLeft = auxLeft.next;
            }
            auxRight = auxRight.next;
        }

        ListNode next = auxRight.next;
        ListNode first = auxLeft;
        ListNode prev = auxLeft;
        ListNode curr = prev.next;

        while (curr != next) {
            ListNode aux = curr.next;
            curr.next = prev;
            prev = curr;
            curr = aux;
        }

        if (ant != null)
            ant.next = prev;
        else
            head = prev;

        first.next = next;
        return head;
    }
}
