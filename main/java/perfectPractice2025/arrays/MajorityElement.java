package perfectPractice2025.arrays;

import java.util.HashMap;
import java.util.Map;

//Moore's voting algorithm

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int count = 0;
        int ele = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(count == 0){
                ele = nums[i];
                count++;
            }
            else if(ele == nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        int count1 = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] == ele){
                count1++;
            }
        }
        for(int j = 0; j < nums.length; j++){
            if(count1 > (nums.length / 2)){
                return ele;
            }
        }
        return -1;
    }

    public int majorityElement1(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        for(Map.Entry<Integer, Integer> set : map.entrySet()){
            if(set.getValue() > nums.length/2)
                return set.getKey();
        }
        return 0;
    }
}
