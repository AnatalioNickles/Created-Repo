/*Anatalio Nickles
 *10MAR22
 *Class assignment regarding exception handling
 */
public class Main {

	public static void main(String[] args) {

		try {	//eveything inside a try block
//question 1			
			String name = "Dci";
			System.out.println(name.repeat(3));
			System.out.println(name.repeat(-1));  	// exception that is caught
			System.out.println(name.charAt(9));		// exception that is caught
//question 2
			int[] numbers = { 99, 88, 50, 75, 40 };

			System.out.println(numbers[7]);			//exception that is caught
//question 3			
			String hello = null;
			System.out.println(hello.repeat(5));	//exception that is caught

		} catch (IllegalArgumentException e) { 		//catch for line 13/14
			System.out.println("Repeat only takes positive numbers as parameters");
		} catch (IndexOutOfBoundsException e) {		//catch for line 18
			System.out.println("not enough elements in array");
		} catch (NullPointerException e) {			//catch for line 21
			System.out.println("String is null");
		}

		finally {
			System.out.println("\nThe End");
		}

	}

}
