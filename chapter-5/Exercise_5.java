import java.util.Scanner;
import java.util.Arrays;

public class Exercise_5{
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
				System.out.println("We are done  taking inputs! ");
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
		
		int mx = Integer.MIN_VALUE;
		int mn = Integer.MAX_VALUE;
		
		for(int i =0; i < elements.length; i++){
			if(elements[i] > mx){
				mx = elements[i];
			}
			if(elements[i] < mn){
				mn = elements[i];
			}
		}
		
		System.out.println("MAX VALUE IS : " + mx +" MIN VALUE IS "+mn);
		
		
	}
}
