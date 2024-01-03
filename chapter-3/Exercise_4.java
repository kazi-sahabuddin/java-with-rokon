import java.util.Scanner;
import java.lang.Math;

public class Exercise_4{
	
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		int ax,ay,bx,by,cx,cy;
		ax = input.nextInt();
		ay = input.nextInt();
		
		bx = input.nextInt();
		by = input.nextInt();
		
		cx = input.nextInt();
		cy = input.nextInt();
		
		double area = (ax*(by - cy )) + (bx*(cy - ay )) + (cx*(ay - by )) ;
		//System.out.println(area);
		area = Math.abs(area);
		//System.out.println(area);
		
		System.out.println(area*.5);
	}
}
