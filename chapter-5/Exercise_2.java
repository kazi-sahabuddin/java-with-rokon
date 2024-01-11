import java.util.Scanner;
import java.util.Arrays;

public class Exercise_2{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] fiboSeries = new int[20];
		
		fiboSeries[0] = 0;
		fiboSeries[1]= 1;
		
		for(int i = 2; i<fiboSeries.length; i++){
			fiboSeries[i] = fiboSeries[i-1] + fiboSeries[i-2];
		}
		
		System.out.println("Fibonnacci Series is: "+Arrays.toString(fiboSeries));
	}
}
