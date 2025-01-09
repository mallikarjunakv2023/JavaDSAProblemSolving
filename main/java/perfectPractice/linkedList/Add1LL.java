package perfectPractice.linkedList;

public class Add1LL {
    class Node{
        int data;
        Node next;

        Node(int x){
            data = x;
            next = null;
        }
    }
    public Node addOne(Node head) {
        Node temp = head;
        int carry = addToLinkedList(temp);

        if(carry == 1){
            Node newNode = new Node(1);
            newNode.next = head;
            head = newNode;
        }
        return head;
    }

    private int addToLinkedList(Node temp){
        //add base condition to return carry 1
        if(temp == null){
            return 1;
        }

        //call the function again untill you get carry
        int carry = addToLinkedList(temp.next);

        //write a backtracking code to add carry to data
        temp.data = temp.data + carry;
        if(temp.data < 10){
            return 0;
        }
        temp.data = 0;
        return 1;
    }
}
