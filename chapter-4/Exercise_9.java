import java.util.Scanner;

public class Exercise_9{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		do{
			System.out.print("Enter a number: ");
			int a = scan.nextInt();
			System.out.print("Enter an operation (+, -, *, /): ");
			char operation = scan.next().charAt(0);
			System.out.print("Enter another number: ");
			int b = scan.nextInt();
			
			int result = switch(operation){
				case '+' -> a+b;
				case '-' -> a-b;
				case '*' -> a*b;
				case '/' -> a/b;
				
				default -> throw new IllegalStateException("Unexpected value: " + operation);
			};
			System.out.printf("%n%d %s %d = %d%n",a, operation, b, result);
			System.out.print("Do you want to continue(y/n): ");
		} while(scan.next().charAt(0) == 'y');
	}
}
