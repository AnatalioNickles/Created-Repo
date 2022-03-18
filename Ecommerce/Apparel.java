/*Anatalio Nickles
 *11MAR22
 *Coding Quiz 5 
 */
//Apparel class that inherits Product protected attributes
public class Apparel extends Product {
	// private Apparel object attributes
	private char size;
	private String color;

	// constructor that brings in super attributes from parent class
	// and private attributes from Apparel class to create objects
	public Apparel(String name, double price, int quantity, char size, String color) {
		super(name, price, quantity);
		this.size = size;
		this.color = color;
	}

	// public getters and setters for future user authentication
	public char getSize() {
		return size;
	}

	public void setSize(char size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// overridden method to produce Apparel specific output
	@Override
	public void getDetails() {
		System.out.println("We sell different kinds of business clothes for both men and women!");
	}

}
