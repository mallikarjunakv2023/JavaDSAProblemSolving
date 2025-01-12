package perfectPractice2025.slidingWindow;

import java.util.HashMap;
import java.util.Map;
/*
Input: s = "AABABBA", k = 1
Output: 4
Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
The substring "BBBB" has the longest repeating letters, which is 4.
There may exists other ways to achieve this answer too.
 */
public class LongestRepeatingCharReplace {
    public int characterReplacement(String s, int k) {
        //String s = "AAABABACA", int k times you can replace char, s.length - 26
        //iterate through - r < n, put the occurance if each char in map, find maxFreq - max(maxFreq, )
        //check if maxlen - maxfreq > k, reduce the occ

        int right = 0, left = 0, maxLen = 0, maxFreq = 0;
        Map<Character, Integer> map = new HashMap<>();

        while(right < s.length()){
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(s.charAt(right)));

            if((right-left+1) - maxFreq > k){
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                left++;
            }
            if((right-left+1) - maxFreq <= k)
                maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        return maxLen;
    }
}
