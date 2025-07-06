package programs;

class StringPalindrome {
    public static void main(String[] args) {

        String str = "aMalalamaaaaa";
        boolean revString = stringPalindrome(str);

        System.out.println("is palindrome ? : "+revString);
    }

    private static boolean stringPalindrome(String str){
        boolean isPalindrome = true;
        if(str.length() == 1)
            return isPalindrome;


        int j = 0;
        for(int i = str.length()-1; i > str.length()/2; i--){
            if(str.charAt(i) == str.charAt(j)){
                isPalindrome = true;
                j++;
            }
            else
                return false;
        }

        return isPalindrome;
    }
}
