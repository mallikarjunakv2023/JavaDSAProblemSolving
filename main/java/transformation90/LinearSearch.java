package transformation90;

public class LinearSearch {

    public static int linearSearch(int[] arr, int key){
        //check if the key is found in arr with any loop, if found return index or -1

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {1,4,2,6,7};
        System.out.println("Key found at : "+linearSearch(arr, 2));
    }
}
