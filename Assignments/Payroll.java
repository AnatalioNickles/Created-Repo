/*Anatalio Nickles
 *Inherietance Class Assignment 
 *04MAR22 
 */

import java.util.Scanner;

public class Payroll {
	//create employee array
	static Employee[] employees = new Employee[6];
	//start of main method
	public static void main(String[] args) {
		//declaring variables
		int count = 0;
		int userChoice;
		String name;
		String ssn;
		double salary;
		int hoursPerWeek;
		String university;
		int contractPeriod;
		boolean isPaid;
		//creating and naming scanner
		Scanner input = new Scanner(System.in);
		//do-while loop to display menu and collect user inputs for employee's attributes
		do {
			//call menu method
			printMenu();
			//collect user input as variable to call corresponding class constructor
			userChoice = input.nextInt();
			input.nextLine();
			//collect attributes for Employee Class
			if (userChoice == 1) {
				System.out.println("Enter employee name: ");
				name = input.nextLine();

				System.out.println("Enter employee salary: ");
				salary = input.nextDouble();
				input.nextLine();

				System.out.println("Enter employee Social Security Number: ");
				ssn = input.nextLine();
				//call FullTime Class constructor to create object and place it in the employees array in current index
				employees[count] = new FullTime(name, salary, ssn);
				//increase count so to not override index
				count++;
			} 
			//collect attributes for Employee Class
			else if (userChoice == 2) {
				System.out.println("Enter employee name: ");
				name = input.nextLine();

				System.out.println("Enter employee salary: ");
				salary = input.nextDouble();

				input.nextLine();

				System.out.println("Enter employee Social Security Number: ");
				ssn = input.nextLine();

				System.out.println("How many hours per week does the employee work: ");
				hoursPerWeek = input.nextInt();
				//call PartTime Class constructor to create object and place it in the employees array in current index
				employees[count] = new PartTime(name, salary, ssn, hoursPerWeek);
				//increase count so to not override index
				count++;
			} 
			//collect attributes for Employee Class
			else if (userChoice == 3) {
				System.out.println("Enter employee name: ");
				name = input.nextLine();

				System.out.println("Enter employee salary: ");
				salary = input.nextDouble();

				input.nextLine();

				System.out.println("Enter employee Social Security Number: ");
				ssn = input.nextLine();

				System.out.println("How many hours per week does the employee work: ");
				hoursPerWeek = input.nextInt();

				System.out.println("Intern is geting paid (true/false): ");
				isPaid = input.nextBoolean();

				System.out.println("Enter the University the intern attending: ");
				university = input.nextLine();
				//call Intern Class constructor to create object and place it in the employees array in current index
				employees[count] = new Intern(name, salary, ssn, hoursPerWeek, university, isPaid);
				//increase count so to not override index
				count++;
			}
			//collect attributes for Employee Class
			else if (userChoice == 4) {
				System.out.println("Enter employee name: ");
				name = input.nextLine();

				System.out.println("Enter employee salary: ");
				salary = input.nextDouble();
				input.nextLine();

				System.out.println("Enter employee Social Security Number: ");
				ssn = input.nextLine();

				System.out.println("Enter the number of months of the current contract length: ");
				contractPeriod = input.nextInt();
				//call Contractor Class constructor to create object and place it in the employees array in current index
				employees[count] = new Contractor(name, salary, ssn, contractPeriod);
				//increase count so to not override index
				count++;
			}
		}
		//while portion of loop designating when to exit the loop, to exit the user must choose 0 option or count is no longer less than 6
		while (count < 6 && userChoice != 0);
		//close scanner
		input.close();
		System.out.println("Payroll checks for each employee in employees array is");
		//for loop to iterate the current count of employees
		for (int i = 0; i < count; i++)
			//display employee ID, name, and check amount for 2 weeks worth of pay of current index of employee array
			System.out.println(employees[i].getEmployeeID() + " : " + employees[i].name + " : " + employees[i].getpay());
	}

	public static void printMenu() {
		//menu display
		System.out.println("Employee type:\n\t1. Full-time" + "\n\t2. Part-time\n\t3. Intern" + "\n\t4. Consultant"
				+ "\n\t0. Exit System");
	}

}
