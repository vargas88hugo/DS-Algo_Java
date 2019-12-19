package SingleLinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLinkedList newList = new SingleLinkedList();
		newList.createSingleLinkedList(5);
		
		newList.printSingleLinkedList();
		
		System.out.println(newList.getSize());
		
		newList.insertInLinkedList(99, 2);
		
		newList.printSingleLinkedList();
		
	}

}
