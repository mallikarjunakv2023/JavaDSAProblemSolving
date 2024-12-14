package org.practice.perfect.slidingWindow;

public class CountNumberOfNiceSubarray {
    public int numberOfSubarrays(int[] nums, int k) {
        return numSubarrayWithLessSum(nums, k) - numSubarrayWithLessSum(nums, k-1);
    }
    public static int numSubarrayWithLessSum(int[] nums, int goal){
        int l = 0, r = 0, sum = 0, count = 0;

        if(goal < 0)
            return 0;
        while(r < nums.length){
            sum = sum + nums[r] % 2;
            while(sum > goal){
                sum = sum - nums[l] % 2;
                l++;
            }
            count = count + (r - l + 1);
            r++;
        }
        return count;
    }
}
