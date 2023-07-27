package Q1;

public class Book {
	
	public int BookId;
	public String BookTitle;
	public String BookAuthor;
	public double Price;
	public Book(int bookId, String bookTitle, String bookAuthor, double price) {
		super();
		BookId = bookId;
		BookTitle = bookTitle;
		BookAuthor = bookAuthor;
		Price = price;
	}
	public int getBookId() {
		return BookId;
	}
	public void setBookId(int bookId) {
		BookId = bookId;
	}
	public String getBookTitle() {
		return BookTitle;
	}
	public void setBookTitle(String bookTitle) {
		BookTitle = bookTitle;
	}
	public String getBookAuthor() {
		return BookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		BookAuthor = bookAuthor;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	@Override
	public String toString() {
		return " | BookId : " + BookId + " | BookTitle : " + BookTitle + " | BookAuthor : " + BookAuthor + " | Price : " + Price
				+ " | ";
	}
	
	
	
	
	

}
