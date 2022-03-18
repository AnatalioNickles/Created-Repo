/* Anatalio Nickles
 * 15Feb22
 * Class Assignments to practice the concepts learnt so far * 
 */
public class ClassAssignment15Feb22 {

	public static void main(String arg[]) {

//Problem 1 (military hour to civilian hour)
		int hourmil = 24;
		int hourciv = 0;
		String ampm;

		hourciv = hourmil - 12;
		
		if (hourmil >= 12) {   	//changes to pm
			ampm = "pm";
		} else {
			ampm="am";
		}

		if (hourciv < 0) {  	//takes out of negative
			hourciv = hourciv + 12;
		}
		
		if (hourciv == 0) {		//if 0000 hourmil
			hourciv = 12;
		}

		System.out.println("The " + hourmil + " in military time equates to " + hourciv + ampm);

//Problem 2 (calculate variable to the third exponent using for loop)
	
	int num=2, base=num, answer=num;
		
	for (int a=1; a<=3; a++) {
		answer=answer*base;
		if (a==3) {
		System.out.println(num + " to the power of 3 is " + answer);
		}
	}
	}
}
