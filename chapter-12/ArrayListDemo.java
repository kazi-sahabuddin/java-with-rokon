import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo{
	public static void main(String[] args){
		List<String> topCities = new ArrayList<>();
		topCities.add("London");
		topCities.add("New York");
		topCities.add("Paris");
		topCities.add("Moscow");
		topCities.add("Tokyo");
		topCities.add("Dubai");
		topCities.add("Barcelona");
		
		//print the all
		System.out.println("Top cities: "+ topCities);
		
	}
}
