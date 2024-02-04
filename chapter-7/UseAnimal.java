class Animal{};
class Horse extends Animal{};

public class UseAnimal{
	public void doSomething(Animal animal){
		System.out.println("Inside animal version");
	}
	public void doSomething(Horse animal){
		System.out.println("Inside Horse Version");
	}
	
	public static void main(String[] args){
		Animal animal = new Horse();
		Horse h = new Horse();
		UseAnimal useAnimal = new UseAnimal();
		useAnimal.doSomething(animal);
		useAnimal.doSomething(h);
	}
}
