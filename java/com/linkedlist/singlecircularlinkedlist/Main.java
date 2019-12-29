package com.linkedlist.singlecircularlinkedlist;

public class Main {

	public static void main(String[] args) {
		
		SingleCircularLinkedList newList = new SingleCircularLinkedList();

		newList.createSingleCircularLinkedList(5);
		
		newList.insertInLinkedList(99);
		
		newList.insertInLinkedList(1);
		
		newList.insertInLinkedList(74);
		
		newList.insertInLinkedList(8);
		
		newList.printSingleLinkedList();
		
		System.out.println("Size: " + newList.getSize());
		
		System.out.println("The node that follows the tail " + newList.getTail() + ": "+ newList.getTail().getNext());
		
		System.out.printf("===========================================================================\n\n");

		newList.insertInLinkedList(99999, 2);
		
		newList.insertInLinkedList(99999, 6);
		
		newList.printSingleLinkedList();
		
		System.out.println("The node that follows the tail " + newList.getTail() + ": "+ newList.getTail().getNext());
		
		System.out.println("Size: " + newList.getSize());
		
		System.out.printf("===========================================================================\n\n");
		
		newList.printNode(4);
		
		newList.deleteNode(3);

		newList.deleteNode(5);
		
		newList.printSingleLinkedList();

		System.out.println("Size: " + newList.getSize());
		
		System.out.printf("===========================================================================\n\n");
		
		newList.printNode(4);
		
		newList.deleteLinkedList();
		
		newList.printSingleLinkedList();
		
		System.out.println("Size: " + newList.getSize());
	}
}
