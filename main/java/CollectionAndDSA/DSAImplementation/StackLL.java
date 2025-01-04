package CollectionAndDSA.DSAImplementation;

public class StackLL {
    /**
     * Top
     * Push
     * pop
     * poll
     * isFull
     * isEmpty
     */
    Node top;

    public boolean isEmpty(){
       return top == null;
    }

    class Node{
        int value;
        Node next;

    }
    public void push(int data){
        Node newNode = new Node();
        if (newNode == null){
            System.out.println("Heap overflow");
            return;
        }

        newNode.value = data;
        newNode.next = top;
        top = newNode;
        System.out.println("Pushed "+top.value);
    }

    public void pop(){
        if(top == null){
            System.out.println("Stack underflow");
            return;
        }
        System.out.println("Popped "+top.value);
        top = top.next;
    }
    public void display(){
        Node temp = top;
        while (temp != null){
            System.out.print(temp.value +" ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        StackLL stackLL = new StackLL();
        stackLL.push(10);
        //stackLL.pop();
        stackLL.push(20);
        stackLL.push(40);
        stackLL.push(40);
        stackLL.push(30);
        //stackLL.display();
        stackLL.push(90);
        stackLL.push(90);
        stackLL.display();
    }
}
