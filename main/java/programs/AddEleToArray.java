package programs;

import java.util.Arrays;

public class AddEleToArray {
    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int ele = 100;
        int pos = 4;

        System.out.println("Array before adding element: "+ Arrays.toString(arr));

        int[] newArr = addEleToArray(arr, ele, pos);

        System.out.println("Array after adding element: "+ Arrays.toString(newArr));
    }

    public static int[] addEleToArray(int[] arr, int ele, int pos){
        int[] newArr = new int[arr.length + 1];
        for(int i =0, j=0; i < newArr.length; i++){
            if(i == pos){
                newArr[i] = ele;
            }else
                newArr[i] = arr[j++];
        }
        return newArr;

    }
}
