package org.java.programs;

public class FindMissingNumInArray {
    public static void main(String [] args){
        int[] array = new int[]{1,2,3,4,6};
        int len = 6;
        int missingNum = findMissingNumInArray(array, len);
        System.out.println("Missing number : "+missingNum);
    }

    private static int findMissingNumInArray(int[] array, int len) {
        int arrayTotal = 0;
        int total = len * (len + 1) / 2;

        for(int ele : array){
            arrayTotal += ele;
        }
        return total - arrayTotal;
    }
}
