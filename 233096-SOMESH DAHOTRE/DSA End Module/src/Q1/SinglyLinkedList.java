package Q1;

import java.util.Stack;

public class SinglyLinkedList {

	private Node head;
	public int count = 0;

	public SinglyLinkedList() {

		this.head = null;
	}

	public int getCount() {
		return count;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public boolean insertByValue(Book B) {

		Node newNode = new Node(B);

		if (head == null) {

			head = newNode;
			count++;
			return true;
		}

		Node last = head;
		while (last.getNext() != null) {

			last = last.getNext();
		}

		last.setNext(newNode);
		count++;
		return true;
	}// end of insertByValue()

	public void display() {

		Node temp = head;

		if (temp == null) {

			return;
		}

		while (temp != null) {

			System.out.println(temp.getData() + " | ");
			temp = temp.getNext();
		}
		System.out.println(" ");
		System.out.println(" ");
	}// end of display()

	public boolean insertByPosition(Book B, int position) {

		Node newNode = new Node(B);

		if (position <= 0 || (head == null && position > 1)) {

			return false;
		}

		if (position == 1) {

			newNode.setNext(head);
			head = newNode;
			count++;
			return true;
		}

		Node prev = head;
		for (int i = 1; i < position - 1; i++) {

			prev = prev.getNext();
			if (prev == null) {

				return false;
			}
		}

		newNode.setNext(prev.getNext());
		prev.setNext(newNode);
		return true;
	}// end of insertByPosition()

	public boolean deleteByValue(Book B) {

		if (head == null) {

			return false;
		}

		if (head.getData() == B) {

			head = head.getNext();
			return true;
		}

		Node prev = head;
		Node del = head;
		while (del.getData() != B) {

			prev = del;
			del = del.getNext();
			if (del == null) {

				return false;
			}
		} // end of while

		prev.setNext(del.getNext());
		System.out.println(" ");
		return true;
	}// end of deleteByValue()

	public boolean deleteByPosition(int position) {

		if (head == null || position < 1) {

			return false;
		}

		if (position == 1) {

			head = head.getNext();
			return true;
		}

		Node prev = head;
		for (int i = 1; i < position - 1; i++) {

			prev = prev.getNext();
			if (prev.getNext() == null) {
				return false;
			}
		} // end of for loop

		Node del = prev.getNext();
		prev.setNext(del.getNext());
		System.out.println(" ");
		return true;
	}// end of deleteByPosition()

	public Book search(int id) {

		Node temp = head;
		if (temp.getData().getBookId() == id) {

			return temp.getData();
		}

		while (temp != null) {

			if (temp.getData().getBookId() == id) {

				return temp.getData();
			}

			else {

				temp = temp.getNext();
			}
		}

		return null;
	}

	public void descendingOrder() {

		Node temp = head;
		Stack<Book> S = new Stack();

		if (temp == null) {
			return;
		}

		while (temp != null) {
			S.push(temp.getData());
			temp = temp.getNext();
		}

		while (!S.isEmpty()) {
			System.out.print(S.pop() + " | ");
		}

	}

	public boolean insertAtFront(SinglyLinkedList SLL, Book B) {

		SLL.insertByPosition(B, 1);

		return true;
	}

	public boolean deleteAtFront(SinglyLinkedList SLL, int position) {

		SLL.deleteByPosition(1);

		return true;
	}

//	public void displayReverse() {
//
//		Node temp = head;
//		Stack<Node> S = new Stack();
//
//		if (temp == null) {
//			return;
//		}
//
//		while (temp != null) {
//			S.push(temp);
//			temp = temp.getNext();
//		}
//
//		while (!S.isEmpty()) {
//			System.out.print(S.pop().getData() + " | ");
//		}
//	}// end of diplayReverse()
//	
}
