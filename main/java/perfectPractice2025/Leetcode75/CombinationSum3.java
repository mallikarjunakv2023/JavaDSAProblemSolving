package perfectPractice2025.Leetcode75;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum3 {
    public List<List<Integer>> combinationSum3(int digits, int sum) {
        List<List<Integer>> ans = new ArrayList<>();
        combination(digits, sum, 1, ans, new ArrayList<Integer>());
        return ans;
    }

    private void combination(int digits, int sum, int start, List<List<Integer>> ans, List<Integer> comb) {
        if (comb.size() == digits && sum == 0) {
            List<Integer> possibleComb = new ArrayList<Integer>(comb);
            ans.add(possibleComb);
            return;
        }
        for (int i = start; i <= 9; i++) {
            comb.add(i);
            combination(digits, sum - i, i + 1, ans, comb);
            comb.remove(comb.size() - 1);
        }
    }
}
