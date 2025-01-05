package perfectPractice.stackQueue;

import java.util.Stack;

public class AsteriodCollision {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        Stack<Integer> st = new Stack<Integer>();
        for (int i=0;i<n;i++){
            if (asteroids[i] > 0){
                st.push(asteroids[i]);
            }
            else{
                while (!st.isEmpty() && st.peek() > 0 && st.peek() < Math.abs(asteroids[i])){
                    st.pop();
                }
                if (!st.isEmpty() && st.peek() == Math.abs(asteroids[i])){
                    st.pop();
                }
                else if (st.isEmpty() && asteroids[i] < 0 || (st.peek() < 0 && asteroids[i] < 0) ||
                        (st.peek() > 0 && asteroids[i] > 0)){
                    st.push(asteroids[i]);
                }
            }
        }
        int arr[] = new int[st.size()];
        int i = st.size() - 1;;
        // Reverse the stack and insert elements into the array
        while (!st.isEmpty()) {
            arr[i--] = st.pop();
        }
        return arr;
    }
}
