package SinglyLinkedList;

public class Tester {

	public static void main(String[] args) {

		SinglyLinkedList SLL = new SinglyLinkedList();

		SLL.insertByValue(10);
		SLL.insertByValue(20);
		SLL.insertByValue(30);
		SLL.insertByValue(40);

		SLL.display();
		SLL.displayByRecursion(SLL.getHead());

		SLL.displayReverse();
		System.out.println(" ");
		SLL.displayReverseByRecursion(SLL.getHead());
		System.out.println(" ");

		SLL.insertByPosition(5, 1);
		SLL.display();
		SLL.insertByPosition(25, 4);
		SLL.display();
		SLL.insertByPosition(50, 7);
		SLL.display();

		SLL.deleteByPosition(1);
		SLL.display();
		SLL.deleteByPosition(3);
		SLL.display();
		SLL.deleteByPosition(5);
		SLL.display();

		System.out.println(" ---< Normal Reverse >--- ");
		//SLL.reverse();
		SLL.display();

		System.out.println(" ---< Recursion Reverse >--- ");
		if (SLL.getHead() != null || SLL.getHead().getNext() != null) {
			SLL.reverseByRecursion(SLL.getHead(), SLL.getHead().getNext());
		}
		SLL.display();
	}

}
