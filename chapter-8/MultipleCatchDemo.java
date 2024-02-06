public class MultipleCatchDemo{
	public static void main(String[] args){
		/*try{
			int number[] = new int[10];
			number[15] = 30/0;
		} catch(ArithmeticException e){
			System.out.println("You cannot divide by zero");
			e.printStackTrace();
		
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("The index you tried to access dose not exist");
			e.printStackTrace();
		}*/
		
		try{
			int number[] = new int[10];
			number[15] = 30/0;
			} catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
			if( e instanceof ArithmeticException){
				
				System.out.println(e.getMessage());
				System.out.println("You cannot divide by zero");
				
				System.out.println(e.toString());
				
				//e.printStackTrace();
				
			} else if( e instanceof ArrayIndexOutOfBoundsException){
				System.out.println("The index you tried to access dose not exist");
				e.printStackTrace();
			}
		}
	}
}
