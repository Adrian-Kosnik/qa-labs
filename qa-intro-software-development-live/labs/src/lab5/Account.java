package lab5;

public class Account {

	private int id;
	private String owner;
	private double balance;

	public Account(int id, String owner, double balance) {
		this.id = id;
		this.owner = owner;
		this.balance = balance;
	}

	void getBalance() {
		System.out.println("Balance: £" + this.balance);
	}

	void deposit(double amount) {
		if (amount > 0) {
			this.balance += amount;
			System.out.println("Deposit: £" + this.balance);
		} else {
			System.out.println("Cannot deposit £0 or less.");
		}
	}

	void withdraw(double amount) {
		if (balance >= amount) {
			this.balance -= amount;
			System.out.println("Withdraw: £" + this.balance);
		} else {
			System.out.println("Cannot withdraw more than current balance.");
		}
	}

	String getDetails() {
		String details = "\nAccount ID: " + this.id + "\nAccount Owner: " + this.owner + "\nAccount Balance: " + "£"
				+ this.balance;
		System.out.println("\n\nDetails: " + details);
		return details;
	}

	public void addInterest() {
		if (balance > 0) {
			System.out.println("\n\nBefore Interest: £" + balance);
			double intrest = balance * 0.025;
			System.out.println("Interest: £" + intrest);
			balance += intrest;
			System.out.println("After Interest: £" + balance);
		}
	}

}
