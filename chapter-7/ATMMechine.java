import java.util.ArrayList;
import java.util.Scanner;

class Customer{
	private long accountNo;
	private String password;
	private int balance;
	
	public Customer(long accountNo, String password, int balance){
		this.accountNo = accountNo;
		this.password = password;
		this.balance = balance;
	}
	
	public long getAccountNo(){
		return accountNo;
	}
	
	public String getPassword(){
		return password;
	}
	
	public int getBalance(){
		return balance;
	}
	
	public void addAmount(int amount){
		this.balance += amount;
	}
	
	public void subtractAmount(int amount){
		this.balance -= amount;
	}	
}



public class ATMMechine{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		ArrayList<Customer> customers = new ArrayList<>();
		
		customers.add( new Customer(123, "qwe", 10000));
		customers.add( new Customer(124, "rty", 15000));
		customers.add( new Customer(125, "uio", 20000));
		
		boolean isLogged = false;
		Customer currentCustomer = null;
		
		System.out.println("Enter your password: ");
		String password = scan.nextLine();
		
		System.out.println("Enter your account no: ");
		long accountNo = scan.nextLong();
		//System.out.println("Enter your password: ");
		
		
		for(Customer customer : customers){
			if( accountNo == customer.getAccountNo() && password.equals(customer.getPassword()))
			{
				isLogged = true;
				currentCustomer = customer;
			}
		}
		int test;
		if(isLogged){
			System.out.println("Login successful");
			do{
				System.out.println("Main Menu");
				System.out.println("1: Check Balance");
				System.out.println("2: Withdraw");
				System.out.println("3: Deposit");
				System.out.println("4: Exit");
				System.out.println("Enter choice: ");
				test = scan.nextInt();
				if(test == 1){
					System.out.println("Your balance: "+ currentCustomer.getBalance());
				} else if(test == 2){
					System.out.print("Enter your amount: ");
					int amount = scan.nextInt();
					if(currentCustomer.getBalance() >= amount){
						currentCustomer.subtractAmount(amount);
						System.out.println("Your balance: "+ currentCustomer.getBalance());
					} else {
						System.out.println("insuffient Balance");
					}	
				} else if(test == 3){
					System.out.print("Enter your amount: ");
					int amount = scan.nextInt();
					currentCustomer.addAmount(amount);
					System.out.println("Your balance: "+ currentCustomer.getBalance());
				}
				
			} while(test != 4);
		} else {
			System.out.println("User not found");
		}
	}
}
