package com.griddynamics.LinkedList;

public class Problem_141 {
    public boolean hasCycle(ListNode head) {
        ListNode aux = head;

        while (aux != null && aux.next != null) {
            aux = aux.next.next;
            head = head.next;

            if (aux == head)
                return true;
        }

        return false;
    }
}
