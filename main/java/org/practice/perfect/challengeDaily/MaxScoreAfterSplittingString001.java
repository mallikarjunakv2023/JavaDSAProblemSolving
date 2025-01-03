package org.practice.perfect.challengeDaily;

public class MaxScoreAfterSplittingString001 {
    /*
    Logic Explanation
    onesCount and zerosCount track the count of '1's and '0's encountered up to the current split point.
    bestScore starts at Integer.MIN_VALUE and is updated with the maximum score found so far.
    After traversing the string, any remaining '1's are accounted for to calculate the final maximum score.
     */
    public int maxScore(String inputStr) {
        int totalOnes = 0;
        int zerosCount = 0;
        int onesCount = 0;
        int bestScore = Integer.MIN_VALUE;

        // Count total ones in the string
        for (char ch : inputStr.toCharArray()) {
            if (ch == '1') totalOnes++;
        }

        // Traverse the string and calculate scores
        for (int i = 0; i < inputStr.length() - 1; i++) {
            if (inputStr.charAt(i) == '0') zerosCount++;
            else onesCount++;

            // Calculate score
            int currentScore = zerosCount + (totalOnes - onesCount);
            bestScore = Math.max(bestScore, currentScore);

        }

        return bestScore;
    }

    public int maxScoreOptimal(String s) {
        int n = s.length();
        int ons = 0;
        int curr = s.charAt(0) == '0' ? 1 : 0;
        int score = curr;

        for (int i = 1; i < n - 1; i++) {
            if (s.charAt(i) == '0') {
                curr++;
            } else {
                ons++;
                curr--;
            }
            if (curr > score) {
                score = curr;
            }
        }
        ons += s.charAt(n - 1) == '1' ? 1 : 0;

        return ons + score;
    }
}
