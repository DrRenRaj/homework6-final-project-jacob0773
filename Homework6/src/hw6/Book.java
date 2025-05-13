package hw6;


/**
 * Represents a Book in the library system.
 * Fields: title, author, ISBN, and availability.
 * Provides methods for accessing and updating book details.
 */

public class Book {


// Fields.
	
	private String bookTitle;
	private String authorName;
	private String isbnNumber;
	private boolean isAvailable;
	
	/**
	 * Constructs a book object with the specified title, author, and ISBN.
	 * @param bookTitle returns title of book
	 * @param authorName returns the name of the author.
	 * @param isbnNumber returns the ISBN number for the books.
	 */
	
	public  Book(String bookTitle, String authorName, String isbnNumber) {
		this.bookTitle = bookTitle;
		this.authorName = authorName;
		this.isbnNumber = isbnNumber;	
		this.isAvailable = true;
	}
	
// setter to update book title, author, and ISBN.
	public void setBookTitle(String newBookTitle) {
		bookTitle = newBookTitle;
	}

	public void setAuthorName(String newAuthor) {
		authorName = newAuthor;
	}
	
	public void setIsbnNumber(String newIsbnNumber) {
		isbnNumber = newIsbnNumber;
	}
	
// Getters to access title, author, and ISBN.
	public String getTitle() {
		return bookTitle;
	}
	
	public String getAuthor() {
		return authorName;
	}
	
	public String getIsbn() {
		return isbnNumber;	
	}
	
// toString() returns book information.
	public String toString() {
		return bookTitle + ": " + authorName + ": " + isbnNumber;
	}
	
/**
 * Sets availability of the book.
 * @param status true if available, false if checked out.
 * @return new availability status.
 */
	public boolean setIsAvailable(boolean status) {
		return isAvailable = status;
	}
	
/**
 * Returns the availability of the book.
 * @return isAvailable.
 */
	public boolean getIsAvailable() {
		return isAvailable;
	}
	
/**
 * Displays the availability messages.
 * @return book details
 */
	public String dispayAvailability() {	
	if(!isAvailable) {
		System.out.println(bookTitle + " is currently checked out");
	}
	else {
		System.out.println(bookTitle + " is available!");
	}
	return toString();

	}

}

	


 

