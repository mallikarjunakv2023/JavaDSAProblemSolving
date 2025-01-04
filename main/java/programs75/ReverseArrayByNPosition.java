package programs75;

import java.util.Arrays;

public class ReverseArrayByNPosition {

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        int pos = 3;

        reverseArrayByNPosition(arr, pos);
    }

    private static void reverseArrayByNPosition(int[] arr, int pos) {
        System.out.println(Arrays.toString(reverseArrayPos(arr, 0, arr.length - pos-1)));
        System.out.println(Arrays.toString(reverseArrayPos(arr, arr.length - pos, arr.length -1)));
        System.out.println(Arrays.toString(reverseArrayPos(arr, 0, arr.length - 1)));

    }

    private static int[] reverseArrayPos(int[] arr, int left, int right) {
        while (left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }
}
