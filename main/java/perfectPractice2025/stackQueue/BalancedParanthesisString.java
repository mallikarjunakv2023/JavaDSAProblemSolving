package perfectPractice2025.stackQueue;

import java.util.Stack;

public class BalancedParanthesisString {
    public boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();
        for(int i =0; i < str.length(); i++){
            if(str.charAt(i) == '[' || str.charAt(i) == '{' || str.charAt(i) == '(')
                stack.push(str.charAt(i));
            else{
                if(stack.isEmpty()) //doesnt have corr opening
                    return false;
                Character top = stack.peek(); //get the top of stack to compare with closing incoming
                stack.pop();
                //check if the incoming closing is of same type
                if(str.charAt(i) == '}' && top == '{' || str.charAt(i) == ']' && top == '[' || str.charAt(i) == ')' && top == '(')
                    continue;
                else
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
