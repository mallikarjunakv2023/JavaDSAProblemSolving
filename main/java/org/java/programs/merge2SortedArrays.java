package org.java.programs;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Arrays;

class HelloWorld {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 5, 7, 0, 0, 0, 0, 0};
        int[] arr2 = {2,4,6,8,10};
        int[] sortedArray = merge2SortedArrays2(arr1, arr2, 4, 5);
        System.out.println("Sorted Array : " +Arrays.toString(sortedArray));
    }

    static int[] merge2SortedArrays2(int[] arr1, int[] arr2, int m, int n){
        int len1 = m;
        int len2 = n;
        int i =len1-1, j=len2-1, k =m+n - 1;

        while(j>=0 && i>=0){ // 1,2,,2,4,5,6,7,8,10
            if( arr1[i] > arr2[j]){
                arr1[k--] = arr1[i--];
            }
            else{
                arr1[k--] = arr2[j--];
            }
        }
        System.out.println("Sorted Array : " +Arrays.toString(arr1));
        return arr1;
    }
    static int[] merge2SortedArrays(int[] arr1, int[] arr2){
        int[] sortedArr = new int[arr1.length + arr2.length];
        if(arr1.length == 0)
            return arr2;
        if(arr2.length == 0)
            return arr2;

        int i = 0, j = 0, k = 0;
        int len1 = arr1.length;
        int len2 = arr2.length;
        while(i < len1 && j < len2){
            if(arr1[i] < arr2[j]){
                sortedArr[k++] = arr1[i++];
            }
            else if(arr1[i] > arr2[j]){
                sortedArr[k++] = arr2[j++];
            }
            else if(arr1[i] == arr2[j]){
                sortedArr[k++] = arr1[i++];
                sortedArr[k++] = arr2[j++];
            }
        }
        while(i < len1)
            sortedArr[k++] = arr1[i++];
        while(j < len2)
            sortedArr[k++] = arr2[j++];
        return sortedArr;
    }
}
