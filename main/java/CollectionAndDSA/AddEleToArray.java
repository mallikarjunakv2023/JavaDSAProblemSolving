package CollectionAndDSA;
import java.util.Arrays;
class HelloWorld {
    public static void main(String[] args) {
        int[] arr = {10,50,20};
        int ele = 15;
        int pos = 2;

        System.out.println("After adding "+Arrays.toString(addEleToArray(arr, ele, pos)));
    }

    public static int[] addEleToArray(int[] arr, int ele, int pos){
        int[] newArr = new int[arr.length+1];

        for(int i =0, j = 0; i < newArr.length ; i++){
            if(i == pos)
                newArr[i] = ele;
            else
                newArr[i] = arr[j++];
        }
        return newArr;
    }
}