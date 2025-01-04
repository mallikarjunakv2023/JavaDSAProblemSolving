package programs75;

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args){
        String str = "(";
        System.out.println(isValidParantheses(str));
    }

    private static boolean isValidParantheses(String str) {
        if(str == null | str.length() <= 1)
            return false;

        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray()){
            if(c == '{')
                stack.push('}');
            else if(c == '[')
                stack.push(']');
            else if(c == '(')
                stack.push(')');
            else if(stack.isEmpty() | stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}
