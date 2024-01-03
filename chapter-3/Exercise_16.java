import java.util.Scanner;

public class Exercise_16{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter seconds: ");
		int second = scan.nextInt();
		int hour = second/3600;
		second%=3600;
		int minutes = second/60;
		second%=60;
		System.out.println(hour+" hour(s) "+ minutes +" minute(s) "+second+" second(s)");
		
	}
	
}
