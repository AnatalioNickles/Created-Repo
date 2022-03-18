/*Anatalio Nickles
 *Inherietance Class Assignment 
 *04MAR22 
 */

//abstract class disallowing employee object to be created
public abstract class Employee {
	//protected variables to be inheirented by child class
	protected String name;
	protected double salary;
	protected String ssn;
	//final employee ID that cannot be altered
	protected final int employeeID;
	//declare and initialize ID counter 
	static int nextID = 1;
	//Employee constructor to take in attributes and assign a employee ID
	public Employee(String name, double salary, String ssn) {

		this.name = name;
		this.salary = salary;
		this.ssn = ssn;
		this.employeeID = nextID++;

	}
	//getters and setters to allow authenticating practices to be applied later
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public int getEmployeeID() {
		return employeeID;
	}
	//abstract method with no parameters
	public abstract double getpay();
	
	}
	

