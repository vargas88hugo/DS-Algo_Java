package com.linkedlist.doublelinkedlist;

public class Main {

	public static void main(String[] args) {
		DoubleLinkedList newList = new DoubleLinkedList();
		
		newList.createDoubleLinkedList(6);
		
		newList.insertInLinkedList(99);
		
		newList.insertInLinkedList(1);
		
		newList.insertInLinkedList(74);
		
		newList.insertInLinkedList(8);
		
		newList.printDoubleLinkedList();
	}

}
