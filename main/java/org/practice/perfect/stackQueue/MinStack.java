package org.practice.perfect.stackQueue;
import java.util.Stack;
class MinStack {
    Long min;
    Stack<Long> stack;
    public MinStack() {
        stack = new Stack<>();
        min = Long.MAX_VALUE;
    }

    public void push(int value) {
        Long val = Long.valueOf(value);
        if(stack.isEmpty()){
            stack.push(val);
            min = val;
        }
        else{
            if(val > min)
                stack.push(val);
            else{
                stack.push(2*val - min);
                min = val;
            }
        }
    }

    public void pop() {
        if(stack.isEmpty())
            return;
        Long x = stack.peek();
        stack.pop();
        if(x < min){
            min = 2*min - x;
        }
    }

    public int top() {
        if(stack.isEmpty())
            return -1;
        Long x = stack.peek();
        if(min < x)
            return x.intValue();
        return min.intValue();
    }

    public int getMin() {
        return min.intValue();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
