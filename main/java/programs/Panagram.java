package programs;

public class Panagram {
    
    public static void main(String[] args){
        String sentence = "The quick brown fox jumps over the lazydog/";

        if (isPanagram(sentence)) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
    }

    private static boolean isPanagram(String sentence) {
        String sen = sentence.replaceAll("\\s", "").toLowerCase();
        System.out.println(sen);
        if(sen.length() < 26)
            return false;
        else if(!sen.matches("a-z"))
            return false;
        boolean flag = false;
        boolean[] chars = new boolean[26];
        int i =0;

        for(char c : sen.toCharArray()){
            if(Character.isLetter(c))
                chars[c-'a'] = true;
            else
                chars[c-'a'] = false;
        }
        for(boolean b : chars){
            if(b)
                flag = true;
            else 
                flag = false;
        }
        
        return flag;
        
    }

}
