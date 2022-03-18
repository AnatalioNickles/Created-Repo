/*Anatalio Nickles
 *11MAR22
 *Coding Quiz 5 
 */
//Bath class that inherits Product protected attributes
public class Bath extends Product {
	// constructor that brings in super attributes
	// from parent class to create objects
	public Bath(String name, double price, int quantity) {
		super(name, price, quantity);
	}

	// overridden method to produce Bath specific output
	@Override
	public void getDetails() {
		System.out.println("We sell organic bath products!");
	}

}
