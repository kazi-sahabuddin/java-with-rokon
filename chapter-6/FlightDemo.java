
class Flight{
	private static final int TOTAL_SETTING_CAPACITY = 150;
	private int totalPassengers;
	private int totalCheckedBags;
	
	public void addOnePassenger(int bags, int carryOns){
	
		int totalBags = bags;
		if(carryOns > 2){
			totalBags = bags + carryOns - 2;
		}
		
		addOnePassenger(totalBags);	
	}
	
	public void addOnePassenger(int bags){
		if(isSeatAvailable()){
			addOnePassenger();
			totalCheckedBags += bags;
		}
	}
	
	private boolean isSeatAvailable(){
		return totalPassengers < TOTAL_SETTING_CAPACITY;
	}
	
	public void addOnePassenger(){
	
		if(isSeatAvailable()){
			totalPassengers += 1;
		}		
	}
	
	public int getTotalCheckedBags(){
		return totalCheckedBags;
	}
	
	public int getTotalPassengers(){
		return totalPassengers;
	}
}

public class FlightDemo{
	public static void main(String[] args){
		Flight flight = new Flight();
		flight.addOnePassenger();
		flight.addOnePassenger(2);
		flight.addOnePassenger(2,2);
		flight.addOnePassenger(2,3);
		
		System.out.println("Total Checked Bags: "+ flight.getTotalCheckedBags());
		System.out.println("Total Passenger: "+ flight.getTotalPassengers());
	}
}
