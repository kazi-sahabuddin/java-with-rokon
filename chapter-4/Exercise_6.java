import java.util.Scanner;

public class Exercise_6{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("How many product did you buy? ");
		int totalItem = scan.nextInt();
		
		int totalAmount =0;
		System.out.println("Enter their price one by one: ");
		while(totalItem > 0){
			int amount = scan.nextInt();
			totalAmount+= amount;
			totalItem--;
		}
		totalAmount+= totalAmount*.15;
		
		System.out.println("Total price: " + totalAmount);
		while(totalAmount>0){
			System.out.print("Please pay the money: ");
			int pay = scan.nextInt();
			totalAmount-=pay;
			if(totalAmount > 0){
				System.out.println("You have to pay more: " + totalAmount);
			} else if(totalAmount < 0){
				System.out.println("Here is your changes: "+ totalAmount*-1);				
			} else{
				System.out.println("Thanks");
			}
		}
	}
}
