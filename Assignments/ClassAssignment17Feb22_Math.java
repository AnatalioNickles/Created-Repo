
/*Anatalio Nickles
 * 17Feb22
 * This program implements modular programming technique using methods to calculate the factorial, sum and average of a number
 */
import java.util.Scanner;

public class ClassAssignment17Feb22_Math {

	public static void main(String arg[]) {

		Scanner input = new Scanner(System.in);

		System.out.println(
				"Please enter a number for me to provide you with the factorial, sum and average of that number:");
		int num = input.nextInt();

		long fact = factorial(num);
		System.out.println("The factorial of number " + num + " is " + fact);

		int sum = summation(num);
		System.out.println("The summation of the number " + num + " is " + sum);

		double avg = average(num);
		System.out.println("The average of the summation of the number " + num + " is " + avg);

		input.close();
	}

	/*
	 * @method: that returns factorial of a given number
	 * 
	 * @parameters: It takes int number as parameter
	 * 
	 * @return: Computes and returns the factorial of that number
	 */
	static long factorial(int num) {

		long factorial = 1;

		for (int i = num; i >= 1; i--) {
			factorial = factorial * i; // factorial *=i;
		}
		return factorial;
	}

	/*
	 * @method:
	 * 
	 * @parameters:
	 * 
	 * @return:
	 */
	static int summation(int x) {
		int sum = 0;

		for (int i = 1; i <= x; i++) {
			sum = sum + i; // sum=sum+x
		}
		return sum;
	}

	/*
	 * @method:
	 * 
	 * @parameters:
	 * 
	 * @return:
	 */
	static double average(int n) {

		int sum = summation(n);
		return sum / n;
	}
}
