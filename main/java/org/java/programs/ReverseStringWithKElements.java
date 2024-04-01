package org.java.programs;

public class ReverseStringWithKElements {
    public String reverseStr(String s, int k) {
        int n = s.length();
        StringBuilder sb = new StringBuilder(s.length());

        for(int i = 0; i < s.length(); i += 2*k){
            int j = Math.min(i+k, n);

            StringBuilder rev = new StringBuilder(s.substring(i, j));
            rev.reverse();
            sb.append(rev);

            int rem = Math.min(i+2*k, n);
            sb.append(s.substring(j, rem));
        }
        return sb.toString();
    }
}
