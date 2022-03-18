
/*
 * Anatalio Nickles
 * 17Feb22
 * Modify the Circle class that you created yesterday to make it modular

    Ask the user to enter the radius of a circle
    Tell the user that you'll be computing the area, circumference and diameter of a circle

    Create a method called area that takes radius as parameter and returns area
        Formula for computing area is 3.142 * r * r
    Create a method called circumference that takes the radius and returns circumference
        Formula: 2 * 3.142 * r
    Create a method called diameter that takes the radius and returns diameter
        Formula: 2 * r

    Call the appropriate methods and create the required variables to print the following messages on screen:
        The diameter of the circle with radius ____ is ____
        The area of the circle with radius ____ is ____
        The circumference of the circle with radius ____ is ____
 */
import java.util.Scanner;

public class ClassAssignment17Feb22_CircleMethods {

	public static void main(String arg[]) {
		Scanner input = new Scanner(System.in);
		System.out
				.println("Please enter a radius for me to compute the area, circumference, and diameter of a circle:");
		int r = input.nextInt();

		radius(r);
		circumference(r);
		diameter(r);

		input.close();
	}

	/*
	 * @method:calculate and display radius
	 * @parameters: pulls user input for radiuS
	 * @return: n/a
	 */
	static void radius(int r) {

		double area = 3.142 * r * r;

		System.out.println("The area of the circle with radius " + r + " is " + area);
	}

	/*
	 * @method: calculate and display circumference
	 * @parameter: pulls user input for radius
	 * @return: n/a
	 */
	static void circumference(int r) {

		double cir = 3.14 * 2 * r;

		System.out.println("The circumference of the circle with radius " + r + " is " + cir);
	}

	/*
	 * @method: calculate and display diameter
	 * @parameters: pulls user input for radius
	 * @return: n/a
	 */
	static void diameter(int r) {

		double diam = 2 * r;

		System.out.println("The diameter of the circle with the radius " + r + " is " + diam);
	}

}
