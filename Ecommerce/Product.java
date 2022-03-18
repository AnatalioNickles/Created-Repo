/*Anatalio Nickles
 *11MAR22
 *Coding Quiz 5 
 */
public abstract class Product {
	// protected variables to be locked and used by inherited classes
	protected String name;
	protected double price;
	protected int quantity;

	// public constructor to be used as super for inherited class objects

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	// public getters and setters for future user authentication
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	// Instance method taking no parameters
	// method checks current selection's stock quantity and
	// returns true or false
	public boolean buy() {
		// if true lowers the stock available by 1
		if ((this.quantity) > 0) {
			this.quantity--;
			return true;
		} else
			return false;
	}

	// abstract method to be overridden in inherited classes
	public abstract void getDetails();

}
