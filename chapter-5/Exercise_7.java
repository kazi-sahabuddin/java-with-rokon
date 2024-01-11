import java.util.Scanner;
import java.util.Arrays;

public class Exercise_7{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a sequence of integers: ");
		
		int capacity =10;
		int size = 0;
		int[] elements = new int[capacity];
		
		int nextInt;
		
		while(true){
			nextInt = scan.nextInt();
			
			if(nextInt == -1){
				//System.out.println("We are done  taking inputs! ");
				break;
			}
			
			if(elements.length == size){
				capacity = size * 2;
				elements = Arrays.copyOf(elements, capacity);
			}
			elements[size++] = nextInt;
		}
		
		if(elements.length > size){
			elements = Arrays.copyOfRange(elements, 0, size);
		}
		System.out.print("Enter a target number: ");
		int targetNum = scan.nextInt();
		
		int a=0,b=0;
		
		for(int i = 0; i<elements.length-1;i++){
			for(int j = 0; j < elements.length; j++){
				if((elements[i] + elements[j]) == targetNum){
					a = elements[i];
					b = elements[j];
				}
			}
		}
		
		System.out.println(a + ", "+ b);
	}
}
