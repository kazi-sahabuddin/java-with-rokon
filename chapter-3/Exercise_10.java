import java.util.Scanner;

public class Exercise_10{

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double total=0;
		System.out.print("Enter marks for 6 subjects one after one by pressing enter: ");
		total += scan.nextDouble();
		total += scan.nextDouble();
		total += scan.nextDouble();
		total += scan.nextDouble();
		total += scan.nextDouble();
		total += scan.nextDouble();
		
		System.out.println("Total marks: "+total);
		System.out.println("Average marks: "+ total/6);
		System.out.println("Percentage: "+total*100/600+"%");
	}

}
