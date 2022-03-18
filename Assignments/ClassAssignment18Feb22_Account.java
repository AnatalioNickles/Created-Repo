/* Anatalio Nickles
 * 18Feb22
 * 
 */
public class ClassAssignment18Feb22_Account {

	// Attributes - static/non-static, constant (final)
	String number;
	String type;
	double balance;

	static String bankName = "Chase";

	// Constructors - NOT written yet

	double getBalance() {

		return this.balance;
	}

	void deposit(double amount) {

		this.balance += amount; // this.balance=this.balance+amount
	}

	void withdrawl(double amount) {

		this.balance -= amount; // this.balance = this.balance - amount
	}

	static String getTradeName() {
		return "JPM";
	}

	public static void main(String[] args) {

		// ClassName objectName=new ClassName();
		//New object called david

		ClassAssignment18Feb22_Account david = new ClassAssignment18Feb22_Account();
		
		System.out.println(david.number);
		System.out.println(david.balance);
		System.out.println(david.type);
		
		david.balance = 800000;
		
		System.out.println(david.balance);
		System.out.println(getTradeName());
		
		david.withdrawl(2000);
		
		System.out.println(david.balance);
		
		ClassAssignment18Feb22_Account sudha = new ClassAssignment18Feb22_Account();
		sudha.number = "123-45";
		sudha.balance = 5000000;
		sudha.type = "Savings";
		
		System.out.println(sudha.balance);
		sudha.deposit(2000);
		System.out.println(sudha.balance);
		david.deposit(3000);
		System.out.println(david.balance);
		
		
		//static attributes are accessed using the class name
		//System.out.println(bankName);
		System.out.println(ClassAssignment18Feb22_Account.bankName);
		
		System.out.println(david.bankName);
		System.out.println(sudha.bankName);
		
		System.out.println("Changing the value of bank name to JPMorgan");
		ClassAssignment18Feb22_Account.bankName = "JP Morgan";
		
		System.out.println(david.bankName);
		System.out.println(sudha.bankName);
		
		
	}

}
