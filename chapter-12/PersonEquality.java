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


public class PersonEquality{
	public static void main(String[] args){
		Person person1 = new Person("Bazlur");
		Person person2 = new Person("Bazlur");
		
		if(person1.equals(person2)){
			System.out.println("Both are equal");
		}else{
			System.out.println("They are not equal");
		}
		
	}
}
