class Statistics<T extends Number> {
	private T[] numbers;
	
	public Statistics(T[] numbers){
		this.numbers = numbers;
	}
	
	public double average(){
		double sum = 0.0;
		for(T number: numbers){
			sum+= number.doubleValue();
		}
		
		return sum/numbers.length;
	}
}

public class StatisticsDemo{
	public static void main(String[] args){
		Integer numbers[] = {1,2,3,4,5};
		Statistics<Integer> stat = new Statistics<>(numbers);
	    System.out.println("Average is " + stat.average());
	}
}
