package org.java.programs;
import java.util.*;
public class FindMajorityElementInArray {
    public int majorityElement(int[] nums) {
        int n = nums.length/2;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{
                map.put(nums[i], 1);
            }
        }

        for(Map.Entry<Integer, Integer> set : map.entrySet()){
            if(set.getValue() > n)
                return set.getKey();
        }
        return 0;
    }
}
