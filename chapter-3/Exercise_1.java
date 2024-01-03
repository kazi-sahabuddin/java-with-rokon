/**
 * exercise_1
 */
 
 import java.util.Scanner;
 
public class Exercise_1 {

    public static void main(String args[]){
    
    	Scanner input = new Scanner(System.in);
    	int a,b,c,d;
    	a = input.nextInt();
    	b = input.nextInt();
    	c = input.nextInt();
    	d = input.nextInt();
    	
    	if(a==b && b==c && c==d){
    		System.out.println("All are equal");
    	} else {
    		System.out.println("Not equal");
    	}
    }
}
