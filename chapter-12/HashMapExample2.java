import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Person{
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
}

class Address{
	private final String streetName;
	private final String city;
	private final String province;
	private final String country;
	private final String postalCode;
	
	public Address(String streetName, String city, String province, String country, String postalCode){
		this.streetName = streetName;
		this.city = city;
		this.province = province;
		this.country = country;
		this.postalCode = postalCode;
	}
	
	@Override
	public String toString(){
		return "Address{"+
			"streetName='" +streetName+'\''+
			", city='" +city+'\''+
			", province='" +province+'\''+
			", postalCode='" +postalCode+'\''+
			"}";
	}
}


public class HashMapExample2{
	public static void main(String[] args){
		Map<Person, Address> addressBook = new HashMap<>();
		
		Person person = new Person("Bazlur");
		Address address = new Address("500 kingston Rd","Toronto", "ON", "Canada", "M4L1V3");
		addressBook.put(person, address);
		System.out.println(person);
		System.out.println(address);
	}
}
