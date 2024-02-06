public class MultipleCatchDemo{
	public static void main(String[] args){
		try{
			int number[] = new int[10];
			number[15] = 30/0;
		} catch(ArithmeticException e){
			System.out.println("You cannot divide by zero");
			e.printStackTrace();
		
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("The index you tried to access dose not exist");
			e.printStackTrace();
		}
	}
}
