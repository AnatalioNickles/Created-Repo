
public class ClassAssignment16Feb22_Methods {
	
	public static void main (String arg[]) {
		int num1 = 567;
		int num2 = 567;
		int num3 = 9342;
		int num4 = 7;
		int num5 = -1;
		
		System.out.println("Question 1:");
		if (num1==num2) {
			System.out.println(num1+" equals "+num2);
		}
		else {
			System.out.println("The larger number between "+num1+" and "+num2+" is "+maxNum(num1, num2));
		}
		System.out.println("\nQuestion 2:");
		oddeven(num3);
		
		System.out.println("\nQuestion 3:");
		System.out.println(num4+" + "+num5+" = "+sum(num4, num5));
		
		System.out.println("\nDone");
	}

	public static int maxNum(int mN1, int mN2) {
		if (mN1>mN2) {
			return mN1;
		}
		else {
			return mN2;
		}
	}
	public static void oddeven(int thirdNumber) {  	
		if (thirdNumber%2==0) {
			System.out.println(thirdNumber+" is even number.");
		}
		else {
			System.out.println(thirdNumber+" is odd number.");
		}
	}
	
	public static int sum(int x, int y) {
		return (x+y);
		
	}
}
