package linkedList;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackQueue {
	
	public static boolean isValid(String s) {
		Deque<Character> stack = new ArrayDeque<>();
		for(char c: s.toCharArray()) {
			if(c == '(') {
				stack.push(')');
			} else if(c == '[') {
				stack.push(']');
			} else if(c == '{') {
				stack.push('}');
			} else if(stack.isEmpty() || stack.pop() != c) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		MinStack test = new MinStack();
		test.push(512);
		System.out.println(test.getMin());
		test.push(-1024);
		System.out.println(test.getMin());
		test.push(-1024);
		System.out.println(test.getMin());
		test.push(512);
		System.out.println(test.getMin());
		test.pop();
		System.out.println(test.getMin());
		test.pop();
		System.out.println(test.getMin());
		test.pop();
		System.out.println(test.getMin());

	}

}
