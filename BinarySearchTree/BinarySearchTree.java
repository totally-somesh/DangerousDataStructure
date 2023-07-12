package BinarySearchTree;

import java.util.Stack;

public class BinarySearchTree {
	
	private Node root;

	public BinarySearchTree() {
		
		this.root = null;		
	}
	
	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public boolean insert(int data) {
		
		Node newNode = new Node(data);
		
		if(root == null) {
			
			root = newNode;
			return true;
		}
		
		Node temp = root;
		
		while(true) {
			
			if(data == temp.getData()) {
				return false;
			}
			
			if(data < temp.getData()) {
				
				if(temp.getLeft() == null) {
					
					temp.setLeft(newNode);
					return true;					
				}
				temp = temp.getLeft();				
			}
			else {
			
				if(temp.getRight() == null) {
					
					temp.setRight(newNode);
					return true;
				}
				temp = temp.getRight();				
			}//end of if - else block
			//System.out.println(" ");			
		}//end of while
	}//end of insertion method
	
	public void preOrder() {
		
		if(root == null) {
			return;
		}
		
		Node temp = root;
		Stack<Node> S = new Stack<Node>();
		
		while(temp != null || !S.isEmpty()) {
			
			while(temp != null) {
				
				System.out.print(temp.getData() + " | ");
				S.push(temp);
				temp = temp.getLeft();				
			}//end of minor while
			
			temp = S.pop().getRight();
			
		}//end of minor while
		
		System.out.print(" ");		
	}//end of preOrder method
	
	public void InOrder() {
		
		if(root == null) {
			return;
		}
		
		Node temp = root;
		Stack<Node> S = new Stack<>();
		
		while(temp != null || !S.isEmpty()) {
			
			while(temp != null) {
				
				S.push(temp);
				temp = temp.getLeft();				
			}//end of minor while
			
			temp = S.pop();
			System.out.print(temp.getData() + " | ");
			temp = temp.getRight();			
		}//end of major while
		
		System.out.print(" ");		
	}//end of preOrder method
	
	public void preOrder(Node root) {
		
		if(root == null) {
			return;
		}
		
		System.out.print(root.getData() + " | ");
		preOrder(root.getLeft());
		preOrder(root.getRight());		
	
	}//end of inOrder
	
	public void inOrder(Node root) {
		
		if(root == null) {
			return;
		}
		
		inOrder(root.getLeft());
		System.out.print(root.getData() + " | ");
		inOrder(root.getRight());
		
	}//end of preOrder
	
	public void postOrder(Node root) {
		
		if(root == null) {
			return;
		}
		
		postOrder(root.getLeft());
		postOrder(root.getRight());
		System.out.print(root.getData() +" | ");
				
	}//end of postOrder
	
	
//	public boolean delete(int data) {
//		
//		if(root == null) {
//			return false;
//		}
//		
//		Node parent = root;
//		Node del = root;
//		
//		while(del.getData() != data) {
//			
//			if(data < del.getData()) {
//				
//				parent = del;
//				del = del.getLeft();			
//			}
//			else {	
//				parent = del;
//				del = del.getRight();
//			}
//			
//			if(del == null) {
//				return false;
//			}			
//		}//end of 1st while loop
//		
//		while(true) {
//			
//			if(del.getLeft() == null && del.getRight() == null) {
//				
//				if(del == root) {	
//					root = null;
//					return true;
//				}
//				
//				if(parent.getLeft() == del) {	
//					parent.setLeft( null);
//				}
//				else {
//					parent.setRight(null);
//				}	
//				return true;
//		
//			}//end of 1st if condition
//			
//			if(del.getLeft() != null) {
//				
//				parent = del;
//				Node max = del.getLeft();
//				
//				while(max.getRight() != null) {
//					
//					parent = max;
//					max = max.getRight();
//				}
//				
//				int temp = del.getData();
//				del.setData(max.getData());
//				max.setData(temp);
//				
//				del = max;
//						
//			}//end of if
//			else {
//				
//				parent = del;
//				Node min = del.getRight();
//				
//				while(min.getLeft() != null) {
//					
//					parent = min;
//					min = min.getLeft();					
//				}
//				
//				int temp = del.getData();
//				del.setData(min.getData());
//				min.setData(temp);
//				
//				del = min;				
//			}//end of else 
//						
//		}//end of 2nd while
//		
//	}

	public boolean delete(int data) {
		
		if(root == null) {	
			return false;
		}
		
		Node parent = root;
		Node del = root;
		
		while(del.getData() != data) {
			
			if(data < del.getData()) {
			
				parent = del;
				del = del.getLeft();				
			}
			else {
				
				parent = del;
				del = del.getRight();
			}
			
			if(del == root) {	
				return false;
			}	
		}//end of 1st while 
		
		while(true) {
			
			if(del.getLeft() == null && del.getRight() == null) {
				
				if(del == root) {	
					root = null;
					return true;
				}
				
				if(parent.getLeft() == del) {
					parent.setLeft(null);
				}
				else {
					parent.setRight(null);
				}
				return true;
				
			}//end of 1st if 
			
			if(del.getLeft() != null) {
				
				parent = del;
				Node max = del.getLeft();	
				
				while(max.getRight() != null) {
					
					parent = max;
					max = max.getRight();
				}
				
				int temp = del.getData();
				del.setData(max.getData());
				max.setData(temp);
				
				del = max;
				
			}//end of 2nd if
			else {
				
				parent = del;
				Node min = del.getRight();
				
				while(min.getLeft() != null) {
					
					parent = min;
					min = min.getLeft();
				}
				
				int temp = del.getData();
				del.setData(min.getData());
				min.setData(temp);
				
				del = min;			
			}
		}//end of 2nd while		
	}//end of delete method
	
	public boolean find(int data){
		
		Node temp = root;
		
		while(temp != null) {
			
			if(temp.getData() == data) {
				return true;
			}
			
			if(data < temp.getData()) {
				
				temp = temp.getLeft();
			}else {
				
				temp = temp.getRight();	
			}
		}//end of while
		
		return false;		
	}
	
	public int getMax() {
		
		if(root == null) {
			
			return -1;
		}
		
		Node temp = root;
		while(temp.getRight() != null) {
			
			temp = temp.getRight();
		}//end of while
		
		return temp.getData();	
	}
	
	public int getMin() {
		
		if(root == null)
		{
			return -1;
		}	
		
		Node temp = root;
		while(temp.getLeft() != null) {
			
			temp = temp.getLeft();
		}//end of while
		return temp.getData();		
	}
	
	
	
}
