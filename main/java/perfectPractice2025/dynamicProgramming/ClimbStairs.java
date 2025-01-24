package perfectPractice2025.dynamicProgramming;

public class ClimbStairs {
    public int climbStairs(int n) {
        if (n <= 3)
            return n;

        int prev1 = 3;
        int prev2 = 2;
        int cur = 0;

        for (int i = 3; i < n; i++) {
            cur = prev1 + prev2;
            prev2 = prev1;
            prev1 = cur;
        }

        return cur;
    }

    //Frog jump
    /*
    Input: heights[] = [20, 30, 40, 20]
    Output: 20
    Explanation:  Minimum cost is incurred when the frog jumps from stair 0 to 1 then 1 to 3:
    jump from stair 0 to 1: cost = |30 - 20| = 10
    jump from stair 1 to 3: cost = |20-30|  = 10
    Total Cost = 10 + 10 = 20
     */
    public static void main(String args[]) {

        int height[]={30,10,60,10,60,50};
        int n=height.length;
        int prev=0;
        int prev2=0;
        for(int i=1;i<n;i++){

            int jumpTwo = Integer.MAX_VALUE;
            int jumpOne= prev + Math.abs(height[i]-height[i-1]);
            if(i>1)
                jumpTwo = prev2 + Math.abs(height[i]-height[i-2]);

            int cur_i=Math.min(jumpOne, jumpTwo);
            prev2=prev;
            prev=cur_i;

        }
        System.out.println(prev);
    }
}
