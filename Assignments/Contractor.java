/*Anatalio Nickles
 *Inherietance Class Assignment 
 *04MAR22 
 */
public class Contractor extends Employee {

	//private variable to not be accessed, used, or modified elsewhere
	private int contractPeriod;

	//constructor to create contractor object
	public Contractor(String name, double salary, String ssn, int contractPeriod) {
		super(name, salary, ssn);
		this.contractPeriod = contractPeriod;
	}
	
	//getter and setter for contract period
	public int getContractPeriod() {
		return contractPeriod;
	}

	public void setContractPeriod(int contractPeriod) {
		this.contractPeriod = contractPeriod;
	}

	//Polymorphism on getpay method returning a double	
	@Override
	public double getpay() {
		return (this.salary / this.getContractPeriod()) / 2;
	}

}
