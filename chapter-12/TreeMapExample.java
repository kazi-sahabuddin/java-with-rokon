import java.util.Map;
import java.util.TreeMap;
import java.util.Objects;

class Person implements Comparable<Person>{
	private String name;
	public Person(String name){
		this.name = name;
	}
	
	@Override
	public String toString(){
		return name;
	}
	
	@Override
	public boolean equals(Object o){
		if(this == o){
			return true;
		}
		if(o == null || getClass() != o.getClass()){
			return false;
		}
		Person person = (Person) o;
		return Objects.equals(name, person.name);
	}
	
	@Override
	public int hashCode(){
		return Objects.hash(name);
	}
	
	@Override
	public int compareTo(Person o){
		return this.name.compareTo(o.name);
	}
}

public class TreeMapExample{
	public static void main(String[] args){
		Map<Person, String> phoneBook = new TreeMap<>();
		Person tahmid = new Person("Tahmid");
		Person rafi = new Person("Rafi");
		Person sumon = new Person("Sumon");
		Person arif = new Person("Arif");
		phoneBook.put(tahmid, "01780217771");
		phoneBook.put(rafi, "01780217000");
		phoneBook.put(sumon, "01780217100");
		phoneBook.put(arif, "01780217200");
		
		for(Map.Entry<Person, String> entry : phoneBook.entrySet()){
			System.out.println(entry.getKey().toString()+" - "+entry.getValue());
		}
	}
}
