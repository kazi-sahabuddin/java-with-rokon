public class ExceptionDemo{

	private static int divide(int a, int b){
		return a / b;
	}
	public static void main(String[] args){
		int a = 1;
		int b = 0;
		
		int result = divide(a, b);
		
		System.out.println("result = "+result);
	}
}
