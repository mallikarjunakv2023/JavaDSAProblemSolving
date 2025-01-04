package programs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class FirstUniqueCharInString {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }

        for (char c : s.toCharArray()) {
            if (map.get(c) == 1) {
                return s.indexOf(c);
            }
        }
        return -1;
    }

    public int firstUniqChar2(String s) {
        int temp[] = new int[26];
        Queue<Character> val = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            val.add(ch);
            temp[ch - 'a']++;
            while (!val.isEmpty() && temp[val.peek() - 'a'] > 1) {
                val.remove();
            }
        }
        return val.isEmpty() ? -1 : s.indexOf(val.peek());
    }

    public int firstUniqChar1(String s) {
        int temp[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            temp[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (temp[s.charAt(i) - 'a'] == 1) return i;
        }
        return -1;
    }
}
