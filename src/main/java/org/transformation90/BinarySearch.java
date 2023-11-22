package org.transformation90;

public class BinarySearch {


    public static void main(String []args){
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int key = 10;

        System.out.println("Key found ? " +binarySearch(arr, key));
    }

    public static boolean binarySearch(int[] arr, int key){
        int left = 0;
        int right = arr.length-1;
        int mid = 0;

        while(left <= right){
            mid = left + (right - left) / 2;

            if(arr[mid] == key){
                return true;
            }
            else if(arr[mid] < key){
                left = mid + 1;
            }
            else if(arr[mid] > key){
                right = mid - 1;
            }
        }
        return false;
    }
}
