package m3.task1;

public class BankAccount {
	private String accountHolderName;
	private int balance;
	private String status; // true for active / false for inactive
	
	// --------Constructor---------//
	public BankAccount(String accountHolderName, int balance, String status) {
		super();
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.status = status;
	}
	public BankAccount() {
		super();
	}
	//------- set and get methods-------//
	public String getAccountHolderName() {
		return accountHolderName;
	}


	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}

	
	// business methods
	public int doWithdrawal(int amount)
	{
		if((balance > 10000 || amount > balance) && (balance-amount) > 10000) {
			balance -= amount;
			status = "active";
		}else {
			status = "Inactive";
		}
		return balance; // new balance
	}
	

	
	public int doDeposit(int amount)
	{
		balance += amount;
		status = "active";
		return balance;
	}
}
