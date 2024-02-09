public class Test{
	public static void main(String[] args){
		try{
			int a = 5;
			if(a < 10){
				throw new Exception("Value is too small");
			} 
		}catch(Exception ex) {
				System.out.println(ex.getMessage());
		}
	}
}
