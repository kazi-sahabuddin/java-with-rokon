import java.util.ArrayList;

class Client{
	private final String name;
	private final int hoursWorked;
	
	public Client(String name, int hoursWorked){
		this.name = name;
		this.hoursWorked = hoursWorked;
	}
	
	public String getName(){
		return name;
	}
	
	public int getHoursWorked(){
		return hoursWorked;
	}
}

/*
class PayCalculator{
	private static final double HOURLY_RATE = 70;
	private static final double FIXED_PAY = 550;
	
	public double getPay(Client client, String method){
	
		return switch(method){
			case "HOURLY" -> client.getHoursWorked() * HOURLY_RATE;
			case "FIXED" -> FIXED_PAY;
			default -> throw new IllegalArgumentException( "Unknown method: "+ method );
		};
	}
}*/

abstract class PayCalculator {
	public abstract double getPay(Client client);
}
class HourlyPayCalculator extends PayCalculator{
	private final double hourlyRate;
	
	public HourlyPayCalculator(double hourlyRate){
		this.hourlyRate = hourlyRate;
	}
	
	@Override
	public double getPay(Client client){
		return hourlyRate * client.getHoursWorked();
	}
}

class HrManager {
	private ArrayList<Client> clients = new ArrayList<>();
	private PayCalculator payCalculator;
	
	public HrManager(PayCalculator payCalculator){
		this.payCalculator = payCalculator;
	}
	
	public void addClient(Client client){
		clients.add(client);
	}
	
	public double getTotalPay(){
		double total = 0.0;
		for(Client client : clients){
			total+= payCalculator.getPay(client);
		}
		
		return total;
	}
}

public class KaziSolution{
	public static void main(String[] args){
		
		PayCalculator calculator = new HourlyPayCalculator(75);
		HrManager hrManager = new HrManager(calculator);
		Client client0 = new Client("Mosharraf", 45);
		hrManager.addClient(client0);
		
		Client client1 = new Client("Nowshed", 41);
		hrManager.addClient(client1);
		
		double totalPay = hrManager.getTotalPay();
		
		//System.out.println("FIXED PAY "+ hrManager.getTotalPay("FIXED"));
		
		System.out.println("Total pay " + totalPay);
	}
}


