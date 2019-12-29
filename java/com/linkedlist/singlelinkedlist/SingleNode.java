package com.linkedlist.singlelinkedlist;

/**
 * This class provides the nodes of the Single Linked List. the nodes
 * are composed with an integer value and a pointer to the next node
 * @author Hugo Vargas
 */
public class SingleNode {
	private int value;
	private SingleNode next;
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public SingleNode getNext() {
		return next;
	}
	
	public void setNext(SingleNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "[ " + value + " ]";
	}
	
}
