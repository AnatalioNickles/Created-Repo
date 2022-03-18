import java.util.HashMap;
import java.util.Map;

public class Maps {

	static public void main(String[] args) {

		HashMap<String, String> capitalCities = new HashMap<String, String>();

		capitalCities.put("nmSantaFe", "Two Million Degrees");
		capitalCities.put("alexHi", "freezing");

		System.out.println(capitalCities);

		capitalCities.put("alexHi", "fre");
		System.out.println(capitalCities);

		System.out.println(capitalCities.get("alexHi"));
		capitalCities.remove("alexHii");

		System.out.println(capitalCities);
		System.out.println("-- -- -- -- -- -- -- -- -- -- --");
		HashMap<String, Float> weatherElements = new HashMap<String, Float>();

		weatherElements.put("Wind", 55.0f);
		weatherElements.put("Min Temp", 20.5f);
		weatherElements.put("Max Temp", 50.8f);
		weatherElements.put("Humidity", 50.0f);
		weatherElements.put("Air Pressure", 12.0f);

		System.out.println("\nUsing For/Each Loop: ");
		for(Map.Entry<String, Float> temp:weatherElements.entrySet()) {
			
			System.out.println(temp.getKey() + ";" +temp.getValue());
		}
		System.out.println("\nUsing Lambda: ");
		weatherElements.forEach((key, value)->System.out.println(key+"="+value));
		
		
		
		
		
		
		System.out.println("\n"+weatherElements);
		weatherElements.put("Air Pressure", 99999.9f);
		System.out.println(weatherElements);

		weatherElements.remove("Air Pressure");
		System.out.println(weatherElements);
		
		weatherElements.clear();
		System.out.println("\n"+weatherElements);
	}
}
