package org.programs75;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Palindrome {
    //Program whether a palindrome can be created or not
    //i/p: {a, b, c, c, a, b}
    //o/p: YES
    //
    //
    //i/p: {a, c, b, c, a, e}
    //o/p: NO
    //
    //
    //i/p: {a, d, d, e, g, a, g}
    //adgegda
    //o/p: YES

    //
    public static void main(String[] args){
        char[] arr = {'a', 'b', 'c', 'c', 'a', 'b','e','g'};
        System.out.println(ispalindrome(arr));


}

    private static String ispalindrome(char[] arr) {
        HashMap<Character, Integer> map = new HashMap<>();
        boolean flag = false;
        int odd = 0;
        String value = null;
        for (char c : arr) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        Set<Map.Entry<Character, Integer>> set = map.entrySet();
        for(Map.Entry<Character, Integer> s : set) {
            if (s.getValue() % 2 == 1)
                odd++;
        }

    if(odd <= 1)
        return "Yes";
    return "No";
    }
}
