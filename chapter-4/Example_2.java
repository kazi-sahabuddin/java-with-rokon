import java.util.Scanner;

public class Example_2{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a day between (1 to 7): ");
		int day = scan.nextInt();
		
		switch(day){
			case 1, 2, 3, 4, 5 -> System.out.println("Weekdays");
			case 6, 7 -> System.out.println("Weekends");
		
		}

	}
}
