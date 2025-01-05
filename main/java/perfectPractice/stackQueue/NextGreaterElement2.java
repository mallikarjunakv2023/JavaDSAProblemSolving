package perfectPractice.stackQueue;

import java.util.Stack;

public class NextGreaterElement2 {
    public int[] nextGreaterElements(int[] nums) {
        //use monotonic stack - it stores the ele if it finds the greater ele
        //put a loop from 2n -1 to 0, calculate index index = i % n
        //start from backend of the arr, check if i < n and ele is greater, then put it to stack and nge arr

        Stack<Integer> stack = new Stack<>();
        int n = nums.length;
        int[] nge = new int[n];
        for(int i = 2*n -1; i >= 0; i --){
            int index = i % n;
            while(!stack.isEmpty() && nums[index] >= stack.peek()){
                stack.pop();
            }
            if(i < n){
                nge[i] = stack.isEmpty() ? -1 : stack.peek();
            }
            stack.push(nums[index]);
        }
        return nge;
    }
}
