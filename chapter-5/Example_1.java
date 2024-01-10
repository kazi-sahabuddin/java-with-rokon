import java.util.Scanner;

public class Example_1{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Length of array: ");
		int sizeOfArray = scan.nextInt();
		
		int[] numbers = new int[sizeOfArray];
		for(int i =0; i<numbers.length; i++){
			System.out.print(i+": ");
			numbers[i] = scan.nextInt();
		}
		
		System.out.println("Index\tValue");
		
		for(int i = 0; i < numbers.length; i++){
			System.out.println(i+"\t"+numbers[i]);
		}
		
	}
}
