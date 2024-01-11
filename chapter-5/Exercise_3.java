import java.util.Scanner;
import java.util.Arrays;

public class Exercise_3{

	public static void main(String[] args){
	
		int[] arrays = {5, 23, 4, 67, 56, 30, 2, 10, 40, 90, 9};
		for(int i =0; i < arrays.length; i++){
			for(int j = 0; j < arrays.length-1-i; j++){
			
				if(arrays[j] > arrays[j+1]){
					int temp = arrays[j];
					arrays[j] = arrays[j+1];
					arrays[j+1] = temp;
				}
			
			}
		}
		
		System.out.println(Arrays.toString(arrays));
		
	}
}
