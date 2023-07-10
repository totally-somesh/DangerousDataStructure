package SinglyLinkedList;

import java.util.Stack;

public class SinglyLinkedList {

	private Node head;

	public SinglyLinkedList() {

		this.head = null;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public boolean insertByValue(int data) {

		Node newNode = new Node(data);

		if (head == null) {

			head = newNode;
			return true;
		}

		Node last = head;
		while (last.getNext() != null) {

			last = last.getNext();
		}

		last.setNext(newNode);
		return true;
	}// end of insertByValue()

	public void display() {

		Node temp = head;

		if (temp == null) {

			return;
		}

		while (temp != null) {

			System.out.print(temp.getData() + " | ");
			temp = temp.getNext();
		}
		System.out.println(" ");
	}// end of display()

	public void displayByRecursion(Node head) {

		if (head == null) {
			return;
		}
		System.out.print(head.getData() + " | ");
		displayByRecursion(head.getNext());
		System.out.println(" ");
	}

	public void displayReverse() {

		Node temp = head;
		Stack<Node> S = new Stack();

		if (temp == null) {
			return;
		}

		while (temp != null) {
			S.push(temp);
			temp = temp.getNext();
		}

		while (!S.isEmpty()) {
			System.out.print(S.pop().getData() + " | ");
		}
	}// end of diplayReverse()

	public void displayReverseByRecursion(Node head) {

		if (head == null) {

			return;
		}
		displayReverseByRecursion(head.getNext());
		System.out.print(head.getData() + " | ");
	}// end of disaplyReverseByRecursion()

	public boolean insertByPosition(int data, int position) {

		Node newNode = new Node(data);

		if (position <= 0 || (head == null && position > 1)) {

			return false;
		}

		if (position == 1) {

			newNode.setNext(head);
			head = newNode;
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

	public boolean deleteByValue(int data) {

		if (head == null) {

			return false;
		}

		if (head.getData() == data) {

			head = head.getNext();
			return true;
		}

		Node prev = head;
		Node del = head;
		while (del.getData() != data) {

			prev = del;
			del = del.getNext();
			if (del == null) {

				return false;
			}
		} // end of while

		prev.setNext(del.getNext());
		return true;
	}// end of deleteByValue()

	public boolean deleteByPosition(int position) {

		if(head == null || position < 1) {
			
			return false;			
		} 
		
		if(position == 1) {
			
			head = head.getNext();
			return true;
		}
		
		Node prev = head;
		for(int i=1; i<position-1; i++) {
			
			prev = prev.getNext();
			if(prev.getNext() == null) {
				return false;				
			}			
		}//end of for loop
		
		Node del = prev.getNext();
		prev.setNext(del.getNext());
		return true;		
	}//end of deleteByPosition()
	
	public void reverse() {
		
		if(head == null || head.getNext() == null) {
			
			return;
		}
		
		Node n1 = head;
		Node n2 = head.getNext();
		Node n3 = null;
		
		while(n2 != null) {

			n3 = n2.getNext();
			n2.setNext(n1);
			n1 = n2;
			n2 = n3;		
		}
		
		head.setNext(null);
		head = n1;		
	}//end of reverse()


	public void reverseByRecursion(Node n1, Node n2) {
		
		if(n2 == null) {
			head.setNext(null);
			head = n1;
			return;			
		}
		
		reverseByRecursion(n2, n2.getNext());
		n2.setNext(n1);	
	}//end of reverseByRecursion();
	
}
