package org.practice.perfect.bitManipulation;

public class Swap2Numbers {
    public static void swap2Numbers(int a, int b){
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a + " " + b);
    }
    public static void main(String[] args){
        swap2Numbers(3, 4);
    }
}
