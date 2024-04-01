package org.java.programs;

import java.util.Scanner;

public class isAnagram {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        int[] count = new int[26];
        boolean flag = true;
        char[] arr1 = a.toLowerCase().toCharArray();
        char[] arr2 = b.toLowerCase().toCharArray();

        if(a.length() != b.length())
            return false;

        for(int i = 0; i < a.length(); i ++){
            count[arr1[i] - 'a']++;
        }

        for(int i = 0; i < b.length(); i ++){
            count[arr2[i] - 'a']--;
        }

        for(int c : count){
            if(c != 0)
                flag = false;
        }
        return flag;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
