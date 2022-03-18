/*Anatalio Nickles
 *16Feb22
 *Factorial  
 */
import java.util.Scanner;

public class ClassAssignment16Feb22Factorial {

	public static void main (String arg[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int number = input.nextInt();
		int factorial = 1;
		
		for (int a = 1; a <=number; a++) {
			factorial = factorial*a;
			System.out.println("The current Factorial is "+factorial);
		}
		System.out.println("The facotrial of "+number+" is "+factorial);
		
		input.close();
		
	}
}
