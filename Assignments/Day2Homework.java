
public class Day2Homework {
	/*
	 * Anatalio Nickles 10FEB22 Training assignment from Pooja
	 */

	public static void main (String arg []) {
	int a = 55;
	float b = 128.5265f;
	double c = 42.2;
	int rpm = 3001;
	int newUsers = 99;
	int appDownloads = 100;
		
		System.out.println ("-Problem 1-");
		System.out.println ("a = " + a);
		System.out.println ("b = " + b);
		System.out.println ("c = " + c);
		if (a > b && a > c) {
			System.out.println (a + " is greater than " + b + " & " + c);
		}
		else if (b > a && b > c) {
			System.out.println (b + " is greater than " + a + " & " + c);
		}
		else if (c > b && c > a) {
			System.out.println (c + " is greater than " + a + " & " + b);
		}
		else {
			System.out.println ("Two of the variables may be equal.");
		}
		
		// Problem 2
		System.out.println ("\n-Problem 2-");
		System.out.println ("RPM = " + rpm);		
		if (rpm == 0 || rpm >= 3000) {
			System.out.println ("The engine has either stopped or running too quickly!");
		}
			else {
			System.out.println ("The engine is operating within normal operating procedures.");
		}
		// Problem 3
		System.out.println ();
		System.out.println ("-Problem 3-");
		System.out.println ("New Users = " + newUsers);
		System.out.println ("App Downloads = " + appDownloads);
		if (newUsers > 100 && appDownloads >= 200 || newUsers == 500 || newUsers == 600) {
			System.out.println ("You have reached your application's weekly goal! Well done!");
		}
		else if (newUsers == 99 || appDownloads == 100) {
			System.out.println ("Almost There!");
		}
		else {
			System.out.println ("Your application didn't do great this week.");
			System.out.println ("Better luck next time!");
			}	
}
}
	
			
