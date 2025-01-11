package perfectPractice.linkedList;
import programs75.ListNode;
public class SortLL {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;

        ListNode mid= getMid(head);

        ListNode left= sortList(head);
        ListNode right= sortList(mid);
        return merge(left,right);
    }

    public ListNode getMid(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        ListNode temp=head;
        while(fast!=null && fast.next!=null){
            temp=slow;
            fast=fast.next.next;
            slow=slow.next;
        }
        if(temp!=null) temp.next=null;
        return slow;
    }

    public ListNode merge(ListNode list1, ListNode list2){
        if(list2==null) return list1;
        ListNode list=new ListNode(0);
        ListNode temp=list;
        while(list1 != null && list2 != null){
            if(list1.val<list2.val){
                temp.next=list1;
                list1=list1.next;
            }
            else{
                temp.next=list2;
                list2=list2.next;
            }
            temp=temp.next;
        }
        temp.next= (list1!=null) ? list1:list2;

        return list.next;
    }
}
