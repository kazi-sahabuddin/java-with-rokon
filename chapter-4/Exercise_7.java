import java.util.Scanner;

public class Exercise_7{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scan.nextInt();
		
		int n = num;
		int newNum=0;
		
		while(n>0){
			newNum = newNum * 10 +(n%10);
			n/=10;
		}
		
		if(num == newNum){
			System.out.println(num+" is Palindrome");
		} else {
			System.out.println(num+" is not Palindrome");
		}
	}
}
