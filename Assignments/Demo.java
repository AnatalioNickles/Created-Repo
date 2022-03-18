import java.util.ArrayList;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		ArrayList<Book> books = new ArrayList<Book>();

		Scanner input = new Scanner(System.in);

		while(true) {
			
			System.out.println("Enter Book title (or 'done' to exit): ");	
			String title = input.nextLine();
			
			if (title.equalsIgnoreCase("done")) {
				break;
			}else {
			}
			System.out.println("Enter the author: ");
			String author = input.nextLine();
			
			System.out.println("Enter the isbn: ");
			long isbn = input.nextLong();

			System.out.println("Enter the rental price: ");
			double price = input.nextDouble();
			
			System.out.println("The book is currently checked out true/false: ");
			boolean isBorrowed = input.nextBoolean();
			
			
			
			for(Book book:books) {
				System.out.println(book);				
			}
			input.close();
			
		}
	}

}
