package perfectPractice2025.bitManipulation;

import java.util.Arrays;

public class SingleNumberII {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);

        for(int i = 1; i < nums.length; i = i + 3){
            if(nums[i] != nums[i-1]){
                return nums[i-1];
            }
        }
        return nums[nums.length - 1];
    }

    public int singleNumber2(int[] nums) {
        int ones = 0;
        int twos = 0;

        for (final int num : nums) {
            ones ^= (num & ~twos);
            twos ^= (num & ~ones);
        }

        return ones;
    }
}
