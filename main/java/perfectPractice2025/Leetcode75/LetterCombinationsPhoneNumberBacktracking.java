package perfectPractice2025.Leetcode75;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsPhoneNumberBacktracking {

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0 || digits.equals("")) {
            return new ArrayList<>();
        }
        String[] combos = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> result = new ArrayList<>();
        backTrack(digits, result, combos, new StringBuilder(), 0);
        return result;
    }

    private void backTrack(String digits, List<String> result, String[] combos, StringBuilder br, int index) {
        if (index == digits.length()) {
            result.add(br.toString());
        } else {
            for (char c : (combos[Integer.parseInt(String.valueOf(digits.charAt(index)))]).toCharArray()) {
                br.append(c);
                backTrack(digits, result, combos, br, index + 1);
                br.deleteCharAt(br.length() - 1);
            }
        }

    }
}
