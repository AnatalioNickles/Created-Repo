
public class ClassAsignment11Feb22v2 {
	/*
	 * Anatalio Nickles
	 * 11Feb22 
	 *1. Create a counter that prints numbers from 8 through 20
	 *2. Print all even numbers between 1 & 25
	 *3. Print all odd numbers between 50 & 100
	 */
	
	//Maleeha question 1
	public static void main (String arg[]) {
		int a=1;
		
		while (a<=10) {
			System.out.print(a + " ");
			a++;			
		}

		//Maleeha question 2
		
		int b=5; //declared number
		int c=0; //table number
		int d=0; //answer of b*c
		
		System.out.println();
		while (c<=10) {
			d=b*c;
			System.out.println((b + " X " + c) + " = " + d);
			c++;
		}
		System.out.println("Above is the 1-10 table for " + b);
		
		//Maleeha question 3
		int e=1; //number to square
		int f=1; //answer to square
		
		System.out.println();
		while (e<=5) {
			f=e*e;
			System.out.println((e + " X " + e) + " = " + f);
			e++;
		}
		System.out.println("Above is the first five numbers squared");
		
		//Maleeha question 4
		int startNo=5;
		int endNo=27;
		
		System.out.println();
		System.out.println("Declared start number: "+startNo);
		System.out.println("Declared end number: "+endNo);
		while (startNo <= endNo) {
			if (startNo%2==0) {
				System.out.println(startNo + " ");
			}
			startNo++;			
		}
		System.out.println("Above are the even numbers between my declared numbers");
	}
		

	
	
}
