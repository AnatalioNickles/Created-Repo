/*
 * Different types of errors:
 * 
 * Syntax error - not following java language rule
 * 
 * logical error -  A logic error is a mistake in a program's source code 
 * 				    that results in incorrect or unexpected behavior
 * 
 * Runtime error - when the logic and syntax are correct, but you run into issues when you execute 
 * 					the program with certain input values
 */

public class Calculator {
	
	//Syntax error - fix it
	public static void main(String arg[]) {
		
		int leftOperand = 8;
		//Syntax error - Fix the syntax error
		int rightOperand = 2;
		char operator = '/';
		
		if(operator == '+') {
			/* Logic error - unexpected output, it doesn't add the two numbers. 
			  Fix the error */
			System.out.println("The sum of two numbers is " + (leftOperand + rightOperand));
		}
		
		else if(operator == '-') {
			//Logic error - unexpected output. Fix the error by choosing the correct operator and precedence
			System.out.println("The difference between the two numbers is " + (leftOperand - rightOperand));
		}
		
		//Syntax error - Fix the error by using the appropriate relational operator
		else if(operator == '*') {
			
			System.out.println(leftOperand + " times " + rightOperand + " is " + leftOperand * rightOperand);
		}
		
		else if(operator == '/') {
			
			/*Runtime error - In mathematics division by zero results in undefined.
			 * Change the value of rightOperand to 0, value of operator to '/' and execute your code.
			 * It'll result in a run-time error (DivideByZero Error)
			 * Fix it by adding a nested if within this code block to check if rightOperand is equal to 0
			 * if it is, print a message saying "Divide by Zero not allowed"
			 * For all other cases, print the below statement
			 */
				if (rightOperand == 0) {
					
					System.out.println("Division by zero is not allowed.");
				}	
				else {
					
					System.out.println(leftOperand + " divided by " + rightOperand + " is " + leftOperand / rightOperand);
				}
		
		
				}
		
	}
}


