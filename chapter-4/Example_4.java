import java.util.Scanner;

public class Example_4{
	public static void main(String args[]) {
		double numerator = 4.0;
		double denominator = 1.0;
		double sign = 1.0;
		
		double pi = 0.0;
		
		for(int i=0;i<200000;i++){
			pi += sign * (numerator/denominator);
			denominator +=2;
			sign *= -1.0;
			
		}
		
		System.out.println("PI: "+ pi);
	}
}
