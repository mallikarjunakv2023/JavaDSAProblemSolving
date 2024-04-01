package org.java.programs;

import java.util.HashSet;

public class commonElementsInArrays {


    public static void findCommonElementsInArrays(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet();
        HashSet<Integer> commonElements = new HashSet();

        for(int a : arr1){
            set.add(a);
        }

        for(int b : arr2){
            if(set.contains(b)){
                commonElements.add(b);
            }
        }

        System.out.println("Common elements : "+commonElements);
    }

    public static void main(String[] args){
        int[] arr1 = {2,3,5,3,6};
        int[] arr2 = {6,4,2,7,8,9};

        findCommonElementsInArrays(arr1, arr2);
    }
}
