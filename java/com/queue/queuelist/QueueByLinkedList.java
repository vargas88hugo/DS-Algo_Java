package com.queue.queuelist;

import com.linkedlist.singlelinkedlist.SingleLinkedList;

public class QueueByLinkedList {
	
	SingleLinkedList list;
	
	public QueueByLinkedList() {
		list = new SingleLinkedList();
	}
	
	public void enQueue(int value) {
		if (list.getHead() == null) {
			list.createSingleLinkedList(value);
		} else {
			list.insertInLinkedList(value);
		}
	}
	
	public int deQueue() {
		int value = -1;
		
		if (isQueueEmpty()) {
			System.out.println("Queue underflow error!");
		} else {
			value = list.getHead().getValue();
			list.deleteNode(0);
		}
		
		return value;
	}
	
	public boolean isQueueEmpty() {
		if (list.getHead() == null) {
			return true;
		}
		
		return false;
	}
	
	public int peek() {
		int value = -1;
		
		if (isQueueEmpty()) {
			System.out.println("Queue underflow error!");
		} else {
			value = list.getHead().getValue();
		}
		
		return value;
	}
	
	public void deleteQueue() {
		list.setHead(null);
	}
}
