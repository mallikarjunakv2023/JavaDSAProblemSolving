package perfectPractice2025.arrays;

public class RearrangeArrbySign {
    public int[] rearrangeArray(int[] nums) {
        int pos = 0;
        int neg = 1;
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                ans[pos] = nums[i];
                pos = pos + 2;
            }
            else{
                ans[neg] = nums[i];
                neg = neg + 2;
            }
        }
        return ans;
    }
}
