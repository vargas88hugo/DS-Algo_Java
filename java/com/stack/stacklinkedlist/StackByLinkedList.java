package com.stack.stacklinkedlist;

import com.linkedlist.singlelinkedlist.SingleLinkedList;

public class StackByLinkedList {
	SingleLinkedList list;

	public StackByLinkedList() {
		this.list = new SingleLinkedList();
	}
	
	public void push(int value) {
		if (list.getHead() == null) {
			list.createSingleLinkedList(value);
		} else {
			list.insertInLinkedList(value, 0);
		}
		
		System.out.println("Inserted " + value + " in Stack!");
	}
	
	public int pop() {
		int value = -1;
		
		if (!isEmpty()) {
			value = list.getHead().getValue();
			list.deleteNode(0);
		} else {
			System.out.println("Stack underflow error!");
		}
		
		return value;
	}
	
	public boolean isEmpty() {
		if (list.getHead() == null) {
			return true;
		}
		
		return false;
	}
	
	public int peek() {
		if (!isEmpty()) {
			return list.getHead().getValue();
		} else {
			System.out.println("The stack is empty!");
			return -1;
		}
	}
	
	public void deleteStack() {
		list.setHead(null);
	}
}
