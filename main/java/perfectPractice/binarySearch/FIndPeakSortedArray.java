package perfectPractice.binarySearch;

public class FIndPeakSortedArray {
    public int findPeakElement(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int n = nums.length - 1;
        if (n == 0)
            return 0;

        if (nums[0] > nums[1])
            return 0;
        if (nums[n] > nums[n - 1])
            return n;

        low++;
        high--;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1])
                return mid;
            else if (nums[mid] > nums[mid - 1])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}
