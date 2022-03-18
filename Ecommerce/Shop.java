
/*Anatalio Nickles
 *11MAR22
 *Coding Quiz 5 
 */
//import scanner object
import java.util.Scanner;

public class Shop {
	// declare variables
	static double totalAmount = 0;
	static int userInput;
	// create array and objects index 0-4
	static Product[] inventory = { new Apparel("Business Ritual Women’s Long Sleeve Top", 65.39, 4, 'L', "Blue"),
			new Book("The Art of Computer Programming", 190.54, 9, "Donald E. Knuth", "horror", "526.25"),
			new Apparel("Men's Casual Business Shirt", 57.10, 9, 'M', "Teal"),
			new Bath("Organic Turmeric Soap", 11.25, 1),
			new Book("Head First Design Pattern", 37.35, 3, "Eric Freeman", "Sci-Fi") };

	public static void main(String[] args) {
		// create and name Scanner
		Scanner input = new Scanner(System.in);
		// start point of do/while loop
		do {
			// call static menu method
			displayMenu();
			// take user input
			userInput = input.nextInt();
			// try/catch for exception to check if user input is withint the bounds of the
			// inventory array
			try {
				// using user input (which doubles as array index) to call method to check it
				// item has quantity
				if (inventory[userInput].buy()) {
					// add price to total amount
					totalAmount += inventory[userInput].getPrice();
					System.out.println("Your purchase was successful!");
				}
				// display no current stock message to customer
				else {
					System.out.println("Sorry! This product is out of \r\n" + "stock.");
				}
			}
			// catching exception to break out of do/while loop
			catch (ArrayIndexOutOfBoundsException e) {
				break;
			}
			// while condition to continue do/while loop
		} while (userInput >= 0 && userInput <= 4);
		// close scanner
		input.close();
		// if user choice was outside 0-4 then display total amount due
		System.out.println("Thank you for shopping with us! The total amount is " + totalAmount);
	}

	// menu method display returning nothing
	public static void displayMenu() {
		System.out.println("--------------------------------\nEnter the product index (0 to 4) you \r\n"
				+ "want to buy. To exit the shopping cart, enter any number \r\n" + "other than 0 to 4");
		// for loop doubling the use of array index as counter
		for (int i = 0; i <= inventory.length - 1; i++) {
			System.out.println(i + " : " + inventory[i].getName());
		}
	}

}
