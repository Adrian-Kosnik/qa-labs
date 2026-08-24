package lab14;

class Account implements Comparable<Account> {

	int id;
	double balance;
	String owner;
	
	private boolean accOpen = true;

	public void setAccOpen(boolean accOpen) {
		this.accOpen = accOpen;
	}

	public Account(int id, String owner, double balance) {
		this.id = id;
		this.balance = balance;
		this.owner = owner;
	}
	
	void withdraw(double amount) {
		if(balance >= amount) {
			this.balance -= amount;
			System.out.println("| WITHDRAW: COMPLETE |");
		} else {
			throw new IllegalArgumentException("| WITHDRAW: NOT ENOUGH FUNDS |");
		}
	}
	
	void deposit(double amount) {
		if(amount > 0) {
			this.balance += amount;
			System.out.println("| DEPOSIT: COMPLETE |");
		}
	}
	
	String close() {
		setAccOpen(false);
		return "| ID: " + id + " | " + "Balance: £" + balance + " | " + "Owner: " + owner + (!accOpen ? " | ACCOUNT CLOSED |" : " |");
	}
	
	String getDetails() {
		return "| ID: " + id + " | " + "Balance: £" + balance + " | " + "Owner: " + owner + (accOpen ? " |" : " | ACCOUNT CLOSED |"); 
	}

	@Override
	public int compareTo(Account other) {
		return (int)(this.balance - other.balance);
	}
	
}

