import java.util.Scanner;

public class Exercise_11{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = scan.nextInt();
		
		if(num < 0){
			throw new IllegalArgumentException("Number must be non-negative");
		}
		
		long factorial = 1;
		for(int i = 2; i<= num; i++){
			factorial*=i;
		}
		
		System.out.println(num + "! = "+factorial);
	}
}
