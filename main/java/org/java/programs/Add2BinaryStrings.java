package org.java.programs;
/*
logic : 2 binary strings contains only 0 and 1, ASCII value of 1 isc 49 and 0 is 48,
use this difference 49-48 = 1 to build a logic for binary addition.
Take 2 pointers i and j of length str1 and str2, and carry with init value as 0,
put a while loop which breaks when i and j < 0 and carry is != 1. check if i and j >=0
and compute carry. Append the modulus 2 of carry to string builder. reverse and the sb
to ge the result

 */
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
