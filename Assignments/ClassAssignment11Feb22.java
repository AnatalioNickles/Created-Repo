
public class ClassAssignment11Feb22 {
	/*
	 * Anatalio Nickles
	 * 11Feb22 
	 *1. Create a counter that prints numbers from 8 through 20
	 *2. Print all even numbers between 1 & 25
	 *3. Print all odd numbers between 50 & 100
	 */
	
	public static void main (String arg[]) {
		int a=0;
		int b=0;
		int c=0;
		//8-20
		System.out.println ("The numbers between 8-20 are:");
		while (a<=20) {
			
			a++;
			if (a>=8 && a<=20) {
				System.out.print(a + " ");
			}
			else {
			}
		}
		//Even
		System.out.println();	
		System.out.println ("The EVEN numbers between 1-25 are:");
						
		while (b<25 || b==24) {
			b++;
			if (b%2==0) {
				System.out.print(b + " ");			
			}
			else {
			}
		}
		//Odd
		System.out.println();	
		System.out.println ("The ODD numbers between 50-100 are:");
		while (c<100) {
			c++;
			if (c>=50 && c%2!=0) {
				System.out.print(c + " ");
			}
			else {
		}
		
	}
	}
	}
