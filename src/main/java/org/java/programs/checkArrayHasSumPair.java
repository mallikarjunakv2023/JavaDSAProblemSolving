package org.java.programs;

import java.util.HashSet;

public class checkArrayHasSumPair {

    //Given an array, find if it contains the pair of sum
    static int[] array = {1,4,6,7,9};
    static int sum = 16;

    public static void main(String[] args){
        System.out.println(findPairsForSum2(array, sum));
    }

    //Brute force approach - add each elements with remaining elements to check if sum is equal, reurn true or false

    public static boolean findPairsForSum(int[] arr, int sum) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j<arr.length; j++){
                if(arr[i] + arr[j] == sum ){
                    return true;
                }
            }
        }
        return false;
    }


    //use Hashset for storing the complements of sum(sum - ele), check if the set has ele to return true
    public static boolean findPairsForSum2(int[] arr, int sum) {
        HashSet<Integer> comp = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            if(comp.contains(arr[i])){
                return true;
            }
            else {
                comp.add(sum - arr[i]);
            }
        }
        return false;
    }

}
