package org.java.programs;

public class Add2BinaryStrings {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry == 1) //1+1
        {
            if(i >= 0)
                carry += a.charAt(i--) - '0'; //1, 2
            if(j >= 0)
                carry += b.charAt(j--) - '0'; //2
            sb.append(carry % 2);//sb = 0, 0, 1
            carry /= 2;//carry = 1 , 1 , 0
        }
        return sb.reverse().toString();
    }
}
