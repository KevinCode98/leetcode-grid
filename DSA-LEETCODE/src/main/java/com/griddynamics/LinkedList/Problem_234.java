package com.griddynamics.LinkedList;

public class Problem_234 {
    public boolean isPalindrome(ListNode head) {
        if (head == null)
            return false;

        // Get the middle of the list
        ListNode fast = head;
        ListNode middle = head;
        while (fast != null && fast.next != null) {
            middle = middle.next;
            fast = fast.next.next;
        }

        // Change the link of all nodes from the middle to the end
        ListNode prev = middle;
        ListNode curr = middle.next;

        while (curr != null) {
            ListNode auxNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = auxNode;
        }

        while (head != middle) {
            if (prev.val != head.val)
                return false;
            prev = prev.next;
            head = head.next;
        }
        return true;
    }
}
