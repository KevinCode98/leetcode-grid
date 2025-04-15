package com.griddynamics.LinkedList;

public class Problem_82 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode aux = head;
        while (aux != null && aux.next != null) {
            int count = 1;
            ListNode nextNode = aux.next;

            while (nextNode != null && aux.val == nextNode.val) {
                count++;
                nextNode = nextNode.next;
            }

            if (aux == head && count > 1)
                head = nextNode;

            aux = nextNode;

            if (count == 1)
                break;
        }

        if (head != null) {
            ListNode ant = head;
            aux = head.next;
            while (aux != null && aux.next != null) {
                ListNode nextNode = aux.next;
                ant.next = null;
                int count = 0;

                while (nextNode != null && count != 1) {
                    count = 1;
                    while (nextNode != null && aux.val == nextNode.val) {
                        count++;
                        nextNode = nextNode.next;
                    }
                    if (count != 1)
                        aux = nextNode;
                    if (nextNode != null)
                        nextNode = nextNode.next;
                }

                if (nextNode == null && aux != null)
                    ant.next = aux;

                if (count <= 1) {
                    ant.next = aux;
                    ant = aux;
                    aux = aux.next;
                } else
                    aux = nextNode;
            }
        }

        return head;
    }
}
