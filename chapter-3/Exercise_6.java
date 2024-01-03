import java.util.Scanner;

public class Exercise_6{
	
	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		int a,b,c;
		System.out.print("Enter first edge: ");
		a = input.nextInt();
		System.out.print("Enter second edge: ");
		b = input.nextInt();
		System.out.print("Enter third edge: ");
		c = input.nextInt();
		
		if((a+b)>c && (a+c)> b && (b+c) > a){
		
			System.out.println("Inputs are valid");
		
		} else {
		
			System.out.println("Inputs are invalid");
		
		}
	}
}
