
public class ClassAssignmentIfElse22Feb22 {
	/*
	 * 1. Create a variable called count, if count value is 10 print
	 * "The Count is 10", for any other value print "The count is not 10". 2.
	 * Declare a string variable called carColor and assign it a color of your
	 * choice. (page number:153, Note: instead of using ".equals" use relational
	 * operator "==") 3. Declare a boolean variable called raining and set it to
	 * either true or false. Take another float variable called temperature if
	 * raining is true and temperature is less than 50 print "take your umbrella"
	 * else print " don't take your umbrella. (page number: 159)
	 */
	public static void main(String arg[]) {

//Problem 1
		System.out.println("Problem 1:");
		for (int count = 1; count <= 9; count++) {
			System.out.println("The count value is not 10.");
		}
		System.out.println("The count value is 10.");

//Problem 2
		String carColor = "Red";
		String carColorgreen = "Green";
		String carColorblue = "Blue";
		String carColorred = "Red";

		System.out.println();
		System.out.println("Problem 2:");
		if (carColor == carColorred) {
			System.out.println("The car is Red!");
		} else if (carColor == carColorblue) {
			System.out.println("The car is Blue!");
		} else if (carColor == carColorgreen) {
			System.out.println("The car is Green!");
		} else {
			System.out.println("The car is Silver!");
		}

//Problem 3
		// Declare a boolean variable called raining and set it to either true or false.
		// Take another float variable called temperature if raining is true and
		// temperature is
		// less than 50 print "take your umbrella" else print " don't take your
		// umbrella. (page number: 159)
		System.out.println();
		System.out.println("Problem 3:");
		boolean raining = true;
		float temp = 43.5f;

		if (raining == true) {
			System.out.println("Bring you unbrella!");
			if (temp <= 50) {
				System.out.println("Bring your coat because it is cold!");
			}
		} else {
			System.out.println("You dont need your unbrella.");
		}
	}
}