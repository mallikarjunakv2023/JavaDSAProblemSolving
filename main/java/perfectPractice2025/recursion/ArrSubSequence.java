package perfectPractice2025.recursion;

import java.util.ArrayList;
import java.util.List;

public class ArrSubSequence {
    public List<List<Integer>> subsets(int[] nums) {
        int N = nums.length;
        List<List<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> subList = new ArrayList<>();
        subsetSumsHelper(0, nums, N, subList, mainList);
        return mainList;
    }

    static void subsetSumsHelper(int i, int[] nums, int N, ArrayList<Integer> subList, List<List<Integer>> mainList) {
        if (i == N) {
            mainList.add(new ArrayList<>(subList));
            return;
        }
        subList.add(nums[i]); // add 1
        System.out.println(nums[i] + " " + i);
        subsetSumsHelper(i + 1, nums, N, subList, mainList);
        subList.remove(subList.size() - 1); // remove 1
        subsetSumsHelper(i + 1, nums, N, subList, mainList);
    }

    //better complexity, analyse(copied from sol section
    List<List<Integer>> subsets1(int[] nums) {
        List<List<Integer>> solution = new ArrayList();
        backtracking(solution, nums, new ArrayList(), 0);
        return solution;
    }

    private void backtracking(List<List<Integer>> solution, int[] nums, List<Integer> curr, int ptr) {
        solution.add(new ArrayList(curr));
        for (int i = ptr; i < nums.length; i++) {
            curr.add(nums[i]);
            backtracking(solution, nums, curr, i + 1);
            curr.remove(curr.size() - 1);
        }
    }
}
