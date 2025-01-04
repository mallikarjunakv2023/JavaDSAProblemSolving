package programs;

import java.util.HashMap;

public class WordMatchesPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if(words.length != pattern.length())
            return false;

        HashMap<Character, String> char2word = new HashMap<>();
        HashMap<String, Character> word2char = new HashMap<>();
        for(int i = 0; i < pattern.length(); i++){
            char c = pattern.charAt(i);
            String word = words[i];

            if(!char2word.containsKey(c)){
                char2word.put(c, word);
            }

            if(!word2char.containsKey(word)){
                word2char.put(word, c);
            }

            if(!char2word.get(c).equals(word) || !word2char.get(word).equals(c)){
                return false;
            }
        }
        return true;

    }
}
