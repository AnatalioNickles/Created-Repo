
public class TestArrays {

	public static void main(String[] args) {

		// integer array
		/*
		 * A student can take 5 courses. Score at index 0 :Math Score at index 1
		 * :Science Score at index 2 :Art Score at index 3 :Computers Score at index 4
		 * :Gym
		 */

		int[] scores = { 99, 88, 50, 75, 40 };
		System.out.println("My score in Computers is " + scores[3]);

		// print all elements in scores
		for (int i = 0; i <= (scores.length - 1); i++) {

			System.out.println(scores[i]);
		}

		// float array
		float[] decimals = new float[4];
		decimals[0] = 22.5f;
		decimals[1] = 44.6f;
		decimals[2] = 2.2f;
		decimals[3] = 90.5f;

		String output = "{";

		for (int i = 0; i <= (decimals.length - 1); i++) {

			output += decimals[i];

			// if i is not in the last index
			if (i != decimals.length - 1) {

				output += ",";
			}
		}
		output += "}";

		System.out.println(output);

		// string array

		String[] students = { "Jon", "Shakeah", "Connor", "Justin", "Padmaja", "Bijay" };
		// print all students whose name ends with "n"
		for (int i = 0; i <= students.length - 1; i++) {

			if (students[i].endsWith("n")) {

				System.out.println(students[i]);

			}

		}
		// print every other student in the array
		for (int i = 0; i <= students.length - 1; i += 2) {

			System.out.println(students[i]);
		}

		//creating an array of lucky numbers
		int[] lucky= {19,20,22,13,18,4};
		
		System.out.println(lucky.length);
		
		System.out.println(lucky[0]);
		System.out.println("55");
		
		System.out.println(lucky[lucky.length-1]); //prints 4
		
		//print lucky array in reverse order
		for(int i=lucky.length-1;i>=0;i--) {
			System.out.println(lucky[i]);
		}
	}

}












