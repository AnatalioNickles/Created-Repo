
public class ClassAssignment14Feb22 {

	/*1. Create a program that prints number from 1 to 15.
   	  2. Create a program that display all odd number from 1 to 10.
	  3. Create a program that display back-counting from 20 to 1.
	  4. Create a program that can print the following series: 1,4,7,10...20.
	  5. Create a program to display the product of all odd number from 1 to 10 using for loop (Optional Question).
	*/
	
	public static void main(String arg[]) {
		
		int n1t15output=1; //number 1 through 15 output
		int n1t10odd=1;    //number 1 through 10 odds
						   //using for loop n20t1 is declared in loop - number 20 through 1
		int n1t20=1;	   //number 1 through 20 by 3s 	
		int n1t10oddv2=1;  //number 1 through 10 odds version 2
		int nodd=1;		   //number to be multiplied if odd
		int noddv2=1; 	   //second odd number
		int prod=0;	   //product of odd numbers
		// Problem 1
		System.out.println("Problem 1");
		while (n1t15output<=15) {
			
			System.out.print(n1t15output+++" ");
		}
	// Problem 2
		System.out.println();
		System.out.println();
		System.out.println("Problem 2:");
		while (n1t10odd<10) {
			if (n1t10odd%2!=0);
				System.out.print(n1t10odd+++" ");
		}
	//Problem 3
		System.out.println();
		System.out.println();
		System.out.println("Problem 3:");
		for (int n20t1=20; n20t1!=0; n20t1--) {
			System.out.print(n20t1+" ");
		}
	//Problem 4
		System.out.println();
		System.out.println();
		System.out.println("Problem 4");
		while (n1t20<=20) {
			System.out.print(n1t20+" ");
			n1t20=n1t20+3;
		}
	//Problem 5
		/*
		System.out.println();
		System.out.println();
		System.out.println("Problem 5:");
		//Create a program to display the product of all odd number from 1 to 10 using for loop (Optional Question)
		while (nodd<=10) {
			if (nodd%2!=0&&nodd<=10) {
				prod=nodd*noddv2;
				System.out.println(nodd+" x "+noddv2+" = "+prod);
				++nodd;
			}
			else {
				++nodd;
			}
		}
		*/
		
		//gave up trying to figure out because we ran out of time.
	}
}

