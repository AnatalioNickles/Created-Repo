
public class Home {

	//Living Room
	public static void main(String arg[]) {
		
		System.out.println("Reading a book");
		
		String areyoudone=hungry("rice");
		
		System.out.println("Watching T.V.");
		System.out.println("Learning Java");
		
		sleep();
		hungry("soup");
		
		System.out.println("I am in the living room now.");
	}

	static void sleep() {
		
		System.out.println("Iam going to take a nap");
	}
	
	static String hungry(String food) {
		
		System.out.println("I am eating "+food);
		
		return "I am done eating";
	}
	
	
	
}
