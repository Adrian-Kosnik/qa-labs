package lab5;

import java.util.Random;

public class Bank {

	private static Account[] accounts = new Account[999];
//	private int accountIndex = 0;
	
	public Account[] getAccounts() {
		return accounts;
	}

	public void setAccounts(Account accounts) {
		int i = 0;
		for (Account acc : accounts) {
			if (acc != null) {
				i++;
			} else {
				accounts[i] = acc;
			}
		}
	}

	public Account createAccount(int id, String owner, double balance) {
		Account acc = new Account(id, owner, balance);
		this.setAccounts(acc);
		return acc;
	}

	public static Account[] createRandAccounts(int numOfAccounts) {

		String[] names = { "Adrian", "Sophie", "Jeb", "Ron", "Vicky" };
		Account[] accArr = new Account[numOfAccounts];
		int index = 0;

		for (Account acc : accArr) {
			Random randName = new Random();
			Random randNum = new Random();
			accArr[index] = new Account(index + 1001, names[randName.nextInt(names.length)], randNum.nextInt(2000));
			index++;
		}

		return accArr;
	}

}
