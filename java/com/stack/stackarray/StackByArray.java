package com.stack.stackarray;

public class StackByArray {
	
	int[] arr;
	int topStack;
	
	public StackByArray(int size) {
		this.arr = new int[size];
		this.topStack = -1;
		System.out.println("Successfully created an empty Stack of Size: " + size);
	}
	
	public void push(int value) {
		if (isFullStack()) {
			System.out.println("Stack Overflow Error!");
		} else {
			this.topStack++;
			arr[topStack] = value;
			System.out.println("Succesfully inserted " + value + " in the stack");
		}
	}
	
	public void pop() {
		if (isEmptyStack()) {
			System.out.println("Stack Underflow Error!");
		} else {
			System.out.println("Poping value from Stack: " + arr[topStack] + "...");
			this.topStack--;
		}
	}
	
	public void peek() {
		if (isEmptyStack()) {
			System.out.println("Stack Underflow Error!");
		} else {
			System.out.println("Top of Stack: " + arr[topStack]);
		}
	}
	
	public boolean isFullStack() {
		if (topStack == arr.length - 1) {
			System.out.println("Stack is full!");
			return true;
		}
		
		return false;
	}
	
	public boolean isEmptyStack() {
		if (topStack == -1) {
			System.out.println("Stack is empty!");
			return true;
		}
		
		return false;
	}
	
	public void deleteStack() {
		arr = null;
		System.out.println("Stack is succesfully deleted");
	}
}
