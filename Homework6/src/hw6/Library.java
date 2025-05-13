package hw6;
import java.util.ArrayList;

/**
 * Represents a library system that stores and manages books.
 * Supports adding, removing, searching, checking out, and returning books.
 */

public class Library {
	
// List of all books in the library system.
	private ArrayList<Book> books;
	
/**
 * Constructs a new library object with empty book list.
 */
	public Library() {
	books = new ArrayList<Book>();	
	}
	
/**
 * Adds a new book to the library.
 * @param book added.
 */
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }
    
/**
 * Removes book from the library by the ISBN.
 * @param isbn of the book to be removed.
 * @return true if removed, false if not found.
 */
    public boolean removeBook(String isbn) {
    	
    	boolean found = false;
    	int index = 0;
    	while(index < books.size( )) {
    		if(isbn.equals(books.get(index).getIsbn())) {
    			books.remove(index);
    			found = true;
    			break;
    		}
   
    		else {
    			index++;
    		}		
     }
		return found;   
    }

/**
 * Displays all of the books in the library.
 */
    public void displayAllBooks() {
    	
    	System.out.println("Displaying all books in our system.");
    	if(books.isEmpty()) {
    	
    		System.out.println("There are no books in the library.");
    	}
    	else {
    		for(Book book : books) {
    			System.out.println(book);
    		}
    	}
		
    }
    
/**
 * Searches for a book by title.
 * @param title of the book to be searched for.
 * @return message of book information or if the book was not found.
 */
    public String searchByTitle(String title) {
    	
    	for(int i =0; i < books.size(); i++) {
    		if(title.equalsIgnoreCase(books.get(i).getTitle())) {
    			System.out.println("The book " + title + "is in the system");
    			
    		}
    	}
    	return "Book " + title + " is not in our system.";
    	
    }
    
/**
 * Searches library for a book by author.
 * @param author of the book to be searched for.
 * @return message of book information or if it was not found.
 */
    public String searchByAuthor(String author) {
    	String result = "";
    	boolean found = false;
    	for(Book book : books) {
    		if(book.getAuthor().equalsIgnoreCase(author)) {
    			result += book.toString();
    			found = true;
    		}
    		
    	}
    	
    	if(!found) {
    		return "There are no books in our library by " + author;
    	}
    	return result;
    	
    }
    
/**
 * Checks out book by ISBN.
 * @param isbn of the book to be checked out.
 * @return the updated message.
 */
    public String checkOutBook(String isbn) {
    	for(Book book : books) {
    		if(book.getIsbn().equalsIgnoreCase(isbn) && book.getIsAvailable()) {
    			book.setIsAvailable(false);
    			return book.getTitle() + " has been checked out!";
    			
    		}
    		else {
    			return book.getTitle() + " is already checked out.";
    			
    		}
    		
    	}
       	
    
    	
    	return "The book with ISBN: " + isbn + " was not found in the system.";
    	
 }
    
/**
 * Return book by ISBN.
 * @param isbn of the book to be returned.
 * @return updated message.
 */
     
    public String returnBook(String isbn) {
    	for(Book book : books) {
    		if(book.getIsbn().equalsIgnoreCase(isbn) && !book.getIsAvailable()) {
    			book.setIsAvailable(true);
    			return book.getTitle() + " has been successfully returned!";			
    		}
    		else {
    			return book.getTitle() + " was not checked out";
    		}
    		
    	}
    	
    
    
    return "The book with ISBN " + isbn + " has not been entered into our system.";
    
    }
    
}
    
    
    	
    
		
    



