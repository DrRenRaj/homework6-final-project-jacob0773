package hw6;
import java.util.Scanner;

//Add other classes here or separate java files in same package
public class Main {

	public static void main(String[] args) {
		
	// Creates a library object to manage book operations.	
		Library library = new Library();
		
	// Variable to store user menu selection.
		int input;
		
	// initialize Scanner.
		Scanner scan = new Scanner(System.in);	
		
	// Start of main menu loop.
		do{	
			System.out.println("Main meunu");
			System.out.println("1. Add Book");
			System.out.println("2. Remove Book");
			System.out.println("3. Display All Books");
			System.out.println("4. Search by title");
			System.out.println("5. Search By Author");
			System.out.println("6. Check Out Book");
			System.out.println("7. Return Book");
			System.out.println("8. Exit");
			System.out.println("Please select an option");
			input = scan.nextInt();
			scan.nextLine();
		
			switch (input){
	// Add a new book.
			case 1:{
				
				 System.out.println("Please enter a book title you would like to add.");
				 String title = scan.nextLine();
			
				 System.out.println("Please enter the authors name:");
				 String author = scan.nextLine();
			
				 System.out.println("Please enter the ISBN:");
				 String isbn = scan.nextLine();
			
				 Book newBook = new Book(title, author, isbn);				 
				 library.addBook(newBook);
				 scan.nextLine();
			break;
	
			}
	// remove book.
			case 2:{
				System.out.println("Please enter a book title you would like to remove.");
				String title = scan.nextLine();
				
				System.out.println("Please enter the authors name:");
				String author = scan.nextLine();
				
				System.out.println("Please enter the ISBN:");
				String isbn = scan.nextLine();
				
				library.removeBook(isbn);
				scan.nextLine();
				
				break;
			}
	// Display books.
			case 3:{
				
				library.displayAllBooks();
				scan.nextLine();
				break;
				
			}
	// Search by title.
			case 4:{
				System.out.println("Please enter the title of the book you would like to search for.");
				String title = scan.nextLine();
				System.out.println(library.searchByTitle(title));
				scan.nextLine();
				break;
			}
	// Search by author.
			case 5:{
				System.out.println("Please enter the authors name.");
				String author = scan.nextLine();
				System.out.println(library.searchByAuthor(author));
				break;
			}
	// Check out book by ISBN.
			case 6:{
				System.out.println("Please enter the ISBN number of the book you would like to check out.");
				String isbn = scan.nextLine();
				System.out.println(library.checkOutBook(isbn));
				scan.nextLine();
				break;
			}
	// Return book by ISBN.
			case 7:{
				System.out.println("Please enter the ISBN number of the book you would like to return.");
				String isbn = scan.nextLine();
				System.out.println(library.returnBook(isbn));
				scan.nextLine();
				break;
			}
	// Exit.
			case 8:{
				System.out.println("Thank you, have a nice day!");
				scan.nextLine();
				break;
			}
	// Default.
			default:
				System.out.println("Invalid entry");
				scan.nextLine();
				break;
			}
			
		}
		
		while(input != 8) ;
		scan.close();
			
	}
	
}
		
	
		
	
		
		
		
	
