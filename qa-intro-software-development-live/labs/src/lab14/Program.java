package lab14;

import java.util.ArrayList;
import java.util.Collections;

public class Program {

	public static void main(String[] args) {

		ArrayList<Account> accounts = new ArrayList<>();
		accounts.add(new Account(100, "Bob", 1000));
		accounts.add(new Account(500, "Linda", 3000));
		accounts.add(new Account(300, "David", 2000));
		Collections.sort(accounts);

//		Collections.sort(accounts, (Account acc1, Account acc2) -> (int) (acc1.balance - acc2.balance));
//		for (Account x : accounts) {
//			System.out.println(x.balance);
//		}

		compareAccounts(accounts.getFirst(), accounts.getLast());

	}

	public static void compareAccounts(Account acc1, Account acc2) {
		double accComp = acc1.compareTo(acc2);
		if (accComp < 0) {
			System.out.println("Account ID: " + acc1.id + "\n\tBalance: " + acc1.balance + "\nAccount ID: " + acc2.id
					+ "\n\tBalance: " + acc2.balance + "\n\nAccount ID: " + acc2.id + " balance is higher.");
		} else if (accComp < 0) {
			System.out.println("Account ID: " + acc1.id + "\n\tBalance: " + acc1.balance + "\nAccount ID: " + acc2.id
					+ "\n\tBalance: " + acc2.balance + "\n\nAccount ID: " + acc1.id + " balance is higher.");
		} else {
			System.out.println("Account ID: " + acc1.id + "\n\tBalance: " + acc1.balance + "\nAccount ID: " + acc2.id
					+ "\n\tBalance: " + acc2.balance + "\n\nAccount ID: " + acc1.id + " & Account ID: " + acc2.id
					+ " balance is equal.");
		}
	}

}
