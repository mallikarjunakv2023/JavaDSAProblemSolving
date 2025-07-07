package perfectPractice2025.Leetcode75;

import java.util.Arrays;

public class BikerHighestAltitude {
    public int largestAltitude(int[] gain) {
        int high = 0;
        int i = 0;
        int highest = 0;
        while(i < gain.length){
            high = high + gain[i];
            highest = Math.max(highest, high);
            i++;
        }
        return highest;
    }

    public int largestAltitude1(int[] gain) {
        int len = gain.length;
        int[] ans = new int[len + 1];

        ans[0] = 0;
        for (int i = 1; i <= len; i++)
            ans[i] = ans[i - 1] + gain[i - 1];

        return Arrays.stream(ans).max().getAsInt();
    }
}
