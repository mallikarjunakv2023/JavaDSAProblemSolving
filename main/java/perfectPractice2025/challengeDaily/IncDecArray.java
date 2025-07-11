package perfectPractice2025.challengeDaily;

public class IncDecArray {
    public int longestMonotonicSubarray(int[] nums) {
        int inc = 1;
        int dec = 1;
        int maxLen = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                inc++;
                dec = 1;
            } else if (nums[i] > nums[i + 1]) {
                dec++;
                inc = 1;
            } else {
                inc = 1;
                dec = 1;
            }
            maxLen = Math.max(maxLen, Math.max(inc, dec));
        }
        return maxLen;
    }
}
