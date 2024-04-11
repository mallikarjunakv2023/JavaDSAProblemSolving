package org.programs75;

import java.util.Stack;

public class ReversePosishNotationPerformOperationBasedOnOperands {
    public static void main(String[] args){
        String[] tokens = {"2", "5", "+", "2", "-"};
        System.out.println("Result " + calculateRPN(tokens));
    }

    private static int calculateRPN(String[] tokens) {
        String operands = "+-*/";

        Stack<String> stack = new Stack<>();

        for(String s : tokens){
            if(!operands.contains(s))
                stack.push(s);
            else{
                int a = Integer.valueOf(stack.pop());
                int b = Integer.valueOf(stack.pop());

                switch(s){
                    case "+":
                        stack.push(String.valueOf(a+b));
                        break;
                    case "-":
                        stack.push(String.valueOf(b-a));
                }
            }
        }
        return Integer.valueOf(stack.pop());
    }
}
