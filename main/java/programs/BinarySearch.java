package programs;

public class BinarySearch {
    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int key = 10;

        int index = findKey(arr, 0, arr.length-1, key);

        if(index == -1)
            System.out.println("Key not found");
        else
            System.out.println("Key found at : "+index);
    }

    public static int findKey(int[] arr, int low, int high, int key){
        if (high >= low) {

            int mid = low + (high - low) / 2;
            if(arr[mid] == key)
                return mid;

            if(arr[mid] > key)
                return findKey(arr, 0, mid-1, key);
            else
                return findKey(arr, mid+1, high, key);
        }
        return -1;

    }
    public static int findKey1(int[] arr, int low, int high, int key){
        int index = -1;
        while(high >= low){
            int mid = low + (high - low) / 2;
            if(arr[mid] == key) {
                index = mid;
                break;
            }
            else if(arr[mid] > key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return index;
    }
}
