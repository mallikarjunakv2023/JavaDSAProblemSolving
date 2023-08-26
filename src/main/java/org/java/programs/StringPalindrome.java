package org.java.programs;

class StringPalindrome {
    public static void main(String[] args) {

        String str = "aMalalamaaaaa";
        boolean revString = stringPalindrome(str);

        System.out.println("stringPalindrome : "+revString);
    }

    private static boolean stringPalindrome(String str){
        boolean isPalindrome = true;
        if(str.length() == 1)
            return isPalindrome;



        for(int i = str.length()-1, j = 0; i > str.length()/2; i--, j++){
            if(str.charAt(i) == str.charAt(j)){
                isPalindrome = true;
            }
            else
                isPalindrome = false;
        }

        return isPalindrome;
    }
}
