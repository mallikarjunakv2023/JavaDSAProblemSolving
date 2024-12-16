package org.practice.perfect;

public class BalancedString {
    public boolean isBalanced(String str) {
        //get the char, char - 0 = 1, 2 - 0 = 2,
        //if num % 2 != 0 then oddSum+ = num;
        //else evenSum+= num;
        int oddSum = 0, evenSum = 0;
        for(int i = 0; i < str.length(); i++){
            int ele = str.charAt(i) - '0';
            if(i % 2 != 0)
                oddSum += ele;
            else
                evenSum += ele;
        }
        return oddSum == evenSum;
    }
}
