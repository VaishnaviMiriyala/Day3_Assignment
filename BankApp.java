package m3.task1;

public class BankApp {

	public static void main(String[] args) {
		
		BankAccount a1 = new BankAccount();
		a1.setAccountHolderName("Ram");
		a1.setBalance(20000);
		
		a1.doDeposit(1000);
		System.out.println(a1.getAccountHolderName()+" - "+a1.getBalance()+" - "+a1.getStatus());
		
		a1.doWithdrawal(10000);
		
		
		BankAccount a2 = new BankAccount();
		a2.setAccountHolderName("Ramesh");
		a2.setBalance(500000);
		
		a2.doWithdrawal(50000);
		
		BankAccount a3 = new BankAccount();
		a3.setAccountHolderName("Shyam");
		a3.setBalance(9000);
		
		a3.doWithdrawal(1000);
		
		System.out.println(a1.getAccountHolderName()+" - "+a1.getBalance()+" - "+a1.getStatus());
		System.out.println(a2.getAccountHolderName()+" - "+a2.getBalance()+" - "+a2.getStatus());
		System.out.println(a3.getAccountHolderName()+" - "+a3.getBalance()+" - "+a3.getStatus());
		
	}

}
