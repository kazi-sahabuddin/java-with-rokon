import java.util.Scanner;

public class Exercise_12{

	public static void main (String[] args){
	
		Scanner scan = new Scanner(System.in);
		
		int num;
		System.out.print("Enter a number: ");
		num = scan.nextInt();
		System.out.println("Last Digit: "+num%10);
	
	}

}
