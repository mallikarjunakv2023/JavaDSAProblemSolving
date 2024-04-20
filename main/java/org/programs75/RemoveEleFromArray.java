package org.programs75;

public class RemoveEleFromArray {

    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int k = 0;
        int i =0;
        while(i < len){
            if(nums[i] != val){
                nums[k++] = nums[i++];
            }
            else{
                i++;
            }
        }
        return k;
    }
}
