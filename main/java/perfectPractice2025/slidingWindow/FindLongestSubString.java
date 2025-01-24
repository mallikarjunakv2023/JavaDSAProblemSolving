package perfectPractice2025.slidingWindow;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class FindLongestSubString {

    public int lengthOfLongestSubstring2(String s) {

        int[] chars = new int[256];
        Arrays.fill(chars, -1);

        int l = 0;
        int r = 0;
        int maxLen = 0;

        while (r < s.length()) {
            if (chars[s.charAt(r)] >= l) {
                l = chars[s.charAt(r)] + 1;
            }
            maxLen = Math.max(maxLen, r - l + 1);

            chars[s.charAt(r)] = r;
            r++;
        }
        return maxLen;
    }

    //Brute Force - with O(n^2)
    public int lengthOfLongestSubstring(String s) {
        //Takes a str and finds the logest substr and returns maxlen

        //s can consist of 256 char
        int maxLen = 0;
        //int len = 0;
        if(s.length() == 0)
            return 0;
        if(s.length() == 1)
            return 1;
        for(int i = 0; i < s.length(); i++){
            HashSet<Character> set = new HashSet<>();
            for(int j = i; j < s.length(); j++){
                if(set.contains(s.charAt(j))){
                    break;
                }
                set.add(s.charAt(j)); //a, u
                maxLen = Math.max(maxLen, j - i+1);
            }
        }
        return maxLen;
    }

    public int lengthOfLongestSubstring1(String s) {
        int maxLen = 0;
        int l = 0; int r = 0;
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        if(s.length() == 0)
            return 0;
        if(s.length() == 1)
            return 1;
        while(r < n){
            //check if r exists in set, if exits find the left,
            //otherwise add and compute the maxlen
            if(map.containsKey(s.charAt(r))){
                l = Math.max(map.get(s.charAt(r)) + 1, l); //l should be greater than r index if l is less

            }
            map.put(s.charAt(r), r); //add char to map with its current index
            maxLen = Math.max(maxLen, r - l + 1);
            r++;
        }
        return maxLen;
    }
}
