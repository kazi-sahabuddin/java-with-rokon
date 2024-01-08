import java.util.Scanner;

public class Example_3{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a day between (1 to 7): ");
		int day = scan.nextInt();
		
		String result = switch(day){
			case 1, 2, 3, 4, 5 -> "Weekdays";
			case 6, 7 -> "Weekends";
			default -> "Unexpected value: " + day;
		
		};
		
		System.out.println("Switch case Result: " + result);

	}
}
