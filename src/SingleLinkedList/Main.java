package SingleLinkedList;

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
		
		newList.deleteNode(3);
		
		newList.printSingleLinkedList();
		
		System.out.println("Size: " + newList.getSize());
	}

}
