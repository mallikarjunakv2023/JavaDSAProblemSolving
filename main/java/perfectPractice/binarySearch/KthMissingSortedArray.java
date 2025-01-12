package perfectPractice.binarySearch;
//easy problem, but very tricky, watch video BS-16. Kth Missing Positive Number | Maths + Binary Search
public class KthMissingSortedArray {
    public int findKthPositive(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            int missing = arr[mid] - (mid + 1);
            if (missing < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low + k;
    }
}
