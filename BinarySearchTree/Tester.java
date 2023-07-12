package BinarySearchTree;

public class Tester {

	public static void main(String[] args) {
	BinarySearchTree BST = new BinarySearchTree();
	
	BST.insert(50);
	BST.insert(40);
	BST.insert(60);
	BST.insert(30);
	BST.insert(45);
	BST.insert(55);
	BST.insert(65);
	
//	System.out.println(" --- < InOrder >--- ");
//	BST.InOrder();
//
//	System.out.println(" ");
//	
//	System.out.println(" --- < PreOrder >--- ");
//	BST.preOrder();
	
	System.out.println(" --- < InOrder By Recursion >--- ");
	BST.inOrder(BST.getRoot());

	System.out.println(" ");
	
	System.out.println(" --- < PreOrder By Recursion >--- ");
	BST.preOrder(BST.getRoot());

	System.out.println(" ");
	
	System.out.println(" --- < PostOrder By Recursion >--- ");
	BST.postOrder(BST.getRoot());

	System.out.println(" ");

	
	System.out.println(" ---< Deleting 50 >--- ");
	BST.delete(50);
	BST.preOrder();
	
	System.out.println(" ---< Deleting 45 >--- ");
	
	BST.delete(45);
	BST.preOrder();
	
	System.out.println(" ---< Deleting 65 >--- ");
	
	BST.delete(65);
	BST.preOrder();
	
	System.out.println(" ---<  Max - Min >--- ");
	
	System.out.println(BST.getMax());
	System.out.println(BST.getMin());
	System.out.println(BST.find(50));
	
	
	
	
	}

}
