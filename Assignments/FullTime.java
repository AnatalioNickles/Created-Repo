/*Anatalio Nickles
 *Inherietance Class Assignment 
 *04MAR22 
 */
public class FullTime extends Employee {
	
	//FullTime boject constructor
	public FullTime(String name, double salary, String ssn) {
		super(name, salary, ssn);
	}
	
	//Polymorphism on getpay method returning a double
	@Override
	public double getpay() {
		return this.salary * 15 / 100;
	}

}
