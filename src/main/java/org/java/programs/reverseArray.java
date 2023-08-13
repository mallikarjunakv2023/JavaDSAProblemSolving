package org.java.programs;

import java.util.Arrays;
import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = scan.nextInt();

        System.out.print("Enter array: ");
        int[] array = new int[size];
        for(int i =0 ; i < size; i++){
            array[i] = scan.nextInt();
        }
        int[] reverseArray = new int[size];
        int i = 0;
        int j = size-1;

        while(j >= 0){
            reverseArray[i] = array[j];
            i++;
            j--;
        }

        System.out.println("Reverse array: "+ Arrays.toString(reverseArray));
    }

}
