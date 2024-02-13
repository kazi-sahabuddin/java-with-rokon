import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class HashMapExample{
	public static void main(String[] args){
		Map<String, Integer> citiesWithPopulation = new HashMap<>();
		
		citiesWithPopulation.put("Tokyo",37_400_068);
		citiesWithPopulation.put("Delhi",28_514_000);
		citiesWithPopulation.put("Dhaka",19_578_000);
		citiesWithPopulation.put("New York",8_601_186);
		citiesWithPopulation.put("Istanbul",15_519_167);
		
		System.out.println(citiesWithPopulation);
		Integer population = citiesWithPopulation.get("Dhaka");
		System.out.println(population);
		
		Set<String> keys = citiesWithPopulation.keySet();
		System.out.println("keys = " + keys);
		
		Collection<Integer> values = citiesWithPopulation.values();
		System.out.println("values = " + values);
		
		boolean dhakaExist = citiesWithPopulation.containsKey("Dhaka");
		System.out.println("dhakaExist = " + dhakaExist);
		
		boolean containsValue = citiesWithPopulation.containsValue(37_400_068);
		System.out.println("containsValue = "+ containsValue);
		
		int total = citiesWithPopulation.size();
		System.out.println("Total = " + total);
	}
}
