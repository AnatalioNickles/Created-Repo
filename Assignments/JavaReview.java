import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class JavaReview {

	public static void main(String[] args) {
		String sentence = "The first program everyone writes is Hello World!";

		String[] inputString = sentence.split(" ");
		String blah = " ";
		// String[] outputString = new String[inputString.length];

		int j = 0;
		for (int i = inputString.length - 1; i >= 0; i--) {
			blah += inputString[i] + " ";
			j++;
		}
		System.out.println(sentence);
		System.out.println(blah);

		int year;

		Scanner sc = new Scanner(System.in);
		/*
		 * System.out.println("Enter a year to check if it is a leap year: "); year =
		 * sc.nextInt();
		 * 
		 * if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
		 * System.out.println("Ribbit....Ribbit....Ribbit!"); } else {
		 * System.out.println("Sorry, not your lucky leap year. :-("); }
		 * 
		 * int counter = 0;
		 * 
		 * while (true) { counter++; if (counter == 5) { break; } else { if (counter < 3
		 * || counter > 3) { System.out.println(counter); } else ; }
		 * 
		 * }
		 * 
		 * float[] decimals = new float[5]; decimals[0] = 2.5f; decimals[1] = 4.8f;
		 * decimals[2] = 9.07f; decimals[3] = 12.55f; decimals[4] = 55.7f;
		 * System.out.println("Decimals Array: ");
		 * 
		 * for (int i = 0; i <= (decimals.length - 1); i++) {
		 * System.out.println(decimals[i]); }
		 * 
		 * float userDecimal; System.out.println("\nEnter a decimal #: "); userDecimal =
		 * sc.nextFloat();
		 * 
		 * System.out.println("The ceil value of your inuptted # is " +
		 * Math.ceil(userDecimal));
		 * System.out.println("The floor value of your inuptted # is " +
		 * Math.floor(userDecimal));
		 * System.out.println("The # rounded to its nearest integer is " +
		 * Math.round(userDecimal));
		 * 
		 * HashSet<String> userVisitedStates = new HashSet<String>();
		 * 
		 * System.out.
		 * println("Enter the states you have visited one at a time. When finished type 'done'"
		 * ); while (true) { String userState; userState = sc.nextLine(); if
		 * (userState.equalsIgnoreCase("done")) { break; } else { userState =
		 * userState.toLowerCase(); userVisitedStates.add(userState); } }
		 * System.out.println("You have entered the following states: " +
		 * userVisitedStates);
		 */

		int userInt1;
		int userInt2;

		try {
			System.out.println("Please enter an Interger: ");
			userInt1 = sc.nextInt();
			System.out.println("Please enter another Interger: ");
			userInt2 = sc.nextInt();

			System.out.println("The division of the 2 integers is " + (userInt1 / userInt2));
		} catch (RuntimeException e) {

			System.out.println("Output for .toString(): " + e.toString());
			System.out.println("Output for .getMessage(): " + e.getMessage());
			System.out.println("Output for .StackTrace: ");
			e.printStackTrace();

		}

		sc.close();

		System.out.println("The End" + "\nThank You");
	}
}