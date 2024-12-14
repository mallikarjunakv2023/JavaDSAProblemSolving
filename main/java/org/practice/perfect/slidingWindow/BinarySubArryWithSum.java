package org.practice.perfect.slidingWindow;

public class BinarySubArryWithSum {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return numSubarrayWithLessSum(nums, goal) - numSubarrayWithLessSum(nums, goal-1);
    }
    public static int numSubarrayWithLessSum(int[] nums, int goal){
        int l = 0, r = 0, sum = 0, count = 0;

        if(goal < 0)
            return 0;
        while(r < nums.length){
            sum = sum + nums[r];
            while(sum > goal){
                sum = sum - nums[l];
                l++;
            }
            count = count + (r - l + 1);
            r++;
        }
        return count;
    }
}
