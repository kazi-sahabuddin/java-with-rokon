import java.util.Scanner;

public class Exercise_4{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = scan.nextInt();
		int mx = Integer.MIN_VALUE;
		int mn = Integer.MAX_VALUE;
		
		while(n>0){
			int a = scan.nextInt();
			if(a > mx){
				mx = a;
			}
			
			if(mn > a){
				mn=a;
			}	
			
			n--;
		}
		
	System.out.println("Max number is "+ mx +" Min number is "+ mn);	
		
	}

}
