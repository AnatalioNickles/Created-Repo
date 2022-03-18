/*Anatalio Nickles
 *16Feb22
 *Guess a number from user input
 */
import java.util.Scanner;

public class ClassAggignment16Feb22GuessANumber {

	public static void main (String arg[]) {
		Scanner userinput = new Scanner(System.in);
		boolean guess=false;
		int Cguess=1;
		String y="y";
		String n="n";
		
		System.out.println("Think of a number between 1 & 5 and I'll try to guess it!");
		
		while ((!guess) && Cguess<=5) {
			
			System.out.println("Is the number you thought of equal to "+Cguess+"?");
			System.out.println("(y/n)");
			String yn = userinput.nextLine();
				
			if (yn.equals(y)) {
				
				System.out.println("Yay! I guess your number! It was "+Cguess);
				guess=true;
			} else {
				
				Cguess++;
			}
		}
		
		if (Cguess>5) {
		System.out.println("The number you guessed was not between 1 & 5");
		}
		userinput.close();
	}
}
