package CollectionAndDSA.DSAImplementation;

import programs75.ListNode;

public class LinkedList {

    Node head;
    Node tail;

    class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
            this.next = null;
        }
    }

    public void add(int value){
        Node next = new Node(value);
        if(head == null) {
            head = next;
            tail = next;
        }
        else {
            tail.next = next;
            tail = next;
        }
    }
    public void delete(int value){
        while (head != null && head.value == value) {
            System.out.println("Deleted " + head.value);
            head = head.next;
        }
        Node current = head;
        boolean flag = false;
        while(current.next != null){
            if (current.next.value == value){
                Node temp = current.next;
                current.next = current.next.next;
                System.out.println("Deleted "+temp.value);
                flag = true;
                break;
            }
            current = current.next;
        }
        if (!flag)
            System.out.println("Not found");
    }

    public void print(){
        Node node = head;
        System.out.println();
        while (node != null){
            System.out.print(node.value + " ");
            node = node.next;
        }
    }

    LinkedList(){
        head = null;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(50);
        linkedList.add(20);
        linkedList.add(60);
        linkedList.add(40);
        linkedList.add(30);
        linkedList.add(10);
        linkedList.add(40);
        linkedList.delete(50);
        //linkedList.delete(30);
        linkedList.print();
        linkedList.removeDuplicates();
        linkedList.print();
        LinkedList linkedList1 = new LinkedList();
        linkedList1.add(10);
        linkedList1.add(20);
        linkedList1.add(50);
        linkedList1.add(70);
        linkedList1.add(90);
        LinkedList linkedList2 = new LinkedList();
        linkedList2.add(0);
        linkedList2.add(20);
        linkedList2.add(40);
        linkedList2.add(60);
        linkedList2.add(90);
        linkedList2.add(100);
        linkedList2.add(190);

        LinkedList ans = linkedList.mergeLinkedLists(linkedList1,linkedList2);
        ans.print();

        //Happy Number
        System.out.println("Happy number : "+isHappyNumber(29));

        //sort linked list
        //linkedList.sortList(linkedList.head);


    }


    public void removeDuplicates() {
        Node current = head;
        while (current != null && current.next != null) {
            Node runner = current;
            while (runner.next != null) {
                if (current.value == runner.next.value) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
        tail = head;
        while (tail != null && tail.next != null) {
            tail = tail.next;
        }
    }

    public LinkedList mergeLinkedLists(LinkedList one, LinkedList two){
        Node first = one.head;
        Node second = two.head;
        LinkedList ans = new LinkedList();
        Node head = ans.head;
        Node tail = head;
        while(first.next != null && second.next != null){
            if (first.value < second.value){
                ans.add(first.value);
                first = first.next;

            }else {
                ans.add(second.value);
                second =second.next;
            }
        }
        while(first.next != null){
            ans.add(first.value);
            first = first.next;
        }
        while(second.next != null){
            ans.add(second.value);
            second = second.next;
        }

        return ans;

    }


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode node = new ListNode();
        ListNode tail = node;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            }
            else{
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        while(list1 != null){
            tail.next = list1;
            list1 = list1.next;
            tail = tail.next;
        }
        while(list2 != null){
            tail.next = list2;
            list2 = list2.next;
            tail = tail.next;
        }
        return node.next;
    }


    /**
     * Happy Number using LL
     */


    public static boolean isHappyNumber(int num){
        int slow = num;
        int fast = num;
        do {
            slow = squareRoot(slow);
            fast = squareRoot(squareRoot(fast));
        }while (slow != fast);

        if (slow == 1)
            return true;
        return false;
    }

    public static int squareRoot(int number){
        int ans = 0;
        while(number > 0){
            int rem = number % 10;
            ans += rem * rem;
            number /= 10;
        }
        return ans;
    }

    /**
     * Sort LL using merge sort
     */

    public ListNode sortList(ListNode head){
        ListNode node = head;

        if(node == null || node.next == null)
            return head;

        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return mergeTwoLists(left, right);
    }

    ListNode getMid(ListNode head) {
        ListNode midPrev = null;
        while (head != null && head.next != null) {
            if(midPrev == null)
                midPrev = head;
            else
                midPrev = midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }

    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
