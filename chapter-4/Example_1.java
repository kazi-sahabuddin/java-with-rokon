import java.util.Scanner;

class Example_1{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		double income, taxableIncome,tax=0.0;
		
		System.out.print("Enter your yearly income: ");
		income = scan.nextDouble();
		
		taxableIncome = income - 300_000;
		
		if(taxableIncome > 500_000){
			tax+= (taxableIncome - 500_000) * 0.25;
			taxableIncome = 500_000;
		}
		
		if( taxableIncome > 400_000 && taxableIncome <= 500_000) {
			tax+= (taxableIncome - 400_000) * 0.20;
			taxableIncome = 400_000;
		}
		
		if( taxableIncome > 300_000 && taxableIncome <= 400_000) {
			tax+= (taxableIncome - 300_000) * 0.15;
			taxableIncome = 300_000;
		}
		if( taxableIncome > 100_000 && taxableIncome <= 300_000) {
			tax+= (taxableIncome - 100_000) * 0.10;
			taxableIncome = 100_000;
		}
		if(  taxableIncome <= 100_000) {
			tax+= taxableIncome * 0.05;
		}
		
		System.out.println("Your total payalbe tax is: "+tax);
	}
}
