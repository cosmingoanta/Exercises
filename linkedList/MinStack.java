package linkedList;

import java.util.ArrayDeque;

public class MinStack {
	private ArrayDeque<Integer> stack;
	private ArrayDeque<Integer> min;
	
	
    public MinStack() {
        this.stack = new ArrayDeque<Integer>();
        this.min = new ArrayDeque<Integer>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(min.isEmpty()) {
        	min.push(val);
        }
      
        if(val <= min.peek()) {
        	min.push(val);
        }
    }
    
    public void pop() {
        int el = stack.pop();
        if(el == min.peek()) {
        	min.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
