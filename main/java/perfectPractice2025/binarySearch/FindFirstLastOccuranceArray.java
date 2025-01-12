package perfectPractice2025.binarySearch;

public class FindFirstLastOccuranceArray {
    public int[] searchRange(int[] nums, int target) {
        int[] result = { -1, -1 };
        result[0] = binarySearch(nums, target, true);
        if (result[0] == -1)
            return result;
        result[1] = binarySearch(nums, target, false);
        return result;
    }

    int binarySearch(int[] nums, int target, boolean isLeft) {
        int low = 0;
        int high = nums.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (target == nums[mid]) {
                if (isLeft)
                    high = mid - 1;
                else
                    low = mid + 1;
                result = mid;
            } else if (target > nums[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return result;
    }
}
