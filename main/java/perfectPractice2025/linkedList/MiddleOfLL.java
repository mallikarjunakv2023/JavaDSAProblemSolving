package perfectPractice2025.linkedList;

import programs75.ListNode;

public class MiddleOfLL {
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        int mid = (count/2) + 1;
        System.out.println(mid);
        temp = head;
        while (mid > 1) {
            mid--;
            temp = temp.next;
        }
        return temp;
    }

    public ListNode middleNode1(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }
}
