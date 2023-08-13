package org.java.programs;

import java.util.Arrays;

public class SegreagtePosNegNumbers {
    public static void main(String[] args) {

        int arr[] = {10, -20, -30, 40, 50, 60, 70, 80, 90, 100};

        //System.out.println("Array before adding element: "+ Arrays.toString(arr));

        segregatePosNegNumbers(arr);

    }

    public static void segregatePosNegNumbers(int[] arr){
        int pos = 0, neg = 0;
        for(int e : arr){
            if(e>=0)
                pos++;
            else
                neg++;
        }

        int[] posArr = new int[pos];
        int[] negArr = new int[neg];
        int i = 0, j = 0;
        for(int e : arr){
            if(e>=0)
                posArr[i++] = e;
            else
                negArr[j++] = e;
        }

        System.out.println("Pos Array : "+ Arrays.toString(posArr));
        System.out.println("Pos Array : "+ Arrays.toString(negArr));
    }
}
