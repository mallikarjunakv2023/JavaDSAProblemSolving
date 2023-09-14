package org.java.programs;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class LinkedList{
    int val;

    LinkedList next;
    LinkedList(){

    }
    LinkedList(int val){
        this.val = val;
    }

    LinkedList(int val, LinkedList next){
        this.val = val;
        this.next = next;
    }
}
//prev = null, current = 1, current.next = twoAdd, next = 2
//prev = 1, current = 2                           current.next = null, next = twoAdd
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while(current != null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}
