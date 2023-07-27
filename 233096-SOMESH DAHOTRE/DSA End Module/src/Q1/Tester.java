package Q1;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Book B1 = new Book(1, "XYZ", "XYZ", 400);
		Book B2 = new Book(2, "ABC", "ABC", 500);
		Book B3 = new Book(3, "LMN", "LMN", 600);
		Book B4 = new Book(4, "PQR", "PQR", 700);
		Book B5 = new Book(5, "DEF", "DEF", 800);

		SinglyLinkedList SLL = new SinglyLinkedList();

		SLL.insertByValue(B1);
		SLL.insertByValue(B2);
		SLL.insertByValue(B3);
		SLL.insertByValue(B4);
		SLL.insertByValue(B5);

		boolean exit = false;

		while (!exit) {

			System.out.println(" -------------------< Welcome To Book Shop >--------------------- ");
			System.out.println(" | Choose : 1. Insert At End | 2. Display SLL | 3. Insert Book By Position "
					+ "| 4. Delete Book By Position  | 5. Delete At The End | 6. Search A Book  | 7. Print Books In Descending Order   ");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:

				System.out.println("Enter Book Details : ID / Title / Author / Price ");

				Book NewBook = new Book(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble());

				SLL.insertByValue(NewBook);

				System.out.println(" | Congratulations ! New Book Inserted Succesfully !");

				break;

			case 2:

				System.out.println(" | Displaying The SLL : - ");
				SLL.display();

				break;

			case 3:

				System.out.println("Enter Book Details : ID / Title / Author / Price ");

				Book NewBook1 = new Book(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble());

				SLL.insertByValue(NewBook1);

				System.out.println("Enter Position To Insert At : - ");
				int position = sc.nextInt();

				SLL.insertByPosition(NewBook1, position);

				System.out.println(" | Congratulations ! New Book Inserted Succesfully !");

				break;

			case 4:

				System.out.println("Please Enter Position To Delete The Book : - ");
				int position1 = sc.nextInt();

				SLL.deleteByPosition(position1);

				SLL.display();

				break;

			case 5:

				SLL.deleteByValue(B5);

				System.out.println(" | Congratulations ! Book Deleted From The End ! ");

				break;

			case 6:

				System.out.println(" Enter Book Id : - ");

				System.out.println(SLL.search(sc.nextInt()));
				System.out.println(" | Found This Book ! ");
				break;
				
			case 7:

				System.out.println(" | Printing Books In Descending Order :-  ");
				SLL.descendingOrder();
				
				break;
				
			case 8:

				System.out.println(" | Total No. Of Books In The SLL Are :-  " + SLL.getCount());
				
				break;
				
			case 9:

				System.out.println("Enter Book Details : ID / Title / Author / Price ");

				Book NewBook2 = new Book(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble());

				SLL.insertAtFront(SLL, NewBook2);

				System.out.println(" | Congratulations ! New Book Inserted Succesfully !");
				break;
				
			case 10:

				SLL.deleteAtFront(SLL, 1);

				System.out.println(" | Congratulations ! Book Deleted Succesfully !");
				break;

			default:
				exit = true;
				break;
			}// end of switch

		} // end of while

	}

}
