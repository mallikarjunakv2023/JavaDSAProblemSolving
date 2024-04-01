package org.CollectionAndDSA;
import java.util.*;
public class ContainsDuplicate {
    public static void main(String[] args){
        int[] nums = {2, 3, 2};
        System.out.println("output: "+containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for(int i =0; i < map.size(); i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
                index++;
            }
            else{
                map.put(nums[i], 1);
            }
        }
        if(index > 1)
            return true;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1)
                return true;
        }
        return false;
    }

    public boolean containsDuplicate1(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num))
                return true;
            seen.add(num);
        }
        return false;
    }
}
