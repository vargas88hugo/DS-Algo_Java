package com.linkedlist.singlelinkedlist;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLinkedList newList = new SingleLinkedList();
		newList.createSingleLinkedList(5);
		
		newList.insertInLinkedList(99);
		
		newList.insertInLinkedList(1);
		
		newList.insertInLinkedList(74);
		
		newList.insertInLinkedList(8);
		
		newList.printSingleLinkedList();
		
		System.out.println("Size: " + newList.getSize());
		
		System.out.printf("===========================================================================\n\n");
		
		newList.insertInLinkedList(99999, 2);
		
		newList.insertInLinkedList(99999, 4);
		
		newList.printSingleLinkedList();
		
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
