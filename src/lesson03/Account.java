package lesson03;

public class Account {
	
	private String name = null;
	private double balance;
	
	public Account(String name, double balance) {
		this.name = name;
		if ( balance > 0.0 ) {
			this.balance = balance;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double depositAmount){
		//
		this.balance += depositAmount;
	}

}
