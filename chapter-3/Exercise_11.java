import java.util.Scanner;

public class Exercise_11{
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a character: ");
		char ch;
		ch = scan.next().charAt(0);
		if(Character.isDigit(ch)){
			System.out.println(ch+" is a digit");		
		} else if(Character.isLetter(ch)) {
		
			System.out.println(ch + " is a letter");
		
		} else {
			System.out.println(ch + " is a special character");
		}
	}
}
