package lab5;

import java.util.Arrays;

public class Program {

	public static void main(String[] args) {
		
//		Account[] arrAccounts = Bank.createRandAccounts(1);
//		
//		for (Account acc : arrAccounts) {
//			acc.getDetails();
//			acc.addInterest();
//			acc.getDetails();
//		}
		
		Bank bank = new Bank();
		bank.createAccount(50, "Adrian", 1500);
		System.out.println(Arrays.toString(bank.getAccounts()));

	}

}
