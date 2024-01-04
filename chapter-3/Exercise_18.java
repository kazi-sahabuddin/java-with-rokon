import java.util.Scanner;
import java.lang.Math;

public class Exercise_18{

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int h,w,r;
		System.out.print("Enter height: ");
		h = scan.nextInt();
		System.out.print("Enter width: ");
		w = scan.nextInt();
		System.out.print("Enter radius: ");
		r = scan.nextInt();
		
		double d = Math.sqrt(h*h + w*w);
		
		if(d <= r*2){
			System.out.println("The rectangle can be placed inside the circle");
		} else {
			System.out.println("The rectangle cannot be placed inside the circle");
		}
	
	}

}
