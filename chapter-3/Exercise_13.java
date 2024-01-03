import java.util.Scanner;

public class Exercise_13{

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int minutes;
		System.out.print("Enter total call duration in minutes: ");
		minutes = scan.nextInt();
		
		double totalAmount = 125.0;
		
		if(1000 < minutes){
			totalAmount += (minutes - 1000)*0.49;
			//System.out.println((minutes - 1000)*0.49);
			minutes=1000;
		
		}
		
		if(500<minutes){
			totalAmount += (minutes - 500)*0.25;
			//System.out.println((minutes - 500)*0.25);
		}
		
		System.out.println("Total bill: "+totalAmount);
		
	}

}
