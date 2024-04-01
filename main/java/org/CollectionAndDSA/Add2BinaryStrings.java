package org.CollectionAndDSA;

public class Add2BinaryStrings {

    public static void main(String[] args){
        String a = "11";
        String b = "101";

        String res = add2BinaryStrings(a, b);

        System.out.println("After addition "+res);
    }

    private static String add2BinaryStrings(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int alen = a.length()-1;
        int blen = b.length()-1;

        while (alen >=0 || blen >= 0 || carry == 1){
            if(alen >= 0)
                carry += a.charAt(alen--) - '0';
            if(blen >= 0)
                carry += b.charAt(blen--) - '0';

            sb.append(carry % 2);

            carry /= 2;
        }
        return sb.reverse().toString();
    }
}
