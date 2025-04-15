package com.griddynamics.LinkedList;

import java.util.ArrayList;

public class Problem_2074 {
    public ListNode reverseEvenLengthGroups(ListNode head) {
        int sizeElement = 0;
        ListNode dummy = head;

        while (dummy != null) {
            sizeElement++;
            dummy = dummy.next;
        }

        ArrayList myList = new ArrayList<>();
        int pos = 0;

        while (sizeElement > 0) {
            pos++;
            if (sizeElement < pos)
                myList.add(sizeElement);
            else
                myList.add(pos);
            sizeElement -= pos;
        }

        // Asign the auxiliar variables to get he pointers on the list
        ListNode ptrL = null;
        ListNode ptrR = head;
        ListNode aux_left = head;
        ListNode aux_right = head;
        int moves = 0, i = 0;
        while (aux_right != null) {
            if (i != 0)
                moves = (int) myList.get(i);
            ptrL = aux_right;
            aux_left = (ptrL.next != null) ? ptrL.next : ptrL;
            for (int aux = 0; aux < moves; aux++)
                aux_right = (aux_right != null) ? aux_right.next : null;
            ptrR = (aux_right != null) ? aux_right.next : null;

            // Start to reverse the nodes
            if ((int) myList.get(i) % 2 == 0) {
                ListNode myAux = aux_left;
                ListNode prev = ptrL;
                ListNode curr = aux_left;
                while (curr != ptrR) {
                    ListNode nodeAux = curr.next;
                    curr.next = prev;
                    prev = curr;
                    curr = nodeAux;
                }
                ptrL.next = prev;
                aux_left.next = ptrR;
                aux_right = myAux;
            }
            if (ptrR != null)
                i++;
            else
                break;
        }

        return head;
    }
}
