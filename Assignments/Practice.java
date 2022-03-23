/*Anatalio Nickles
 * 1MAR22
 * Practice Palindrome thing
 */
public class Practice {

	static boolean isPal (String word) {
		
		/*reverse the sting
		 * create charArray and store it in a char array
		 * creata nother char Array with the same size as the above char array
		 * loop through first charArray from last index to first index
		 * insert each character into the 2nd char array
		 */

		char[] inputChar = word.toCharArray();
		char[] outputChar = new char[inputChar.length];
		
		int j=0;
		for (int i=inputChar.length-1; i>=0; i--) {
			outputChar[j]=inputChar[i];
			j++;
		}
		
		String backwards = String.valueOf(outputChar);
		
		if (word.equalsIgnoreCase(backwards)) {
			return true;
		}
			else {
				return false;
		}
			
	}

	public static void main(String []args) {
		String word="pop";
		
		System.out.println(word+ " is a palindrome (T/F): "+isPal(word));
		

		
	}
}
