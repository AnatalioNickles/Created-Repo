
/*Anatalio Nickles
 *16Feb22
 *Display Odd / Even from user input
 */
import java.util.Scanner;

public class ClassAssignment16Feb22OddEven {

	public static void main(String arg[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number and I will tell you if it is odd or even:");
		int x = input.nextInt();

		if (x % 2 == 0) {
			System.out.println(x + " is an even number!");
		} else {
			System.out.println(x + " is an odd number!");
		}

		input.close();
	}

}
