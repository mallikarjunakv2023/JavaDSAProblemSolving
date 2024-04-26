package org.programs75;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class LinkedListHandOn {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        Iterator it = stack.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
