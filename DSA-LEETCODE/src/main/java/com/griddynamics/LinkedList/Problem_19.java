package com.griddynamics.LinkedList;

public class Problem_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null)
            return null;

        ListNode end = head, aux = head, ant = head;
        int count = 0;
        while (end != null) {
            if (count == n - 1) {
                aux = head;
            }

            if (count > n - 1) {
                ant = aux;
                aux = aux.next;
            }

            count++;
            end = end.next;
        }

        if (head.next == aux)
            head.next = aux.next;
        else if (ant == head)
            head = head.next;
        else
            ant.next = aux.next;

        return head;
    }
}
