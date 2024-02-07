import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.StringJoiner;

class Stack<T>{
	private static final int DEFAULT_SIZE = 10;
	private T[] elements;
	private int top;
	
	public Stack(){
		elements = (T[]) new Object[DEFAULT_SIZE];
	}
	
	public void push(T item){
		if(isFull()){
			grow();
		}
		elements[top] = item;
		top++;
		
	}
	private void grow(){
		int newCapacity = elements.length * 2;
		elements = Arrays.copyOf(elements, newCapacity);
	}
	public T pop(){
		if(isEmpty()){
			throw new EmptyStackException();
		}
		top--;
		return elements[top];		
	}
	
	public int size(){
		return top;
	}
	public boolean isEmpty(){
		return top == -1;
	}
	public boolean isFull(){
		return elements.length == top;
	}
	
	public void printElements(){
		StringJoiner joiner = new StringJoiner(", ", "[","]");
		for(int i = 0; i < top; i++){
			joiner.add(String.valueOf(elements[i]));
		}
		
		System.out.println(joiner);
	}
}

public class GenericStack{
	public static void main(String[] args){
		Stack<String> cities = new Stack<>();
		cities.push("Dhaka");
		cities.push("Toronto");
		cities.push("Ottawa");
		cities.push("Calgary");
		cities.pop();
		cities.printElements();
	}
}
