package programs75;

public class SearchInsertPositionAndInsertIfNotFound {

    public static void main(String[] args){
        int[] arr = {1,3,4,5};
        int key = 2;
        System.out.println("Insert position : " + findOrInsert(arr, key));
    }

    private static int findOrInsert(int[] arr, int key) {
        int start = 0,end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == key){
                return mid;
            }
            else if (arr[mid] > key){
                end = mid - 1;
            }
            else if (arr[mid] < key){
                start = mid + 1;
            }
        }
        return start;
    }

}
