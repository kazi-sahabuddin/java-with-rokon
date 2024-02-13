import java.util.Set;
import java.util.TreeSet;

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
	public int compareTo(Person o){
		return this.name.compareTo(o.name);
	}
}

public class PersonDemo{
	public static void main(String[] args){
		Set<Person> persons = new TreeSet<>();
		persons.add(new Person("Rokon"));
		persons.add(new Person("Swarna"));
		persons.add(new Person("Rifat"));
		persons.add(new Person("Eram"));
		persons.add(new Person("Tabassum"));
		
		for(Person person : persons){
			System.out.println(person);
		}
	}
}
