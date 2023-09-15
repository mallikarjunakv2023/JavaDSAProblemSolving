package org.java.programs;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class RemoveDupSortedLL {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;

        if(current == null)
            return current;

        while(current != null && current.next != null) {
            if(current.val == current.next.val)
                current.next = current.next.next;
            else
                current = current.next;


        }
        return head;
    }
}
