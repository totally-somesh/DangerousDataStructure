package DoublyLinkedList;

public class DoublyLinkedList {

	private Node head;

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
			if (last == null) {

				return false;
			}
		} // end of while

		last.setNext(newNode);
		newNode.setPrev(last);
		return true;
	}// end of insertByValue()

	public void display() {

		if (head == null) {

			return;
		}

		Node temp = head;
		while (temp != null) {

			System.out.print(temp.getData() + " | ");
			temp = temp.getNext();
		}
		System.out.println(" ");
	}// end of display()

//	public boolean insertByPosition(int data, int position) {
//
//		if (position <= 0 || (head == null && position > 1)) {
//			return false;
//		}
//		
//		Node newNode = new Node(data);
//		
//		if(position == 1) {
//			
//			if(head != null) {
//				
//				newNode.setNext(head);
//				head.setPrev(newNode);		
//			}
//			head = newNode;
//			return true;		
//		}//end of position 1 insertion
//		
//		Node prev = head;
//		for(int i=1; i<position-1; i++) {
//			
//			prev = prev.getNext();
//			if(prev == null) {
//				
//				return false;
//			}
//		}//end of for loop
//		
//		Node next = prev.getNext();
//		
//		if(next != null) {
//			
//			newNode.setNext(next);
//			prev.setNext(newNode);
//		}
//		newNode.setPrev(prev);
//		prev.setNext(newNode);
//		return true;
//
//	}

	public boolean insertByPosition(int data, int position) {

		if (position <= 0 || (head == null && position > 1)) {
			return false;
		}
		
		Node newNode = new Node(data);
		
		if(position == 1) {
			
			if(head != null) {
				
				newNode.setNext(head);
				head.setPrev(newNode);				
			}
			head = newNode;
			return true;			
		}//end of if
		
		
		Node prev = head;
		for(int i=1; i<position-1; i++) {
			
			prev = prev.getNext();
			if(prev == null) {
				
				return false;				
			}
		}
		
		Node next = prev.getNext();
		
		if(next != null) {	
			newNode.setNext(next);
			next.setPrev(newNode);
		}
		newNode.setPrev(prev);
		prev.setNext(newNode);
		return true; 		
	}//end of insertByPosition()
	
	public boolean deleteByValue(int data) {
		
		if(head == null) {
			return false;
		}
		
		if(head.getData() == data) {
			
			head = head.getNext();
			if(head != null) {
				
				head.setPrev(null);			
			}
			return true;			
		}//end of if
		
		Node del = head;
		while(del.getData() != data) {
			
			del = del.getNext();
			if(del == null) {		
				return false;
			}
		}
		
		Node prev = del.getPrev();
		Node next = del.getNext();
		
		prev.setNext(next);
		if(next != null) {
			next.setPrev(prev);
		}
		return true;	
	}//end of deleteByData()
	
	public boolean deleteByPosition(int position) {
		
		if(position <= 0 || head == null) {
			return false;
		}
		
		if(position == 1) {
			head = head.getNext();
			if(head != null) {
				head.setPrev(null);
			}
			return true;			
		}
		
		Node del = head;
		for(int i=1; i<position; i++) {
			
			del = del.getNext();
			if(del == null) {
				return false;
			}
		}
		
		Node prev = del.getPrev();
		Node next = del.getNext();
		
		prev.setNext(next);
		if(next != null) {
			
			next.setPrev(prev);
		}
		return true;	
	}//end of deleteByPosition()
	
	

}
