import java.nio.charset.Charset;
import java.util.SortedMap;

public class AvailableCharsets{
	public static void main(String[] args){
		SortedMap<String, Charset> map = Charset.availableCharsets();
		int total = map.size();
		System.out.println("Available character set = "+ total);
		for(String name : map.keySet()){
			System.out.println(name);
		}
	}
}
