/*Anatalio Nickles
 *11MAR22
 *Coding Quiz 5 
 */
//Book class that inherits Product protected attributes
public class Book extends Product {
	// private Book object attributes
	private String author;
	private String genre;
	private String isbn;

	// constructors that bring in super attributes from parent class
	// and private attributes from Book class to create objects
	public Book(String name, double price, int quantity, String author, String genre, String isbn) {
		super(name, price, quantity);
		this.author = author;
		this.genre = genre;
		this.isbn = isbn;
	}

	public Book(String name, double price, int quantity, String author, String genre) {
		super(name, price, quantity);
		this.author = author;
		this.genre = genre;
	}
	// public getters and setters for future user authentication

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

//overridden method to produce Book specific output
	@Override
	public void getDetails() {
		System.out.println("We sell books on software development!");
	}

}
