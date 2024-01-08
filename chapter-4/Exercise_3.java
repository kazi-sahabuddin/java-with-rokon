import java.util.Scanner;

public class Exercise_3{
	public static void main(String args[]){
		for(int i =0; i<6; i++){
		
			for(int j=0; j<i; j++){
				System.out.print(". ");			
			}
					
			for(int j=i; j<=6; j++){
				System.out.print("* ");			
			}
			System.out.println();
		
		}
	
	}
}
