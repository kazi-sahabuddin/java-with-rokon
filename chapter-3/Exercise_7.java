import java.util.Scanner;

public class Exercise_7{
	
	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number between 0 and 2,147,483,647: ");
		int num = input.nextInt();
		int value = num;
		int sum =0;
		
		while(value>0){
			sum+=value%10;
			value/=10;
		}
		
		System.out.printf("The sum of all digits of %d is : %d\n",num, sum);	
	}
};
