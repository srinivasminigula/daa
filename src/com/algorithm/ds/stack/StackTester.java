/**
 * 
 */
package com.algorithm.ds.stack;

/**
 * @author srinivasminigula
 *
 */
public class StackTester {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.show();
		System.out.println("peek:" + stack.peek());
		System.out.println("size:" + stack.size());

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println("size:" + stack.size());
		stack.show();

	}

}

class Stack {
	int stack[] = new int[5];
	int top = 0;

	public void push(int data) {
		if (top > 4) {
			System.out.println("Stack is full!");
			return;
		}
		try {
			stack[top++] = data;
		} catch (IndexOutOfBoundsException e) {
			throw new StackOverflowError("Stack is already full!");

		}
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty!");
		}
		top--;
		int data = stack[top];
		stack[top] = 0;
		return data;
	}

	public int peek() {
		return stack[top - 1];
	}

	public int size() {
		return top;
	}

	public boolean isEmpty() {
		return top <= 0;
	}

	public void show() {
		for (int i : stack) {
			System.out.println(i);
		}
	}
}