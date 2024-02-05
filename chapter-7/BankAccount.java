enum AccountType{
	CHECKING, SAVING, SUPER_SAVINGS;
}

public class BankAccount{
	private int accountNumber;
	private double accountBalance;
	private String accountHolderName;
	private AccountType accountType;
	
	public BankAccount(int accountNumber, double accountBalance, String accountHolderName, AccountType accountType){
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
	}
	
	public void deposit(double amount){
		this.accountBalance += amount;
	}
	
	public void withdraw(double amount){
		if(amount > this.accountBalance){
			System.out.println("Eorro: Insufficient funds");
		} else if (this.accountBalance - amount < 0){
			System.out.println("Error: Cannot have negative balance");
		} else {
			this.accountBalance -= amount;
		}
	}
	
	public double checkBalance(){
		return this.accountBalance;
	}
	
	public static void main(String[] args){
		BankAccount account = new BankAccount (12345, 100, "John Smith", AccountType.CHECKING);
		
		account.deposit(50);
		System.out.println(account.checkBalance());
		
		account.withdraw(200);
		System.out.println(account.checkBalance());
	}
}


