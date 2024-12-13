package org.practice.perfect;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[2];
        int count = 0;
        while(count < nums.length){
            if(map.containsKey(target - nums[count])){
                arr[0] = map.get(target - nums[count]);
                arr[1] = count;
                break;
            }
            else{
                map.put(nums[count], count);
                count++;
            }
        }
        return arr;
    }
}
