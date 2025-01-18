package perfectPractice2025.recursion;

import java.util.ArrayList;
import java.util.List;

public class FindAllPermutationsArray {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        permutations(0, nums, ans);
        return ans;
    }

    public void permutations(int index, int[] nums, List<List<Integer>> ans) {
        if (index == nums.length) {
            List<Integer> ds = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                ds.add(nums[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = index; i < nums.length; i++) {
            swap(index, i, nums);
            permutations(index + 1, nums, ans);
            swap(index, i, nums);
        }
    }

    public void swap(int index, int i, int[] nums) {
        int temp = nums[index];
        nums[index] = nums[i];
        nums[i] = temp;
    }
}
