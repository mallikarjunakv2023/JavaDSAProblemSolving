package org.CollectionAndDSA.ArrayProblems;

public class PalindromeSubString {
    //inputs
    //cbbd - bb
    //fftaatyui - taat
    public static void main(String[] args){
        String str = "cbbd";
        System.out.println("palindrome substring : " +palindromeSubstring(str));
    }

    public static String palindromeSubstring(String str){
        String subStr = "";
        int i = 0;
        int j = str.length() - 1;
        int start = 0;
        int end = j;
        for(i = 0; i < j/2; i++){
            if(str.charAt(i) == str.charAt(j)){
                start++;
                end--;
            }
        }
        return subStr;
    }
}
