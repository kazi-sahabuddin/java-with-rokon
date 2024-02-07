import java.util.Arrays;
import java.util.StringJoiner;

class DynamicArray<T>{
	private static final int DEFAULT_CAPACITY = 10;
	
	private T[] elements;
	private int size;
	
	public DynamicArray(){
		elements = (T[]) new Object[DEFAULT_CAPACITY]; 
	}
	
	public int size(){
		return size;
	}
	
	public boolean isEmpty(){
		return size == 0;
	}
	
	public void add(T item){
		if(size == elements.length){
			grow();
		}
		
		elements[size] = item;
		size++;
	}
	
	private void grow(){
		int newCapacity = elements.length * 2;
		elements = Arrays.copyOf(elements, newCapacity);
	}
	
	public T get(int index){
		if(index < 0 || index >= size ){
			throw new IndexOutOfBoundsException();
		}
		
		return elements[index];
	}
	
	@Override
	public String toString(){
		StringJoiner joiner = new StringJoiner(", ");
		for(int i = 0; i < size; i++){
			T element = elements[i];
			joiner.add(String.valueOf(element));
		}
		return joiner.toString();
		
	}
}

public class DynamicArrayDemo {
	public static void main(String[] args){
		DynamicArray<Integer> numbers = new DynamicArray<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		System.out.println(numbers);
		System.out.println(numbers.get(0));
		System.out.println(numbers.get(1));
		//System.out.println(numbers.get(4));
		int totalElements = numbers.size();
		System.out.println("Total Elements = " + totalElements);
		
		DynamicArray<String> cities = new DynamicArray<>();
		cities.add("Dhaka");
		cities.add("Toronto");
		cities.add("beijing");
		cities.add("Tokyo");
		cities.add("Sao Paulo");
		
		System.out.println(cities);
		System.out.println(cities.get(0));
		System.out.println(cities.get(1));
		System.out.println(cities.get(4));
		int totalCities = cities.size();
		System.out.println("Total Cities = " + totalCities);
		
	}
}
