package com.griddynamics.LinkedList;

// Problem 707
public class MyLinkedList {
    private int size;
    private ListNode head;

    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size)
            return -1;

        ListNode aux = head;
        for (int i = 0; i < index; i++)
            aux = aux.next;
        return aux.val;
    }

    public void addAtHead(int val) {
        ListNode aux = new ListNode(val);
        aux.next = head;
        head = aux;
        this.size++;
    }

    public void addAtTail(int val) {
        ListNode aux = new ListNode(val);
        if (head == null)
            head = aux;
        else {
            ListNode dummy = head;
            while (dummy.next != null)
                dummy = dummy.next;
            dummy.next = aux;
        }
        this.size++;
    }

    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        } else {
            if (index <= 0)
                addAtHead(val);
            else {
                ListNode aux = new ListNode(val);
                ListNode dummy = head;
                for (int i = 0; i < index - 1; i++)
                    dummy = dummy.next;

                aux.next = dummy.next;
                dummy.next = aux;
                this.size++;
            }
        }
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= this.size)
            return;
        if (index == 0)
            head = head.next;
        else {
            ListNode dummy = head;
            for (int i = 0; i < index - 1; i++)
                dummy = dummy.next;
            dummy.next = dummy.next.next;
        }
        this.size--;
    }
}
