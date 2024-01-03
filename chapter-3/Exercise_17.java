import java.util.Scanner;

public class Exercise_17{
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter total Slices: ");
		int totalSlice = scan.nextInt();
		System.out.print("Enter number of your friend(s): ");
		int friend = scan.nextInt();
		System.out.print("How many Slices each wants: ");
		int wantSlice = scan.nextInt();
		
		if((friend * wantSlice) <= totalSlice){
			System.out.println("Yes. it's possible to split the pizza fairly.");
		} else {
			System.out.println("Sorry. it's not possible to split the pizza fairly");
		}
	}
}
