package DoublyLinkedList;

public class Tester {
	
	public static void main(String[] args) {
		
		DoublyLinkedList DLL = new DoublyLinkedList();
		
		DLL.insertByValue(10);
		DLL.insertByValue(20);
		DLL.insertByValue(30);
		DLL.insertByValue(40);
		
		DLL.display();
		
		DLL.insertByPosition(5,1);
		DLL.display();
		DLL.insertByPosition(25,4);
		DLL.display();
		DLL.insertByPosition(50,7);
		DLL.display();	
		
		DLL.deleteByPosition(1);
		DLL.deleteByPosition(3);
		DLL.deleteByPosition(5);
		DLL.display();
	
	}

}
