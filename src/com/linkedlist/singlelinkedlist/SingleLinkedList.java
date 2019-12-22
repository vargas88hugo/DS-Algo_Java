package com.linkedlist.singlelinkedlist;

/**
 * This class handles the node instances to build the structure of
 * the Single Linked List. The Linked List is composed of an integer
 * value 
 * @author 	Hugo Vargas
 */
public class SingleLinkedList {
	private SingleNode head;
	private SingleNode tail;
	private int size;
	
	/**
	 * This method initializes the first node head of the Single 
	 * Linked List. The head is also the tail.
	 * @param 	nodeValue 
	 * @return 	The head of the Single Linked List
	 */
	public SingleNode createSingleLinkedList(int nodeValue) {
		head = new SingleNode();
		head.setValue(nodeValue);
		head.setNext(null);
		tail = head;
		size = 1;
		
		System.out.println("The Single Linked List has been created and has a head of value " + nodeValue);
		
		return head;
	}

	public SingleNode getHead() {
		return head;
	}

	public void setHead(SingleNode head) {
		this.head = head;
	}
	
	public SingleNode getTail() {
		return tail;
	}
	
	public void setTail(SingleNode tail) {
		this.tail = tail;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * This method inserts a new node to the Single Linked List. It has
	 * a error verification with the index position that must be between
	 * the size of the List
	 * @param nodeValue	Integer value of the node
	 * @param index		Index position to insert the node
	 */
	public void insertInLinkedList(int nodeValue, int index) {
		SingleNode node = new SingleNode();
		node.setValue(nodeValue);
		
		if (!existsLinkedList()) {
			System.out.println("The Linked List does not exists.");
			return;
		} else if (index > size || index < 0) {
			System.out.println("The index " + index + " is out of range.");
			return;
		} else if (index == 0) {
			node.setNext(head);
			head = node;
		} else if (index == size) {
			node.setNext(null);
			tail.setNext(node);
			tail = node;
		} else {
			SingleNode tempNode= head;
			int count = 0;
			
			while (count < index - 1) {
				tempNode = tempNode.getNext();
				count++;
			}
			SingleNode nextNode = tempNode.getNext();
			tempNode.setNext(node);
			node.setNext(nextNode);
		}
		setSize(getSize() + 1);
		System.out.println("The node of value " + nodeValue + " and index " + index + " has been created");
	}
	
	/**
	 * Overloading method of insertInLinkedList
	 * @param nodeValue	Integer value of the node
	 */
	public void insertInLinkedList(int nodeValue) {
		insertInLinkedList(nodeValue, size);
	}
	
	/**
	 * This method checks if the Linked List exists
	 * @return 	true if exists and false otherwise
	 */
	public boolean existsLinkedList() {
		// if head is not null return true otherwise return false
		return head != null;
	}
	
	/**
	 * Method that prints the Single Linked List
	 */
	public void printSingleLinkedList() {
		if (!existsLinkedList()) {
			System.out.println("The Linked List does not exists.");
			return;
		}
		SingleNode temp = head;
		
		while (temp != null) {
			System.out.print(temp + "---> ");
			temp = temp.getNext();
		}
		System.out.println("null");
	}
	
	/**
	 * This method deletes a node in the given index. If the index doesn't
	 * exist, nothing will be deleted
	 * @param index	Position of the node to be deleted
	 */
	public void deleteNode(int index) {
		
		if (!existsLinkedList()) {
			System.out.println("The Linked List does not exists.");
			return;
		} else if (index >= size || index < 0) {
			System.out.println("The index " + index + " is out of range.");
			return;
		} else if (index == 0) {
			head = head.getNext();
			setSize(getSize() - 1);
			if (getSize() == 0) {
				tail = null;
			}
		} else if (index == size - 1) {
			SingleNode temp = head;
			
			while (temp.getNext().getNext() != null) {
				temp = temp.getNext();
			}
			tail = temp;
			tail.setNext(null);
		} else {
			SingleNode temp = head;
			int count = 0;
			
			while (count < index - 1) {
				temp = temp.getNext();
				count++;
			}
			temp.setNext(temp.getNext().getNext());
		}
		setSize(getSize() - 1);
		System.out.println("The node of index " + index + " has been deleted");
	}
	
	/**
	 * This method prints the node of the given index. If the index doesn't
	 * exists, nothing will be deleted
	 * @param index	Node position to print
	 */
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
			SingleNode temp = head;
			int count = 0;
			
			while (count < index) {
				temp = temp.getNext();
				count++;
			}
			
			System.out.println("This is the node of value " + temp.getValue() + " and index " + index + ".");
		}
	}
	
	public void deleteLinkedList() {
		head = null;
		tail = null;
		size = 0;
		System.out.println("The Single Linked List has been deleted.");
	}
}