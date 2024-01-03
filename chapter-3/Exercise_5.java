import java.util.Scanner;

public class Exercise_5{

	public static void main(String args[]){
		double distance, time;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter distance in meters: ");
		distance = input.nextDouble();
		System.out.print("Enter time taken in minutes: ");
		time = input.nextDouble();
		
		//converting meter to kilometer
		distance /= 1000;
		
		//converting minutes to second
		time/=60;
		double speed = distance / time;
		//System.out.println(speed);
		
		System.out.printf("Speed in km/h is: %.2f\n",speed);
	
	}
}
