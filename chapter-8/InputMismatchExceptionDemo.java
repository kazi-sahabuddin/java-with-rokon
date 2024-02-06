import java.util.Scanner;
import java.util.InputMismatchException;

public class InputMismatchExceptionDemo{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		
		int number=0;
		do{
			try{
				number = scan.nextInt();
				if(number != -1){
					System.out.println("You entered: " + number + ", enter another number (-1 exit): ");
				} else {
					System.out.println("Program exited");
				}
			} catch (InputMismatchException e){
				e.printStackTrace();
				System.out.println("Please enter only a number: ");
				scan.nextLine();
			}
			
		} while(number != -1);
	}
}
