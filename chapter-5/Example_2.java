import java.util.Scanner;

public class Example_2{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter characters: ");
		String inputValue = scan.nextLine();
		inputValue = inputValue.toLowerCase();
		char[] letters = inputValue.toCharArray();
		
		int[] counts = new int[26];
		
		for(int i = 0; i < letters.length; i++){
		
			if(Character.isLetter(letters[i])){
				int index = letters[i] - 'a';
				counts[index]++;
			}
			
		}
		
		System.out.println("letter\tCount");
		for(int i = 0; i < counts.length; i++){
			if(counts[i]>0){
				System.out.println( (char)(i+'a') +":\t"+counts[i]);
			}
			
		}
		
	}
}
