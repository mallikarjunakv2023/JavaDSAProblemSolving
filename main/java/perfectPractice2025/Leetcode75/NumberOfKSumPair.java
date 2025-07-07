package perfectPractice2025.Leetcode75;

import java.util.Arrays;

public class NumberOfKSumPair {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int count = 0;

        while (right > left) {
            if (nums[left] + nums[right] == k) {
                left++;
                right--;
                count++;
            } else if (nums[left] + nums[right] <= k)
                left++;
            else if (nums[left] + nums[right] > k)
                right--;
        }
        return count;
    }
}
