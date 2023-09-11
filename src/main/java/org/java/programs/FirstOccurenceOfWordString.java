package org.java.programs;


/* Logic : Sentence haystack contains word needle ? if yes return the start index of word needle else return -1.
           Can start with negative cases - checking if word length is less than sentence, if so return -1
           Take 2 pointers for sentence(i) and word(j) index which starts from 0, check if the char in word matches any char
           in sentence and also increment the j for each match. once the loop is completed for sentence-word length,
           check if j count is equal to word needle length, if yes return j value. If not above return -1 to end
*/

public class FirstOccurenceOfWordString {
    public static void main(String[] args){
        String haystack = "pendri driev  ve ve";
        String needle = "ve";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        int hayLength=haystack.length();
        int needleLength=needle.length();
        if(hayLength<needleLength)
            return -1;
        for(int i=0;i<=hayLength-needleLength;i++){
            int j=0;
            while(j<needle.length() && haystack.charAt(i+j)==needle.charAt(j))
                j++;
            if(j==needle.length()){
                return i;
            }
        }
        return -1;
    }
}
