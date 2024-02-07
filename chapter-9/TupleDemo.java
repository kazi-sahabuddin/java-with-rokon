class Tuple<X, Y>{
	private final X x;
	private final Y y;
	
	public Tuple(X x, Y y){
		this.x = x;
		this.y = y;
	}
	
	public X getX(){
		return x;
	}
	
	public Y getY(){
		return y;
	}
	
	public void showTypes(){
		System.out.println("Type of X is " + x.getClass().getName() + " and value: "+ x);
		System.out.println("Type of Y is " + y.getClass().getName() + " and value: "+ y);
	}
}

public class TupleDemo{
	public static void main(String[] args){
		Tuple<String, String> tuple = new Tuple<>("Bazlur", "Rahman");
		tuple.showTypes();
		
		Tuple<String, Integer> person = new Tuple<>("Nafis", 45);
		person.showTypes();
		
		Tuple<String, Tuple<Integer, Integer>> tTuple = new Tuple<>("Sumon", new Tuple<>(45,89));
		tTuple.showTypes();
	}
}
