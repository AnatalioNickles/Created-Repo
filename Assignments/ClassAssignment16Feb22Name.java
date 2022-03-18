/*Anatalio Nickles
 * 16Feb22
 * 
 */
import java.util.Scanner;

public class ClassAssignment16Feb22Name {

	public static void main (String arg[]) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter you name:");

		String username = input.nextLine();
		
		System.out.println("Hello and welcome to DCI "+ username);
		
		input.close();
		
	}	
	
}
