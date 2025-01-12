package perfectPractice.binarySearch;

public class FindSmallestDivisor {
    public boolean smallDiv(int[] nums, int threshold, int mid) {
        int sum = 0;
        for (int i : nums)
            sum += Math.ceil((double) i / (double) mid);

        if (sum <= threshold)
            return true;

        return false;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        if (n > threshold)
            return -1;

        int low = 1;
        int high = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            high = Math.max(high, nums[i]);
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (smallDiv(nums, threshold, mid))
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }
}
