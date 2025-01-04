package perfect.slidingWindow;

public class MaxConsecutiveOnes1 {
    public static void main(String[] args){
        int[] arr = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }


    public static int findMaxConsecutiveOnes(int[] nums) {
        int l = 0, r = 0, maxLen = 0;
        int n = nums.length;
        while(r < n){
            if(nums[r] == 1){
                maxLen = Math.max(maxLen, r - l + 1);
                r++;
            }
            else{
                l = r + 1;
                r++;
            }
        }

        return maxLen;
    }
}
