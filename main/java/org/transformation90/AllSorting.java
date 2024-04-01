package org.transformation90;

import java.util.Arrays;

import static java.util.Collections.binarySearch;
import static java.util.Collections.swap;

public class AllSorting {
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        arr = cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    static int[] cycleSort(int[] arr){
        //{5,4,3,2,1} - while loop index < arr.length - check if the value is equal to index
        //if not swap with its correct index
        int index = 0;
        while (index < arr.length - 1){
            int correct = arr[index] - 1;
            if(index == arr[index] -1){
                index++;
            }
            else{
                swap(arr, index, correct);
            }
        }
        return arr;
    }

    static int[] selectionSOrt(int[] arr){
        //find the max/min index in the array and swap with last index, every
        //inner loop runs n-1 times
        //n-1, n-2, n-3 , n-4 for 5 length arr

        for(int i = 0; i < arr.length; i++){
            int lastIndex = arr.length - i - 1;
            int maxIndex = findMaxIndex(arr, 0, lastIndex);
            swap(arr, maxIndex, lastIndex);
        }
        return arr;

    }

    private static int findMaxIndex(int[] arr, int start, int last) {
        int max = start;
        for (int i = 0; i <= last; i ++){ //important loop
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }

    private static int[] insertionSort(int[] arr) {

        for(int i = 0; i < arr.length - 1; i++){
            for(int j=i+1; j > 0; j-- ){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
                else{
                    break;
                }
            }
        }
        return arr;
    }
}
