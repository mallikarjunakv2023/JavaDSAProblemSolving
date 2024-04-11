package org.programs75;

public class FindLastWordInSentence {
    public static void main(String[] args){
        String str = "Last Word";
        System.out.println("Last word : " + findLastWord(str));
    }

    private static String findLastWord(String str) {
        char[] arr = str.toCharArray();
        int index = arr.length;
        for(int i = arr.length - 1; i >=0; i--){
            if(Character.isSpaceChar(str.charAt(i))){
                break;
            }
            else{
                index--;
            }
        }
        return str.substring(index);
    }
}
