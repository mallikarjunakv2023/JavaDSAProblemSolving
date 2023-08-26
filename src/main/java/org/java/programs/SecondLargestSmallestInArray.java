package org.java.programs;

public class SecondLargestSmallestInArray {
    public static void main(String[] args){
        int[] array = {2,5,3,7,9,8};
        int secLargest = secondLargestSmallestInArray(array);
        System.out.println("Second largest : "+secLargest);

        int secSmallest = secondSmallestInArray(array);
        System.out.println("Second smallest : "+secSmallest);
    }

    private static int secondLargestSmallestInArray(int[] array) {
        int secLargest = 0;
        int max = 0;

        for(int i =0; i< array.length; i++){
           if(array[i] > max){
               secLargest = max;
               max = array[i];
           }
           else if(array[i] < max & array[i] > secLargest){
               secLargest = array[i];
           }
        }
        return secLargest;
    }

    private static int secondSmallestInArray(int[] array) {
        int secSmallest = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i =0; i< array.length; i++){ //{2,5,3,7,9,8}
            if(array[i] <= min){
                secSmallest = min;
                min = array[i];
            }
            else if(array[i] > min & array[i] < secSmallest){
                secSmallest = array[i];
            }
        }
        return secSmallest;
    }
}
