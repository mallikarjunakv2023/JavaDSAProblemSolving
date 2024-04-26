package org.CollectionAndDSA.DSAImplementation;

import org.programs75.ListNode;

public class LinkedList {

    LinkedList(){
        head = null;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(40);
        //linkedList.delete(50);
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


    }
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

    public void removeDuplicates(){
        Node node = head;
        while(node.next != null){
            if(node.value == node.next.value){
                node.next = node.next.next;
            }
            else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
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
}
