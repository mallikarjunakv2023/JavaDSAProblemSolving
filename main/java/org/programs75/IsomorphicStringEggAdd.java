package org.programs75;

import java.util.HashMap;

public class IsomorphicStringEggAdd {
    public static void main(String[] args){
        boolean b = isIsomorphic("add", "egg");
        System.out.println(b);
    }

    private static boolean isIsomorphic(String str1, String str2) {

        HashMap<Character, Character> map = new HashMap<>();
        char c;
        for (int i = 0; i < str1.length();i++){
            if (map.containsKey(str1.charAt(i))){ //if map contains str1 value at i, then check
                // if that keys value is equal to str2 char at i, if not return false, if same repeat
                c = map.get(str1.charAt(i));
                if (c != str2.charAt(i))
                    return false;
            }
            else if (!map.containsValue(str2.charAt(i))){//put a, e to map if doesnt contain str2
                map.put(str1.charAt(i), str2.charAt(i));
            }
            else {
                return false;
            }
        }
        return true;
    }
}
