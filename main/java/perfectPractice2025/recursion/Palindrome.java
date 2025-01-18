package perfectPractice2025.recursion;

public class Palindrome {
    public static void main(String[] args){
        String str = "madsssaam";
        System.out.println(isPalindrome(str, 0));
    }

    private static boolean isPalindrome(String str, int i) {
        if(i >= str.length() / 2)
            return true;
        if(str.charAt(i) != str.charAt(str.length() - i - 1))
            return false;
        return isPalindrome(str, i + 1);
    }
}
