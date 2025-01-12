package perfectPractice2025.slidingWindow;

public class PickMaxCardFromCardspack {
    public int maxScore(int[] cardPoints, int k) {
        //take 2 pointers, left and right, left with 0, right with n-1
        //first add all k ele from left and find sum
        //put a loop from k-1 to 0 and keep removing k-1 ele from leftsum and keep adding same num of ele from right

        int l = 0;
        int r = cardPoints.length - 1;
        int maxSum = 0;
        int lSum = 0;
        int rSum = 0;

        for(int i = 0; i < k; i++){
            maxSum = maxSum + cardPoints[i];
        }
        lSum = maxSum;
        for(int i = k - 1; i >= 0; i--){
            lSum = lSum - cardPoints[i];
            rSum = rSum + cardPoints[r];
            r--;
            maxSum = Math.max(maxSum, lSum + rSum);
        }
        return maxSum;
    }
}
