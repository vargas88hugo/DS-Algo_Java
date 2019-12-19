package SingleLinkedList;

public class SingleLinkedList {
	private SingleNode head;
	private SingleNode tail;
	private int size;
	
	public SingleNode createSingleLinkedList(int nodeValue) {
		head = new SingleNode();
		head.setValue(nodeValue);
		head.setNext(null);
		tail = head;
		size = 1;
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
	
	public void insertInLinkedList(int nodeValue, int index) {
		SingleNode node = new SingleNode();
		node.setValue(nodeValue);
		
		if (!existsLinkedList()) {
			System.out.println("The Linked List does not exists.");
			return;
		} else if (index > size || index < 0) {
			System.out.println("The index is out of range.");
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
	}
	
	public boolean existsLinkedList() {
		// if head is not null return true otherwise return false
		return head != null;
	}
	
	public void printSingleLinkedList() {
		SingleNode temp = head;
		
		while (temp != null) {
			System.out.print(temp + "---> ");
			temp = temp.getNext();
		}
		System.out.println("null");
	}
}
