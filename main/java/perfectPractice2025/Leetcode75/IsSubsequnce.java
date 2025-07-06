package perfectPractice2025.Leetcode75;

public class IsSubsequnce {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        int m = s.length();
        int n = t.length();
        char sArr[] = s.toCharArray();
        char tArr[] = t.toCharArray();

        if (m == 0)
            return true;

        while (i < n) {
            if (tArr[i] == sArr[j])
                j++;
            i++;

            if (j == m)
                return true;
        }

        return false;
    }
}
