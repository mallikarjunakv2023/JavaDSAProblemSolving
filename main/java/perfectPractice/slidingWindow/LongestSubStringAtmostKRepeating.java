package perfectPractice.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringAtmostKRepeating {

    public static void main(String[] args){
        String s = "aaabaaaaccaaaaaaaaaa";
        int k = 2;
        System.out.println("Len : " + longestSubstring(s, k));
    }

    //put each char into map and increase the value,
    //check if size > k, then move l else move r
    //check if size <= k then compute maxLen
    public static int longestSubstring(String s, int k) {
        int l = 0, r = 0, maxLen = 0;
        Map<Character, Integer> map = new HashMap<>();

        while(r < s.length()){
        map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);
        if(map.size() > k){
            map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
            if(map.get(s.charAt(l)) == 0){
                map.remove(s.charAt(l));
            }
            l++;
        }
        if(map.size() <= k){
            maxLen = Math.max(maxLen, r - l + 1);
        }
        r++;
    }
        return maxLen;
}
}
