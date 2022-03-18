
/*  Anatalio Nickles
 *  28Feb22
 *  Class Assignment : Strings
 */
import java.util.Scanner;

public class Classassignment_Strings {

	public static void main(String arg[]) {

		Scanner input = new Scanner(System.in);
// variable for easy way to do question 4
		String a = "a";
//take user input for strings
		System.out.println("1a. Please type a short sentence:");
		String sentence = input.nextLine();
		System.out.println("1b. Please enter your least favorite word:");
		String word = input.next();

		// Question 2 count the 1st user input characters
		System.out.println("2.  The 1st String has a length of: " + sentence.length()
				+ ". The 2nd string has a length of: " + word.length() + ".");

		// Question 3 does the sentence contains 2nd input
		System.out.println("3.  The 2nd string can be found in the 1st string (T/F): " + sentence.contains(word));

		// Question 4 easy way just check if starts with 'a'
		System.out.println(
				"4.  The 1st string begins with a lower case 'a' (T/F) (easy code): " + sentence.startsWith(a));

		// Question 4 Pooja's way convert to lower case then does it begin with 'a'?
		System.out.println("4a. The 1st string begins with a lower case 'a' (T/F (Pooja's way): "
				+ sentence.toLowerCase().startsWith("a"));

		// Question 5 ending with DCI?
		System.out.println("5.  The 1st string ends with 'DCI' (T/F): " + sentence.endsWith("DCI"));

		// Question 6 contains in string
		System.out.println("6.  The 2nd string contains the word UST (T/F): " + word.contains("UST"));

		// Question 7 starting and ending with same char
		System.out.println("7.  Does the 1st string start and end with the same character? (T/F) :"
				+ (sentence.charAt(0) == sentence.charAt(sentence.length() - 1)));

		// Question 8 equals
		System.out.println(
				"8.  Are the 1st string and the 2nd string equal? (case sensitive) (T/F): " + (sentence.equals(word)));

		// Question 9 equals ignore case
		System.out.println("9.  Are the 1st String and the 2nd string equal (non-case sensitive) (T/F): "
				+ sentence.equalsIgnoreCase(word));

		// Question 10 Strings are immutable
		System.out.println("\n10. Behold, the below printlns have replaced each vowel with an '?'!");
		System.out.println("Changed all the 'a's: " + sentence.replace('a', '?'));
		System.out.println("Changed all the 'e's: " + sentence.replace('e', '?'));
		System.out.println("Changed all the 'i's: " + sentence.replace('i', '?'));
		System.out.println("Changed all the 'o's: " + sentence.replace('o', '?'));
		System.out.println("Changed all the 'u's: " + sentence.replace('u', '?'));
		System.out.println("Changed all the 'y's: " + sentence.replace('y', '?'));
		System.out.println(sentence);
		System.out.println(
				"\nBut still, the orginal user input string has remained unchanged! How can this be?\n\nStrings are IMMUTABLE!?!");

		input.close();
	}

}
