package com.linkedlist.doublelinkedlist;

public class DoubleLinkedList {
	private DoubleNode head;
	private DoubleNode tail;
	private int size;
	
	public DoubleNode createDoubleLinkedList(int value) {
		head = new DoubleNode();
		head.setValue(value);
		head.setNext(null);
		head.setPrev(null);
		tail = head;
		size = 1;
		
		System.out.println("The Double Linked List has been created and has a head of value " + value);
		
		return head;
	}

	public DoubleNode getHead() {
		return head;
	}

	public void setHead(DoubleNode head) {
		this.head = head;
	}

	public DoubleNode getTail() {
		return tail;
	}

	public void setTail(DoubleNode tail) {
		this.tail = tail;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public void insertInLinkedList(int value, int index) {
		DoubleNode node = new DoubleNode();
		node.setValue(value);
		
		if (!existsLinkedList()) {
			System.out.println("The Linked List does not exists.");
			return;
		} else if (index > size || index < 0) {
			System.out.println("The index " + index + " is out of range.");
			return;
		} else if (index == 0) {
			node.setNext(head);
			node.setPrev(null);
			head = node;
		} else if (index == size) {
			tail.setNext(node);
			node.setPrev(tail);
			node.setNext(null);
			tail = node;
		} else {
			DoubleNode temp = head;
			int count = 0;
			
			while (count < index - 1) {
				temp = temp.getNext();
				count++;
			}
			(temp.getNext()).setPrev(node);
			node.setNext(temp.getNext());
			temp.setNext(node);
			node.setPrev(temp);
		}
		
		setSize(getSize() + 1);
		System.out.println("The node of value " + value + " and index " + index + " has been created");
	}
	
	public void insertInLinkedList(int nodeValue) {
		insertInLinkedList(nodeValue, size);
	}
	
	public boolean existsLinkedList() {
		return head != null;
	}
	
	public void printDoubleLinkedList() {
		DoubleNode node = head;
		
		System.out.print("null <---> ");
		while (node != null) {
			System.out.print(node + " <---> ");
			node = node.getNext();
		}
		System.out.println("null");
	}
	
	public void deleteNode(int index) {		
		if (!existsLinkedList()) {
			System.out.println("The Linked List does not exists.");
			return;
		} else if (index >= size || index < 0) {
			System.out.println("The index " + index + " is out of range.");
			return;
		} else if (index == 0) {
			head = head.getNext();
			head.setPrev(null);
			
			setSize(getSize() - 1);
			
			if (getSize() == 0) {
				tail = null;
			}
		} else if (index == getSize() - 1) {
			tail = tail.getPrev();
			tail.setNext(null);
		} else {
			DoubleNode node = head;
			
			int count = 0;
			while (count < index - 1) {
				node = node.getNext();
				count++;
			}
			node.getNext().getNext().setPrev(node);
			node.setNext(node.getNext().getNext());
		}
		
		setSize(getSize() - 1);
		System.out.println("The node of index " + index + " has been deleted");
	}
	
	public void deleteLinkedList() {
		head = null;
		tail = null;
		size = 0;
		System.out.println("The Single Linked List has been deleted.");
	}
	
	public void printNode(int index) {
		if (!existsLinkedList()) {
			System.out.println("The Linked List does not exists.");
		} else if (index >= size || index < 0) {
			System.out.println("The index " + index + " is out of range.");
		} else if (index == 0) {
			System.out.println("This is the node of value " + head.getValue() + " and index " + index + ".");
		} else if (index == size - 1) {
			System.out.println("This is the node of value " + tail.getValue() + " and index " + index + ".");
		} else {
			DoubleNode temp = head;
			int count = 0;
			
			while (count < index) {
				temp = temp.getNext();
				count++;
			}
			
			System.out.println("This is the node of value " + temp.getValue() + " and index " + index + ".");
		}
	}
}
