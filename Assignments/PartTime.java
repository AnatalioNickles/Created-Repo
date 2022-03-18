/*Anatalio Nickles
 *Inherietance Class Assignment 
 *04MAR22 
 */
public class PartTime extends Employee {
		
		//private variable not to be used accessed, modified, or used elsewhere
		private int hoursPerWeek;
		
		//PartTime constructor to create object in employee array
		public PartTime(String name, double salary, String ssn, int hoursPerWeek) {
			super(name, salary, ssn);
			this.hoursPerWeek = hoursPerWeek;
		}
		
	//Polymorphism on getpay method returning a double	
	@Override
	public double getpay() {
	return (this.salary*hoursPerWeek)*2;
		
	}

}
