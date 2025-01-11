package perfectPractice.linkedList;
import programs75.ListNode;
public class RotateLL {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null)
            return head;
        int len = 1;
        ListNode tail = head;
        while(tail.next != null){
            len++;
            tail = tail.next;
        }
        //check if k%len ==0, return head if 0
        if(k % len == 0) return head;

        //attch tail.next to head
        tail.next = head;

        //find the lastnode = len - k
        k = k % len;
        int last = len - k;
        ListNode temp = head;
        while(last > 1){
            temp = temp.next;
            last--;
        }

        //assign head to lastnode and lastnode.next = null
        head = temp.next;
        temp.next = null;

        return head;
    }
}
