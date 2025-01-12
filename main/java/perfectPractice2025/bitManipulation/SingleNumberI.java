package perfectPractice2025.bitManipulation;

public class SingleNumberI {
    public static int singleNumber(int[] arr){
        int num = 0;
        for(int i = 0; i< arr.length; i++){
            num = num ^ arr[i];
        }
        return num;
    }
}
