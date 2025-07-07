package perfectPractice2025.arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestCosSeq {

    public int longestConsecutive1(int[] nums) {
        int len = nums.length;
        if (len == 0)
            return 0;

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < len; i++) {
            set.add(nums[i]);
        }

        int longest = 1;
        for (int ele : set) {
            if (!set.contains(ele - 1)) {
                int count = 1;

                while (set.contains(ele + 1)) {
                    count++;
                    ele++;
                }

                longest = Math.max(longest, count);
            }
        }
        return longest;

    }


    public int longestConsecutive(int[] arr) {
        int n = arr.length;
        if(n == 0) return 0;
        Set<Integer> set = new HashSet<>();
        int longest = 1;
        for(int i : arr){
            set.add(i);
        }
        for(int i : set){
            if(!set.contains(i-1)){
                int count = 1;
                int x = i;
                while(set.contains(x+1)){
                    x++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
}
