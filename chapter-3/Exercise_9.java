import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise_9{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		double amount;
		System.out.print("Enter your amount: ");
		amount = input.nextDouble();
		amount = (amount*1.85)/100;
		DecimalFormat deif = new DecimalFormat("$#.##");
		String sam = deif.format(amount);
		System.out.println("Charge: "+sam);
		//System.out.printf("Charge: %.2f\n",amount);
	}
}
