package Q1;

public class Node {
	
	public Book B;
	public Node next;
	
	public Node(Book B) {
		this.B = B;
		this.next = null;		
	}

	public Book getData() {
		return B;
	}

	public void setData(Book B) {
		this.B = B;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node head) {
		this.next = head;
	}

	
	
}
