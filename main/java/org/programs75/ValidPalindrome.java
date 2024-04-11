package org.programs75;

import java.util.Stack;

public class ValidPalindrome {
    public static void main(String [] args){
        String str = "amaaa";
        System.out.println("is Valid : " + isValidPalindrome(str));
    }

    private static boolean isValidPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]]","");
        Stack<Character> stack = new Stack<>();
        int stackLen = str.length()/2;
        int index =0;

        for (int i = 0; i < str.length()/2; i++){
            stack.push(str.charAt(i));
            index++;
        }
        while (index < str.length() && !stack.isEmpty()){
            if(stack.pop() != str.charAt(index++)){
                return false;
            }
        }
        return stack.isEmpty();
    }
}
