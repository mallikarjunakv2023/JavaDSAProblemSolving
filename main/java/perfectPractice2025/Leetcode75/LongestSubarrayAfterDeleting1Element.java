package perfectPractice2025.Leetcode75;

public class LongestSubarrayAfterDeleting1Element {
    public int longestSubarray(int[] nums) {
        int zeros = 0;
        int l = 0;
        int r = 0;
        int maxLen = 0;

        while (r < nums.length) {
            if (nums[r] == 0) {
                zeros++;
            }
            if (zeros <= 1) {
                maxLen = Math.max(maxLen, r - l);
            }
            if (zeros > 1) {
                if (nums[l] == 0) {
                    zeros--;
                }
                l++;
            }
            r++;
        }
        return maxLen;
    }
}
