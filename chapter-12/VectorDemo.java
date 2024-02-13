import java.util.Vector;
import java.util.List;

public class VectorDemo{
	public static void main(String[] args){
		List<String> topCities = new Vector<>();
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
