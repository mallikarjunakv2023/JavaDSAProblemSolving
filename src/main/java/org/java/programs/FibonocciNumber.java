package org.java.programs;

import java.util.Arrays;

public class FibonocciNumber {
    public static void main(String[] args){
        System.out.println("Fibinocci number for n is : " + fibinocciNumber(6));
        System.out.println("Fibinocci number for n is : " + fibinocciSeries(6).length);
        System.out.println("Fibinocci number for n is : " + fib(6));
    }

    private static int[] fibinocciSeries(int n) {
        int count = 0;
        int[] arr = new int[n];
        int a = 0;
        int b = 1;

        if(n == 0)
            arr[0] = a;
        if(n == 1)
            arr[0] = b;
        else {
            arr[0] = 1;
            arr[1] = 1;
        }
        int c = a+b;
        for(int i = 2; i < n; i++){
            arr[i] = arr[i-2] + arr[i-1];
            count++;
        }
        System.out.println(Arrays.toString(arr) + count);
        return arr;

    }

    static int fib(int n)
    {
        // Base Case
        if (n <= 1)
            return n;

        // Recursive call
        return fib(n - 1) + fib(n - 2);
    }

    //1, 1, 2, 3, 5, 8, 13
    public static int fibinocciNumber(int n){
        int a = 0;
        int b = 1;

        if(n == 0)
            return a;
        if(n == 1)
            return b;
        if(n == 2)
            return a+b;
        int c = a+b;
        for(int i = 2; i < n; i++){
            a = b;
            b = c;
            c = a+b;
        }

        return c;
    }
}
