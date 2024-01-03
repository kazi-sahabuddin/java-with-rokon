import java.util.Scanner;

public class Exercise_8{
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		double bdt,usd,cad;
		System.out.print("Enter amount in BDT: ");
		bdt = input.nextDouble();
		System.out.print("Enter exchange rate (in USD): ");
		usd = input.nextDouble();
		System.out.print("Enter exchange rate (in CAD): ");
		cad = input.nextDouble();
		
		System.out.println("USD: "+ bdt * usd);
		System.out.println("CAD: "+bdt * cad);
		
	
	}
}
