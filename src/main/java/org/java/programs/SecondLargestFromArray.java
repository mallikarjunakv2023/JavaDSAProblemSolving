package org.java.programs;

public class SecondLargestFromArray {
    public static void main(String[] args) {
        int[] array = new int[] {5,4};

        int firstMax = 0;
        int secMax = 0;

        for(int i = 0; i<array.length; i++){
            if(array.length <= 2)
                break;
            if(firstMax <= array[i] ){
                secMax = firstMax;
                firstMax = array[i];
            }
            else if(secMax <= array[i] ){
                secMax = array[i];
            }
        }

        System.out.println("Second max: "+secMax);
    }
}
