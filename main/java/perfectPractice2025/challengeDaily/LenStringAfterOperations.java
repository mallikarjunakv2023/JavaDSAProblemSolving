package perfectPractice2025.challengeDaily;

public class LenStringAfterOperations {
    public int minimumLength(String str) {
        int len = 0;
        int[] frequency = new int[26];

        for (char c : str.toCharArray()) {
            frequency[c - 'a']++;
        }

        for (int freq : frequency) {
            if (freq == 0)
                continue;
            if (freq % 2 == 0)
                len = len + 2;
            else
                len = len + 1;
        }
        return len;
    }
}
