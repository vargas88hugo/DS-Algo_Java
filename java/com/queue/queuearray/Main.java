package com.queue.queuearray;

public class Main {

	public static void main(String[] args) {

		System.out.println("Creating an empty queue...");
		QueueByArray queue = new QueueByArray(5);

		System.out.println("\nEnqueuing 5 values in the queue...");
		for (int i = 1; i <= 5; i++) {
			queue.enQueue(i * 10);
		}
		queue.enQueue(60);
		queue.deQueue();
		queue.deQueue();
		queue.enQueue(60);
		queue.printArray();
		queue.deQueue();
		queue.printArray();
		queue.deleteStack();
	}

}
