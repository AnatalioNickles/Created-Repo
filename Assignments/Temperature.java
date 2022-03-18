
public class Temperature {
	/* Anatalio Nickles
	 * 09FEB22
	 * Training assignment from Pooja
	 */
	
	public static void main (String arg[]){								//standard opening
		
		float temperatureInF = 200.258642158f;							//declaring and initializing float variable for fahrenheit
				if (temperatureInF >= 100.4) {							//condition 1
					System.out.println("You have a fever!");			//display 1
				}
				else if (temperatureInF > 99.2)	{						//condition 2
					System.out.println("You have a mild fever.");		//display 2
				}	
				else {													//if no conditions are met
					System.out.println("You are fine.");				//display is no conditions are met
				}
				
		float temperatureInC = ((temperatureInF-32)*5/9);				//
				System.out.println(temperatureInC + "Your temperature in degrees Celsius. Good Luck!");
		
	}
	
}
	

