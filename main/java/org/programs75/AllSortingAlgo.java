package org.programs75;

import java.util.Arrays;

public class AllSortingAlgo {

    public static void main(String [] agrs){
        int[] arr = {1,3,2,5,6,3,7,0,11,8};

        //Bubble sort : 2 nested for loops, 0 to n-1 and 0 to n-i-1,
        // and flag to check if array is sorted to break outer loop
        //System.out.println("Sorted arr : "+ Arrays.toString(bubbleSort(arr)));

        //Selection sort : 2 nested loops, use inner loop to find smallest index(min)
        // and swap with outer loops ith element
        //System.out.println("Sorted arr : "+ Arrays.toString(selectionSort(arr)));
        //Insertion sort : start outer loop i from 1, start inner while loop j to compare with left array, shift ele to right if its greater,
        // atlast move temp to j
        //System.out.println("Sorted arr : "+ Arrays.toString(insertionSort(arr)));

        //create a method sort, call divide method with arr, 0 to n-1
        //inside divide method, check if low < high and find the mid, call divide method for both both left and right
        //after 2 divide method, call copyMergeAnd Sort for arr, low, mid, high
        //inside copyMergeAndSort, copy whole arr to temp array, while loop to check i <= mid, and j <= high
        //put the smallest ele to arr using index k, copy rem ele of right/left using while loop
        System.out.println("Sorted arr : "+ Arrays.toString(mergeSort(arr)));
        //System.out.println("Sorted arr : "+ Arrays.toString(quickSort(arr, 0, arr.length-1)));
    }
    /*
        QUICK SORT

     */
    private static int[] quickSort(int[] arr, int low, int high) {

        int pi = divideAndSwap(arr, low, high);
        if(low < pi-1)
            quickSort(arr,low, pi-1);
        if(pi < high)
            quickSort(arr, pi, high);
        return arr;

    }

    private static int divideAndSwap(int[] arr, int low, int high) {
        int pivot = arr[(low+high)/2];
        while(low <= high){
            while (arr[low] < pivot)
                low++;
            while (arr[high] > pivot)
                high--;
            if(low <=high){
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }
        return low;
    }


    /*
    MERGE SORT

 */
    private static int[] mergeSort(int[] arr) {
        //call divide method
        devide(arr,0, arr.length-1);
        return arr;
    }

    private static void devide(int[] arr, int low, int high) {
        if(low < high){
            int mid = low + (high - low) / 2;

            devide(arr, low, mid);

            devide(arr, mid+1, high);

            copyMergeSort(arr, low, mid, high);
        }
    }

    private static void copyMergeSort(int[] arr, int low, int mid, int high) {
        int[] temp = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            temp[i] = arr[i];
        }

        int i = low;
        int j = mid+1;
        int k = low;

        while(i <= mid && j <= high){
            if(temp[i] < temp[j]){
                arr[k] = temp[i];
                i++;
            }
            else{
                arr[k] = temp[j];
                j++;
            }
            k++;
        }

        while(i <= mid)
            arr[k++] = temp[i++];
        while(j <= high)
            arr[k++] = temp[j++];
    }
/*
    INSERTION SORT

 */
    //find the pos of the ele from the left arr and insert it,
    // move the elements to right while checking the > inside while loop
    private static int[] insertionSort(int[] arr) {
        int temp;
        int j;
        for(int i = 1; i < arr.length; i++){
            temp = arr[i];
            j = i;

            while(j > 0 && arr[j - 1] > temp){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
        return arr;
    }
/*
SELECTION SORT
 */
    //compare and get the smallest ele index - min, and swap with i and min values
    private static int[] selectionSort(int[] arr) {
        int min = 0;
        int temp;
        for(int i = 0; i< arr.length; i++){
            min = i;
            for(int j = i+1; j < arr.length;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    /*
    BUBBLE SORT
     */
    //Bubble sort, 2 nested loops, increase effi by checking flag after each row compare
    //Also in second loop length - 1 - i - to not to check already sorted part at the last
    private static int[] bubbleSort(int[] arr) {
        int temp;
        for(int i =0; i<arr.length; i++){
            int flag = 0;
            for(int j = 0; j < arr.length -1 -i; j++){
                if (arr[j] > arr[j+1]) { //for string sorting - iff(arr[j].compareTo(arr[j+1] > 0) - 0,-1,1 output
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = 1;
                }
            }
            if(flag == 0)
                break;
        }
        return arr;
    }
}
