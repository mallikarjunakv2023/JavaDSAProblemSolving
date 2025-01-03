package org.practice.perfect.arrays;

//kadane's algorithm
public class MaximumSubarraySum {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
            max = Math.max(max, sum + nums[i]);
            if(sum < 0)
                sum = 0;
        }
        return max;
    }
}
