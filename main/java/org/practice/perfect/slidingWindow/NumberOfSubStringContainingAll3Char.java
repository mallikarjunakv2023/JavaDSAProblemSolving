package org.practice.perfect.slidingWindow;

public class NumberOfSubStringContainingAll3Char {
    public int numberOfSubstrings(String s) {
        int[] lastSeen = {-1,-1,-1};
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            lastSeen[s.charAt(i) - 'a'] = i; //97-97 = 0, 98-97 = 1
            count = count + ( 1 + Math.min(Math.min(lastSeen[0], lastSeen[1]), lastSeen[2]));
        }
        return count;
    }
}
