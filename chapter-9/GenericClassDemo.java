class Generic<T>{
	private T obj;
	public Generic(T obj){
		this.obj = obj;
	}
	
	public T getObj(){
		return obj;
	}
	
	public void showType(){
		System.out.println("Type of T: "+ obj.getClass().getName());
	}
}

public class GenericClassDemo{
	public static void main(String[] args){
		Generic<Integer> iObj;
		iObj = new Generic<>(88);
		
		iObj.showType();
		int value = iObj.getObj();
		System.out.println("value = " + value);
		
		Generic<String> strObj = new Generic<>("This is a test");
		strObj.showType();
		String strValue = strObj.getObj();
		System.out.println("strValue = "+ strValue);
	}
}
