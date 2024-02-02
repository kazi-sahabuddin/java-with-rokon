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

class PayCalculator{
	private static final double HOURLY_RATE = 70;
	
	public double getPay(Client client){
		return client.getHoursWorked() * HOURLY_RATE;
	}
}

class HrManager {
	private ArrayList<Client> clients = new ArrayList<>();
	private PayCalculator payCalculator = new PayCalculator();
	
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
		HrManager hrManager = new HrManager();
		Client client0 = new Client("Mosharraf", 45);
		hrManager.addClient(client0);
		
		Client client1 = new Client("Nowshed", 41);
		hrManager.addClient(client1);
		
		double totalPay = hrManager.getTotalPay();
		System.out.println("Total pay " + totalPay);
	}
}


