/*Anatalio Nickles
 *Inherietance Class Assignment 
 *04MAR22 
 */
public class Intern extends Employee {

	//private variables to not be accessed, modified or used elsewhere
	private int hoursPerWeek;
	private String unversity;
	private boolean isPaid;

	//Intern constructor
	public Intern(String name, double salary, String ssn, int hoursPerWeek, String unversity, boolean isPaid) {
		super(name, salary, ssn);
		this.hoursPerWeek = hoursPerWeek;
		this.unversity = unversity;
		this.isPaid = isPaid;
	}
	//getter and setter for private university
	public String getUnversity() {
		return unversity;
	}
	
	public void setUnversity(String unversity) {
		this.unversity = unversity;
	}

	//Polymorphism on getpay method returning a double		
	@Override
	public double getpay() {
		//if statement to check if intern is intern is paid or not
		if (this.isPaid) {
			return this.salary * this.hoursPerWeek * 2;
			
		}else {
			return 0.0;

	}

}
}