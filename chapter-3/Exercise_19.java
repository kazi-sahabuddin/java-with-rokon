import java.util.Scanner;

public class Exercise_19{
	
	public static void main(String[] args){
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the fuel amount (in liters): ");
		double fuelAmount = scan.nextDouble();
		
		System.out.print("Enter the fuel consumption (liter/100 km): ");
		double fuelConsumption = scan.nextDouble();
		
		System.out.print("Enter the number of passengers (excluding the driver: )");
		int numPassengers = scan.nextInt();
		
		double baseFuelConsumption = fuelConsumption/100;
		
		double totalFuelConsumption = baseFuelConsumption + numPassengers*0.05;
		
		System.out.println("You can travel a maximum distance of "+ fuelAmount/totalFuelConsumption + " km.");
	
	}
}
