package perfectPractice2025.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public int[] sortArray(int[] nums) {
        int n = nums.length - 1;
        mergeSort(0, n, nums);
        return nums;
    }

    private void mergeSort(int low, int high, int[] nums) {
        if (low >= high)
            return;

        int mid = low + (high - low) / 2;

        mergeSort(low, mid, nums);

        mergeSort(mid + 1, high, nums);

        merge(low, mid, high, nums);
    }

    private void merge(int low, int mid, int high, int[] nums) {
        List<Integer> temp = new ArrayList<>();

        Arrays.sort(nums);

        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                temp.add(nums[left]);
                left++;
            } else {
                temp.add(nums[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(nums[left]);
            left++;
        }

        while (right <= high) {
            temp.add(nums[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            nums[i] = temp.get(i - low);
        }
    }
}
