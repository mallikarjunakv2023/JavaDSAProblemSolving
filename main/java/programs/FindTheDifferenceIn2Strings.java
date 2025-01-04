package programs;

public class FindTheDifferenceIn2Strings {
    public static void main(String[] args){
        String s = "a";
        String t = "ea";
        char c = findTheDifference(s, t);
        System.out.println(c);
    }

    public static char findTheDifference(String s, String t) {
        char c = 0;
        for(char cs : s.toCharArray()){
            c ^= cs;
            System.out.println(c);
        }
        for(char ct : t.toCharArray()) {
            c ^= ct;
            System.out.println(c);
        }
        return c;
    }
}
