package programs75;

public class RotateArrayByK {
    public int[] solution(int[] A, int K) {
        reverse(A, 0, A.length - 1);
        reverse(A, 0, K - 1);
        reverse(A, K, A.length - 1);
        return A;
    }

    public static int[] reverse(int[] arr, int start, int end){
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        return arr;
    }
}
