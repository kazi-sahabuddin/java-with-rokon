import java.util.Scanner;

public class Exercise_15{
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your amount: ");
		int amount = scan.nextInt();
		
		System.out.println("After " +3500000.0/amount+" mounth(s) you can buy a car!");
	}
}
