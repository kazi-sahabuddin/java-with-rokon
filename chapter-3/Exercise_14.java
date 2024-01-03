import java.util.Scanner;

public class Exercise_14{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
	
		System.out.print("Enter a number: ");
		int num = scan.nextInt();
		
		if(num % 6 == 0 && num % 5 == 0){
			System.out.println("YES");		
		} else {
			System.out.println("NO");
		}
	}
}
